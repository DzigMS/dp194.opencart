package steps;

import driver.Driver;
import pages.ForgottenPasswordPage;

public class ForgottenPasswordPageStep extends BaseStep {
    private ForgottenPasswordPage page;

    public ForgottenPasswordPageStep(Driver driver) {
        super(driver);
        this.page = new ForgottenPasswordPage(this.getDriver());
    }
}
