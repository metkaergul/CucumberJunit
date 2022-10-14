package metka.pages;

import metka.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePages {

    public HomePages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id="navbarDropdown")
    public WebElement profileMenuDropdown;

    @FindBy(linkText = "Log Out")
    public WebElement LogOutOption;




}
