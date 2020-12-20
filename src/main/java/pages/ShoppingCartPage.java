package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Table;

public class ShoppingCartPage extends BasePage{
    @FindBy(xpath = "//div[@class='table-responsive']")
    private Table shoppingCarTable;
    public ShoppingCartPage(Driver driver) {
        super(driver);
    }

}
