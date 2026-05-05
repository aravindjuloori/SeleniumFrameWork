package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class Tc001_AccountsRegistrationTest extends BaseClass {

	@Test
	public void login() throws InterruptedException {
		
		logger.info("******************TesCase001_Accounts registration started************");
		
		try {
		
		/*
		 * HomePage hp = new HomePage(driver); hp.clickMyAccount();
		 * logger.info("************Clicked on my account link******");
		 * hp.clickRegister();
		 * logger.info("************Clicked on Register link******");
		 */

		RegistrationPage regpage = new RegistrationPage(driver);
		
		logger.info("************Providing customer detials******");
		Thread.sleep(5000);
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.setEmail(randomString() + "@gmail.com");
		regpage.setPassword(randomAlphanumeric().toLowerCase());
		//regpage.setPrivacy();
		regpage.clickContinue();
		logger.info("************Done with  the providing details and validating expected message******");

		/*
		 * String confmsg = regpage.getConfirmationMessage();
		 * Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		 */
		}
		
		  catch(Exception e ) {
			  
		  logger.error("Test failed...");
		  logger.debug("Debug logs"); 
		  Assert.fail();
		  
		  }
		 
		
		logger.info("************Finished the test case***********");
	}
	

}
