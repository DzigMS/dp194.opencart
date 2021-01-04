package registerPageTests;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.HomePageStep;
import steps.RegisterPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TC_DP194_80
 * Registration page: Validation the registration, invalid values
 */
public class TC_DP194_80  extends CommonConditionTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/RegisterPageInvalidCredits.csv", numLinesToSkip = 1)
    public void TCDP194_80(String firstName, String lastName,
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

        assertEquals(PagesURL.REGISTER_PAGE_URL, this.driver.getWebDriver().getCurrentUrl());

        registerPageStep.passwordConfirmErrMsgAppeared();

    }
}
