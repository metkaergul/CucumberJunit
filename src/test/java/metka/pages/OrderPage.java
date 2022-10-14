package metka.pages;

import metka.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage extends BasePage{

    public OrderPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//select[@name='product']")
    public WebElement productDropdown;
    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantity;

    @FindBy(xpath = "//input[@placeholder='Full name of the customer']")
    public WebElement customerName;

    @FindBy(xpath = "//input[@placeholder='Street address of the customer']")
    public WebElement street;

    @FindBy(xpath = "//input[@placeholder='City where the customer lives']")
    public WebElement city;

    @FindBy(xpath = "//input[@placeholder='State where the customer lives']")
    public WebElement state;

    @FindBy(name = "zip")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement> radioButtons;

    @FindBy(name = "cardNo")
    public WebElement cardNumber;

    @FindBy(name = "cardExp")
    public WebElement expirationDate;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;




}
