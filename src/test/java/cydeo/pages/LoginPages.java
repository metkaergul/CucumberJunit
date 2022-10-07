package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {

    public LoginPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="inputEmail")
    public WebElement usernameInputBox;


     @FindBy(id="inputPassword")
    public WebElement passwordInputBox;


     @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;



}
