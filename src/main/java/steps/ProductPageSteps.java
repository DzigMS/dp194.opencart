package steps;

import driver.Driver;
import model.ProductReview;
import pages.ProductPage;

public class ProductPageSteps {
    private ProductPage productPage;

    public ProductPageSteps(Driver driver) {
        this.productPage = new ProductPage(driver);
    }

    public String writeProductReviewStep() {
        productPage.goToModelProductReview();
        productPage.getProductReview().fillNameTexBox("gjdlrjg;a lrjlej");
        productPage.getProductReview().fillReviewTextBox("fhjarlfEFKekfn nwenEWKFLHEKWJFwfNEDGRSGSEGKN>kn >NEKJEW");
        productPage.getProductReview().murkDownProductRatingRadio();
        productPage.getProductReview().clickContinueButtonReview();
        return productPage.getProductReview().getMessageSuccess();
    }
    public String createExpectedSuccessMessageAddProductReview(){
        return "Thank you for your review. It has been submitted to the webmaster for approval.";
    }

    public String getSuccessMessageAboutAddedProductToShoppingCartStep(){
        productPage.addProductToShoppingCart();
        return productPage.getSuccessMessage();
    }

    public String createExpectedSuccessMessageAddProductToShoppingCart(){
        return "Success: You have added" + " " + productPage.getProductName() + " " + "to your shopping cart!\n×";
    }
}
