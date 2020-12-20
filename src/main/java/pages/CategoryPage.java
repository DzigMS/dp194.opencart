package pages;

import driver.Driver;
import model.ProductActions;
import model.ProductItem;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CategoryPage extends BasePage{
    private ProductActions productActions;

    private List<ProductItem> productItemList;



    public CategoryPage(Driver driver) {
        super(driver);
    }

    public void getPriceItems(){
        for (ProductItem item :
             productItemList) {
            System.out.println(item.getPrice());
        }
    }

    public ProductActions getProductActions() {
        return productActions;
    }

    public List<ProductItem> getProductItemList() {
        return productItemList;
    }

}

