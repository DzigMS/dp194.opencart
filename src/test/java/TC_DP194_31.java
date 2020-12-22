import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Validation the function adding a product review with valid data
public class TC_DP194_31 extends CommonConditionTest {
    private static final String PRODUCT_PAGE_URL = "http://34.121.117.87/htc-touch-hd";

    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PRODUCT_PAGE_URL);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/validReview.csv", numLinesToSkip = 1)
    public void TCDP194_31(String name, String review, String message) {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String actual = productPageStep.goToModelProductReviewStep()
                .fillNameTexBoxProductReviewStep(name).fillReviewTexBoxProductReviewStep(review)
                .murkDownProductRatingRadioProductReviewStep()
                .clickContinueButtonProductReviewStep().getMessageSuccessProductReviewStep();
        assertEquals(message, actual);
    }
}
