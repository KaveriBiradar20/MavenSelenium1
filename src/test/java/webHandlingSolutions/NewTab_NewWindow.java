package webHandlingSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab_NewWindow {

	public static void main(String[] args) 
	{
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.google.com");
		
		//from google page i want to open a new tab
		
		for(int i=1; i<=10; i++)
		{
	    WebDriver driver2=driver1.switchTo().newWindow(WindowType.TAB);
	    driver2.get("https://www.facebook.com");
	    System.out.println("Title is :" +driver2.getTitle());
		}
	    
	    //switching to new window
	    
	   WebDriver driver3= driver1.switchTo().newWindow(WindowType.WINDOW);
	   driver3.get("https://www.amazon.in");
	   System.out.println("title is "+driver3.getTitle());
		

	}

}
