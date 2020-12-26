package steps;

import driver.Driver;
import pages.ShoppingCartPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartStep extends BaseStep {
    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartStep(Driver driver) {
        super(driver);
        this.shoppingCartPage = new ShoppingCartPage(this.getDriver());
    }

    public ShoppingCartStep verifyAddedProductName(String expected) {
        assertEquals(expected, shoppingCartPage.getProductName());
        return this;
    }
    public ShoppingCartStep verifyAddedProductPrice(String expected) {
        assertEquals(expected, shoppingCartPage.getProductPrice());
        return this;
    }
    public ShoppingCartStep verifyAddedProductQuantity(String expected) {
        assertEquals(expected,shoppingCartPage.getProductQuantity());
        return this;
    }

    public ProductPageStep clickLinkProductName() {
        shoppingCartPage.clickLinkProductName();
        return new ProductPageStep(this.getDriver());
    }

    public ShoppingCartStep clearFieldQuantityProduct() {
        shoppingCartPage.clearFieldProductQuantity();
        return this;
    }

    public ShoppingCartStep fillQuantityProduct(String quantity) {
        shoppingCartPage.fillProductQuantity(quantity);
        return this;
    }

    public ShoppingCartStep updateQuantity() {
        shoppingCartPage.clickUpdateButton();
        return this;
    }

    public ShoppingCartStep removeShoppingCart() {
        shoppingCartPage.clickRemoveButton();
        return this;
    }

    public HomePageStep clickContinueButton() {
        shoppingCartPage.clickContinueButton();
        return new HomePageStep(this.getDriver());
    }

    public ShoppingCartStep verifySuccessMsgModified(String expectedMsg) {
        assertEquals (expectedMsg,shoppingCartPage.getSuccessMessageModified());
        return this;

    }

    public CheckoutStep clickCheckoutLink() {
        shoppingCartPage.clickCheckoutLink();
        return new CheckoutStep(this.getDriver());
    }

    public HomePageStep clickContinueShoppingButton() {
        shoppingCartPage.clickContinueShoppingButton();
        return new HomePageStep(this.getDriver());
    }

    public ShoppingCartStep clickUseCouponCodeLinkDropdown() {
        shoppingCartPage.getCoupon().clickUseCouponCodeLinkDropdown();
        return this;
    }

    public ShoppingCartStep fillCouponTextInput(String coupon) {
        shoppingCartPage.getCoupon().fillCouponTextInput(coupon);
        return this;
    }

    public ShoppingCartStep clickApplyCouponButton() {
        shoppingCartPage.getCoupon().clickApplyCouponButton();
        return this;
    }
}

