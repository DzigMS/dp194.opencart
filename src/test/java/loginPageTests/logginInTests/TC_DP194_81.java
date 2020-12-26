package loginPageTests.logginInTests;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.HomePageStep;
import steps.LoginPageStep;

/**
 * TC_DP194_81
 * Login page: Validation of Logging In, invalid values
 */
public class TC_DP194_81 extends CommonConditionTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/LoginPageInvalidLoginCredits.csv", numLinesToSkip = 1)
    public void TCDP194_81(String email, String password) {
        HomePageStep homePageStep = new HomePageStep(this.driver);
        homePageStep.goToLoginPage();

        LoginPageStep loginPageStep = new LoginPageStep(this.driver);
        loginPageStep.
                fillEmailField(email).
                fillPasswordField(password).
                clickLoginButton().
                verifyCurrentPage(PagesURL.LOGIN_PAGE_URL).
                loginErrMsgAppeared();
    }
}
