package cydeo.step_definitions;

import cydeo.pages.WikipediaPage;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;

public class WikiStepDefinitions {

    WikipediaPage wikipediaPage;

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://en.wikipedia.org/wiki/Main_Page");
    }
    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        // Write code here that turns the phrase above into concrete actions
        wikipediaPage=new WikipediaPage();
        wikipediaPage.wikisearchbox.sendKeys("Steve Jobs"+Keys.ENTER);
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        // Write code here that turns the phrase above into concrete actions
       wikipediaPage=new WikipediaPage();

    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        // Write code here that turns the phrase above into concrete actions
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("Steve Jobs"));


    }

}
