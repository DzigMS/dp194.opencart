package ProductPageTest;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Validation the function of add the product to the shopping cart with valid quantity data
public class TC_DP194_26 extends CommonConditionTest {

    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PagesURL.PRODUCT_PAGE_URL);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/validQuantity.csv", numLinesToSkip = 1)
    public void TCDP194_26(String quantity) {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String actual = productPageStep.clearFieldProductQuantity()
                .fillFieldProductQuantity(quantity)
                .addProductToShoppingCart()
                .getSuccessMessageAboutAddedProductToShoppingCart();
        assertEquals
                (productPageStep.createExpectedSuccessMessageAddProductToShoppingCart(), actual);
    }
}
