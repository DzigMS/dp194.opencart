package registerPageTests;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.HomePageStep;
import steps.RegisterPageStep;
import subsidiaryClasses.CSVParser;
import subsidiaryClasses.RemoveNewCustomer;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TC_DP194_44
 * Registration page: Validation the registration, valid values
 */
public class TC_DP194_44 extends CommonConditionTest {
    private static final int LINE_INDEX = 0;
    private static final int USERNAME_INDEX = 0;
    private static final int PASSWORD_INDEX = 1;

    private static final String RESOURCE_DIR = "\\src\\test\\resources";
    private static final String FILEPATH = "\\OpenCart_AdminCredit.csv";

    private RemoveNewCustomer rnc;

    @BeforeEach
    public void setupRnc() {
        this.rnc = new RemoveNewCustomer(this.driver);

        try {
            String csvFile = System.getProperty("user.dir") + TC_DP194_44.RESOURCE_DIR + TC_DP194_44.FILEPATH;

            List<List<String>> credits = CSVParser.parseFile(csvFile, 1);

            this.rnc.setAdminUsername(credits.get(TC_DP194_44.LINE_INDEX).get(TC_DP194_44.USERNAME_INDEX));
            this.rnc.setAdminPassword(credits.get(TC_DP194_44.LINE_INDEX).get(TC_DP194_44.PASSWORD_INDEX));
        } catch (FileNotFoundException | IndexOutOfBoundsException e) {
            e.printStackTrace();

            this.rnc.setAdminUsername("Test");
            this.rnc.setAdminPassword("Test1");
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/RegisterPageValidCredits.csv", numLinesToSkip = 1)
    public void TCDP194_44(String firstName, String lastName,
                           String email, String telephone,
                           String password, String passwordConfirm) {
        HomePageStep homePageStep = new HomePageStep(this.driver);
        homePageStep.goToRegisterPage();

        RegisterPageStep registerPageStep = new RegisterPageStep(this.driver);
        registerPageStep.
                fillFirstNameField(firstName).
                fillLastNameField(lastName).
                fillEmailField(email).
                fillTelephoneField(telephone).
                fillPasswordField(password).
                fillPasswordConfirmField(passwordConfirm).
                markPrivacyPolicyCheckbox().
                clickContinueButton();

        assertEquals(PagesURL.SUCCESS_REGISTRATION_PAGE, this.driver.getWebDriver().getCurrentUrl());

        this.NewCustomerRemove(email);
    }

    public void NewCustomerRemove(String clientEmail) {
        this.rnc.setCustomerEmail(clientEmail);

        this.rnc.login();
        if (this.rnc.findCustomer()) {
            if (this.rnc.markCustomer()) {
                this.rnc.clickDeleteButton();
            }
        }

        this.rnc.logout();
    }
}
