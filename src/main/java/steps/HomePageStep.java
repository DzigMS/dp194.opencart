package steps;

import driver.Driver;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageStep extends BaseStep {
	private HomePage homePage;
	
	public HomePageStep(Driver driver) {
		super(driver);
		this.homePage = new HomePage(this.getDriver());
	}

	public HomePageStep fillSearchField(String keyword) {
		homePage.getHeader().fillSearchField(keyword);
		String actual = homePage.getHeader().getSearchFieldText();
		assertEquals(keyword, actual);
		return this;
	}
	
	public SearchPageStep clickSearchButton() {
		homePage.getHeader().clickSearchButton();
		return new SearchPageStep(this.getDriver());
	}
	
	public HomePageStep clickShoppingCartButton() {
		homePage.getHeader().clickShoppingCartButton();
		return this;
	}
	public ContactPageStep clickContactUsLink() {
		homePage.getTopNavBar().clickContactUsLink();
		return new ContactPageStep(this.getDriver());
	}
}
