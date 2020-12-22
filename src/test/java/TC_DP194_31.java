import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TC_DP194_31 extends CommonConditionTest {

    //Validation the function adding a product review with valid data
    @ParameterizedTest
    @CsvFileSource(resources = "/validReview.csv",numLinesToSkip = 1)
    public void TCDP194_31(String name,String review, String message) {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String actual =  productPageStep.goToModelProductReviewStep()
                .fillNameTexBoxProductReviewStep(name).fillReviewTexBoxProductReviewStep(review)
                .murkDownProductRatingRadioProductReviewStep()
                .clickContinueButtonProductReviewStep().getMessageSuccessProductReviewStep();
        assertEquals(message, actual);
    }
}
