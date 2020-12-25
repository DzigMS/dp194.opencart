package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.*;

public class RegisterPage extends BasePage {
    @FindBy(linkText = "login page")
    private Link loginPageLink;

    @FindBy(id = "input-firstname")
    private TextInput firstName;
    @FindBy(id = "input-lastname")
    private TextInput lastName;
    @FindBy(id = "input-email")
    private TextInput email;
    @FindBy(id = "input-telephone")
    private TextInput telephone;

    @FindBy(id = "input-password")
    private TextInput password;
    @FindBy(id = "input-confirm")
    private TextInput passwordConfirm;

    @FindBy(xpath = "//input[@type = 'radio' and @name = 'newsletter' and @value = '1']")
    private Radio newsLetterYes;
    @FindBy(xpath = "//input[@type = 'radio' and @name = 'newsletter' and @value = '0']")
    private Radio newsLetterNo;

    @FindBy(xpath = "//input[@type = 'checkbox']")
    private CheckBox privacyPolicy;

    @FindBy(xpath = "//input[@type = 'submit'][@value = 'Continue']")
    private Button continueButton;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible'][text() = ' Warning: You must agree to the Privacy Policy!']")
    private HtmlElement privacyPolicyErrMsg;

    @FindBy(xpath = "//div[@class='text-danger'][text() = 'First Name must be between 1 and 32 characters!']")
    private HtmlElement firstNameErrMsg;
    @FindBy(xpath = "//div[@class='text-danger'][text() = 'Last Name must be between 1 and 32 characters!']")
    private HtmlElement lastNameErrMsg;
    @FindBy(xpath = "//div[@class='text-danger'][text() = 'E-Mail Address does not appear to be valid!']")
    private HtmlElement emailErrMsg;
    @FindBy(xpath = "//div[@class='text-danger'][text() = 'Telephone must be between 3 and 32 characters!']")
    private HtmlElement telephoneErrMsg;

    @FindBy(xpath = "//div[@class='text-danger'][text() = 'Password must be between 4 and 20 characters!']")
    private HtmlElement passwordErrMsg;
    @FindBy(xpath = "//div[@class='text-danger'][text() = 'Password confirmation does not match password!']")
    private HtmlElement passwordConfirmErrMsg;

    public RegisterPage(Driver driver) {
        super(driver);
    }

    public void clickLoginPageLink() {
        this.loginPageLink.click();
    }

    public void fillFirstNameField(CharSequence... firstName) {
        this.firstName.sendKeys(firstName);
    }
    public void clearFirstNameField() {
        this.firstName.clear();
    }
    public String getFirstNameText() {
        return this.firstName.getText();
    }

    public void fillLastNameField(CharSequence... lastName) {
        this.lastName.sendKeys(lastName);
    }
    public void clearLastNameField() {
        this.lastName.clear();
    }
    public String getLastNameText() {
        return this.lastName.getText();
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

    public void fillTelephoneField(CharSequence... telephone) {
        this.telephone.sendKeys(telephone);
    }
    public void clearTelephoneField() {
        this.telephone.clear();
    }
    public String getTelephoneText() {
        return this.telephone.getText();
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

    public void fillPasswordConfirmField(CharSequence... passwordConfirm) {
        this.passwordConfirm.sendKeys(passwordConfirm);
    }
    public void clearPasswordConfirmField() {
        this.passwordConfirm.clear();
    }
    public String getPasswordConfirmText() {
        return this.passwordConfirm.getText();
    }

    public void clickNewsLetterYesRadio() {
        this.newsLetterYes.click();
    }
    public void clickNewsLetterNoRadio() {
        this.newsLetterNo.click();
    }

    public void setPrivacyPolicyCheckBox(boolean value) {
        this.privacyPolicy.set(value);
    }

    public void clickContinueButton() {
        this.continueButton.click();
    }

    public boolean privacyPolicyErrMsgExists() {
        return this.privacyPolicyErrMsg.exists();
    }

    public boolean firstNameErrMsgExists() {
        return this.firstNameErrMsg.exists();
    }
    public boolean lastNameErrMsgExists() {
        return this.lastNameErrMsg.exists();
    }
    public boolean emailErrMsgExists() {
        return this.emailErrMsg.exists();
    }
    public boolean telephoneErrMsgExists() {
        return this.telephoneErrMsg.exists();
    }

    public boolean passwordErrMsgExists() {
        return this.passwordErrMsg.exists();
    }
    public boolean passwordConfirmErrMsgExists() {
        return this.passwordConfirmErrMsg.exists();
    }
}
