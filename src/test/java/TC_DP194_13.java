import org.junit.jupiter.api.Test;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Validation continue shopping from cart
public class TC_DP194_13 extends CommonConditionTest {
    private final String urlHomePage = "http://34.121.117.87/index.php?route=common/home";

    @Test
    public void TCDP194_13() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String actual = productPageStep.addProductToShoppingCartStep()
                .goToShoppingCartStep(driver).clickContinueShoppingButtonInShoppingCartStep()
                .getCurrentUrl();
        assertEquals(urlHomePage, actual);
    }
}
