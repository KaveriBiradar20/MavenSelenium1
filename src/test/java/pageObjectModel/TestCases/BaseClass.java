package pageObjectModel.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjectModel.Pages.LoginPage;
import pageObjectModel.Pages.NewLoginPage;

public class BaseClass
{
	public WebDriver driver;
	public LoginPage lp;
	public NewLoginPage nlp;
	
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp=new LoginPage(driver);
		//nlp=new NewLoginPage(driver);
		NewLoginPage nlp=PageFactory.initElements(driver, NewLoginPage.class); 
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
		
	
	

}
