package pages;

import driver.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public class AdminLoginPage {

    @FindBy(xpath = "//div[@class = 'alert alert-danger alert-dismissible']")
    private WebElement loginErrMsg;

    @FindBy(xpath = "//input[@type = 'text' and @name = 'username' and @id = 'input-username']")
    private WebElement usernameTextBox;
    @FindBy(xpath = "//input[@type = 'password' and @name = 'password' and @id = 'input-password']")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type = 'submit' and @class = 'btn btn-primary']")
    private WebElement loginButton;

    public AdminLoginPage(Driver driver) {
        PageFactory.initElements
                (new HtmlElementDecorator(new HtmlElementLocatorFactory(driver.getWebDriver())), this);
    }

    public boolean loginErrMsgExists() {
        try {
            this.loginErrMsg.isDisplayed();
            return true;
        }
        catch (NoSuchElementException ex) {
            return false;
        }
    }

    public void sendKeysUsernameTextBox(CharSequence... keysToSend) {
        this.usernameTextBox.sendKeys(keysToSend);
    }
    public void clearUsernameTextBox() {
        this.usernameTextBox.clear();
    }
    public void fillUsernameTextBox(String text) {
        this.clearUsernameTextBox();
        this.sendKeysUsernameTextBox(text);
    }
    public String getUsernameTextBoxText() {
        return this.usernameTextBox.getText();
    }

    public void sendKeysPasswordTextBox(CharSequence... keysToSend) {
        this.passwordTextBox.sendKeys(keysToSend);
    }
    public void clearPasswordTextBox() {
        this.passwordTextBox.clear();
    }
    public void fillPasswordTextBox(String text) {
        this.clearPasswordTextBox();
        this.sendKeysPasswordTextBox(text);
    }
    public String getPasswordTextBoxText() {
        return this.passwordTextBox.getText();
    }

    public void clickLoginButton() {
        this.loginButton.click();
    }
}
