package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class LoginPage extends BasePage {
    @FindBy(linkText = "Continue")
    private Link newCustomerContinueLink;

    @FindBy(id = "input-email")
    private TextInput email;
    @FindBy(id = "input-password")
    private TextInput password;

    @FindBy(linkText = "Forgotten Password")
    private Link forgottenPassword;

    @FindBy(xpath = "//input[@type = 'submit' and @class = 'btn btn-primary']")
    private Button loginButton;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible'][text() = ' Warning: No match for E-Mail Address and/or Password.']")
    private HtmlElement loginErrMsg;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible'][text() = ' An email with a confirmation link has been sent your email address.']")
    private HtmlElement passwordRestoreScsMsg;

    public LoginPage(Driver driver) {
        super(driver);
    }

    public void clickNewCustomerContinueLink() {
        this.newCustomerContinueLink.click();
    }

    public void fillEmailField(CharSequence... email) {
        this.email.sendKeys(email);
    }
    public void clearEmailField() {
        this.email.clear();
    }
    public String getEmailText() {
        return this.email.getText();
    }

    public void fillPasswordField(CharSequence... password) {
        this.password.sendKeys(password);
    }
    public void clearPasswordField() {
        this.password.clear();
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

    public boolean loginErrMsgExists() {
        return this.loginErrMsg.exists();
    }
    public boolean passwordRestoreScsMsgExists() {
        return this.passwordRestoreScsMsg.exists();
    }

}
