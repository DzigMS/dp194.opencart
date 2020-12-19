package steps;

import driver.Driver;
import pages.ShoppingCartPage;

public class ShoppingCartSteps {
    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartSteps(Driver driver) {
        this.shoppingCartPage = new ShoppingCartPage(driver);
    }

    public String getAddedProductNameIntoShoppingCartTest() {
        return shoppingCartPage.getProductNameFromShoppingCarTable();
    }

}
