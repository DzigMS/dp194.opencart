package steps;

import driver.Driver;
import pages.ForgottenPasswordPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForgottenPasswordPageStep extends BaseStep {
    private ForgottenPasswordPage page;

    public ForgottenPasswordPageStep(Driver driver) {
        super(driver);
        this.page = new ForgottenPasswordPage(this.getDriver());
    }

    public ForgottenPasswordPageStep fillEmailField(String text) {
        this.page.clearEmailField();
        this.page.fillEmailField(text);
        assertEquals(text, this.page.getEmailText());
        return this;
    }

    public ForgottenPasswordPageStep clickContinueButton() {
        this.page.clickContinueButton();
        this.page = new ForgottenPasswordPage(this.getDriver());
        return this;
    }

    public ForgottenPasswordPageStep verifyCurrentPage(String pageURL) {
        assertEquals(pageURL, this.getDriver().getLinkUrl());
        return this;
    }

    public ForgottenPasswordPageStep passwordRestoreErrMsgAppeared() {
        boolean expected = true;
        assertEquals(expected, this.page.passwordRestoreErrMsgExists());
        return this;
    }
}
