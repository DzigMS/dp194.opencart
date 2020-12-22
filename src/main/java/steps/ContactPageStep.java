package steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import driver.Driver;
import pages.ContactUsPage;

public class ContactPageStep extends BaseStep {
	private ContactUsPage contactUsPage;
	
	public ContactPageStep(Driver driver) {
		super(driver);
		this.contactUsPage = new ContactUsPage(this.getDriver());
	}
	
	public ContactPageStep fillNameField(String name) {
		contactUsPage.fillNameField(name);
		String actual = contactUsPage.getNameFieldText();
		assertEquals(name, actual);
		return this;
	}
	
	public ContactPageStep fillEmailField(String email) {
		contactUsPage.fillEmailField(email);
		String actual = contactUsPage.getEmailFieldText();
		assertEquals(email, actual);
		return this;
	}
	
	public ContactPageStep fillEnquiryField(String enquiry) {
		contactUsPage.fillEnquiryField(enquiry);
		String actual = contactUsPage.getEnquiryFieldText();
		assertEquals(enquiry, actual);
		return this;
	}
	
	public ContactPageStep clickSubmitButton() {
		contactUsPage.clickSubmitButton();
		return this;
	}
	
	public ContactPageStep verifyCurrentPage(String expectedUrl) {
		String actual = this.getDriver().getLinkUrl();
		assertEquals(expectedUrl, actual);
		return this;
	}

	public ContactPageStep verifyNameErrorMsg(boolean expected) {
		boolean actual = contactUsPage.isNameErrorMsgExist();
		assertEquals(expected, actual);
		return this;
	}

	public ContactPageStep verifyEmailErrorMsg(boolean expected) {
		boolean actual = contactUsPage.isEmailErrorMsgExist();
		assertEquals(expected, actual);
		return this;
	}

	public ContactPageStep verifyEnquiryErrorMsg(boolean expected) {
		boolean actual = contactUsPage.isEnquiryErrorMsgExist();
		assertEquals(expected, actual);
		return this;
	}
}
