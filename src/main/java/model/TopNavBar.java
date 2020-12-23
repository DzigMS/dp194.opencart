package model;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

@FindBy(id = "top")
public class TopNavBar extends HtmlElement {
    @FindBy(xpath = "//*[@class='fa fa-phone']/..")
    private Link contactUsLink;

    @FindBy(xpath = "//a[@class='dropdown-toggle'][@title='My Account']")
    private Link myAccountDropdown;
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Register']")
    private Link registerLink;
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Login']")
    private Link loginLink;
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='My Account']")
    private Link myAccountLink;
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Logout']")
    private Link logoutLink;

    @FindBy(id = "wishlist-total")
    private Link wishListLink;
    @FindBy(xpath = "//a[@title='Shopping Cart']")
    private Link shoppingCartLink;
    @FindBy(xpath = "//a[@title='Checkout']")
    private Link checkoutLink;

    public void clickContactUsLink() {
        contactUsLink.click();
    }


    public void clickMyAccountDropdown() {
        this.myAccountDropdown.click();
    }

    public void clickRegisterLink() {
        if (this.registerLink.exists()) {
            this.registerLink.click();
        }
    }
    public void clickLoginLink() {
        if (this.loginLink.exists()) {
            this.loginLink.click();
        }
    }
    public void clickMyAccountLink() {
        if (this.myAccountLink.exists()) {
            this.myAccountLink.click();
        }
    }
    public void clickLogoutLink() {
        if (this.logoutLink.exists()) {
            this.logoutLink.click();
        }
    }


    public void goToShoppingCartPage() {
        shoppingCartLink.click();
    }
}
