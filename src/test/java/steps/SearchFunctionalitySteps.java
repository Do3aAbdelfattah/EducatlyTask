package steps;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static base.TestBase.driver;

public class SearchFunctionalitySteps {

HomePage homePageObject = new HomePage(driver);
String firstSearchBarString;
String secondSearchBarString;

    @Given("user is in home page")
    public void user_is_in_home_page() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.educatly.com/");

    }
    @When("user enters {string} in the first search bar")
    public void userEntersInTheFirstSearchBar(String arg0) {
        homePageObject.EnterKeywordInFirstSearchBar(arg0);
        firstSearchBarString = arg0;

    }
    @And("user enters {string} in the second search bar")
    public void userEntersInTheSecondSearchBar(String arg0) {
        homePageObject.EnterKeywordInSecondSearchBar(arg0);
        secondSearchBarString = arg0;

    }
    @And("user clicks on search button")
    public void user_clicks_on_search_button() {
        homePageObject.clickOnSearchButton();

    }
    @Then("the search result page is opened")
    public void the_search_result_page_is_opened() {
        //wait until page loaded
        homePageObject.waitUntilURLChanged();
        //Ensure accurate filtering of search results based on keywords entered in the first search bar
        Assert.assertTrue(driver.getCurrentUrl().contains(firstSearchBarString), "search result isn't based on keyword entered in the first search bar");
        //Ensure accurate filtering of search results based on keywords entered in the second search bar
        Assert.assertTrue(driver.getCurrentUrl().contains(secondSearchBarString), "search result isn't based on keyword entered in the second search bar");
    }

    @Then("result page for all programs opens")
    public void resultPageForAllProgramsOpens() {
        homePageObject.waitUntilURLChanged();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.educatly.com/programs");
    }




}
