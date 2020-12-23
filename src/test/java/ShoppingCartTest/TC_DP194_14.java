package ShoppingCartTest;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Validation links of items working in cart
public class TC_DP194_14 extends CommonConditionTest {


    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PagesURL.PRODUCT_PAGE_URL);
    }
    @Test
    public void TCDP194_14() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String actual = productPageStep.addProductToShoppingCartStep()
                .goToShoppingCartStep(driver)
                .clickLinkProductNameFromShoppingCarTable().getCurrentPage();
        assertEquals(PagesURL.PRODUCT_PAGE_URL, actual);
    }
}
