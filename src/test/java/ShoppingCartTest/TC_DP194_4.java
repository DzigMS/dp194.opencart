package ShoppingCartTest;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import steps.ProductPageStep;
import steps.ShoppingCartStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Validation removing items from cart
public class TC_DP194_4 extends CommonConditionTest {

    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PagesURL.PRODUCT_PAGE_URL);
    }

    @Test
    public void TCDP194_4() throws InterruptedException {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        ShoppingCartStep shoppingCartStep = productPageStep.addProductToShoppingCartStep()
                .goToShoppingCartStep(this.driver)
                .removeShoppingCartStep();
        Thread.sleep(10000);
        String actual = shoppingCartStep.clickContinueButtonInShoppingCartStep().getCurrentPage();
        assertEquals(PagesURL.URL_HOME_PAGE, actual);
    }
}
