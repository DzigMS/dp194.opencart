package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class ChangePasswordPage extends BasePage {
    //@FindBy(xpath = "//a[text() = 'Back'")
    @FindBy(linkText = "Back")
    private Button backButton;

    @FindBy(id = "input-password")
    private TextInput password;

    @FindBy(id = "input-confirm")
    private TextInput passwordConfirm;

    @FindBy(xpath = "//input[@value='Continue']")
    private Button continueButton;

    @FindBy(xpath = "//div[@class='text-danger'][text() = 'Password must be between 4 and 20 characters!']")
    private HtmlElement passwordErrMsg;
    @FindBy(xpath = "//div[@class='text-danger'][text() = 'Password confirmation does not match password!']")
    private HtmlElement passwordConfirmErrMsg;

    public ChangePasswordPage(Driver driver) {
        super(driver);
    }

    public void clickBackButton() {
        this.backButton.click();
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

    public void clickContinueButton() {
        this.continueButton.click();
    }

    public boolean passwordErrMsgExists() {
        return this.passwordErrMsg.exists();
    }
    public boolean passwordConfirmErrMsgExists() {
        return this.passwordConfirmErrMsg.exists();
    }
}
