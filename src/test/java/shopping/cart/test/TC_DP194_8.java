package shopping.cart.test;

import product.page.test.ProductPagePreCondition;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

//Validation applying correct coupon code
public class TC_DP194_8 extends ProductPagePreCondition {

    @ParameterizedTest
    @CsvFileSource(resources = "/ShoppingCartPageValidCoupon.csv", numLinesToSkip = 1)
    public void TCDP194_8(String coupon, String message) {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        productPageStep.addProductToShoppingCart()
                .goToShoppingCart()
                .clickUseCouponCodeLinkDropdown()
                .fillCouponTextInput(coupon)
                .clickApplyCouponButton()
                .verifySuccessMsgModified(message);
    }
}
