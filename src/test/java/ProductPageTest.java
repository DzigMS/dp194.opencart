import org.junit.jupiter.api.Test;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductPageTest extends CommonConditionTest {
//   ProductPageTest productPageStep;
    private final String ExpectedSuccessMessageAddProductReview = "Thank you for your review. It has been submitted to the webmaster for approval.";




//
//    @Test
//    public void validationWriteProductReviewTest() {
//        productPageStep = new ProductPageTest();
//        productPageStep.goToModelProductReviewStep();
//        productPageStep.fillNameTexBoxProductReviewStep();
//        productPageStep.fillReviewTexBoxProductReviewStep();
//        productPageStep.murkDownProductRatingRadioProductReviewStep();
//        productPageStep.clickContinueButtonProductReviewStep();
//        assertEquals(productPageStep.getMessageSuccessProductReviewStep(),
//                productPageStep.createExpectedSuccessMessageAddProductReviewStep());
//    }
//
    @Test
    public void validationGetSuccessMessageAboutAddedProductToShoppingCartTest() {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        productPageStep.clearFieldProductQuantityStep();
        productPageStep.fillFieldProductQuantityStep("2");
        productPageStep.addProductToShoppingCartStep();
        assertEquals
                (productPageStep.getSuccessMessageAboutAddedProductToShoppingCartStep(),
                        productPageStep.createExpectedSuccessMessageAddProductToShoppingCartStep());
    }
}
