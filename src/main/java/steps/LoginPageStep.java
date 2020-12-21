package steps;

import driver.Driver;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPageStep {
    private Driver driver;
    private LoginPage page;

    public LoginPageStep(Driver driver) {
        this.driver = driver;
        this.page = new LoginPage(this.driver);
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
        return new ForgottenPasswordPageStep(this.driver);
    }

    public MyAccountPageStep clickLoginButton() {
        this.page.clickLoginButton();
        return new MyAccountPageStep(this.driver);
    }

    public RegisterPageStep clickNewCustomerContinueLink() {
        this.page.clickNewCustomerContinueLink();
        return new RegisterPageStep(this.driver);
    }
}
