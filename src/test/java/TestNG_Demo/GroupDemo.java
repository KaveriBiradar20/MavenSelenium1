package TestNG_Demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupDemo {
  @Test(priority=1,groups="smoketest")
  public void verifyURL()
  {
	  System.out.println("This is my smoke test");
  }
  @Test(priority=2,groups="smoketest")
  public void verifylink()
  {
	  System.out.println("This is my smoke test");
  }
  @Test(priority=3,groups="functionalTest")
  public void verifyLogin()
  {
	  System.out.println("This is functional test");
  }
  @Test(priority=4,groups="functionalTest")
  public void verifytitle()
  {
	  System.out.println("This is functional test");
  }
  @Test(priority=5,groups="functionalTest")
  public void verifylogout()
  {
	  System.out.println("This is functional test");
  }
  
}
