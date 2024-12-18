package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	//add locators

	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement pswd;
	@FindBy(xpath="//input[@value='Login']")
	WebElement Loginbtn;
	
	//add action methods
	
	public void setemail(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void setpaswrd(String pwd)
	{
		pswd.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		Loginbtn.click();
	}
	
	
}
