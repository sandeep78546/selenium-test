package test.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebTablePage {
    WebDriver driver;

    @FindBy(id = "edit-record-2")
    WebElement editBtn;

    @FindBy(id = "firstName")
    WebElement firstName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "userEmail")
    WebElement email;

    @FindBy(id = "age")
    WebElement age;
    @FindBy(id = "salary")
    WebElement salary;

    @FindBy(id = "department")
    WebElement department;

    @FindBy(id = "submit")
    WebElement submitBtn;

    public WebTablePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnEditBtn(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", editBtn);
    }

    public void editRecord(){
        firstName.clear();
        firstName.sendKeys("Sandeep");
        lastName.clear();
        lastName.sendKeys("Birla");
        email.clear();
        email.sendKeys("sandeep210@gmail.com");
        age.clear();
        age.sendKeys("23");
        salary.clear();
        salary.sendKeys("35000");
        department.clear();
        department.sendKeys("Software");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", submitBtn);
    }
}
