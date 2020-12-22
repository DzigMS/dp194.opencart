import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Validation adding item into shopping cart
public class TC_DP194_2 extends CommonConditionTest {
    private static final String PRODUCT_PAGE_URL = "http://34.121.117.87/htc-touch-hd";

    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PRODUCT_PAGE_URL);
    }
    @Test
    public void TCDP194_2ValidationName() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String expected = productPageStep.getProductNameFromProductPageStep();
        String actual = productPageStep.addProductToShoppingCartStep()
                .goToShoppingCartStep(this.driver).getAddedProductNameFromShoppingCartStep();
        assertEquals(expected,actual);
    }
    @Test
    public void TCDP194_2TCDP194_2ValidationPrice() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String expected = productPageStep.getProductPriceFromProductPagStep();
        String actual = productPageStep.addProductToShoppingCartStep()
                .goToShoppingCartStep(this.driver).getAddedProductPriceFromShoppingCartStep();
        assertEquals(expected,actual);
    }

    @Test
    public void TCDP194_2TCDP194_2ValidationQuantity() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String expected = productPageStep.getProductQuantityFromProductPagStep();
        String actual = productPageStep.addProductToShoppingCartStep()
                .goToShoppingCartStep(this.driver).getAddedProductQuantityFromShoppingCartStep();
        assertEquals(expected,actual);
    }
}
