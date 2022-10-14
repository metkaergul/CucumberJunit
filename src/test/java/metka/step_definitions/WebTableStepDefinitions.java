package metka.step_definitions;

import metka.pages.LoginWebTablePage;
import metka.utilities.BrowserUtils;
import metka.utilities.ConfigurationReader;
import metka.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WebTableStepDefinitions {


    LoginWebTablePage loginWebTablePage=new LoginWebTablePage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        // Write code here that turns the phrase above into concrete actions
        String url= ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
    }
    @Given("user enters username {string}")
    public void user_enters_username(String string) {
        // Write code here that turns the phrase above into concrete actions
        loginWebTablePage.usernameInputBox.sendKeys(string);

    }
    @Given("user enters password {string}")
    public void user_enters_password(String string) {
        // Write code here that turns the phrase above into concrete actions
loginWebTablePage.passwordInputBox.sendKeys(string);
    }
    @Given("user click the login button")
    public void user_click_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
loginWebTablePage.loginButton.click();
    }


    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        // Write code here that turns the phrase above into concrete actions
            BrowserUtils.verifyURLContains("orders");
    }

    @And("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {

        loginWebTablePage.LoginWithValidCredentials(username, password);

    }

    @When("User enters  below credentials")
    public void user_enters_below_credentials(Map<String,String>credentials) {

//        loginWebTablePage.usernameInputBox.sendKeys(credentials.get("username"));
//        loginWebTablePage.passwordInputBox.sendKeys(credentials.get("password"));
//        loginWebTablePage.loginButton.click();
        //we can call our login utility method and pass values from map
        loginWebTablePage.LoginWithValidCredentials(credentials.get("username"),credentials.get("password"));


    }



}
