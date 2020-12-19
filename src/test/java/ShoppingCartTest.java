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
        String actual = productPageSteps.getProductNameFromProductPage();
        productPageSteps.goToShoppingCart(driver);
        shoppingCartSteps = new ShoppingCartSteps(driver);
        assertEquals(shoppingCartSteps.getAddedProductNameIntoShoppingCartTest(), actual);
    }
}
