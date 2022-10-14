package metka.pages;

import metka.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudyHomePage {

    public StudyHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[.='Quick Launchpad']")
    public WebElement QuickLaunchPadText;


    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement DashboardText;
}