import basetest.CommonConditionTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import steps.ProductPageStep;
import steps.ShoppingCartStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Validation removing items from cart
public class TC_DP194_4 extends CommonConditionTest {
    private static final String URL_HOME_PAGE = "http://34.121.117.87/index.php?route=common/home";
    private static final String PRODUCT_PAGE_URL = "http://34.121.117.87/htc-touch-hd";

    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PRODUCT_PAGE_URL);
    }

    @Test
    public void TCDP194_4() throws InterruptedException {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        ShoppingCartStep shoppingCartStep = productPageStep.addProductToShoppingCartStep()
                .goToShoppingCartStep(this.driver)
                .removeShoppingCartStep();
        Thread.sleep(10000);
        String actual = shoppingCartStep.clickContinueButtonInShoppingCartStep().getCurrentPage();
        assertEquals(URL_HOME_PAGE, actual);
    }
}
