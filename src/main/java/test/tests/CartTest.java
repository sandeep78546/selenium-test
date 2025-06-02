package test.tests;

import org.testng.annotations.Test;
import test.BaseTest;
import test.Pages.CartPage;

public class CartTest extends BaseTest {

    CartPage cartPage;

    @Test(dependsOnMethods = {"test.tests.DashboardTest.addProduct"})
    public void setUpCart() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.setClickOnCartBtn();
        Thread.sleep(5000);
    }
}
