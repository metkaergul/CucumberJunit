package cydeo.step_definitions;

import cydeo.pages.DropdownsPage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dataTable_StepDefinition {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String>fruits) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println(fruits);
        System.out.println(fruits.get(1));


    }


    @Given("User is on the dropdowns page og practice tool")
    public void user_is_on_the_dropdowns_page_og_practice_tool() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }


    DropdownsPage dropdownsPage=new DropdownsPage();
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String>expectedMonths) {

        //This method will return us the list of String of
        List<String> optionsAsAList = BrowserUtils.dropdownOptionsAsString(dropdownsPage.monthsDropdown);


        Assert.assertEquals(expectedMonths,optionsAsAList);

    }
}
