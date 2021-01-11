package shopping.cart.test;

import product.page.test.ProductPagePreCondition;
import constants.PagesURL;
import org.junit.jupiter.api.Test;
import steps.ProductPageStep;

//Validation removing items from cart
public class TC_DP194_4 extends ProductPagePreCondition {

    @Test
    public void TCDP194_4() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        productPageStep.addProductToShoppingCart()
                .goToShoppingCart()
                .removeShoppingCart()
                .clickContinueButton().verifyCurrentPage(PagesURL.HOME_PAGE_URL);
    }
}
