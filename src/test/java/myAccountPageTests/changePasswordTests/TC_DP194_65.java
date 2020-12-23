package myAccountPageTests.changePasswordTests;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.HomePageStep;

/**
 * TC_DP194_65
 * My Account page: Validation of Password Change, valid values
 */
public class TC_DP194_65 extends CommonConditionTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/ForgottenPasswordPageValidEmail.csv", numLinesToSkip = 1)
    public void TCDP194_65(String password) {
        HomePageStep homePageStep = new HomePageStep(this.driver);

    }
}
