package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class ChangePasswordPage extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'Back')]")
    private Button backButton;

    @FindBy(id = "input-password")
    private TextInput password;

    @FindBy(id = "input-confirm")
    private TextInput passwordConfirm;

    @FindBy(xpath = "//input[@value='Continue']")
    private Button continueButton;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private HtmlElement passwordErrorMessage;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private HtmlElement confirmPasswordErrorMessage;


    public ChangePasswordPage(Driver driver) {
        super(driver);
    }


    public void clickBackButton() {
        this.backButton.click();
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


    public void clickContinueButton() {
        this.continueButton.click();
    }


    public boolean passwordErrorMessageExists() {
        return this.passwordErrorMessage.exists();
    }

    public boolean confirmPasswordErrorMessageExists() {
        return this.confirmPasswordErrorMessage.exists();
    }
}
