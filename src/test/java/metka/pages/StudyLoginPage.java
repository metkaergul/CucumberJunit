package metka.pages;

import metka.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudyLoginPage {
    public StudyLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(name = "_username")
    public WebElement username;


      @FindBy(name = "_password")
    public WebElement password;


      @FindBy(name = "_remember_me")
    public WebElement rememberMe;


        @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPassword;

        @FindBy(name = "_submit")
    public WebElement loginButton;







}
