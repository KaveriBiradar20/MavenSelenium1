package parallel_CrossBrowserTest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class2 {
	@Test
	  public void chromeTest()
	  
	  {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com");
		  System.out.println(driver.getTitle());
		  
		  
	  }
}
