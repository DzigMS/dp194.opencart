package searchTests;
import basetest.CommonConditionTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import steps.HomePageStep;
import steps.SearchPageStep;
//Search page: Validation the search by invalid keywords
public class TC_DP194_42 extends CommonConditionTest {
	@ParameterizedTest
	@CsvFileSource(resources = "/InvalidSearchKeywords.csv", numLinesToSkip = 1)
	@EmptySource
	@ValueSource(strings = {" ", "   "})
	public void TCDP194_42(String keyword) {
		HomePageStep homePageStep = new HomePageStep(this.driver);
		SearchPageStep searchPageStep = homePageStep.fillSearchField(keyword).clickSearchButton();
		searchPageStep.verifyIsEmptySearch(true);
	}
}
