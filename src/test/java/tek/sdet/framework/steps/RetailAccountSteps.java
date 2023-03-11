package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

	// extends CommonUtilityClass
	// Create object of POMFactory
	// Write implementation steps

	POMFactory factory = new POMFactory();
	private List<Map<String, String>> dataTable;

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("User Click on Account");

	}

	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhoneNumber(String name, String phoneNumber) {

		// clear the existing value
		// enter new value
		clearTextUsingSendKeys(factory.accountPage().nameInput);
		sendText(factory.accountPage().nameInput, name);
		clearTextUsingSendKeys(factory.accountPage().phoneInput);
		sendText(factory.accountPage().phoneInput, phoneNumber);
		logger.info("Updating Name and Phone Number");}

	@And("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateButton);
		logger.info("Click on update button");
	}
	@Then("user profile information should be updated")
	public void userProfileInfoShouldUpdate() {

		waitTillPresence(factory.accountPage().personalInfoUpdateMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateMessage));
		String actualMessage = factory.accountPage().personalInfoUpdateMessage.getText();
		String expectedMessage = "Personal Information Updated Successfully";
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("User Profile Information Updated");
		
	}
	@When( "User click on Edit payment method option")
	public void userClickOnEditPaymentMethodoption() {
		click(factory.accountPage().editPaymentMethodoption);
		logger.info("Edit payment method option");
		
	}
	@And( "User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addaPaymentMethodlink);
		logger.info("Add a payment method link");
	}
		@And("User fill debit or credit card information")
		public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
			
			List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
			sendText(factory.accountPage().cardnumber, data.get(0).get("cardnumber"));
			sendText(factory.accountPage().nameoncard,data.get(0).get("nameoncard"));
			sendText(factory.accountPage().expirationmonth, data.get(0).get("expirationmonth"));
			sendText(factory.accountPage().nameoncard,data.get(0).get("expirationyear"));
			sendText(factory.accountPage().securitycode, data.get(0).get("securitycode"));
			logger.info("user filled theDebit or credit card information");
		       
		}
		@And("User click on Add your card button")
		public void userClickOnAddYouCard() {
			click(factory.accountPage().addyourcardButton);
			logger.info("Click on add your card button");
		
		}
		@And("a message should be displayed ‘Payment Method added successfully")
		public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
			
			waitTillPresence(factory.accountPage().PaymentMethodaddedsuccessfully);
			Assert.assertTrue(isElementDisplayed(factory.accountPage().PaymentMethodaddedsuccessfully));
			String actualMessage = factory.accountPage().PaymentMethodaddedsuccessfully.getText();
			String expectedMessage = "Payment Method added successfully";
			Assert.assertEquals(expectedMessage, actualMessage);
			logger.info("‘Payment Method added successfully");
			
	}
		@Then("User click on remove option")
		public void userClickOnremoveoption() {
			click(factory.accountPage().addyourcardButton);
			logger.info("Click on removeoption");
}
}