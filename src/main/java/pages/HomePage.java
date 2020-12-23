package pages;

import driver.Driver;
import model.CategoryMenu;
import model.ProductItem;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

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

}
