package pageObjectModel.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPageTest extends BaseClass
{
	@Test(priority=1)
	public void verifyUrl()
	{
		//LoginPage lp=new LoginPage();
		String url=lp.getUrl();
		Assert.assertTrue(url.contains("hrmlive"),"URL is invalid");
		System.out.println("URL is Valid");
		
	}
	
	@Test(priority=2)
	public void verifyTitle()
	{
		String acttitle=lp.getAppTitle();
		Assert.assertTrue(acttitle.contains("OrangeHRM"),"Title Mismatch");
		System.out.println("Title match");
	}
	
	@Test(priority=3)
	public void logIn()
	{
		lp.doLogin("Admin", "admin123");
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"login failed");
		System.out.println("login completed");
		
	}

	

	

}
