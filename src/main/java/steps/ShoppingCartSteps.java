package steps;

import driver.Driver;
import pages.ShoppingCartPage;

public class ShoppingCartSteps {
    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartSteps(Driver driver) {
        this.shoppingCartPage = new ShoppingCartPage(driver);
    }

    public String getAddedProductNameFromShoppingCartStep() {
        return shoppingCartPage.getProductNameFromShoppingCarTable();
    }

    public String getAddedProductPriceFromShoppingCartStep() {
        return shoppingCartPage.getProductPriceFromShoppingCarTable();
    }

    public String getAddedProductQuantityFromShoppingCartStep() {
        return shoppingCartPage.getProductQuantityFromShoppingCarTable();
    }

    public void clearFieldQuantityProductInShoppingCartStep() {
        shoppingCartPage.clearFieldProductQuantityInShoppingCartTable();
    }

    public void fillQuantityProductInShoppingCartStep() {
        shoppingCartPage.fillProductQuantityInShoppingCartTable("2");
    }

    public void updateQuantityInShoppingCartStep() {
        shoppingCartPage.clickUpdateButtonFromShoppingCar();
    }

    public void removeShoppingCartStep() {
        shoppingCartPage.clickRemoveButtonFromShoppingCar();
    }
}

