package steps;

import driver.Driver;
import pages.HomePage;

public class HomePageStep {
    private HomePage homePage;

    public HomePageStep(Driver driver) {
        this.homePage = new HomePage(driver);
    }
    public String getHomePageUrlStep(Driver driver) {
        return homePage.getLinkUrl(driver);
    }
}
