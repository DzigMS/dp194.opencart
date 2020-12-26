package steps;

import driver.Driver;
import pages.ShoppingCartPage;

public class ShoppingCartStep extends BaseStep {
    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartStep(Driver driver) {
        super(driver);
        this.shoppingCartPage = new ShoppingCartPage(this.getDriver());
    }

    public String getAddedProductNameFromShoppingCart() {
        return shoppingCartPage.getProductNameFromShoppingCarTable();
    }

    public ProductPageStep clickLinkProductNameFromShoppingCarTable() {
        shoppingCartPage.clickLinkProductNameFromShoppingCarTable();
        return new ProductPageStep(this.getDriver());
    }

    public String getAddedProductPriceFromShoppingCart() {
        return shoppingCartPage.getProductPriceFromShoppingCarTable();
    }

    public String getAddedProductQuantityFromShoppingCart() {
        return shoppingCartPage.getProductQuantityFromShoppingCarTable();
    }

    public ShoppingCartStep clearFieldQuantityProductInShoppingCart() {
        shoppingCartPage.clearFieldProductQuantityInShoppingCartTable();
        return this;
    }

    public ShoppingCartStep fillQuantityProductInShoppingCart(String quantity) {
        shoppingCartPage.fillProductQuantityInShoppingCartTable(quantity);
        return this;
    }

    public ShoppingCartStep updateQuantityInShoppingCart() {
        shoppingCartPage.clickUpdateButtonFromShoppingCar();
        return this;
    }

    public ShoppingCartStep removeShoppingCart() {
        shoppingCartPage.clickRemoveButtonFromShoppingCar();
        return this;
    }

    public HomePageStep clickContinueButtonInShoppingCart() {
        shoppingCartPage.clickContinueButtonFromShoppingCar();
        return new HomePageStep(this.getDriver());
    }

    public String getSuccessMessageModifiedShoppingCart() {
        return shoppingCartPage.getSuccessMessageModifiedShoppingCart();
    }

    public CheckoutStep clickCheckoutLinkShoppingCart() {
        shoppingCartPage.clickCheckoutLinkShoppingCart();
        return new CheckoutStep(this.getDriver());
    }

    public HomePageStep clickContinueShoppingButtonInShoppingCart() {
        shoppingCartPage.clickContinueShoppingButtonFromShoppingCar();
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

