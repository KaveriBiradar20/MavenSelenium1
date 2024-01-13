package parallel_CrossBrowserTest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class class1 {
	@Test
	public void edgeTest()

	{
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://www.Amazon.com");
		  System.out.println(driver.getTitle());
		  
		  
	}
}
