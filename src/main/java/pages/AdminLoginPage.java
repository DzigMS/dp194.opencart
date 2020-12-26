package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public class AdminLoginPage {
    @FindBy(xpath = "//input[@type = 'text' and @name = 'username' and @id = 'input-username' and @class = 'form-control']")
    private TextInput loginTextBox;

    @FindBy(xpath = "//input[@type = 'password' and @name = 'password' and @id = 'input-password' and @class = 'form-control']")
    private TextInput passwordTextBox;

    @FindBy(xpath = "//button[@type = 'submit' and @class = 'btn btn-primary']")
    private Button loginButton;

    public AdminLoginPage(Driver driver) {
        PageFactory.initElements
                (new HtmlElementDecorator(new HtmlElementLocatorFactory(driver.getWebDriver())), this);
    }

    public void fillLoginTextBox(String text) {
        this.loginTextBox.sendKeys(text);
    }
    public void clearLoginTextBox() {
        this.loginTextBox.clear();
    }
    public String getLoginTextBoxText() {
        return this.loginTextBox.getText();
    }

    public void fillPasswordTextBox(String text) {
        this.passwordTextBox.sendKeys(text);
    }
    public void clearPasswordTextBox() {
        this.passwordTextBox.clear();
    }
    public String getPasswordTextBoxText() {
        return this.passwordTextBox.getText();
    }

    public void clickLoginButton() {
        this.loginButton.click();
    }
}
