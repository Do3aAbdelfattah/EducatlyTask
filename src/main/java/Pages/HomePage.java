package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    //element locator for first search bar
    By firstSearchbar = By.id("rc_select_0");
    //element locator for second search bar
    By secondSearchBar = By.id("rc_select_1");
    //element locator for search button
    By SearchButton = By.xpath("//div[@class='styles_header__start__search__btn__Faur6']");

   // By Dropdown = By.xpath("//div[@class='ant-select-selector']");

    //Enter text in the first search bar
    public void EnterKeywordInFirstSearchBar(String text)
    {
        enterText(firstSearchbar,text);
    }
    //Enter text in the second search bar
    public void EnterKeywordInSecondSearchBar(String text)
    {
        enterText(secondSearchBar,text);
    }
    //click on search button
    public void clickOnSearchButton()
    {
        clickOnElement(SearchButton);
    }
    public String GetFirstPlaceHolderText()
    {
        //get the web element of first search bar
        WebElement inputField = driver.findElement(firstSearchbar);
        // Get the placeholder text
        return inputField.getAttribute("placeholder");
    }
    public String GetSecondPlaceHolderText()
    {
        //get the web element of second search bar
        WebElement inputField = driver.findElement(secondSearchBar);
        // Get the placeholder text
        return inputField.getAttribute("placeholder");
    }
    //select from auto-suggestion list of first search bat
    public void selectFromFirstDropdown(String text)
    {
        //wait until precence of the value in the list
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement suggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[title='Arts']")));
        //click on it
        suggestion.click();
    }
    //select from auto-suggestion list of second search bar
    public void selectFromSecondDropdown(String text)
    {
        //wait until precence of the value in the list
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement suggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[title='Europe']")));
        //click on it
        suggestion.click();
    }
    //click on the first search bar
    public void clickOnFirstSearchBar()
    {
        clickOnElement(firstSearchbar);
    }
    //click on the second search bar
    public void clickOnSecondSearchBar()
    {
        clickOnElement(secondSearchBar);
    }
}
