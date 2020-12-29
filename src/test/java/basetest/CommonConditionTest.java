package basetest;

import constants.PagesURL;
import driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import steps.HomePageStep;
import steps.SearchPageStep;

public class CommonConditionTest {
    protected Driver driver;

    @BeforeEach
    public void startTest() {
        driver = Driver.configureDriver("chrome");
        driver.openUrl(PagesURL.HOME_PAGE_URL);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/ShowValuesSearchPage.csv", numLinesToSkip = 1)
    public void TCDP194_29(int index, int maxValue) {
        HomePageStep homePageStep = new HomePageStep(this.driver);
        SearchPageStep searchPageStep = homePageStep.fillSearchField("d").clickSearchButton();
        searchPageStep.markDescriptionCheckbox()
                .clickSearchButton()
                .selectShowValue(index)
                .verifyQuantity(maxValue);
    }
    @AfterEach
    public void endTest() {
        driver.closeDriver();
    }
}
