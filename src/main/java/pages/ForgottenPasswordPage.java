package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class ForgottenPasswordPage extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'Back')]")
    private Button backButton;

    @FindBy(id = "input-email")
    private TextInput email;

    @FindBy(xpath = "//input[@value='Continue']")
    private Button continueButton;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private HtmlElement passwordRestoreErrorMessage;

    public ForgottenPasswordPage(Driver driver) {
        super(driver);
    }

    public void clickBackButton() {
        this.backButton.click();
    }

    public void fillEmailField(CharSequence... firstName) {
        this.email.sendKeys(firstName);
    }

    public String getEmailText() {
        return this.email.getText();
    }

    public void clickContinueButton() {
        this.continueButton.click();
    }

    public boolean passwordRestoreErrorMessageExists() {
        return this.passwordRestoreErrorMessage.exists();
    }

}
