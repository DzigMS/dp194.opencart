package steps;

import driver.Driver;
import pages.ProductPage;

public class ProductPageStep extends BaseStep {
    private ProductPage productPage;

    public ProductPageStep(Driver driver) {
        super(driver);
        this.productPage = new ProductPage(this.getDriver());
    }

    public String getUrlProductPage(){
        return productPage.getLinkUrl(this.getDriver());
    }

    public ProductPageStep goToModelProductReviewStep() {
        productPage.goToModelProductReview();
        return this;
    }

    public ProductPageStep fillNameTexBoxProductReviewStep(String name) {
        productPage.getProductReview().fillNameTexBox(name);
        return this;
    }

    public ProductPageStep fillReviewTexBoxProductReviewStep(String review) {
        productPage.getProductReview().fillReviewTextBox(review);
        return this;
    }

    public ProductPageStep murkDownProductRatingRadioProductReviewStep() {
        productPage.getProductReview().murkDownProductRatingRadio();
        return this;
    }

    public ProductPageStep clickContinueButtonProductReviewStep() {
        productPage.getProductReview().clickContinueButtonReview();
        return this;
    }

    public String getMessageSuccessProductReviewStep() {
        return productPage.getProductReview().getMessageSuccess();
    }


    public ProductPageStep addProductToShoppingCartStep() {
        productPage.addProductToShoppingCart();
        return this;
    }
    public ProductPageStep fillFieldProductQuantityStep(String quantity) {
        productPage.fillFieldProductQuantity(quantity);
        return this;
    }
//        public ProductPageStep fillFieldProductQuantityStep(int quantity) {
//        productPage.fillFieldProductQuantity(String.valueOf(quantity));
//            return this;
//    }

    public ProductPageStep clearFieldProductQuantityStep() {
        productPage.clearFieldProductQuantity();
        return this;
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
        return "Success: You have added "
                + this.getProductNameFromProductPageStep() +
                " to your shopping cart!\n×";
    }

    public ShoppingCartStep goToShoppingCartStep(Driver driver) {
        productPage.getTopNavBar().goToShoppingCartPage();
        return new ShoppingCartStep(driver);
    }
}
