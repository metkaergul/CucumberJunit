package metka.pages;

import metka.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtTrackDashboardPage {
    public VtTrackDashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@id='user-menu']/a")
    public WebElement profileMenu;


    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutOption;

    public void logOut(){
        profileMenu.click();
        logoutOption.click();

    }



}
