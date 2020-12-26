package ProductPageTest;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Validation the function adding a product review with valid quantity data
public class TC_DP194_31 extends CommonConditionTest {

    @BeforeEach
    public void openProductPage() {
        driver.openUrl(PagesURL.PRODUCT_PAGE_URL);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/validReview.csv", numLinesToSkip = 1)
    public void TCDP194_31(String name, String review, String message) {
        ProductPageStep productPageStep = new ProductPageStep(this.driver);
        String actual = productPageStep.goToModelProductReview()
                .fillNameTexBoxProductReview(name).fillReviewTexBoxProductReview(review)
                .murkDownProductRatingRadioProductReview()
                .clickContinueButtonProductReview().getMessageSuccessProductReview();
        assertEquals(message, actual);
    }
}
