package pages;

import driver.Driver;
import model.CategoryMenu;
import model.ProductItem;

public class HomePage extends BasePage {

    private ProductItem productItem;
    private CategoryMenu categoryMenu;

    public HomePage(Driver driver) {
        super(driver);
    }
    public CategoryMenu getCategoryMenu() {
        return categoryMenu;
    }
    public ProductItem getProductItem() {
        return productItem;
    }

    public String getLinkUrl(Driver driver) {
        return driver.getWebDriver().getCurrentUrl();
    }
}
