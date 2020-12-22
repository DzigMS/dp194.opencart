import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TC_DP194_26 extends CommonConditionTest {
    //Validation the function of add the product to the shopping cart with valid data
    @ParameterizedTest
    @CsvFileSource(resources = "/validQuantity.csv", numLinesToSkip = 1)
    public void TCDP194_26(String quantity) {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String actual = productPageStep.clearFieldProductQuantityStep()
                .fillFieldProductQuantityStep(quantity)
                .addProductToShoppingCartStep()
                .getSuccessMessageAboutAddedProductToShoppingCartStep();
        assertEquals
                (productPageStep.createExpectedSuccessMessageAddProductToShoppingCartStep(), actual);
    }
}
