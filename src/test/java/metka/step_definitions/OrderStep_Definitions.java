package metka.step_definitions;

import metka.pages.BasePage;
import metka.pages.LoginWebTablePage;
import metka.pages.OrderPage;
import metka.pages.ViewAllOrderPage;
import metka.utilities.BrowserUtils;
import metka.utilities.ConfigurationReader;
import metka.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class OrderStep_Definitions {
    BasePage basePage=new BasePage();
    OrderPage orderPage=new OrderPage();

    ViewAllOrderPage viewAllOrderPage=new ViewAllOrderPage();
    LoginWebTablePage loginWebTablePage=new LoginWebTablePage();
    @Given("user is already logged in and on order page")
    public void userIsAlreadyLoggedInAndOnOrderPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        loginWebTablePage.LoginWithValidCredentials();
        basePage.order.click();

    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        Select select=new Select(orderPage.productDropdown);
        select.selectByVisibleText(string);

    }
    @And("user enters quantity {int}")
    public void userEntersQuantity(int arg0) {
        //clear() method will delete whatever is in the input box
         orderPage.quantity.clear();

         //if clear()method does not work,then you can use sendKeys(Keys.BACK_SPACE) method
        //orderPage.quantity.sendKeys(Keys.BACK_SPACE);

        //accepting int argument and sending it using sendKeys()method
        //since sendKeys()method only accepts String ,we need to either concat with ""
        //or send String.valueOf(int);
//        orderPage.quantity.sendKeys(arg0+"");
        orderPage.quantity.sendKeys(String.valueOf(arg0));
    }

    @When("user enters Customer name {string}")
    public void user_enters_customer_name(String string) {
        orderPage.customerName.sendKeys(string);
    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
            orderPage.street.sendKeys(string);
    }
    @When("user enters City {string}")
    public void user_enters_city(String string) {
            orderPage.city.sendKeys(string);
    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
        orderPage.state.sendKeys(string);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        orderPage.zipcode.sendKeys(string);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String expectedRadioButton) {

        //this line will loop through  the list and decide which radio button to click
        BrowserUtils.clickRadioButton(orderPage.radioButtons,expectedRadioButton);
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        orderPage.cardNumber.sendKeys(string);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        orderPage.expirationDate.sendKeys(string);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
            orderPage.processOrderButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedFirstCell) {
           Assert.assertTrue(viewAllOrderPage.newCustomerCell.getText().equals(expectedFirstCell));
    }



}
