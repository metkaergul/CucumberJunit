package metka.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metka.pages.StudyHomePage;
import metka.pages.StudyLoginPage;
import metka.utilities.BrowserUtils;
import metka.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStudy_Step_Definitons {

    StudyLoginPage studyLoginPage = new StudyLoginPage();
    StudyHomePage studyHomePage = new StudyHomePage();

    @Given("user is on login page")
    public void userIsOnLoginPage() {

        Driver.getDriver().get("https://qa.navfort.com/user/login");
    }

    @When("driver enters username as {string}")
    public void driver_enters_drivername(String username) {
        studyLoginPage.username.sendKeys(username);


    }

    @When("driver enters password as {string}")
    public void driver_enters_password(String password) {
        studyLoginPage.password.sendKeys(password);

    }

    @When("driver clicks the login page")
    public void driver_clicks_the_login_page() {
        studyLoginPage.loginButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(studyHomePage.QuickLaunchPadText));
    }

    @Then("driver can see {string} text")
    public void driver_can_land_on_to_dashboard(String expectedText) {
        String actualText = studyHomePage.QuickLaunchPadText.getText();

        Assert.assertEquals(expectedText, actualText);

    }


    @When("storemanager or sales manager enter username as {string}")
    public void storemanagerOrSalesManagerEnterUsernameAs(String username) {

        studyLoginPage.username.sendKeys(username);
    }

    @And("storemanager or sales manager enter password as {string}")
    public void storemanagerOrSalesManagerEnterPasswordAs(String password) {
        studyLoginPage.password.sendKeys(password);
    }

    @And("storemanager or sales manager clicks the login page")
    public void storemanagerOrSalesManagerClicksTheLoginPage() {
        studyLoginPage.loginButton.click();

    }

    @Then("storemanager or sales manager can see {string} on the homepage")
    public void storemanagerOrSalesManagerCanSeeOnTheHomepage(String expectedDashboardText) {
        String actualText = studyHomePage.DashboardText.getText();
        Assert.assertEquals(expectedDashboardText, actualText);

    }



}
