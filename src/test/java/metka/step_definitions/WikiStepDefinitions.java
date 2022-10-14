package metka.step_definitions;

import metka.pages.WikipediaPage;
import metka.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiStepDefinitions {

    WikipediaPage wikipediaPage=new WikipediaPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://www.wikipedia.org/");
    }
//    @When("User types Steve Jobs in the wiki search box")
//    public void user_types_steve_jobs_in_the_wiki_search_box() {
//        // Write code here that turns the phrase above into concrete actions
//
//        wikipediaPage.wikiSearchBox.sendKeys("Steve Jobs");
//    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        wikipediaPage.wikiSearchBox.sendKeys(string);
    }


    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        // Write code here that turns the phrase above into concrete actions
       wikipediaPage.wikiSearchButton.click();

    }
//    @Then("User sees Steve Jobs is in the wiki title")
//    public void user_sees_steve_jobs_is_in_the_wiki_title() {
//        // Write code here that turns the phrase above into concrete actions
//        String title = Driver.getDriver().getTitle();
//        Assert.assertTrue(title.contains("Steve Jobs"));
//
//
//    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        // Write code here that turns the phrase above into concrete actions
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains(string));
}

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String headerText) {

          Assert.assertTrue(wikipediaPage.wikiMainHeader.isDisplayed());
          Assert.assertTrue(wikipediaPage.wikiMainHeader.getText().equals(headerText));
    }

    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String imageHeaderText) {
     Assert.assertTrue(wikipediaPage.imageHeader.getText().equals(imageHeaderText));
    }
}
