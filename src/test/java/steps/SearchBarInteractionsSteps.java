package steps;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static base.TestBase.driver;

public class SearchBarInteractionsSteps {
    HomePage homePageObject = new HomePage(driver);
    @And("placeholder for first search bar is {string}")
    public void placeholderForFirstSearchBarIs(String arg0) {
        String firstPlaceHolder = homePageObject.GetFirstPlaceHolderText();
        Assert.assertEquals(firstPlaceHolder, arg0, "First placeholder text does not match expected value");
    }

    @Then("placeholder for second search bar is {string}")
    public void placeholderForSecondSearchBarIs(String arg0) {
        String secondPlaceHolder = homePageObject.GetSecondPlaceHolderText();
        Assert.assertEquals(secondPlaceHolder, arg0, "Second placeholder text does not match expected value");

    }

    @Given("user clicks on first search bar")
    public void userClicksOnFirstSearchBar() {
        homePageObject.clickOnFirstSearchBar();
    }

    @When("user select {string}")
    public void userSelect(String arg0) {
        homePageObject.selectFromFirstDropdown(arg0);
    }

    @And("clicks on second search bar")
    public void clicksOnSecondSearchBar() {
        homePageObject.clickOnSecondSearchBar();
    }

    @And("select {string}")
    public void select(String arg0) {
        homePageObject.selectFromSecondDropdown(arg0);
    }
}
