package login.password_restoring;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ForgottenPasswordPageStep;
import steps.HomePageStep;
import steps.LoginPageStep;

/**
 * TC_DP194_63
 * Login page: Validation of Password Restoring, valid values
 */
public class TC_DP194_63 extends CommonConditionTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/ForgottenPasswordPageValidEmail.csv", numLinesToSkip = 1)
    public void TCDP194_63(String email) {
        HomePageStep homePageStep = new HomePageStep(this.driver);
        homePageStep.goToLoginPage();

        LoginPageStep loginPageStep = new LoginPageStep(this.driver);
        loginPageStep.clickForgottenPasswordLink();

        ForgottenPasswordPageStep forgottenPasswordPageStep = new ForgottenPasswordPageStep(this.driver);
        forgottenPasswordPageStep.
                fillEmailField(email).
                clickContinueButton().
                verifyCurrentPage(PagesURL.LOGIN_PAGE_URL);
    }
}
