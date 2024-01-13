package TestNG_Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.PropertiesUtil;

public class PropertiesFileGoogleRead {
  @Test
  public void readfile() throws IOException
  {
	  PropertiesUtil p1=new PropertiesUtil();
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get(p1.getData("url"));
	  
	  //driver.get("https://www.google.com");
	  Assert.assertTrue(driver.getTitle().contains(p1.getData("title")),"Title mismatch");
	  System.out.println("Title is matched");
	  driver.findElement(By.name(p1.getData("name"))).sendKeys(p1.getData("input"),Keys.ENTER);
	  
	  
	  /*
	  //File
	  File f1=new File("./"+"\\config.properties");
	  //read in a stream by using FileInputStream class
	  FileInputStream fs= new FileInputStream(f1);
	  //just to handle properties file
	  Properties p1=new Properties();
	  
	  //update everything from properties file to here for this using load method
	  
	  p1.load(fs);
	  */
	  //data we can ready by using method getProperty
	// System.out.println("url is "+p1.getProperty("url"));
	 // System.out.println("Title is "+p1.getProperty("title"));
  }
}
