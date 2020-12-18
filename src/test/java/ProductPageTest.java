import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;
import steps.ProductPageSteps;

public class ProductPageTest extends CommonConditionTest {

    ProductPageSteps productPageSteps;

    @Test
    public void writeProductReview() {
        productPageSteps = new ProductPageSteps(driver);
        String actual = productPageSteps.writeProductReview();
        Assert.assertEquals(actual,"Thank you for your review. It has been submitted to the webmaster for approval.");
    }
}
