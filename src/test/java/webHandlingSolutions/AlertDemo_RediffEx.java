package webHandlingSolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo_RediffEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Inspect UserName
		driver.findElement(By.id("login1")).sendKeys("krajole20@gmail.com");
		
		driver.findElement(By.className("signinbtn")).click();
		
		//Alert appears, but not handling the alert
		
		//driver.findElement(By.id("password")).sendKeys("test123"); //it throws the exception UnhandledAlertException
		
	Thread.sleep(2000);
		//handle the Alert
		
		
		Alert alt=driver.switchTo().alert();
		String text=alt.getText();
		System.out.println("Alert text is "+ text);
		alt.accept();
		driver.findElement(By.id("password")).sendKeys("test123");
		
		

	}

}
