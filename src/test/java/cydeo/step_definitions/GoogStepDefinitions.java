package cydeo.step_definitions;

import cydeo.pages.GoogleSearchPage;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogStepDefinitions {
    GoogleSearchPage googleSearchPage=new GoogleSearchPage();


    @When("user types apple and clicks enter")
    public void user_types_and_clicks_enter2() {

        googleSearchPage.searchBox.sendKeys("apple"+Keys.ENTER);
    }


    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKeyword) {

        googleSearchPage.searchBox.sendKeys(searchKeyword+Keys.ENTER);
    }


    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {
        String expectedTitle=string+" - Google Search";
        String actualTitle=Driver.getDriver().getTitle();

        //Junit assertion accept first arg as expected,second arg as actual
        Assert.assertEquals("title is not as expected",expectedTitle,actualTitle);
        // Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));

    }


    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {
        String expectedTitle="apple - Google Search";
        String actualTitle=Driver.getDriver().getTitle();

        //Junit assertion accept first arg as expected,second arg as actual
        Assert.assertEquals("title is not as expected",expectedTitle,actualTitle);
        // Assert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));


    }

    @Given("User is on Google search page")
    public void user_is_on_google_search_page() {
        // Write code here that turns the phrase above into concrete actions

        Driver.getDriver().get("https://www.google.com");
    }
    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle="Google";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }


//
//    @When("User types Steve Jobs in the google search box and clicks enter")
//    public void userTypesSteveJobsInTheGoogleSearchBoxAndClicksEnter() {
//
//    googlepage=new GooglePage();
//        googlepage.searchBox.sendKeys("Steve Jobs"+ Keys.ENTER);
//
//    }
//
//
//    @Then("User sees Steve Jobs is in the google title")
//    public void user_sees_steve_jobs_is_in_the_google_title() {
//        // Write code here that turns the phrase above into concrete actions
//        String title = Driver.getDriver().getTitle();
//        Assert.assertTrue(title.contains("Steve Job"));
//
//    }

}
