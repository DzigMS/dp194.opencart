package steps;

import driver.Driver;
import pages.MyAccountPage;

public class MyAccountPageStep {
    private Driver driver;
    private MyAccountPage page;

    public MyAccountPageStep(Driver driver) {
        this.driver = driver;
        this.page = new MyAccountPage(this.driver);
    }
}
