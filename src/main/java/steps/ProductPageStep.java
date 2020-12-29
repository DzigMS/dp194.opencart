package steps;

import driver.Driver;
import pages.ProductPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductPageStep extends BaseStep {
    private ProductPage productPage;

    public ProductPageStep(Driver driver) {
        super(driver);
        this.productPage = new ProductPage(this.getDriver());
    }

    public ProductPageStep verifyCurrentPage(String expectedUrl) {
        assertEquals(expectedUrl, this.getDriver().getLinkUrl());
        return this;
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

    public ProductPageStep verifySuccessMsg(String expectedMsg) {
        String actualMsg = productPage.getProductReview().getMessageSuccess();
        assertEquals(expectedMsg, actualMsg);
        return this;
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

    public ProductPageStep verifySuccessMsgAddedProductToShoppingCart(String expected) {
        assertEquals
                (expected,
                        productPage.getSuccessMessage()
                                .substring(0, productPage
                                        .getSuccessMessage().indexOf('\n')));
        return this;
    }

    public ProductPageStep verifyWarningMsgAddedProductToShoppingCart(boolean expected) {
        boolean actual = productPage.isWarningMessageExists();
        assertEquals(expected, actual);
        return this;
    }

    public ShoppingCartStep goToShoppingCart() {
        productPage.getTopNavBar().goToShoppingCartPage();
        return new ShoppingCartStep(this.getDriver());
    }
}
