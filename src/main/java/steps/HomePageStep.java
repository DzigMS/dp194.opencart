package steps;

import driver.Driver;
import pages.HomePage;

public class HomePageStep extends BaseStep {
	private HomePage homePage;
	
	public HomePageStep(Driver driver) {
		super(driver);
		this.homePage = new HomePage(this.getDriver());
	}

	public HomePageStep fillSearchField(String keyword) {
		homePage.getHeader().fillSearchField(keyword);
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

	public CategoryPageStep goToPhonesAndPDAsCategoryPageStep(){
		homePage.getCategoryMenu().clickPhonesAndPDAsCategoryMenu();
		return new CategoryPageStep(this.getDriver());
	}
	public String getCurrentUrl(){
		return homePage.getLinkUrl(this.getDriver());
	}


}
