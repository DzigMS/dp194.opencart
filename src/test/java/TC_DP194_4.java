import org.junit.jupiter.api.Test;
import steps.ProductPageStep;
import steps.ShoppingCartStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Validation removing items from cart
public class TC_DP194_4 extends CommonConditionTest {
    private final String urlHomePage = "http://34.121.117.87/index.php?route=common/home";

    @Test
    public void TCDP194_4() throws InterruptedException {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        ShoppingCartStep shoppingCartStep = productPageStep.addProductToShoppingCartStep()
                .goToShoppingCartStep(this.driver)
                .removeShoppingCartStep();
        Thread.sleep(10000);
        String actual = shoppingCartStep.clickContinueButtonInShoppingCartStep().getCurrentUrl();
        assertEquals(urlHomePage, actual);
    }
}
