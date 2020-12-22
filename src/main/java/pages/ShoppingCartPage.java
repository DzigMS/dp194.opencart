package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.element.*;

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
    @FindBy(xpath = "//a[contains(text(),'Continue Shopping')]")
    private Button continueShoppingButtonFromShoppingCar;
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    private Link continueButtonFromShoppingCar;



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

    public void clearFieldProductQuantityInShoppingCartTable() {
        productQuantityFromShoppingCar.clear();
    }

    public void fillProductQuantityInShoppingCartTable(String quantity) {
        productQuantityFromShoppingCar.sendKeys(quantity);
    }

    public void clickUpdateButtonFromShoppingCar() {
        updateButtonFromShoppingCar.click();
    }

    public void clickRemoveButtonFromShoppingCar() {
        removeButtonFromShoppingCar.click();
    }

    public void clickContinueShoppingButtonFromShoppingCar() {
        continueShoppingButtonFromShoppingCar.click();
    }

    public void clickContinueButtonFromShoppingCar(Driver driver) {
        WebDriverWait webDriverWait;
        webDriverWait = new WebDriverWait(driver.getWebDriver(),50);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Continue')]")));
        continueButtonFromShoppingCar.click();
    }

}
