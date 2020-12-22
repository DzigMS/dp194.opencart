import basetest.CommonConditionTest;
import org.junit.jupiter.api.Test;
import steps.ProductPageStep;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductPageTest extends CommonConditionTest {

    ProductPageStep productPageSteps;

    @Test
    public void writeProductReviewTest() {
        productPageSteps = new ProductPageStep(driver);
        assertEquals(productPageSteps.writeProductReviewStep(),
                productPageSteps.createExpectedSuccessMessageAddProductReview());
    }

    @Test
    public void getSuccessMessageAboutAddedProductToShoppingCartTest() {
        productPageSteps = new ProductPageStep(driver);
        assertEquals
                (productPageSteps.getSuccessMessageAboutAddedProductToShoppingCartStep(),
                        productPageSteps.createExpectedSuccessMessageAddProductToShoppingCart());
    }
}
