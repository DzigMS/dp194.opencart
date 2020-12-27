package productTests;

import basetest.CommonConditionTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import steps.CategoryPageStep;
import steps.HomePageStep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TC_DP194_37 extends CommonConditionTest {


    @ParameterizedTest
    @MethodSource("AZValues")
    public void SortAZ(List<String> expected){
        HomePageStep homePageStep = new HomePageStep(this.driver);
        CategoryPageStep categoryPageStep = homePageStep.clickPhoneNavBar();
        categoryPageStep.compareResult(expected, categoryPageStep.selectShowValueNameAZStep().getItemNames());
    }

    private static Stream<List<String>> AZValues() {
        ArrayList<String> expected = new ArrayList<String>(
                Arrays.asList(
                        "HTC Touch HD",
                        "iPhone",
                        "Palm Treo Pro"
                ));
        return Stream.of(expected);
    }


    @ParameterizedTest
    @MethodSource("ZAValues")
    public void SortZA(List<String> expected){
        HomePageStep homePageStep = new HomePageStep(this.driver);
        CategoryPageStep categoryPageStep = homePageStep.clickPhoneNavBar();
        categoryPageStep.compareResult(expected, categoryPageStep.selectShowValueNameZAStep().getItemNames());
    }

    private static Stream<List<String>> ZAValues() {
        ArrayList<String> expected = new ArrayList<String>(
                Arrays.asList(
                        "Palm Treo Pro",
                        "iPhone",
                        "HTC Touch HD"
                ));
        return Stream.of(expected);
    }

    @ParameterizedTest
    @MethodSource("AZValues")
    public void PriceLowHigh(List<String> expected){
        HomePageStep homePageStep = new HomePageStep(this.driver);
        CategoryPageStep categoryPageStep = homePageStep.clickPhoneNavBar();
        categoryPageStep.compareResult(expected, categoryPageStep.selectShowValueNamePriceLowHigh().getItemNames());
    }


    @ParameterizedTest
    @MethodSource("ZAValues")
    public void PriceHighLow(List<String> expected){
        HomePageStep homePageStep = new HomePageStep(this.driver);
        CategoryPageStep categoryPageStep = homePageStep.clickPhoneNavBar();
        categoryPageStep.compareResult(expected, categoryPageStep.selectShowValueNamePriceHighLow().getItemNames());
    }


    @ParameterizedTest
    @MethodSource("ZAValues")
    public void HighestRating(List<String> expected){
        HomePageStep homePageStep = new HomePageStep(this.driver);
        CategoryPageStep categoryPageStep = homePageStep.clickPhoneNavBar();
        categoryPageStep.compareResult(expected, categoryPageStep.selectShowValueNameHighestRatingStep().getItemNames());
    }


    @ParameterizedTest
    @MethodSource("AZValues")
    public void LowestRating(List<String> expected){
        HomePageStep homePageStep = new HomePageStep(this.driver);
        CategoryPageStep categoryPageStep = homePageStep.clickPhoneNavBar();
        categoryPageStep.compareResult(expected, categoryPageStep.selectShowValueNameLowestRatingStep().getItemNames());
    }

}
