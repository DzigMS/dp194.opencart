package steps;

import driver.Driver;
import pages.HomePage;
import pages.SearchPage;

public class HomePageStep {
	private Driver driver;
	private HomePage homePage;
	
	public HomePageStep(Driver driver) {
		this.driver = driver;
		this.homePage = new HomePage(driver);
	}

	public HomePageStep fillSearchField(String keyword) {
		homePage.getHeader().fillSearchField(keyword);
		return this;
	}
	
	public SearchPageStep clickSearchButton() {
		homePage.getHeader().clickSearchButton();
		return new SearchPageStep(this.driver);
	}
	
	public HomePageStep clickShoppingCartButton() {
		homePage.getHeader().clickShoppingCartButton();
		return this;
	}
	public ContactPageStep clickContactUsLink() {
		homePage.getTopNavBar().clickContactUsLink();
		return new ContactPageStep(driver);
	}
}
