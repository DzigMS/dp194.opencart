package steps;

import driver.Driver;
import pages.ShoppingCartPage;

public class ShoppingCartStep extends BaseStep {
    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartStep(Driver driver) {
        super(driver);
        this.shoppingCartPage = new ShoppingCartPage(this.getDriver());
    }

    public String getAddedProductNameFromShoppingCartStep() {
        return shoppingCartPage.getProductNameFromShoppingCarTable();
    }

    public ProductPageStep clickLinkProductNameFromShoppingCarTable() {
        shoppingCartPage.clickLinkProductNameFromShoppingCarTable();
        return new ProductPageStep(this.getDriver());
    }

    public String getAddedProductPriceFromShoppingCartStep() {
        return shoppingCartPage.getProductPriceFromShoppingCarTable();
    }

    public String getAddedProductQuantityFromShoppingCartStep() {
        return shoppingCartPage.getProductQuantityFromShoppingCarTable();
    }

    public ShoppingCartStep clearFieldQuantityProductInShoppingCartStep() {
        shoppingCartPage.clearFieldProductQuantityInShoppingCartTable();
        return this;
    }

    public ShoppingCartStep fillQuantityProductInShoppingCartStep(String quantity) {
        shoppingCartPage.fillProductQuantityInShoppingCartTable(quantity);
        return this;
    }

    public ShoppingCartStep updateQuantityInShoppingCartStep() {
        shoppingCartPage.clickUpdateButtonFromShoppingCar();
        return this;
    }

    public ShoppingCartStep removeShoppingCartStep() {
        shoppingCartPage.clickRemoveButtonFromShoppingCar();
        this.shoppingCartPage = new ShoppingCartPage(this.getDriver());
        return this;
    }

    public ShoppingCartStep clickContinueButtonInShoppingCartStep() {
        this.shoppingCartPage.clickContinueButtonFromShoppingCar();
        return this;
    }

    public String getSuccessMessageModifiedShoppingCartStep() {
        return shoppingCartPage.getSuccessMessageModifiedShoppingCart();
    }

    public CheckoutStep clickCheckoutLinkShoppingCartStep() {
        shoppingCartPage.clickCheckoutLinkShoppingCart();
        return new CheckoutStep(this.getDriver());
    }

    public HomePageStep clickContinueShoppingButtonInShoppingCartStep() {
        shoppingCartPage.clickContinueShoppingButtonFromShoppingCar();
        return new HomePageStep(this.getDriver());
    }

    public ShoppingCartStep clickUseCouponCodeLinkDropdownStep() {
        shoppingCartPage.getCoupon().clickUseCouponCodeLinkDropdown();
        return this;
    }
    public ShoppingCartStep fillCouponTextInputStep(String coupon) {
        shoppingCartPage.getCoupon().fillCouponTextInput(coupon);
        return this;
    }
    public ShoppingCartStep clickApplyCouponButtonStep() {
        shoppingCartPage.getCoupon().clickApplyCouponButton();
        return this;
    }
}

