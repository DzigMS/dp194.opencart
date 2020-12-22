import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Validation links of items working in cart
public class TC_DP194_14 extends CommonConditionTest {

    private static final String PRODUCT_PAGE_URL = "http://34.121.117.87/htc-touch-hd";

    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PRODUCT_PAGE_URL);
    }
    @Test
    public void TCDP194_14() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String actual = productPageStep.addProductToShoppingCartStep()
                .goToShoppingCartStep(driver)
                .clickLinkProductNameFromShoppingCarTable().getUrlProductPage();
        assertEquals(PRODUCT_PAGE_URL, actual);
    }
}
