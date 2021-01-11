package product.page.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

//Validation the function of add the product to the shopping cart with valid quantity data
public class TC_DP194_26 extends ProductPagePreCondition {

    @ParameterizedTest
    @CsvFileSource(resources = "/ProductPageValidQuantity.csv", numLinesToSkip = 1)
    public void TCDP194_26(String quantity, String message) {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        productPageStep.clearFieldProductQuantity()
                .fillFieldProductQuantity(quantity)
                .addProductToShoppingCart()
                .verifySuccessMsgAddedProductToShoppingCart(message);
    }
}
