package steps;

import driver.Driver;
import pages.RegisterPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterPageStep extends BaseStep {
    private RegisterPage page;

    public RegisterPageStep(Driver driver) {
        super(driver);
        this.page = new RegisterPage(this.getDriver());
    }

    public RegisterPageStep fillFirstNameField(String text) {
        this.page.clearFirstNameField();
        this.page.fillFirstNameField(text);
        assertEquals(text, this.page.getFirstNameText());
        return this;
    }
    public RegisterPageStep fillLastNameField(String text) {
        this.page.clearLastNameField();
        this.page.fillLastNameField(text);
        assertEquals(text, this.page.getLastNameText());
        return this;
    }
    public RegisterPageStep fillEmailField(String text) {
        this.page.clearEmailField();
        this.page.fillEmailField(text);
        assertEquals(text, this.page.getEmailText());
        return this;
    }
    public RegisterPageStep fillTelephoneField(String text) {
        this.page.clearTelephoneField();
        this.page.fillTelephoneField(text);
        assertEquals(text, this.page.getTelephoneText());
        return this;
    }
    public RegisterPageStep fillPasswordField(String text) {
        this.page.clearPasswordField();
        this.page.fillPasswordField(text);
        assertEquals(text, this.page.getPasswordText());
        return this;
    }
    public RegisterPageStep fillPasswordConfirmField(String text) {
        this.page.clearPasswordConfirmField();
        this.page.fillPasswordConfirmField(text);
        assertEquals(text, this.page.getPasswordConfirmText());
        return this;
    }

    public RegisterPageStep markPrivacyPolicyCheckbox() {
        this.page.setPrivacyPolicyCheckBox(true);
        return this;
    }
    public RegisterPageStep unmarkPrivacyPolicyCheckbox() {
        this.page.setPrivacyPolicyCheckBox(false);
        return this;
    }

    public RegisterPageStep clickContinueButton() {
        this.page.clickContinueButton();
        this.page = new RegisterPage(this.getDriver());
        return this;
    }

    public RegisterPageStep privacyPolicyErrMsgAppeared() {
        boolean expected = true;
        assertEquals(expected, this.page.privacyPolicyErrMsgExists());
        return this;
    }

    public RegisterPageStep firstNameErrMsgAppeared() {
        boolean expected = true;
        assertEquals(expected, this.page.firstNameErrMsgExists());
        return this;
    }
    public RegisterPageStep lastNameErrMsgAppeared() {
        boolean expected = true;
        assertEquals(expected, this.page.lastNameErrMsgExists());
        return this;
    }
    public RegisterPageStep emailErrMsgAppeared() {
        boolean expected = true;
        assertEquals(expected, this.page.emailErrMsgExists());
        return this;
    }
    public RegisterPageStep telephoneErrMsgAppeared() {
        boolean expected = true;
        assertEquals(expected, this.page.telephoneErrMsgExists());
        return this;
    }

    public RegisterPageStep passwordErrMsgAppeared() {
        boolean expected = true;
        assertEquals(expected, this.page.passwordErrMsgExists());
        return this;
    }
    public RegisterPageStep passwordConfirmErrMsgAppeared() {
        boolean expected = true;
        assertEquals(expected, this.page.passwordConfirmErrMsgExists());
        return this;
    }
}
