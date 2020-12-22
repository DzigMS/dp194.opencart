import org.junit.jupiter.api.Test;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Validation links of items working in cart
public class TC_DP194_14 extends CommonConditionTest {
    private final String urlProductPage = "http://34.121.117.87/htc-touch-hd";

    @Test
    public void TCDP194_14() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String actual = productPageStep.addProductToShoppingCartStep()
                .goToShoppingCartStep(driver)
                .clickLinkProductNameFromShoppingCarTable().getUrlProductPage();
        assertEquals(urlProductPage, actual);
    }
}
