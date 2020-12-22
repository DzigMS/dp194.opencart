package steps;

import driver.Driver;
import pages.ProductPage;

public class ProductPageStep extends BaseStep {
    private ProductPage productPage;

    public ProductPageStep(Driver driver) {
        super(driver);
        this.productPage = new ProductPage(this.getDriver());
    }

    public void goToModelProductReviewStep() {
        productPage.goToModelProductReview();
    }

    public void fillNameTexBoxProductReviewStep() {
        productPage.getProductReview().fillNameTexBox("gjdlrjg;a lrjlej");
    }

    public void fillReviewTexBoxProductReviewStep() {
        productPage.getProductReview().fillReviewTextBox("fhjarlfEFKekfn nwenEWKFLHEKWJFwfNEDGRSGSEGKN>kn >NEKJEW");
    }

    public void murkDownProductRatingRadioProductReviewStep() {
        productPage.getProductReview().murkDownProductRatingRadio();
    }

    public void clickContinueButtonProductReviewStep() {
        productPage.getProductReview().clickContinueButtonReview();
    }

    public String getMessageSuccessProductReviewStep() {
        return productPage.getProductReview().getMessageSuccess();
    }

    public String createExpectedSuccessMessageAddProductReviewStep() {
        return "Thank you for your review. It has been submitted to the webmaster for approval.";
    }

    public void addProductToShoppingCartStep() {
        productPage.addProductToShoppingCart();
    }
    public void fillFieldProductQuantityStep(String quantity) {
        productPage.fillFieldProductQuantity(quantity);
    }


//    public void fillFieldProductQuantityStep(int quantity) {
//        productPage.fillFieldProductQuantity(String.valueOf(quantity));
//    }

    public void clearFieldProductQuantityStep() {
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
        return "Success: You have added " + this.getProductNameFromProductPageStep() + " to your shopping cart!\n×";
    }

    public ShoppingCartSteps goToShoppingCartStep(Driver driver) {
        productPage.getTopNavBar().goToShoppingCartPage();
        return new ShoppingCartSteps(driver);
    }
}
