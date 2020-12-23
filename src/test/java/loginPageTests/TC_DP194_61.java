package loginPageTests;

import basetest.CommonConditionTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.LoginPageStep;

public class TC_DP194_61 extends CommonConditionTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/ValidLoginCredits.csv", numLinesToSkip = 1)
    public void TCDP194_61(String email, String password) {
        LoginPageStep loginPageStep = new LoginPageStep(this.driver);
        loginPageStep.
                fillEmailField(email).
                fillPasswordField(password).
                clickLoginButton();
    }
}
