package test.tests;

import org.testng.annotations.Test;
import test.BaseTest;
import test.Pages.DashboardPage;

public class DashboardTest extends BaseTest {

    DashboardPage dashboardPage;


    @Test(dependsOnMethods = {"test.tests.LoginTest.loginToApplication"})
    public void addProduct() {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.addProduct();
    }
}
