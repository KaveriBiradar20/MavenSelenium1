package pageObjectModel.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	//Encapsulation=wrapping of data+ Function
	private WebDriver driver;
	
	//Initializing the Driver
	
	public LoginPage(WebDriver driver) // taking from base class
	{
		this.driver=driver;
	}
	
	// Locators
	private By un=By.name("username");
	private By pw=By.name("password");
	private By loginbtn=By.xpath("//button[@type='submit']");
	
	//Public Methods
	
	public void doLogin(String username, String password)
	{
		driver.findElement(un).sendKeys(username);
		driver.findElement(pw).sendKeys(password);
		driver.findElement(loginbtn).click();
	}
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
}


