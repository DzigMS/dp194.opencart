package pages;

import driver.Driver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class EditInfoPage extends BasePage {
    //@FindBy(xpath = "//a[text() = 'Back']")
    @FindBy(linkText = "Back")
    private Button backButton;

    @FindBy(id = "input-firstname")
    private TextInput firstName;

    @FindBy(id = "input-lastname")
    private TextInput lastName;

    @FindBy(id = "input-email")
    private TextInput email;

    @FindBy(id = "input-telephone")
    private TextInput telephone;

    @FindBy(xpath = "//input[@value='Continue']")
    private Button continueButton;

    @FindBy(xpath = "//div[@class='text-danger'][text() = 'First Name must be between 1 and 32 characters!']")
    private HtmlElement firstNameErrMsg;
    @FindBy(xpath = "//div[@class='text-danger'][text() = 'Last Name must be between 1 and 32 characters!']")
    private HtmlElement lastNameErrMsg;
    @FindBy(xpath = "//div[@class='text-danger'][text() = 'E-Mail Address does not appear to be valid!']")
    private HtmlElement emailErrMsg;
    @FindBy(xpath = "//div[@class='text-danger'][text() = 'Telephone must be between 3 and 32 characters!']")
    private HtmlElement telephoneErrMsg;

    public EditInfoPage(Driver driver) {
        super(driver);
    }

    public void clickBackButton() {
        this.backButton.click();
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

    public void clickContinueButton() {
        this.continueButton.click();
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
}
