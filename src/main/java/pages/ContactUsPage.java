package pages;

import org.openqa.selenium.support.FindBy;

import driver.Driver;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Link;
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
	@FindBy(xpath = "//*[@class='btn btn-primary' and text()='Continue']")
	private Button continueButton;
	
	public ContactUsPage(Driver driver) {
		super(driver);
	}
	
	public void fillNameField(String name) {
		nameField.sendKeys(name);
	}
	
	public void fillEmailField(String email) {
		emailField.sendKeys(email);
	}
	
	public void fillEnquiryField(String enquiry) {
		enquiryField.sendKeys(enquiry);
	}
	
	public void clickSubmitButton() {
		submit.click();
	}
	
	public Button getcontinueButton() {
		return this.continueButton;
	}
}
