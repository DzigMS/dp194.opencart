import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.HomePageStep;
import steps.SearchPageStep;
//Search page: Validation the possibility to display products in different quantity
public class TC_DP194_29 extends CommonConditionTest {
	@ParameterizedTest
	@CsvFileSource(resources = "/ShowValues.csv", numLinesToSkip = 1)
	public void TCDP194_29(int index, int maxValue) {
		HomePageStep homePageStep = new HomePageStep(this.driver);
		SearchPageStep searchPageStep = homePageStep.fillSearchField("d").clickSearchButton();
		searchPageStep.markDescriptionCheckbox()
		.clickSearchButton()
		.selectShowValue(index)
		.verifyQuantity(maxValue);
	}
}
