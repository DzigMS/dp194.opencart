package steps;

import driver.Driver;
import pages.ProductPage;

public class ProductPageStep extends BaseStep {
    private ProductPage productPage;

    public ProductPageStep(Driver driver) {
        super(driver);
        this.productPage = new ProductPage(this.getDriver());
    }

    public String getCurrentPage() {
        return this.getDriver().getLinkUrl();
    }

    public ProductPageStep goToModelProductReview() {
        productPage.goToModelProductReview();
        return this;
    }

    public ProductPageStep fillNameTexBoxProductReview(String name) {
        productPage.getProductReview().fillNameTexBox(name);
        return this;
    }

    public ProductPageStep fillReviewTexBoxProductReview(String review) {
        productPage.getProductReview().fillReviewTextBox(review);
        return this;
    }

    public ProductPageStep murkDownProductRatingRadioProductReview() {
        productPage.getProductReview().murkDownProductRatingRadio();
        return this;
    }

    public ProductPageStep clickContinueButtonProductReview() {
        productPage.getProductReview().clickContinueButtonReview();
        return this;
    }

    public String getMessageSuccessProductReview() {
        return productPage.getProductReview().getMessageSuccess();
    }

    public ProductPageStep addProductToShoppingCart() {
        productPage.addProductToShoppingCart();
        return this;
    }

    public ProductPageStep fillFieldProductQuantity(String quantity) {

        productPage.fillFieldProductQuantity(quantity);
        return this;
    }

    public ProductPageStep clearFieldProductQuantity() {

        productPage.clearFieldProductQuantity();
        return this;
    }

    public String getSuccessMessageAboutAddedProductToShoppingCart() {
        return productPage.getSuccessMessage();
    }

    public String getWaringMessageAboutAddedProductToShoppingCart() {
        return productPage.getWarningMessage();
    }

    public String getProductNameFromProductPage() {
        return productPage.getProductName();
    }

    public String getProductPriceFromProductPage() {
        return productPage.getProductPrice();
    }

    public String getProductQuantityFromProductPage() {
        return productPage.getProductQuantity();
    }

    public String createExpectedSuccessMessageAddProductToShoppingCart() {
        return "Success: You have added "
                + this.getProductNameFromProductPage() +
                " to your shopping cart!\n×";
    }

    public ShoppingCartStep goToShoppingCart() {
        productPage.getTopNavBar().goToShoppingCartPage();
        return new ShoppingCartStep(this.getDriver());
    }
}
