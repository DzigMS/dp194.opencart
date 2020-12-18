package steps;

import driver.Driver;
import model.ProductReview;
import pages.ProductPage;

public class ProductPageSteps {
    private ProductPage productPage;

    public ProductPageSteps(Driver driver) {
        this.productPage = new ProductPage(driver);
    }

    public String writeProductReview() {
        productPage.goToModelProductReview();
        productPage.getProductReview().fillNameTexBox("gjdlrjg;a lrjlej");
        productPage.getProductReview().fillReviewTextBox("fhjarlfEFKekfn nwenEWKFLHEKWJFwfNEDGRSGSEGKN>kn >NEKJEW");
        productPage.getProductReview().murkDownProductRatingRadio();
        productPage.getProductReview().clickContinueButtonReview();
        return productPage.getProductReview().getMessageSuccess();
    }
}
