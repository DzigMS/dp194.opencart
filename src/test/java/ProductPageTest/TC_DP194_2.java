package ProductPageTest;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Validation adding item into shopping cart
public class TC_DP194_2 extends CommonConditionTest {


    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PagesURL.PRODUCT_PAGE_URL);
    }
    @Test
    public void TCDP194_2ValidationName() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String expected = productPageStep.getProductNameFromProductPage();
        String actual = productPageStep.addProductToShoppingCart()
                .goToShoppingCart().getAddedProductNameFromShoppingCart();
        assertEquals(expected,actual);
    }
    @Test
    public void TCDP194_2TCDP194_2ValidationPrice() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String expected = productPageStep.getProductPriceFromProductPage();
        String actual = productPageStep.addProductToShoppingCart()
                .goToShoppingCart().getAddedProductPriceFromShoppingCart();
        assertEquals(expected,actual);
    }

    @Test
    public void TCDP194_2TCDP194_2ValidationQuantity() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String expected = productPageStep.getProductQuantityFromProductPage();
        String actual = productPageStep.addProductToShoppingCart()
                .goToShoppingCart().getAddedProductQuantityFromShoppingCart();
        assertEquals(expected,actual);
    }
}
