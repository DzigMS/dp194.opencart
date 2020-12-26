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
        ShoppingCartStep shoppingCartStep = productPageStep.addProductToShoppingCart()
                .goToShoppingCart()
                .removeShoppingCart();
        Thread.sleep(10000);
        String actual = shoppingCartStep.clickContinueButtonInShoppingCart().getCurrentPage();
        assertEquals(PagesURL.HOME_PAGE_URL, actual);
    }

    @Test
    public void TCDP194_41()  {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        ShoppingCartStep shoppingCartStep = productPageStep.addProductToShoppingCart()
                .goToShoppingCart()
                .removeShoppingCart();


        String actual = shoppingCartStep.clickContinueButtonInShoppingCart().getCurrentPage();
        assertEquals(PagesURL.HOME_PAGE_URL, actual);
    }
}
