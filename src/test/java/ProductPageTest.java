import org.junit.jupiter.api.Test;
import steps.ProductPageSteps;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductPageTest extends CommonConditionTest {

    ProductPageSteps productPageSteps;

    @Test
    public void validationWriteProductReviewTest() {
        productPageSteps = new ProductPageSteps(driver);
        productPageSteps.goToModelProductReviewStep();
        productPageSteps.fillNameTexBoxProductReviewStep();
        productPageSteps.fillReviewTexBoxProductReviewStep();
        productPageSteps.murkDownProductRatingRadioProductReviewStep();
        productPageSteps.clickContinueButtonProductReviewStep();
        assertEquals(productPageSteps.getMessageSuccessProductReviewStep(),
                productPageSteps.createExpectedSuccessMessageAddProductReviewStep());
    }

    @Test
    public void validationGetSuccessMessageAboutAddedProductToShoppingCartTest() {
        productPageSteps = new ProductPageSteps(driver);
        productPageSteps.clearFieldProductQuantityStep();
        productPageSteps.fillFieldProductQuantityStep("2");
        productPageSteps.addProductToShoppingCartStep();
        assertEquals
                (productPageSteps.getSuccessMessageAboutAddedProductToShoppingCartStep(),
                        productPageSteps.createExpectedSuccessMessageAddProductToShoppingCartStep());
    }
}
