package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class ForgottenPasswordPage extends BasePage {
    @FindBy(linkText = "Back")
    private Button backButton;

    @FindBy(id = "input-email")
    private TextInput email;

    @FindBy(xpath = "//input[@value='Continue']")
    private Button continueButton;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible'][text() = ' Warning: The E-Mail Address was not found in our records, please try again!']")
    private HtmlElement passwordRestoreErrMsg;

    public ForgottenPasswordPage(Driver driver) {
        super(driver);
    }

    public void clickBackButton() {
        this.backButton.click();
    }

    public void fillEmailField(CharSequence... firstName) {
        this.email.sendKeys(firstName);
    }
    public void clearEmailField() {
        this.email.clear();
    }
    public String getEmailText() {
        return this.email.getText();
    }

    public void clickContinueButton() {
        this.continueButton.click();
    }

    public boolean passwordRestoreErrMsgExists() {
        return this.passwordRestoreErrMsg.exists();
    }

}
