import driver.Driver;


import org.junit.jupiter.api.Test;
import steps.CategoryPageStep;
import steps.HomePageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TC_DP_194_37 extends CommonConditionTest{

    Driver driver;
    CategoryPageStep categoryPageStep;
    @Test
    public void testNameAZSort() {
        HomePageStep homePageStep = new HomePageStep(this.driver);

        categoryPageStep = new CategoryPageStep(driver);
        categoryPageStep.getItemNames();
        assertEquals(categoryPageStep.selectShowValueNameAZStep(),
                categoryPageStep.createShowValueNameAZStepResult());
    }

    @Test
    public void testNameZASort(){
        categoryPageStep = new CategoryPageStep(driver);
        categoryPageStep.getItemNames();
        assertEquals(categoryPageStep.selectShowValueNameZAStep(),
                categoryPageStep.createShowValueNameZAStepResult());
    }

    @Test
    public void testPriceLowHighSort(){
        categoryPageStep = new CategoryPageStep(driver);
        categoryPageStep.getItemNames();
        assertEquals(categoryPageStep.selectShowValueNamePriceLowHighStep(),
                categoryPageStep.createShowValuePriceLowHighStepResult());
    }

    @Test
    public void testPriceHighLowSort(){
        categoryPageStep = new CategoryPageStep(driver);
        categoryPageStep.getItemNames();
        assertEquals(categoryPageStep.selectShowValueNamePriceHighLowStep(),
                categoryPageStep.createShowValuePriceHighLowStepResult());
    }

    @Test
    public void testRatingHighestSort(){
        categoryPageStep = new CategoryPageStep(driver);
        categoryPageStep.getItemNames();
        assertEquals(categoryPageStep.selectShowValueNameHighestRatingStep(),
                categoryPageStep.createShowValueHighestRatingResult());
    }

    @Test
    public void addToComparation(){
        categoryPageStep = new CategoryPageStep(driver);
        categoryPageStep.clickAddToCompareButton();
        
    }

}
