package realTime_AnnotationsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CRMTestBasic {
  @Test
  public void crmTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://automationplayground.com/crm");
	  //Sign in
	  driver.findElement(By.linkText("Sign In")).click();
	  //login
	  driver.findElement(By.id("email-id")).sendKeys("test123@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("remember")).click();
	  driver.findElement(By.id("submit-id")).click();
	  //driver close
	  driver.quit();
  }
  
}
