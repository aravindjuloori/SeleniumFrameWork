package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
	
	
	public RegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txtPassword;
	
	/*
	 * @FindBy(xpath="//input[@name='agree']") WebElement chkBoxpolicy;
	 */
	
	@FindBy(xpath="//a[normalize-space()='Create Account']")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}
	
	public void setEmail(String emailid) {
		txtEmail.sendKeys(emailid);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	/*
	 * public void setPrivacy() { chkBoxpolicy.click();
	 * 
	 * }
	 */
	
	public void clickContinue() {
		btnContinue.click();
	}
	
	public String getConfirmationMessage() {
		try {
			return (msgConfirmation.getText());
		}
		catch(Exception e) {
			return(e.getMessage());
		}
		
		
		
	}

}
