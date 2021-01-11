package product_page;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

//Validation the function of add the product to the shopping cart with invalid quantity data
public class TC_DP194_46 extends ProductPagePreCondition {

    @ParameterizedTest
    @CsvFileSource(resources = "/ProductPageInvalidQuantity.csv", numLinesToSkip = 1)
    public void TCDP194_46(String quantity, String warningMessage) {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        productPageStep.clearFieldProductQuantity()
                .fillFieldProductQuantity(quantity)
                .addProductToShoppingCart()
                .verifyWarningMsgAddedProductToShoppingCart(true);
    }
}
