package cydeo.step_definitions;

import cydeo.pages.LoginPages;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

//    LoginPages loginPages;
    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
//        Driver.getDriver().get("https://library1.cydeo.com/login.html");

        System.out.println("user is on the library login page");
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
//        loginPages=new LoginPages();
//        loginPages.usernameInputBox.sendKeys(ConfigurationReader.getProperty("librarian.username"));
        System.out.println("user enters librarian user name");

    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
//        loginPages=new LoginPages();
//       loginPages.passwordInputBox.sendKeys("hOFlkKhD");
        System.out.println("user enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
//        loginPages=new LoginPages();
//        loginPages.signInButton.click();
//        String expectedTitle="Login - Library";
//        String actualTitle=Driver.getDriver().getTitle();
//        Assert.assertEquals(expectedTitle,actualTitle);
        System.out.println("user should see the dashboard");
    }
    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("user enters student username");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("user enters student password");
    }

    @When("user enters admin username")
    public void user_enters_admin_username() {
        System.out.println("user enters admin username");
    }
    @When("user enters admin password")
    public void user_enters_admin_password() {
        System.out.println("user enters admin password");
    }





}
