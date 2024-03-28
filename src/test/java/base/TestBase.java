package base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends AbstractTestNGCucumberTests {
    public static WebDriver driver;

    @BeforeMethod
    public void startBrowser()
    {
        //Open chrome browser
        driver = new ChromeDriver();
        //navigate to the website's URL
        driver.navigate().to("https://www.educatly.com/");
        //Maximize the browser's window
        driver.manage().window().maximize();
        //Click on accept all cookies button
        //driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @AfterMethod
    public void closeBrowser()
    {
        //close the browser
        driver.quit();
    }
}
