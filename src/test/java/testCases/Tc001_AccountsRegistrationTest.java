package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class Tc001_AccountsRegistrationTest extends BaseClass {

	@Test
	public void login() {

		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();

		RegistrationPage regpage = new RegistrationPage(driver);
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.setEmail(randomString() + "@gmail.com");
		regpage.setPassword(randomAlphanumeric().toLowerCase());
		regpage.setPrivacy();
		regpage.clickContinue();

		String confmsg = regpage.getConfirmationMessage();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");

	}

}
