package steps;

import driver.Driver;
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

    public String createExpectedSuccessMessageAddProductReviewStep() {
        return "Thank you for your review. It has been submitted to the webmaster for approval.";
    }

    public void addProductToShoppingCartStep() {
        productPage.addProductToShoppingCart();
    }

    public void fillFieldProductQuantityStep() {
        productPage.fillFieldProductQuantity("2");
    }
    public void clearFieldProductQuantityStep(){
        productPage.clearFieldProductQuantity();
    }

    public String getSuccessMessageAboutAddedProductToShoppingCartStep() {
        return productPage.getSuccessMessage();
    }

    public String getProductNameFromProductPageStep() {
        return productPage.getProductName();
    }

    public String getProductPriceFromProductPagStep() {
        return productPage.getProductPrice();
    }

    public String getProductQuantityFromProductPagStep() {
        return productPage.getProductQuantity();
    }

    public String createExpectedSuccessMessageAddProductToShoppingCartStep() {
        return "Success: You have added" + " " + this.getProductNameFromProductPageStep() + " " + "to your shopping cart!\n×";
    }

    public ShoppingCartSteps goToShoppingCartStep(Driver driver) {
        productPage.getTopNavBar().goToShoppingCartPage();
        return new ShoppingCartSteps(driver);
    }
}
