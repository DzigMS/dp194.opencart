package steps;

import driver.Driver;
import pages.RegisterPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterPageStep {
    private RegisterPage page;

    public RegisterPageStep(Driver driver) {
        this.page = new RegisterPage(driver);
    }

    public RegisterPageStep fillFirstNameField(String text) {
        this.page.fillFirstNameField(text);
        assertEquals(text, this.page.getFirstNameText());
        return this;
    }

    public RegisterPageStep fillLastNameField(String text) {
        this.page.fillLastNameField(text);
        assertEquals(text, this.page.getLastNameText());
        return this;
    }

    public RegisterPageStep fillEmailField(String text) {
        this.page.fillEmailField(text);
        assertEquals(text, this.page.getEmailText());
        return this;
    }

    public RegisterPageStep fillTelephoneField(String text) {
        this.page.fillTelephoneField(text);
        assertEquals(text, this.page.getTelephoneText());
        return this;
    }

    public RegisterPageStep fillPasswordField(String text) {
        this.page.fillPasswordField(text);
        assertEquals(text, this.page.getPasswordText());
        return this;
    }

    public RegisterPageStep fillPasswordConfirmField(String text) {
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
        return this;
    }
}
