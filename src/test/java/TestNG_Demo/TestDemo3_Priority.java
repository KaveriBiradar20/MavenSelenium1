package TestNG_Demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo3_Priority  {
  @Test(priority=1,description="This is my first test case")
  public void registrationTest()
  {
	  System.out.println("This is Register Test");
  }
  @Test(priority=2,description="This is my second test case")
  public void loginTest()
  {
	  System.out.println("This is Login Test");
  }
  @Test(priority=3)
  public void searchTest()
  {
	  System.out.println("This is Search Test");
  }
  @Test(priority=4)
  public void addToCartTest()
  {
	  System.out.println("This is addToCart Test");
  }
}
