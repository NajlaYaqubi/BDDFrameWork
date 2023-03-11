package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.lu.a;
import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//img[@alt='profile pic']")
	public WebElement accountProfilePicture;
	
	
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement nameInput;
	
	@FindBy(xpath = "//input[@id='personalPhoneInput']")
	public WebElement phoneInput;
	
	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement updateButton;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateMessage;
	
   @FindBy(xpath="//p[contains(text(),'Add a payment method link')]")
   public WebElement addaPaymentMethodlink;
   
   
   
   @FindBy( id="accountLink\"")
   public WebElement caccountLink;
   
   @FindBy(xpath="//button[contains(text(),'Edit')]")
   public WebElement editPaymentMethodoption;
   
	@FindBy(id="cardNumberInput")
	public WebElement cardnumber;
	
	
	@FindBy(xpath = "//input[@id='nameOnCardInput']")
	public WebElement nameoncard;
	
	@FindBy(css="#expirationMonthInput")
	public WebElement expirationmonth;
	
	@FindBy(xpath ="//select[@id='expirationYearInput']")
	public WebElement expirationyear;
	
	@FindBy(xpath=" //input[@id='securityCodeInput']")
	public WebElement securitycode;
	
	@FindBy(css= "#paymentSubmitBtn")
	public WebElement addyourcardButton;

	@FindBy(xpath="//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement PaymentMethodaddedsuccessfully;


	@FindBy(xpath=" //button[contains(text(),'remove')]")
	public WebElement removeoption;


	
	
}
