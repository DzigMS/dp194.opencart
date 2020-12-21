import driver.Driver;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import steps.CategoryPageSteps;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DP_194_37 {

    Driver driver;
    CategoryPageSteps categoryPageSteps;

    @BeforeEach
    public void start() {
        driver = Driver.configureDriver("firefox");
        driver.openUrl("http://34.121.117.87/smartphone");
        this.categoryPageSteps = new CategoryPageSteps(driver);
    }

    @Test
    public void testNameAZSort() {
        categoryPageSteps = new CategoryPageSteps(driver);
        categoryPageSteps.getItemNames();
        assertEquals(categoryPageSteps.selectShowValueNameAZStep(),
                categoryPageSteps.createShowValueNameAZStepResult());
    }

    @Test
    public void testNameZASort(){
        categoryPageSteps = new CategoryPageSteps(driver);
        categoryPageSteps.getItemNames();
        assertEquals(categoryPageSteps.selectShowValueNameZAStep(),
                categoryPageSteps.createShowValueNameZAStepResult());
    }

    @Test
    public void testPriceLowHighSort(){
        categoryPageSteps = new CategoryPageSteps(driver);
        categoryPageSteps.getItemNames();
        assertEquals(categoryPageSteps.selectShowValueNamePriceLowHighStep(),
                categoryPageSteps.createShowValuePriceLowHighStepResult());
    }

    @Test
    public void testPriceHighLowSort(){
        categoryPageSteps = new CategoryPageSteps(driver);
        categoryPageSteps.getItemNames();
        assertEquals(categoryPageSteps.selectShowValueNamePriceHighLowStep(),
                categoryPageSteps.createShowValuePriceHighLowStepResult());
    }

    @Test
    public void testRatingHighestSort(){
        categoryPageSteps = new CategoryPageSteps(driver);
        categoryPageSteps.getItemNames();
        assertEquals(categoryPageSteps.selectShowValueNameHighestRatingStep(),
                categoryPageSteps.createShowValueHighestRatingResult());
    }

    @Test
    public void addToComparation(){
        categoryPageSteps = new CategoryPageSteps(driver);
        categoryPageSteps.clickAddToCompareButton();
        
    }

}
