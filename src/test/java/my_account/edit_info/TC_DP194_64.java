package my_account.edit_info;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.*;

/**
 * TC_DP194_64
 * My Account page: Validation of Profile Edit, valid values
 */
public class TC_DP194_64 extends CommonConditionTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/EditInfoPageValidValuesEmailEdit.csv", numLinesToSkip = 1)
    public void TCDP194_64_Email_Edit(String oldEmail, String password, String newEmail) {
        HomePageStep homePageStep = new HomePageStep(this.driver);
        homePageStep.goToLoginPage();

        LoginPageStep loginPageStep = new LoginPageStep(this.driver);
        loginPageStep.
                fillEmailField(oldEmail).
                fillPasswordField(password).clickLoginButton();

        MyAccountPageStep myAccountPageStep = new MyAccountPageStep(this.driver);
        myAccountPageStep.clickEditInfoLink();

        EditInfoPageStep editInfoPageStep = new EditInfoPageStep(this.driver);
        editInfoPageStep.
                fillEmailField(newEmail).
                clickContinueButton().
                verifyCurrentPage(PagesURL.MY_ACCOUNT_PAGE);

        this.setEmailBack(oldEmail);
    }

    public void setEmailBack(String oldEmail) {
        MyAccountPageStep myAccountPageStep = new MyAccountPageStep(this.driver);
        myAccountPageStep.clickEditInfoLink();

        EditInfoPageStep editInfoPageStep = new EditInfoPageStep(this.driver);
        editInfoPageStep.
                fillEmailField(oldEmail).
                clickContinueButton();
    }
}
