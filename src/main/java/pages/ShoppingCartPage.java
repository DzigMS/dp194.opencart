package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Table;

public class ShoppingCartPage extends BasePage {
    @FindBy(xpath = "//div[@class='table-responsive']")
    private Table shoppingCarTable;
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[2]/a")
    private Table ProductNameFromShoppingCar;

    public ShoppingCartPage(Driver driver) {
        super(driver);
    }

    public String getProductNameFromShoppingCarTable() {
        return ProductNameFromShoppingCar.getText();
    }
//    public String getProductNameFromShoppingCarTable() {
//        String name = shoppingCarTable.getCellAt(2, 2).getText();
//        System.out.println(name);
//        return name;
//    }
}
