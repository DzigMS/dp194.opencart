import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import steps.HomePageStep;
import steps.ProductPageSteps;
import steps.ShoppingCartSteps;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest extends CommonConditionTest {
    ShoppingCartSteps shoppingCartSteps;
    ProductPageSteps productPageSteps;
    HomePageStep homePageStep;


    @Test
    public void validationTheProductByNameInTheShoppingCardTest() {
        productPageSteps = new ProductPageSteps(driver);
        String actual = productPageSteps.getProductNameFromProductPageStep();
        productPageSteps.addProductToShoppingCartStep();
        productPageSteps.goToShoppingCartStep(driver);
        shoppingCartSteps = new ShoppingCartSteps(driver);
        assertEquals(shoppingCartSteps.getAddedProductNameFromShoppingCartStep(), actual);
    }

    @Test
    public void validationTheProductByPriceInTheShoppingCardTest() {
        productPageSteps = new ProductPageSteps(driver);
        String actual = productPageSteps.getProductPriceFromProductPagStep();
        productPageSteps.addProductToShoppingCartStep();
        productPageSteps.goToShoppingCartStep(driver);
        shoppingCartSteps = new ShoppingCartSteps(driver);
        assertEquals(shoppingCartSteps.getAddedProductPriceFromShoppingCartStep(), actual);
    }

    @Test
    public void validationTheProductByQuantityInTheShoppingCardTest() {
        productPageSteps = new ProductPageSteps(driver);
        String actual = productPageSteps.getProductQuantityFromProductPagStep();
        productPageSteps.addProductToShoppingCartStep();
        shoppingCartSteps = productPageSteps.goToShoppingCartStep(driver);
        assertEquals(shoppingCartSteps.getAddedProductQuantityFromShoppingCartStep(), actual);
    }

    @Test
    public void validationChangingQuantityItemInTheShoppingCardTest() {
        productPageSteps = new ProductPageSteps(driver);
        productPageSteps.addProductToShoppingCartStep();
        shoppingCartSteps = productPageSteps.goToShoppingCartStep(driver);
        shoppingCartSteps.clearFieldQuantityProductInShoppingCartStep();
        shoppingCartSteps.fillQuantityProductInShoppingCartStep();
        assertEquals("2", shoppingCartSteps.getAddedProductQuantityFromShoppingCartStep());
    }

    @Test
    public void validationRemovingItemInTheShoppingCardTest() throws InterruptedException {
        productPageSteps = new ProductPageSteps(driver);
        productPageSteps.addProductToShoppingCartStep();
        shoppingCartSteps = productPageSteps.goToShoppingCartStep(driver);
        shoppingCartSteps.removeShoppingCartStep();
          Thread.sleep(50000);
        homePageStep = shoppingCartSteps.clickContinueButtonInShoppingCartStep(driver);


        assertEquals("http://34.121.117.87/index.php?route=common/home", homePageStep.getHomePageUrlStep(driver));
    }

}
