package ShoppingCartTest;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Validation applying correct coupon code

public class TC_DP194_8 extends CommonConditionTest {
    private static final String SUCCESS_MESSAGE = "Success: Your coupon discount has been applied!\n×";


    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PagesURL.PRODUCT_PAGE_URL);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/validCoupon.csv", numLinesToSkip = 1)
    public void TCDP194_4(String coupon) {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String actual = productPageStep.addProductToShoppingCartStep()
                .goToShoppingCartStep(this.driver)
                .clickUseCouponCodeLinkDropdownStep()
                .fillCouponTextInputStep(coupon)
                .clickApplyCouponButtonStep()
                .getSuccessMessageModifiedShoppingCartStep();
        assertEquals(SUCCESS_MESSAGE, actual);
    }
}
