package metka.pages;

import metka.utilities.ConfigurationReader;
import metka.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebTablePage {

    public LoginWebTablePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(name = "username")
    public WebElement usernameInputBox;


    @FindBy(name = "password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;


    /**
     * No parameters
     * When we call this method, it will directly login using:
     * Username:Test
     * Password:Tester
     */
    public  void LoginWithValidCredentials() {

        this.usernameInputBox.sendKeys("Test");
        this.passwordInputBox.sendKeys("Tester");
        this.loginButton.click();
    }

    /**
     * This method will accept two arguments and login
     * @param username
     * @param password
     */
    public  void LoginWithValidCredentials(String username,String password){

        this.usernameInputBox.sendKeys(username);
       this. passwordInputBox.sendKeys(password);
        this.loginButton.click();


    }

    /**
     * THIS METHOD will log in using credentials from
     * configuration.properties
     */
    public void loginWithConfig(){

        usernameInputBox.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
        loginButton.click();
    }






}
