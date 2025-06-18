package test.tests;

import org.testng.annotations.Test;
import test.BaseTest;
import test.Pages.WebTablePage;

public class WebTableTest extends BaseTest {

    WebTablePage webTablePage;
    @Test
    public void editTableData() throws InterruptedException {
        driver.get("https://demoqa.com/webtables");
        webTablePage = new WebTablePage(driver);
        webTablePage.clickOnEditBtn();
        webTablePage.editRecord();
        Thread.sleep(5000);
    }
}
