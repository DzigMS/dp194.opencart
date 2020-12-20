import org.junit.jupiter.api.Test;
import steps.ProductPageSteps;
import steps.ShoppingCartSteps;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest extends CommonConditionTest {
    ShoppingCartSteps shoppingCartSteps;
    ProductPageSteps productPageSteps;

    @Test
    public void checkingTheProductByNameInTheShoppingCardTest() {
        productPageSteps = new ProductPageSteps(driver);
        String actual = productPageSteps.getProductNameFromProductPageStep();
        productPageSteps.addProductToShoppingCartStep();
        productPageSteps.goToShoppingCartStep(driver);
        shoppingCartSteps = new ShoppingCartSteps(driver);
        assertEquals(shoppingCartSteps.getAddedProductNameFromShoppingCartStep(), actual);
    }

    @Test
    public void checkingTheProductByPriceInTheShoppingCardTest() {
        productPageSteps = new ProductPageSteps(driver);
        String actual = productPageSteps.getProductPriceFromProductPagStep();
        productPageSteps.addProductToShoppingCartStep();
        productPageSteps.goToShoppingCartStep(driver);
        shoppingCartSteps = new ShoppingCartSteps(driver);
        assertEquals(shoppingCartSteps.getAddedProductPriceFromShoppingCartStep(), actual);
    }
    @Test
    public void checkingTheProductByQuantityInTheShoppingCardTest() {
        productPageSteps = new ProductPageSteps(driver);
        String actual = productPageSteps.getProductQuantityFromProductPagStep();
        productPageSteps.addProductToShoppingCartStep();
        productPageSteps.goToShoppingCartStep(driver);
        shoppingCartSteps = new ShoppingCartSteps(driver);
        assertEquals(shoppingCartSteps.getAddedProductQuantityFromShoppingCartStep(), actual);
    }
    @Test
    public void checkingChangeQuantityInTheShoppingCardTest() {
        productPageSteps = new ProductPageSteps(driver);
        productPageSteps.addProductToShoppingCartStep();
        productPageSteps.goToShoppingCartStep(driver);
        shoppingCartSteps = new ShoppingCartSteps(driver);
        shoppingCartSteps.clearFieldQuantityProductInShoppingCartStep();
        shoppingCartSteps.fillQuantityProductInShoppingCartStep();

        assertEquals("2",shoppingCartSteps.getAddedProductQuantityFromShoppingCartStep());
    }

}
