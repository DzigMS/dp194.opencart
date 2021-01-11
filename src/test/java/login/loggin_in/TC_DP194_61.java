package login.loggin_in;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.HomePageStep;
import steps.LoginPageStep;

/**
 * TC_DP194_61
 * Login page: Validation of Logging In, valid values
 */
public class TC_DP194_61 extends CommonConditionTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/LoginPageValidLoginCredits.csv", numLinesToSkip = 1)
    public void TCDP194_61(String email, String password) {
        HomePageStep homePageStep = new HomePageStep(this.driver);
        homePageStep.goToLoginPage();

        LoginPageStep loginPageStep = new LoginPageStep(this.driver);
        loginPageStep.
                fillEmailField(email).
                fillPasswordField(password).
                clickLoginButton().
                verifyCurrentPage(PagesURL.MY_ACCOUNT_PAGE);
    }
}
