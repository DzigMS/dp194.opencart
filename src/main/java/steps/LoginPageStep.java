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
        this.page.fillEmailField(text);
        assertEquals(text, this.page.getEmailText());
        return this;
    }

    public LoginPageStep fillPasswordField(String text) {
        this.page.fillPasswordField(text);
        assertEquals(text, this.page.getPasswordText());
        return this;
    }

    public ForgottenPasswordPageStep clickForgottenPasswordLink() {
        this.page.clickForgottenPasswordLink();
        return new ForgottenPasswordPageStep(this.getDriver());
    }

    public MyAccountPageStep clickLoginButton() {
        this.page.clickLoginButton();
        return new MyAccountPageStep(this.getDriver());
    }

    public RegisterPageStep clickNewCustomerContinueLink() {
        this.page.clickNewCustomerContinueLink();
        return new RegisterPageStep(this.getDriver());
    }
}
