package my_account.change_password;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ChangePasswordPageStep;
import steps.HomePageStep;
import steps.LoginPageStep;
import steps.MyAccountPageStep;

/**
 * TC_DP194_84
 * My Account page: Validation of Password Change, invalid values
 */
public class TC_DP194_84 extends CommonConditionTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/ChangePasswordPageInvalidValues.csv", numLinesToSkip = 1)
    public void TCDP194_84(String email, String oldPassword, String newPassword) {
        HomePageStep homePageStep = new HomePageStep(this.driver);
        homePageStep.goToLoginPage();

        LoginPageStep loginPageStep = new LoginPageStep(this.driver);
        loginPageStep.
                fillEmailField(email).
                fillPasswordField(oldPassword).clickLoginButton();

        MyAccountPageStep myAccountPageStep = new MyAccountPageStep(this.driver);
        myAccountPageStep.clickChangePasswordLink();

        ChangePasswordPageStep changePasswordPageStep = new ChangePasswordPageStep(this.driver);
        changePasswordPageStep.
                fillPasswordField(newPassword).
                fillPasswordConfirmField(newPassword).
                clickContinueButton().
                verifyCurrentPage(PagesURL.PASSWORD_CHANGE_PAGE).
                passwordErrMsgAppeared();
    }
}
