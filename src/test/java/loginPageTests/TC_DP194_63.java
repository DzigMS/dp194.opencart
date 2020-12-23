package loginPageTests;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.HomePageStep;
import steps.LoginPageStep;

/**
 * TC_DP194_63
 * Login page: Validation of Logging In, invalid values
 */
public class TC_DP194_63 extends CommonConditionTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/InvalidLoginCredits.csv", numLinesToSkip = 1)
    public void TCDP194_63(String email, String password) {
        HomePageStep homePageStep = new HomePageStep(this.driver);
        LoginPageStep loginPageStep = homePageStep.goToLoginPage();
        loginPageStep.
                fillEmailField(email).
                fillPasswordField(password).
                clickLoginButton().
                verifyCurrentPage(PagesURL.LOGIN_PAGE_URL).
                loginErrorMessageAppeared();
    }
}
