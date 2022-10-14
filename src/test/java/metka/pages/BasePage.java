package metka.pages;


import metka.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
in this class we will store web elements common to all pages
 */
public class BasePage {

public BasePage(){

    PageFactory.initElements(Driver.getDriver(),this);

}



@FindBy(xpath = "//button[.='View all orders']")
    public WebElement viewAllOrders;


    @FindBy(xpath = "//button[.='View all products']")
public WebElement viewAllProducts;

    @FindBy(xpath = "//button[.='Order']")
public WebElement order;

@FindBy(xpath = "Logout")
    public WebElement logoutButton;

}