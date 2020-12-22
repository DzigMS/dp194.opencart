package searchTests;
import basetest.CommonConditionTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.HomePageStep;
import steps.SearchPageStep;
//Search page: Validation the search by valid keywords
public class TC_DP194_36 extends CommonConditionTest {
	@ParameterizedTest
	@CsvFileSource(resources = "/ValidKeywords.csv", numLinesToSkip = 1)
	public void  TCDP194_36(String keyword) {
		HomePageStep homePageStep = new HomePageStep(this.driver);
		SearchPageStep searchPageStep = homePageStep.fillSearchField(keyword).clickSearchButton();
		searchPageStep.verifySearchResults(keyword);
	}
}
