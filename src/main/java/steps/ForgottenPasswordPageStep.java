package steps;

import driver.Driver;
import pages.ForgottenPasswordPage;

public class ForgottenPasswordPageStep {
    private ForgottenPasswordPage page;

    public ForgottenPasswordPageStep(Driver driver) {
        this.page = new ForgottenPasswordPage(driver);
    }
}
