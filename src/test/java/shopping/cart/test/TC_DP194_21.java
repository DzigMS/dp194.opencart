package shopping.cart.test;

import product.page.test.ProductPagePreCondition;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

//Validation changing quantity of items in cart to correct value
public class TC_DP194_21 extends ProductPagePreCondition {

    @ParameterizedTest
    @CsvFileSource(resources = "/ShoppingCartValidQuantity.csv", numLinesToSkip = 1)
    public void TCDP194_21(String quantity, String message) {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        productPageStep.addProductToShoppingCart()
                .goToShoppingCart()
                .clearFieldQuantityProduct()
                .fillQuantityProduct(quantity)
                .updateQuantity()
                .verifySuccessMsgModified(message);
    }
}
