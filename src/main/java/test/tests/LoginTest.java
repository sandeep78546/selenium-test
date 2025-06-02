package test.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;
import test.Pages.LoginPage;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @Test
    public void loginToApplication(){
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        loginPage.doLogin("standard_user", "secret_sauce");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
    }
}
