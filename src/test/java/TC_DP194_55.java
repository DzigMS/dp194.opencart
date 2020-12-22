import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.ContactPageStep;
import steps.HomePageStep;
//Contact Us Page: Validation the "E-Mail Address" field of the "Contact" form with invalid data
public class TC_DP194_55 extends CommonConditionTest {
	String contactPageUrl = "https://34.121.117.87/index.php?route=information/contact";
	@ParameterizedTest
	@CsvFileSource(resources = "/ContactFormInvalidEmail.csv", numLinesToSkip = 1)
	public void TCDP194_55(String name, String email, String enquiry) {
		HomePageStep homePageStep = new HomePageStep(this.driver);
		ContactPageStep contactPageStep = homePageStep.clickContactUsLink();
		contactPageStep.fillNameField(name)
		.fillEmailField(email)
		.fillEnquiryField(enquiry)
		.clickSubmitButton().verifyCurrentPage(contactPageUrl)
		.clickSubmitButton().verifyEmailErrorMsg(true);
	}
}
