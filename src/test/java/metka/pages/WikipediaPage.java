package metka.pages;

import metka.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {



    public WikipediaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement wikiSearchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement wikiSearchButton;

    @FindBy(xpath = "//h1[@id='firstHeading']")
    public WebElement wikiMainHeader;

    @FindBy(xpath = "//div[@class='fn']")
    public WebElement imageHeader;



}
