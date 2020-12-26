package steps;

import driver.Driver;
import pages.ChangePasswordPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangePasswordPageStep extends BaseStep {
    private ChangePasswordPage page;

    public ChangePasswordPageStep(Driver driver) {
        super(driver);
        this.page = new ChangePasswordPage(this.getDriver());
    }

    public ChangePasswordPageStep fillPasswordField(String text) {
        this.page.clearPasswordField();
        this.page.fillPasswordField(text);
        assertEquals(text, this.page.getPasswordText());
        return this;
    }
    public ChangePasswordPageStep fillPasswordConfirmField(String text) {
        this.page.clearPasswordConfirmField();
        this.page.fillPasswordConfirmField(text);
        assertEquals(text, this.page.getPasswordConfirmText());
        return this;
    }
    public ChangePasswordPageStep clickContinueButton() {
        this.page.clickContinueButton();
        this.page = new ChangePasswordPage(this.getDriver());
        return this;
    }
    public ChangePasswordPageStep verifyCurrentPage(String pageURL) {
        assertEquals(pageURL, this.getDriver().getLinkUrl());
        return this;
    }

    public ChangePasswordPageStep passwordErrMsgAppeared() {
        boolean expected = true;
        assertEquals(expected, this.page.passwordErrMsgExists());
        return this;
    }
    public ChangePasswordPageStep passwordConfirmErrMsgAppeared() {
        boolean expected = true;
        assertEquals(expected, this.page.passwordConfirmErrMsgExists());
        return this;
    }
}
