package metka.pages;

import metka.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAllOrderPage extends BasePage{

    public ViewAllOrderPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

//we need to locate the first cell of the first row
    @FindBy(xpath = "//table/tbody/tr[1]/td[1]")
    public WebElement newCustomerCell;

}
