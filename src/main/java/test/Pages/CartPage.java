package test.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@data-test='shopping-cart-link']")
    WebElement clickOnCartBtn;

    @FindBy(name = "checkout")
    WebElement checkoutBtn;

    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastName;

    @FindBy(css = "input#postal-code")
    WebElement zipCode;
    @FindBy(xpath = "//input[@data-test='continue']")
    WebElement continueBtn;
    public void fillAddress(){
        firstName.sendKeys("Sandeep");
        lastName.sendKeys("Birla");
        zipCode.sendKeys("452003");
    }
    public void setClickOnCartBtn(){
        clickOnCartBtn.click();
        checkoutBtn.click();
        fillAddress();
        continueBtn.click();
    }
}
