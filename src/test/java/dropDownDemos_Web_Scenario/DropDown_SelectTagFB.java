package dropDownDemos_Web_Scenario;

import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import helper.Utility;

public class DropDown_SelectTagFB
{
	//reusable script/method
//	public static void selectBasedDropdown(WebElement ele,String value)
//	{
//		Select dd=new Select(ele);
//		
//		System.out.println("Is dropdown support mutiple selection: "+dd.isMultiple());
//		
//		List<WebElement> allOptions=dd.getOptions();
//		
//		System.out.println("Total Options are: "+allOptions.size());
//		
//		for(WebElement i:allOptions)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains(value))
//			{
//				i.click();
//				break;
//			}
//		}
//	}

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//dropdown
		WebElement dayele=driver.findElement(By.id("day"));
		
		Utility.selectBasedDropDown(dayele,"27");
		
		//month dropdown
		WebElement monele=driver.findElement(By.id("month"));
		Utility.selectBasedDropDown(monele,"Dec");
		
		//year dropdown
		WebElement yearele=driver.findElement(By.id("year"));
		Utility.selectBasedDropDown(yearele,"2010");
	}
}

		
		
//		Select dd=new Select(dayele);
//		
//		System.out.println("Is dropdown support mutiple selection: "+dd.isMultiple());
//		
//		List<WebElement> allOptions=dd.getOptions();
//		
//		System.out.println("Total Options are: "+allOptions.size());
//		
//		for(WebElement i:allOptions)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains("27"))
//			{
//				i.click();
//				break;
//			}
//		}
