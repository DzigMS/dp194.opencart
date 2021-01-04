package subsidiaryClasses;

import driver.Driver;
import pages.AdminCustomerListPage;
import pages.AdminLoginPage;

public class RemoveNewCustomer {
    private static final String ADMIN_LOGIN_PAGE = "https://34.121.117.87/admin/index.php?route=common/login";
    private static final String ADMIN_CUSTOMER_LIST_PAGE = "https://34.121.117.87/admin/index.php?route=customer/customer";

    private Driver driver;

    private AdminLoginPage loginPage;
    private AdminCustomerListPage listPage;

    private String adminUsername;
    private String adminPassword;

    private Boolean isLoggedIn;

    private String customerEmail;

    public RemoveNewCustomer(Driver driver) {
        this.driver = driver;

        this.isLoggedIn = false;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public boolean setCustomerEmail(String customerEmail) {
        if (customerEmail.contains("@")) {
            this.customerEmail = customerEmail;
            return true;
        }
        return false;
    }

    public void login() {
        this.logout();

        this.driver.getWebDriver().get(RemoveNewCustomer.ADMIN_CUSTOMER_LIST_PAGE);

        this.loginPage = new AdminLoginPage(this.driver);

        this.loginPage.fillUsernameTextBox(this.adminUsername);
        this.loginPage.fillPasswordTextBox(this.adminPassword);
        this.loginPage.clickLoginButton();


        if (!this.driver.getWebDriver().getCurrentUrl().equals(RemoveNewCustomer.ADMIN_LOGIN_PAGE)) {
            this.isLoggedIn = true;

            this.listPage = new AdminCustomerListPage(this.driver);
        }
    }

    public boolean findCustomer() {
        boolean isFound = false;

        if (this.isLoggedIn) {
            this.listPage.clearEmailTextBox();
            this.listPage.fillEmailTextBox(this.customerEmail);
            this.listPage.clickFilterButton();

            this.listPage = new AdminCustomerListPage(this.driver);

            isFound = this.listPage.getTableValueIndex(AdminCustomerListPage.TableTextValue.EMAIL_INDEX, this.customerEmail) != -1;
        }

        return isFound;
    }

    public boolean markCustomer() {
        boolean isMarked = false;

        if (this.isLoggedIn) {
            if (!this.listPage.isTableEmpty()) {
                int index = this.listPage.getTableValueIndex(AdminCustomerListPage.TableTextValue.EMAIL_INDEX, this.customerEmail);
                if (index != -1) {
                    this.listPage.setCheckBox(index, true);
                    isMarked = true;
                }
            }
        }

        return isMarked;
    }

    public void clickDeleteButton() {
        if (this.isLoggedIn) {
            this.listPage.clickDeleteButton();
            this.driver.getWebDriver().switchTo().alert().accept();

            this.listPage = new AdminCustomerListPage(this.driver);
        }
    }

    public void logout() {
        if (this.isLoggedIn) {
            this.listPage.clickLogoutButton();

            this.isLoggedIn = false;
        }
    }
}
