package contactUsTests;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ContactPageStep;
import steps.HomePageStep;
//Contact Us Page: Validation the "Enquiry" field of the "Contact" form with invalid data
public class TC_DP194_57 extends CommonConditionTest {
	@ParameterizedTest
	@CsvFileSource(resources = "/ContactFormInvalidEnquiry.csv", numLinesToSkip = 1)
	public void TCDP194_57(String name, String email, String enquiry) {
		HomePageStep homePageStep = new HomePageStep(this.driver);
		ContactPageStep contactPageStep = homePageStep.clickContactUsLink();
		contactPageStep.fillNameField(name)
		.fillEmailField(email)
		.fillEnquiryField(enquiry)
		.clickSubmitButton().verifyCurrentPage(PagesURL.CONTACT_PAGE_URL)
		.verifyEnquiryErrorMsg(true);
	}
}
