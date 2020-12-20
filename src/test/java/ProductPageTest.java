import org.junit.jupiter.api.Test;
import steps.ProductPageSteps;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductPageTest extends CommonConditionTest {

    ProductPageSteps productPageSteps;

    @Test
    public void writeProductReviewTest() {
        productPageSteps = new ProductPageSteps(driver);
        assertEquals(productPageSteps.writeProductReviewStep(),
                productPageSteps.createExpectedSuccessMessageAddProductReview());
    }

    @Test
    public void getSuccessMessageAboutAddedProductToShoppingCartTest() {
        productPageSteps = new ProductPageSteps(driver);
        assertEquals
                (productPageSteps.getSuccessMessageAboutAddedProductToShoppingCartStep(),
                        productPageSteps.createExpectedSuccessMessageAddProductToShoppingCart());
    }
}
