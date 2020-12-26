package ProductPageTest;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import steps.ProductPageStep;

//Validation adding item into shopping cart
public class TC_DP194_2 extends CommonConditionTest {


    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PagesURL.PRODUCT_PAGE_URL);
    }

    @Test
    public void TCDP194_2ValidationName() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String expected = productPageStep.getProductName();
        productPageStep.addProductToShoppingCart()
                .goToShoppingCart().verifyAddedProductName(expected);
    }

    @Test
    public void TCDP194_2ValidationPrice() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String expected = productPageStep.getProductPrice();
        productPageStep.addProductToShoppingCart()
                .goToShoppingCart().verifyAddedProductPrice(expected);
    }

    @Test
    public void TCDP194_2ValidationQuantity() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String expected = productPageStep.getProductQuantity();
        productPageStep.addProductToShoppingCart()
                .goToShoppingCart().verifyAddedProductQuantity(expected);
    }
}
