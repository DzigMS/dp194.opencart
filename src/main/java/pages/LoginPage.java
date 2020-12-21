package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class LoginPage extends BasePage {

    @FindBy(id = "input-email")
    private TextInput email;
    @FindBy(id = "input-password")
    private TextInput password;

    @FindBy(xpath = "//a[contains(text(),'Forgotten Password')]")
    private Link forgottenPassword;

    @FindBy(xpath = "//input[@value='Login']")
    private Button loginButton;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    private Link newCustomerContinueLink;

    public LoginPage(Driver driver) {
        super(driver);
    }

    public void fillEmailField(CharSequence... firstName) {
        this.email.sendKeys(firstName);
    }

    public String getEmailText() {
        return this.email.getText();
    }


    public void fillPasswordField(CharSequence... firstName) {
        this.password.sendKeys(firstName);
    }

    public String getPasswordText() {
        return this.password.getText();
    }


    public void clickForgottenPasswordLink() {
        this.forgottenPassword.click();
    }


    public void clickLoginButton() {
        this.loginButton.click();
    }


    public void clickNewCustomerContinueLink() {
        this.newCustomerContinueLink.click();
    }
}
