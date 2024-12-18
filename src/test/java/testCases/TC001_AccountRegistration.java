package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC001_AccountRegistration extends BaseClass{
	
	
	
	
	@Test
	public void VerifyAccount() throws InterruptedException
	{
		HomePage hm =new HomePage(driver);
		hm.clickMyaccount();
		hm.clickRegister();
		
		RegisterPage rpg=new RegisterPage(driver);
		rpg.firstname(randomString().toUpperCase());
		rpg.lastname(randomString().toUpperCase());
		rpg.email(randomString()+"@gmail.com");
		rpg.phonenumber(randomNumber());
		
		String pwd=randomAlphaNumeric();
		rpg.password(pwd);
		rpg.passwordConfirm(pwd);
		rpg.clickagree();
		Thread.sleep(1000);
		rpg.clickContinue();
	String actualmessage=rpg.confirmMsg();
	org.testng.Assert.assertEquals(actualmessage, "Your Account Has Been Created!");
		
	}

}
