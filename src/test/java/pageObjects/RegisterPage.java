package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}

	
	//add locators

	

@FindBy(xpath="//input[@id='input-firstname']") WebElement firstName;
@FindBy(xpath="//input[@id='input-lastname']")  WebElement lastName;
@FindBy(xpath="//input[@id='input-email']") WebElement email;
@FindBy(xpath="//input[@id='input-telephone']") WebElement telephone;
@FindBy(xpath="//input[@id='input-password']") WebElement password;
@FindBy(xpath="//input[@id='input-confirm']")  WebElement passwordConfirm;
@FindBy(xpath="//input[@name='agree']")  WebElement agree;
@FindBy(xpath="//input[@type='submit']")  WebElement btncontinue;
@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']") WebElement successMsg;
	

//add action methods

public void firstname(String fname)
{
	firstName.sendKeys(fname);
}

public void lastname(String lname)
{
	lastName.sendKeys(lname);
}

public void email(String mail)
{
	email.sendKeys(mail);
}

public void phonenumber(String phnumber)
{
	telephone.sendKeys(phnumber);
}

public void password(String pwd)
{
	password.sendKeys(pwd);
}


public void passwordConfirm(String Confirmpwd)
{
	passwordConfirm.sendKeys(Confirmpwd);
}

public void clickagree()
{
	agree.click();
}

public void clickContinue()
{
	btncontinue.click();
	
}

public String confirmMsg()
{
	try
	{
		return(successMsg.getText());
	}
	catch (Exception e) {
	return(e.getMessage());
	}
}


}
