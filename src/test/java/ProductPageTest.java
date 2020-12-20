import org.junit.jupiter.api.Test;
import steps.ProductPageSteps;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductPageTest extends CommonConditionTest {

    ProductPageSteps productPageSteps;

    @Test
    public void checkWriteProductReviewTest() {
        productPageSteps = new ProductPageSteps(driver);
        assertEquals(productPageSteps.writeProductReviewStep(),
                productPageSteps.createExpectedSuccessMessageAddProductReviewStep());
    }

    @Test
    public void checkGetSuccessMessageAboutAddedProductToShoppingCartTest() {
        productPageSteps = new ProductPageSteps(driver);
        productPageSteps.clearFieldProductQuantityStep();
        productPageSteps.fillFieldProductQuantityStep();
        productPageSteps.addProductToShoppingCartStep();
        assertEquals
                (productPageSteps.getSuccessMessageAboutAddedProductToShoppingCartStep(),
                        productPageSteps.createExpectedSuccessMessageAddProductToShoppingCartStep());
    }
}
