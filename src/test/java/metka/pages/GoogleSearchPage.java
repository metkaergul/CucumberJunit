package metka.pages;

import metka.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    //CREATE CONSTRUCTOR AND INITIALIZE DRIVER INSTANCE AND THIS CLASS's INSTANCE USING PAGEFACTORY INIT ELEMENTS
    public GoogleSearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //YOU CAN START LOCATING WEB ELEMENTS USING @FindBy annotation
    @FindBy(name = "q")
    public WebElement searchBox;





}
