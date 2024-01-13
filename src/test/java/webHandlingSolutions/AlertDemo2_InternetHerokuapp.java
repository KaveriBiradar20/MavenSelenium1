package webHandlingSolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo2_InternetHerokuapp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		//Alert Handling
		
		Alert alt=driver.switchTo().alert();
		String text=alt.getText();
		System.out.println("Simple alert text is "+text);
		alt.accept();
		//Capturing the result
		
		String result=driver.findElement(By.id("result")).getText();
		System.out.println("Result is "+result);
		
	    //Alert handling2
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		//Alert handling
		Alert alt2=driver.switchTo().alert();
		String text2=alt2.getText();
		System.out.println("Simple alert text is" + text2);
		alt2.dismiss();
		
		
		//Capturing result
		String result2=driver.findElement(By.id("result")).getText();
		System.out.println("Result is "+result2);
		
	
		
	}

}
