package webHandlingSolutions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling_OrangeHRM {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//main page or parent page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentId=driver.getWindowHandle();
		System.out.println("Parent window id is "+ parentId);
		
		//child window
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> allId=driver.getWindowHandles();
		System.out.println(allId);
		
		/*Ask Driver to Switch when Id's are not same
		 * 
		 */
		
		for(String chlidId: allId)
		{
			if(!parentId.equals(chlidId))
			{
				driver.switchTo().window(chlidId);
				driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
				
				//driver.close(); //it will close current window
				//driver.quit(); //it will close all open window by selenium
			}
		}
		//comeback to parent window
		
		driver.switchTo().window(parentId);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		

	}

}
