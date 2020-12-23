package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.*;

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

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private HtmlElement loginErrorMessage;

    public LoginPage(Driver driver) {
        super(driver);
    }

    public void fillEmailField(CharSequence... email) {
        this.email.sendKeys(email);
    }

    public String getEmailText() {
        return this.email.getText();
    }


    public void fillPasswordField(CharSequence... password) {
        this.password.sendKeys(password);
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

    public boolean loginErrorMessageExists() {
        return this.loginErrorMessage.exists();
    }

}
