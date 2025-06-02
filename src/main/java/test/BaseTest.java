package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import test.base.DriverFactory;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.getDriver();
    }

    @AfterSuite
    public void tearDown(){
        DriverFactory.quitDriver();
    }
}
