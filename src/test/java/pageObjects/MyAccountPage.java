package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	//add locators
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement msgHeading;
	
	//action methods
	public boolean myAccountpageexist()
	{
		return(msgHeading.isDisplayed());
		
	}
}
