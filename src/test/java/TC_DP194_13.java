import basetest.CommonConditionTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Validation continue shopping from cart
public class TC_DP194_13 extends CommonConditionTest {
    private static final String URL_HOME_PAGE = "http://34.121.117.87/index.php?route=common/home";
    private static final String PRODUCT_PAGE_URL = "http://34.121.117.87/htc-touch-hd";

    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PRODUCT_PAGE_URL);
    }

    @Test
    public void TCDP194_13() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String actual = productPageStep.addProductToShoppingCartStep()
                .goToShoppingCartStep(driver).clickContinueShoppingButtonInShoppingCartStep()
                .getCurrentPage();
        assertEquals(URL_HOME_PAGE, actual);
    }
}
