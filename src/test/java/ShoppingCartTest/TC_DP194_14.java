package ShoppingCartTest;

import ProductPageTest.ProductPagePreCondition;
import constants.PagesURL;
import org.junit.jupiter.api.Test;
import steps.ProductPageStep;

//Validation links of items working in cart
public class TC_DP194_14 extends ProductPagePreCondition {

    @Test
    public void TCDP194_14() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        productPageStep.addProductToShoppingCart()
                .goToShoppingCart()
                .clickLinkProductName().verifyCurrentPage(PagesURL.PRODUCT_PAGE_URL);
    }
}
