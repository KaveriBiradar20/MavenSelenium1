package dropDownDemos_Web_Scenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboDropDown_Demo {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
		ele.submit();
		
		//List<WebElement> list1=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//p//span"));
		//System.out.println("Total Options are "+ list1.size());
		
//		for(WebElement i:list1)
//		{
//			System.out.println(i.getText());
//			
//		}

	}

}
