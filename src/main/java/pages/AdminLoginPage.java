package pages;

import driver.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class AdminLoginPage extends AbstractPage {
    @FindBy(xpath = "//div[@class = 'alert alert-danger alert-dismissible'][text() = ' No match for Username and/or Password.\n              ']")
    private HtmlElement loginErrMsg;

    @FindBy(xpath = "//input[@type = 'text' and @name = 'username' and @id = 'input-username']")
    private TextInput usernameTextBox;
    @FindBy(xpath = "//input[@type = 'password' and @name = 'password' and @id = 'input-password']")
    private TextInput passwordTextBox;

    @FindBy(xpath = "//button[@type = 'submit' and @class = 'btn btn-primary']")
    private Button loginButton;

    public AdminLoginPage(Driver driver) {
        super(driver);
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
