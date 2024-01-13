package mousekeyboardhandlingActions_Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_Actions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get( "https://jqueryui.com/droppable/#default");
		
		//handle the frame
		driver.switchTo().frame(0);
		
		WebElement src=driver.findElement(By.id("draggable"));
		
		WebElement dest=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		//act.clickAndHold(src).moveToElement(dest).release().build().perform();
		
		 act.dragAndDrop(src, dest).perform();
		
		System.out.println("Action is completed");
		
		
		
		
		
		
	}

}
