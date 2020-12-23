package steps;

import driver.Driver;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegisterPage;

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

    public RegisterPageStep goToRegisterPage() {
        this.homePage.getTopNavBar().clickMyAccountDropdown();
        this.homePage.getTopNavBar().clickRegisterLink();

        return new RegisterPageStep(this.getDriver());
    }

    public LoginPageStep goToLoginPage() {
        this.homePage.getTopNavBar().clickMyAccountDropdown();
        this.homePage.getTopNavBar().clickLoginLink();

        return new LoginPageStep(this.getDriver());
    }

    public MyAccountPageStep goToMyAccountPage() {
        this.homePage.getTopNavBar().clickMyAccountDropdown();
        this.homePage.getTopNavBar().clickMyAccountLink();

        return new MyAccountPageStep(this.getDriver());
    }
}
