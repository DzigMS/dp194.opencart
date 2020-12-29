package registerPageTests;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.HomePageStep;
import steps.RegisterPageStep;
import subsidiaryClasses.RemoveNewCustomer;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TC_DP194_44
 * Registration page: Validation the registration, valid values
 */
public class TC_DP194_44 extends CommonConditionTest {
    private RemoveNewCustomer rnc;

    public void setupRnc(String username, String password) {
        String csvFile = "/OpenCart_AdminCredit.csv";
        this.rnc = new RemoveNewCustomer(this.driver);
        this.rnc.setAdminUsername(username);
        this.rnc.setAdminPassword(password);
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
