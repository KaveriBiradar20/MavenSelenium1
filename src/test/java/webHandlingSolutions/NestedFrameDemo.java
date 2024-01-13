package webHandlingSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//Top Frame
		//driver.switchTo().frame(0);
		//left frame
		//driver.switchTo().frame("frame-left");
		
		//we can write in one line also
		driver.switchTo().frame(0).switchTo().frame("frame-left");
		
		
		String text1=driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText();
		System.out.println(text1);
		System.out.println("********Left frame source***");
		System.out.println(driver.getPageSource());
		
		//come back to top frame
		driver.switchTo().defaultContent();
		
		
		// Left- Middle--no
		driver.switchTo().frame(0);
		driver.switchTo().frame("frame-middle");
		String text2=driver.findElement(By.id("content")).getText();
		System.out.println(text2);
		
		System.out.println(  "******Middle Frame source****");
		System.out.println(driver.getPageSource());
		
		//comeback to top
		driver.switchTo().defaultContent();
		
		//go to right frame
		driver.switchTo().frame(0).switchTo().frame("frame-right");
		
		//driver.switchTo().frame("frame-right");
		String text3=driver.findElement(By.xpath("//body[normalize-space()='RIGHT']")).getText();
		System.out.println(text3);
		
		//right to bottom frame
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		System.out.println(driver.getPageSource());
	 String str4=driver.findElement(By.xpath("//body[normalize-space()='BOTTOM']")).getText();
		System.out.println("Text is "+str4);
		
		
		
				
		
	}

}
