package steps;

import driver.Driver;

public abstract class BaseStep {
    private Driver driver;

    public BaseStep(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return this.driver;
    }
}
