package datadrivenFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HRMDataDrivenTest {
 
	
	/*@Test(dataProvider = "testdata1", dataProviderClass = Customdata.class)
	public void loginTest(String un, String psw) 
	 {
		// Driver Initialization
		WebDriver driver = new ChromeDriver();

		// global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
		// User Name
		
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(psw);
		driver.findElement(By.className("orangehrm-login-button")).click();

		// validation

		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login Failed");
		System.out.println("Login successful");

	}
	*/
	
	@Test(dataProvider = "Exceldata", dataProviderClass = Customdata.class)
	public void loginTest(String un, String psw) 
	 {
		// Driver Initialization
		WebDriver driver = new ChromeDriver();

		// global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
		// User Name
		
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(psw);
		driver.findElement(By.className("orangehrm-login-button")).click();

		// validation

		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login Failed");
		System.out.println("Login successful");

	}
}
