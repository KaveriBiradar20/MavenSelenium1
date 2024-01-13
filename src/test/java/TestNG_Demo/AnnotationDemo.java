package TestNG_Demo;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationDemo 
{
@Test(priority=1)
public void registerTest()
{
	  System.out.println("This is Register test!");
}

@Test(priority=2)
public void loginTest()
{
	  System.out.println("This is Login test!");
}

@Test(priority=3)
public void logoutTest()
{
	  System.out.println("This is Logout test!");
}


//Annotations
@BeforeMethod
public void bMethod()
{
	  System.out.println("BeforeMethod executes before every test case!");
}

@AfterMethod
public void aMethod()
{
	  System.out.println("AfterMethod will execute after every test case!");
}

@BeforeClass
public void bClass()
{
	  System.out.println("BeforeClass Executes before only first test case!");
}

@AfterClass
public void aClass()
{
	  System.out.println("AfterClass Executes after only last test case!");
}

@BeforeTest
public void bTest()
{
	  System.out.println("BeforeTest will run before class/All classes!");
}


@AfterTest
public void aTest()
{
	  System.out.println("AfterTest will run after class/All classes!");
}

@BeforeSuite
public void bSuite()
{
	  System.out.println("BeforeSuite will run before Test!");
}


@AfterSuite
public void aSuite()
{
	  System.out.println("AfterSuite will run after Test!");
}

}
