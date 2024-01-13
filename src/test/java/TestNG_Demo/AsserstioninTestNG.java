package TestNG_Demo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsserstioninTestNG 
{
	  @Test(priority=1)
	  public void hardAssertionTest() 
	  {
		  String act="Selenium WebDriver is WebUI Test Automation library";
		  
		  String exp="WebUI Test test";
		  
		  //assertEquals()
//		  Assert.assertEquals(act,exp,"Fail: Strings are not equal");
//		  System.out.println("Pass: Strings are equal");
		 
		  //assertTrue
//		  Assert.assertTrue(act.contains(exp),"Fail: Actual string doent contains WebUI");
//		  System.out.println("Actual string contains WebUI");
		  
		  //assertFalse()
		  Assert.assertFalse(act.contains(exp),"Fail: Actual string contains WebUI Test ");
		  System.out.println("Pass: Actual string not contains WebUI Test ");
		  
		  System.out.println("Hard Assertion is completed!");
		  

	  }
	  
	  @Test(priority=2)
	  public void softAssertionTest()
	  {
		  
		  SoftAssert sf=new SoftAssert();
		  
		  int a=100,b=200;
		  
		  //assertEquals()
	      Assert.assertEquals(a,b,"Fail: Number are not equals");
		  System.out.println("Pass: Numbers are equals");
		  sf.assertAll();
		  System.out.println("This is Soft asertion test case");
		  
//		  sf.assertTrue(a==b,"Fail: Number are not equals");
//		  System.out.println("Pass: Numbers are equals");
//		  System.out.println("This is Soft asertion test case");
		  
//		  Assert.assertFalse(a==b,"Fail: Number are equals");
//		  System.out.println("Pass: Numbers are not equals");
//		  System.out.println("This is Soft asertion test case");
//		  sf.assertAll();
//		  
//		  
	  }
	}