package contactus;

import basetest.CommonConditionTest;
import constants.PagesURL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ContactPageStep;
import steps.HomePageStep;
//Contact Us Page: Validation the "Contact" form with valid data
public class TC_DP194_54 extends CommonConditionTest {
	@ParameterizedTest
	@CsvFileSource(resources = "/ContactFormValidValues.csv", numLinesToSkip = 1)
	public void TCDP194_54(String name, String email, String enquiry) {
		HomePageStep homePageStep = new HomePageStep(this.driver);
		ContactPageStep contactPageStep = homePageStep.clickContactUsLink();
		contactPageStep.fillNameField(name)
		.fillEmailField(email)
		.fillEnquiryField(enquiry)
		.clickSubmitButton().verifyCurrentPage(PagesURL.SUCCESS_CONTACT_PAGE_URL);
	}
}
