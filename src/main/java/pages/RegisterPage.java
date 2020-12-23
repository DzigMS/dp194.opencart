package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.CheckBox;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class RegisterPage extends BasePage {
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

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]")
    private CheckBox privacyPolicy;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
    private Button continueButton;

    public RegisterPage(Driver driver) {
        super(driver);
    }

    public void fillFirstNameField(CharSequence... firstName) {
        this.firstName.sendKeys(firstName);
    }

    public String getFirstNameText() {
        return this.firstName.getText();
    }

    public void fillLastNameField(CharSequence... lastName) {
        this.lastName.sendKeys(lastName);
    }

    public String getLastNameText() {
        return this.lastName.getText();
    }

    public void fillEmailField(CharSequence... email) {
        this.email.sendKeys(email);
    }

    public String getEmailText() {
        return this.email.getText();
    }

    public void fillTelephoneField(CharSequence... telephone) {
        this.telephone.sendKeys(telephone);
    }

    public String getTelephoneText() {
        return this.telephone.getText();
    }

    public void fillPasswordField(CharSequence... password) {
        this.password.sendKeys(password);
    }

    public String getPasswordText() {
        return this.password.getText();
    }

    public void fillPasswordConfirmField(CharSequence... passwordConfirm) {
        this.passwordConfirm.sendKeys(passwordConfirm);
    }

    public String getPasswordConfirmText() {
        return this.passwordConfirm.getText();
    }

    public void setPrivacyPolicyCheckBox(boolean value) {
        this.privacyPolicy.set(value);
    }

    public void clickContinueButton() {
        this.continueButton.click();
    }
}
