import basetest.CommonConditionTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TC_DP194_46 extends CommonConditionTest {

    private static final String PRODUCT_PAGE_URL = "http://34.121.117.87/htc-touch-hd";
    private String warningMessage = "Incorrect format!";

    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PRODUCT_PAGE_URL);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidQuantity.csv", numLinesToSkip = 1)
    public void TCDP194_46(String quantity) {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String actual = productPageStep.clearFieldProductQuantityStep()
                .fillFieldProductQuantityStep(quantity)
                .addProductToShoppingCartStep()
                .getWaringMessageAboutAddedProductToShoppingCartStep();
        assertEquals
                (warningMessage, actual);
    }
}
