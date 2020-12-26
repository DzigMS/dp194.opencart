package myAccountPageTests.changePasswordTests;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ChangePasswordPageStep;
import steps.HomePageStep;
import steps.LoginPageStep;
import steps.MyAccountPageStep;

/**
 * TC_DP194_65
 * My Account page: Validation of Password Change, valid values
 */
public class TC_DP194_65 extends CommonConditionTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/ChangePasswordPageValidValues.csv", numLinesToSkip = 1)
    public void TCDP194_65(String email, String oldPassword, String newPassword) {
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
                verifyCurrentPage(PagesURL.MY_ACCOUNT_PAGE);

        this.setPasswordBack(oldPassword);
    }

    public void setPasswordBack(String oldPassword) {
        MyAccountPageStep myAccountPageStep = new MyAccountPageStep(this.driver);
        myAccountPageStep.clickChangePasswordLink();

        ChangePasswordPageStep changePasswordPageStep = new ChangePasswordPageStep(this.driver);
        changePasswordPageStep.
                fillPasswordField(oldPassword).
                fillPasswordConfirmField(oldPassword).
                clickContinueButton();
    }
}
