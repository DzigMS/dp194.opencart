package steps;

import driver.Driver;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPageStep extends BaseStep {
    private LoginPage page;

    public LoginPageStep(Driver driver) {
        super(driver);
        this.page = new LoginPage(this.getDriver());
    }

    public LoginPageStep fillEmailField(String text) {
        this.page.clearEmailField();
        this.page.fillEmailField(text);
        assertEquals(text, this.page.getEmailText());
        return this;
    }

    public LoginPageStep fillPasswordField(String text) {
        this.page.clearPasswordField();
        this.page.fillPasswordField(text);
        assertEquals(text, this.page.getPasswordText());
        return this;
    }

    public LoginPageStep clickForgottenPasswordLink() {
        this.page.clickForgottenPasswordLink();
        this.page = new LoginPage(this.getDriver());
        return this;
    }

    public LoginPageStep clickLoginButton() {
        this.page.clickLoginButton();
        this.page = new LoginPage(this.getDriver());
        return this;
    }

    public LoginPageStep verifyCurrentPage(String pageURL) {
        assertEquals(pageURL, this.getDriver().getLinkUrl());
        return this;
    }

    public LoginPageStep loginErrMsgAppeared() {
        boolean expected = true;
        assertEquals(expected, this.page.loginErrMsgExists());
        return this;
    }
}
