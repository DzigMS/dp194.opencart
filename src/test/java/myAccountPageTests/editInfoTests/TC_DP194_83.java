package myAccountPageTests.editInfoTests;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.EditInfoPageStep;
import steps.HomePageStep;
import steps.LoginPageStep;
import steps.MyAccountPageStep;

/**
 * TC_DP194_83
 * My Account page: Validation of Profile Edit, invalid values
 */
public class TC_DP194_83  extends CommonConditionTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/EditInfoPageInvalidValuesEmailEdit.csv", numLinesToSkip = 1)
    public void TCDP194_83_Email_Edit(String oldEmail, String password, String newEmail) {
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
                verifyCurrentPage(PagesURL.EDIT_INFO_PAGE).
                emailErrMsgAppeared();
    }
}
