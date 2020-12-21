package steps;

import driver.Driver;
import pages.MyAccountPage;

public class MyAccountPageStep extends BaseStep {
    private MyAccountPage page;

    public MyAccountPageStep(Driver driver) {
        super(driver);
        this.page = new MyAccountPage(this.getDriver());
    }
}
