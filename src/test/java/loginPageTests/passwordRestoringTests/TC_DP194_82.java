package loginPageTests.passwordRestoringTests;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ForgottenPasswordPageStep;
import steps.HomePageStep;
import steps.LoginPageStep;

/**
 * TC_DP194_82
 * Login page: Validation of Password Restoring, invalid values
 */
public class TC_DP194_82 extends CommonConditionTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/ForgottenPasswordPageInvalidEmail.csv", numLinesToSkip = 1)
    public void TCDP194_82(String email) {
        HomePageStep homePageStep = new HomePageStep(this.driver);
        homePageStep.goToLoginPage();

        LoginPageStep loginPageStep = new LoginPageStep(this.driver);
        loginPageStep.clickForgottenPasswordLink();

        ForgottenPasswordPageStep forgottenPasswordPageStep = new ForgottenPasswordPageStep(this.driver);
        forgottenPasswordPageStep.
                fillEmailField(email).
                clickContinueButton().
                verifyCurrentPage(PagesURL.FORGOTTEN_PASS_PAGE).
                passwordRestoreErrMsgAppeared();
    }
}
