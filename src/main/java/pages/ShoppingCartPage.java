package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Table;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class ShoppingCartPage extends BasePage {
    @FindBy(xpath = "//div[@class='table-responsive']")
    private Table shoppingCarTable;
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[2]/a")
    private TextBlock productNameFromShoppingCar;
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[5]")
    private TextBlock productPriceFromShoppingCar;
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[6]")
    private TextBlock totalPriceFromShoppingCar;
    @FindBy(xpath = "//input[contains(@name,'quantity')]")
    private TextInput productQuantityFromShoppingCar;
    @FindBy(xpath = "//button[@data-original-title='Update']")
    private Button updateButtonFromShoppingCar;
    @FindBy(xpath = "//button[@data-original-title='Remove']")
    private Button removeButtonFromShoppingCar;

    public ShoppingCartPage(Driver driver) {
        super(driver);
    }

    public String getProductNameFromShoppingCarTable() {
        return productNameFromShoppingCar.getText();
    }

    public String getProductPriceFromShoppingCarTable() {
        return productPriceFromShoppingCar.getText();
    }

    public String getTotalPriceFromShoppingCarTable() {
        return productPriceFromShoppingCar.getText();
    }

    public String getProductQuantityFromShoppingCarTable() {
        return productQuantityFromShoppingCar.getText();
    }
    public void clearFieldProductQuantityInShoppingCartTable(){
        productQuantityFromShoppingCar.clear();
    }

    public void fillProductQuantityInShoppingCartTable(String quantity) {
        productQuantityFromShoppingCar.sendKeys(quantity);
    }

    public void removeProductQuantityInShoppingCartTable() {
        productQuantityFromShoppingCar.clear();
    }

    public void clickUpdateButtonFromShoppingCar() {
        updateButtonFromShoppingCar.click();
    }

    public void clickRemoveButtonFromShoppingCar() {
        removeButtonFromShoppingCar.click();
    }
}
