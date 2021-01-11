package shopping_cart;

import product_page.ProductPagePreCondition;
import constants.PagesURL;
import org.junit.jupiter.api.Test;
import steps.ProductPageStep;

// Validation continue shopping from cart
public class TC_DP194_13 extends ProductPagePreCondition {

    @Test
    public void TCDP194_13() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        productPageStep.addProductToShoppingCart()
                .goToShoppingCart().clickContinueShoppingButton()
                .verifyCurrentPage(PagesURL.HOME_PAGE_URL);
    }
}
