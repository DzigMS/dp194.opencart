package pages;

import org.openqa.selenium.support.FindBy;

import driver.Driver;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class ContactUsPage extends BasePage {

    @FindBy(id = "input-name")
    private TextInput nameField;
    @FindBy(id = "input-email")
    private TextInput emailField;
    @FindBy(id = "input-enquiry")
    private TextInput enquiryField;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    private Button submit;
    @FindBy(xpath = "//*[@class='text-danger' and text()='Name must be between 3 and 32 characters!']")
    private TextBlock nameErrorMsg;
    @FindBy(xpath = "//*[@class='text-danger' and text()='E-Mail Address does not appear to be valid!']")
    private TextBlock emailErrorMsg;
    @FindBy(xpath = "//*[@class='text-danger' and text()='Enquiry must be between 10 and 3000 characters!']")
    private TextBlock enquiryErrorMsg;

    public ContactUsPage(Driver driver) {
        super(driver);
    }

    public String getNameFieldText() { return nameField.getText(); }

    public String getEmailFieldText() { return emailField.getText(); }

    public String getEnquiryFieldText() { return enquiryField.getAttribute("value"); }

    public void fillNameField(String name) { nameField.sendKeys(name); }

    public void fillEmailField(String email) { emailField.sendKeys(email); }

    public void fillEnquiryField(String enquiry) { enquiryField.sendKeys(enquiry); }

    public void clickSubmitButton() {
        submit.click();
    }

    public boolean isNameErrorMsgExist() {
        return this.nameErrorMsg.exists();
    }

    public boolean isEmailErrorMsgExist() {
        return this.emailErrorMsg.exists();
    }

    public boolean isEnquiryErrorMsgExist() {
        return this.enquiryErrorMsg.exists();
    }
}
