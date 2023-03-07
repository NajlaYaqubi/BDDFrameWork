package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	// @FindBy(locatorType = "Value of Locator")
	// public WebElement elementName;
	
	@FindBy(id ="email")
	public WebElement emailField;
	
	@FindBy(css = "#password")
	public WebElement passwordField;
	
	@FindBy(xpath ="//button[text()='Login']")
	public WebElement loginButton;
	
	@FindBy(id ="newAccountBtn")
	public WebElement createNewAccountButton;
	
	@FindBy(css ="#nameInput")
	public WebElement createNewAccountNameField;
	
	@FindBy(id="emailInput")
	public WebElement createNewAccountEmailField;
	
	@FindBy(xpath ="//input[@id='passwordInput']")
	public WebElement createNewAccountPasswordField;
	
	@FindBy(id ="confirmPasswordInput")
	public WebElement createNewAccountConfPassField;
	
	@FindBy(xpath = "//button[text()='Sign Up']")
	public WebElement signUpButton;
	
	@FindBy(xpath ="//a[@id='accountLink']")
	public WebElement accountoption;

	
	@FindBy(xpath="//p[contains(text(),'Add a payment method')]")
	public WebElement userClickOnAddAPaymentMethod;
	
	@FindBy(xpath=" //body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h1[1]")
	public WebElement debitorcreditcardinformation;
	
	@FindBy(css="#cardNumberInput")
	public WebElement cardnumber;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameoncard;
	
	@FindBy(xpath="//select[@id='expirationMonthInput']")
	public WebElement expirationmonth;
	
	@FindBy(css =" #expirationYearInput")
	public WebElement expirationyear;
	
	@FindBy(xpath=" //input[@id='securityCodeInput']")
	public WebElement securitycode;
	
	@FindBy(xpath="//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement update;

	

}
