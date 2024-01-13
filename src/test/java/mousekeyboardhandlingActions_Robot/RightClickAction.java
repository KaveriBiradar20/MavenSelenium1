package mousekeyboardhandlingActions_Robot;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rbtn=driver.findElement(By.xpath("//span[text()='right click me']"));
		//Actions class
		
		Actions act=new Actions(driver);
		//right click operation
		act.contextClick(rbtn).perform();
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']"));
	// List<WebElement> list1=driver.findElements(By.xpath("(//ul)[3]//li//span"));
		//iterating the options
		for(WebElement i:list)
		{
			System.out.println("All options are "+ i.getText());
		    if(i.getText().contains("Delete"))
		    {
		    	System.out.println("click on it");
		    	i.click();
		    	break;
		    	
		    }
		}
		//Handling Alert
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert text is "+ alt.getText());
			    alt.accept();
			    
			    //Double click Action
			   WebElement ele1= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			   Actions act2=new Actions(driver);
			   
			   act2.doubleClick(ele1).perform();
			   System.out.println("Double Clicked ");
			   
			   Alert alt2=driver.switchTo().alert();
			   System.out.println("Alert text is:" + alt2.getText() );
			   alt2.accept();
			   
			   
			    
		
		
		
		
		

	}

	

}
