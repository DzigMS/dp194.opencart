//import org.junit.jupiter.api.Test;
//import steps.HomePageStep;
//import steps.ProductPageSteps;
//import steps.ShoppingCartStep;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class ShoppingCartTest extends CommonConditionTest {
//    ShoppingCartStep shoppingCartStep;
//    ProductPageSteps productPageSteps;
//    HomePageStep homePageStep;
//
//
//    @Test
//    public void validationTheProductByNameInTheShoppingCardTest() {
//        productPageSteps = new ProductPageSteps(driver);
//        String actual = productPageSteps.getProductNameFromProductPageStep();
//        productPageSteps.addProductToShoppingCartStep();
//        productPageSteps.goToShoppingCartStep(driver);
//        shoppingCartStep = new ShoppingCartStep(driver);
//        assertEquals(shoppingCartStep.getAddedProductNameFromShoppingCartStep(), actual);
//    }
//
//    @Test
//    public void validationTheProductByPriceInTheShoppingCardTest() {
//        productPageSteps = new ProductPageSteps(driver);
//        String actual = productPageSteps.getProductPriceFromProductPagStep();
//        productPageSteps.addProductToShoppingCartStep();
//        productPageSteps.goToShoppingCartStep(driver);
//        shoppingCartStep = new ShoppingCartStep(driver);
//        assertEquals(shoppingCartStep.getAddedProductPriceFromShoppingCartStep(), actual);
//    }
//
//    @Test
//    public void validationTheProductByQuantityInTheShoppingCardTest() {
//        productPageSteps = new ProductPageSteps(driver);
//        String actual = productPageSteps.getProductQuantityFromProductPagStep();
//        productPageSteps.addProductToShoppingCartStep();
//        shoppingCartStep = productPageSteps.goToShoppingCartStep(driver);
//        assertEquals(shoppingCartStep.getAddedProductQuantityFromShoppingCartStep(), actual);
//    }
//

//    @Test
//    public void validationRemovingItemInTheShoppingCardTest() throws InterruptedException {
//        productPageSteps = new ProductPageSteps(driver);
//        productPageSteps.addProductToShoppingCartStep();
//        shoppingCartStep = productPageSteps.goToShoppingCartStep(driver);
//        shoppingCartStep.removeShoppingCartStep();
//          Thread.sleep(50000);
//        homePageStep = shoppingCartStep.clickContinueButtonInShoppingCartStep(driver);
//
//
//        assertEquals("http://34.121.117.87/index.php?route=common/home", homePageStep.getHomePageUrlStep(driver));
//    }
//
//}
