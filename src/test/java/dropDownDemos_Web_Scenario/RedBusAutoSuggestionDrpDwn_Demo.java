package dropDownDemos_Web_Scenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusAutoSuggestionDrpDwn_Demo {

	public static void main(String[] args) 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
	    WebElement frmele=driver.findElement(By.id("src"));
		frmele.click();
		frmele.sendKeys("pun");
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li//div//text[@class='placeHolderMainText']"));
		System.out.println("List of options are "+list1.size());
		for(WebElement i: list1)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Shivaji Nagar"))
			{
				i.click();
				break;
			}
			
		}
		
		//TO Dropdown
		
		WebElement toele=driver.findElement(By.id("dest"));
		toele.click();
		toele.sendKeys("Bidar");
		//driver.findElement(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li[@class='sc-iwsKbI jTMXri cursorPointing']")).click();
		List<WebElement> list2=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li"));
		System.out.println("Total Options are "+ list2.size());
		for(WebElement k:list2)
		{
			System.out.println(k.getText());
			if(k.getText().contains("Bidarekere"))
			{
				k.click();
				break;
			}
		}
		
		
		
	}

}
