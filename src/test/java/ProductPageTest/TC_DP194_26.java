package ProductPageTest;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

//Validation the function of add the product to the shopping cart with valid quantity data
public class TC_DP194_26 extends CommonConditionTest {

    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PagesURL.PRODUCT_PAGE_URL);
    }

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
