package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	
	//adding the constructor
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	
	

	//adding the locators
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;
	
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(linkText = "Login")
	WebElement linklogin;
	
	
	//Action methods
	
	public void clickMyaccount()
	{
		lnkMyaccount.click();
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	public void clickLogin()
	{
		linklogin.click();
	}
	
}
