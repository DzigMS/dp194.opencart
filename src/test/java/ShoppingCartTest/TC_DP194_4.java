package ShoppingCartTest;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import steps.ProductPageStep;

//Validation removing items from cart
public class TC_DP194_4 extends CommonConditionTest {

    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PagesURL.PRODUCT_PAGE_URL);
    }

    @Test
    public void TCDP194_4_1() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);

        productPageStep.addProductToShoppingCart()
                .goToShoppingCart()
                .removeShoppingCart()
                .clickContinueButton().verifyCurrentPage(PagesURL.HOME_PAGE_URL);
    }
}
