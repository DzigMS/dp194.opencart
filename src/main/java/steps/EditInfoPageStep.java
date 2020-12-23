package steps;

import driver.Driver;
import pages.EditInfoPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EditInfoPageStep extends BaseStep {
    private EditInfoPage page;

    public EditInfoPageStep(Driver driver) {
        super(driver);
        this.page = new EditInfoPage(this.getDriver());
    }

    public EditInfoPageStep clickContinueButton() {
        this.page.clickContinueButton();
        this.page = new EditInfoPage(this.getDriver());
        return this;
    }

    public EditInfoPageStep fillFirstNameField(String text) {
        this.page.clearFirstNameField();
        this.page.fillFirstNameField(text);
        assertEquals(text, this.page.getFirstNameText());
        return this;
    }

    public EditInfoPageStep fillLastNameField(String text) {
        this.page.clearLastNameField();
        this.page.fillLastNameField(text);
        assertEquals(text, this.page.getLastNameText());
        return this;
    }

    public EditInfoPageStep fillEmailField(String text) {
        this.page.clearEmailField();
        this.page.fillEmailField(text);
        assertEquals(text, this.page.getEmailText());
        return this;
    }

    public EditInfoPageStep fillTelephoneField(String text) {
        this.page.clearTelephoneField();
        this.page.fillTelephoneField(text);
        assertEquals(text, this.page.getTelephoneText());
        return this;
    }

    public EditInfoPageStep verifyCurrentPage(String pageURL) {
        assertEquals(pageURL, this.getDriver().getLinkUrl());
        return this;
    }


    public EditInfoPageStep firstNameErrorMessageAppeared() {
        boolean expected = true;
        assertEquals(expected, this.page.firstNameErrorMessageExists());
        return this;
    }

    public EditInfoPageStep lastNameErrorMessageAppeared() {
        boolean expected = true;
        assertEquals(expected, this.page.lastNameErrorMessageExists());
        return this;
    }

    public EditInfoPageStep emailErrorMessageAppeared() {
        boolean expected = true;
        assertEquals(expected, this.page.emailErrorMessageExists());
        return this;
    }

    public EditInfoPageStep telephoneErrorMessageAppeared() {
        boolean expected = true;
        assertEquals(expected, this.page.telephoneErrorMessageExists());
        return this;
    }
}
