package pageObjectModel.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModel.Pages.NewLoginPage;

public class NewLoginPageTest extends BaseClass 
{
	@Test(priority=1)
	public void verifyurl()
	{
		String url=nlp.geturl();
		System.out.println(url);
	}
	
	
	@Test
	public void verifyLogin()
	{
		//NewLoginPage nlp=PageFactory.initElements(driver, NewLoginPage.class); 
		nlp.doLogin("Admin", "admin123");
	}
}
