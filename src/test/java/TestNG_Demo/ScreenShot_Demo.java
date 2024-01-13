package TestNG_Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import helper.Utility;

public class ScreenShot_Demo {
  @Test
  public void capture() throws IOException
  {
	  WebDriver driver=new ChromeDriver();
	  	driver.get("https://www.amazon.in");
	  	
	  	//save it in utility
	  	//Create object using driver
	  /*	TakesScreenshot ts=(TakesScreenshot) driver;
	     //takes screen shots in temp file
	  	    File temp=ts.getScreenshotAs(OutputType.FILE);
	  	
	  	//save the screen shot in your project so take take the Location
	  	File dest=new File("./"+"\\Screenshots\\amazon1.png");
	  	
	  	//copy screen shot from temp location to expected location
	  	FileHandler.copy(temp, dest);
	  	
	  */	
	  	
	  	Utility.getscreenShot(driver);
	  	
  }
}
