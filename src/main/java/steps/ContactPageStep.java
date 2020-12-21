package steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import driver.Driver;
import pages.ContactUsPage;

public class ContactPageStep {
	private Driver driver;
	private ContactUsPage contactUsPage;
	
	public ContactPageStep(Driver driver) {
		this.driver = driver;
		this.contactUsPage = new ContactUsPage(this.driver);
	}
	
	public ContactPageStep fillNameField(String name) {
		contactUsPage.fillNameField(name);
		return this;
	}
	
	public ContactPageStep fillEmailField(String email) {
		contactUsPage.fillEmailField(email);
		return this;
	}
	
	public ContactPageStep fillEnquiryField(String enquiry) {
		contactUsPage.fillEnquiryField(enquiry);
		return this;
	}
	
	public ContactPageStep clickSubmitButton() {
		contactUsPage.clickSubmitButton();
		return this;
	}
	
	public ContactPageStep verifyCurrentPage(String expectedUrl) {
//		boolean actual = contactUsPage.getcontinueButton().exists();
//		assertEquals(expected, actual);
		String actual = driver.getLinkUrl();
		assertEquals(expectedUrl, actual);
		return this;
	}
}
