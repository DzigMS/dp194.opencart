package ProductPageTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

//Validation adding item into shopping cart
public class TC_DP194_2 extends ProductPagePreCondition {

    @ParameterizedTest
    @CsvFileSource(resources = "/ProductPageName.csv", numLinesToSkip = 1)
    public void TCDP194_2ValidationName(String expected) {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        productPageStep.addProductToShoppingCart()
                .goToShoppingCart().verifyAddedProductName(expected);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/ProductPagePrice.csv", numLinesToSkip = 1)
    public void TCDP194_2ValidationPrice(String expected) {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        productPageStep.addProductToShoppingCart()
                .goToShoppingCart().verifyAddedProductPrice(expected);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/ProductPageQuantity.csv", numLinesToSkip = 1)
    public void TCDP194_2ValidationQuantity(String expected) {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        productPageStep.addProductToShoppingCart()
                .goToShoppingCart().verifyAddedProductQuantity(expected);
    }
}
