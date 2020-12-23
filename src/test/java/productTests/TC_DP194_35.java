package productTests;

import basetest.CommonConditionTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import steps.CategoryPageStep;
import steps.HomePageStep;

import java.util.stream.Stream;

public class TC_DP194_35 extends CommonConditionTest {

    @ParameterizedTest
    @MethodSource("expectedProductLink")
    public void TCDP194_35(String expected){

        HomePageStep homePageStep = new HomePageStep(this.driver);
        CategoryPageStep categoryPageStep = homePageStep.clickPhoneNavBar();
        categoryPageStep.clickProduct();
        categoryPageStep.verifyCurrentPage(expected);

    }

    private static Stream<String> expectedProductLink(){
        String str = "http://34.121.117.87/smartphone/htc-touch-hd";

        return Stream.of(str);

    }

}
