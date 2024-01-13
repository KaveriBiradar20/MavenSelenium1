package dropDownDemos_Web_Scenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_SelectTag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in");
		System.out.println("Title is "+ driver.getTitle());
		//Identify the select based drop-down
		WebElement ele=driver.findElement(By.name("url"));
		//Create Select class Object
		Select dd1=new Select(ele);
		
		System.out.println("Is dropdown support multiple selection ?:"+ dd1.isMultiple());
		//Single selection
		
		dd1.selectByIndex(2);
		Thread.sleep(2000);
		dd1.selectByVisibleText("Garden & Outdoors");
		Thread.sleep(2000);
		dd1.selectByValue("search-alias=beauty");
		
		//Print all options from dropdown
		
		List<WebElement> list=dd1.getOptions();
		System.out.println("Total Options are "+list.size());
		for(WebElement i:list)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Apps & Games"))
			{
			 i.click();
			 break;
			}
		}
		
	
		
		
		
		

	}

}
