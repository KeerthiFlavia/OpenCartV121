package testBase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClass {
	
	
	public WebDriver driver;
	public Properties prop;
	
	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException
	{
		
		FileReader file=new FileReader("./src//test//resources//config.properties");
		 prop =new Properties();
		prop.load(file);
		
		
		
		switch(br.toLowerCase())
		{
		case "chrome" :driver=new ChromeDriver();break;
		case "edge": driver=new EdgeDriver();break;
		case "Firefox": driver=new FirefoxDriver();break;
		default :System.out.println("invalid browser name"); return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(prop.getProperty("appUrl")); //reading the url from properties file
		driver.manage().window().maximize();
		
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public String randomString()
	{
		String generatedstring= RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
		
	}
	
	public String randomNumber()
	{
		String generatednumber= RandomStringUtils.randomNumeric(5);
		return generatednumber;
		
	}

	public String randomAlphaNumeric()
	{
		String generatedstrings= RandomStringUtils.randomNumeric(5);
		String generatednumbers= RandomStringUtils.randomNumeric(5);
		return (generatedstrings+"@"+generatednumbers);
		
	}
}
