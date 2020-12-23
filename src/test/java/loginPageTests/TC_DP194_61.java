package loginPageTests;

import basetest.CommonConditionTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TC_DP194_61 extends CommonConditionTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/ValidLoginCredits.csv", numLinesToSkip = 1)
    public void TCDP194_61(String login, String password) {
    }
}
