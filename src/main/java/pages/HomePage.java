package pages;

import driver.Driver;
import model.ProductItem;

public class HomePage extends BasePage {
    private ProductItem productItem;

    public HomePage(Driver driver) {
        super(driver);
    }

    public ProductItem getProductItem() {
        return productItem;
    }

}
