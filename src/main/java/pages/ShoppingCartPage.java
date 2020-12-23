package pages;

import driver.Driver;
import model.Coupon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.element.*;
import steps.ShoppingCartStep;

public class ShoppingCartPage extends BasePage {
    private Coupon coupon;
    @FindBy(xpath = "//div[@class='table-responsive']")
    private Table shoppingCarTable;
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[2]/a")
    private Link productNameFromShoppingCar;
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
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private TextBlock successMessageModifiedShoppingCart;
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    private Link checkoutLinkShoppingCart;

    public ShoppingCartPage(Driver driver) {
        super(driver);
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public String getProductNameFromShoppingCarTable() {
        return productNameFromShoppingCar.getText();
    }

    public void clickLinkProductNameFromShoppingCarTable() {
        productNameFromShoppingCar.click();
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

    public void clickContinueButtonFromShoppingCar() {
        continueButtonFromShoppingCar.click();
    }

    public String getSuccessMessageModifiedShoppingCart() {
        return successMessageModifiedShoppingCart.getText();
    }

    public void clickCheckoutLinkShoppingCart() {
        checkoutLinkShoppingCart.click();
    }

}
