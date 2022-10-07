package cydeo.step_definitions;

import cydeo.pages.HomePages;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Logout_StepDefinitions {

    HomePages homePages;
    WebDriver driver;

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        driver=Driver.getDriver();
        String expectedTitle="Login - Library";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }
    @When("user click the profile menu")
    public void user_click_the_profile_menu() {
        driver=Driver.getDriver();
        homePages=new HomePages();
        homePages.profileMenuDropdown.click();
    }
    @When("user click the Logout option")
    public void user_click_the_logout_option() {
        driver=Driver.getDriver();
        homePages=new HomePages();
      homePages.LogOutOption.click();
    }
    @Then("user should land on the login page")
    public void user_should_land_on_the_login_page() {
        driver=Driver.getDriver();
        String expectedTitle="Login - Library";
        String actualTitle= driver.getTitle();
      Assert.assertEquals(expectedTitle,actualTitle);
    }

}
