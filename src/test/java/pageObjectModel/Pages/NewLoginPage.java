package pageObjectModel.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewLoginPage 
{
	private WebDriver driver;
	
	//initilize driver
	
	public NewLoginPage (WebDriver driver)//base class
	{
		this.driver=driver;
	}
	
	//locators using @findBy annotation
	
	private @FindBy(name="username")
	WebElement un;
	
	private @FindBy(name="password")
	WebElement psw;
	
	private @FindBy(xpath="//button[@type='submit']")
	WebElement btn;
	
	//Methods
	
	public String geturl()
	{
		return driver.getCurrentUrl();
		
	}
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void doLogin(String username, String password)
	{
		un.sendKeys(username);
		psw.sendKeys(password);
		btn.click();
	}
	

}
