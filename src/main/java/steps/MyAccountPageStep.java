package steps;

import driver.Driver;
import pages.MyAccountPage;

public class MyAccountPageStep extends BaseStep {
    private MyAccountPage page;

    public MyAccountPageStep(Driver driver) {
        super(driver);
        this.page = new MyAccountPage(this.getDriver());
    }

    public MyAccountPageStep clickEditInfoLink() {
        this.page.clickEditInfoLink();
        return new MyAccountPageStep(this.getDriver());
    }

    public MyAccountPageStep clickChangePasswordLink() {
        this.page.clickChangePasswordLink();
        return new MyAccountPageStep(this.getDriver());
    }
}
