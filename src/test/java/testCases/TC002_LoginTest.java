package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	
	@Test
	public void verifyLogin()
	{
		
		HomePage hm=new HomePage(driver);
		
		hm.clickMyaccount();
		hm.clickLogin();
		
		LoginPage lp= new LoginPage(driver);
		lp.setemail(prop.getProperty("email"));
		lp.setpaswrd(prop.getProperty("password"));
		lp.clicklogin();
		
		MyAccountPage mp=new MyAccountPage(driver);
		boolean message=mp.myAccountpageexist();
		//Assert.assertEquals(message, true);
		Assert.assertTrue(message);
		
	}

}
