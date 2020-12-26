package ProductPageTest;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Validation the function adding a product review with invalid quantity data
public class TC_DP194_46 extends CommonConditionTest {

    private String warningMessage = "Incorrect format!";

    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PagesURL.PRODUCT_PAGE_URL);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidQuantity.csv", numLinesToSkip = 1)
    public void TCDP194_46(String quantity) {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String actual = productPageStep.clearFieldProductQuantity()
                .fillFieldProductQuantity(quantity)
                .addProductToShoppingCart()
                .getWaringMessageAboutAddedProductToShoppingCart();
        assertEquals
                (warningMessage, actual);
    }
}
