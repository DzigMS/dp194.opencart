package pages;

import driver.Driver;
import model.ProductActions;
import model.ProductItem;

import java.util.List;

public class CategoryPage extends BasePage {
    private ProductActions productActions;
    private List<ProductItem> productItemList;
    private ProductItem productItem;

    public CategoryPage(Driver driver) {
        super(driver);
    }

    public ProductActions getProductActions() {
        return productActions;
    }

    public List<ProductItem> getProductItemList() {
        return productItemList;
    }

    public ProductItem getProductItem() {
        return productItem;
    }
}

