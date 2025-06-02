package test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if( driver == null){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
