package ShoppingCartTest;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

//Validation changing quantity of items in cart to correct value
public class TC_DP194_21 extends CommonConditionTest {

    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PagesURL.PRODUCT_PAGE_URL);
    }

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
