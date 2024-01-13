package TestNG_Demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDisablefromexecution {
  @Test
  public void testCase1() 
  {
	  System.out.println("this is test case 1");
  }
  @Test
  public void testCase2() 
  {
	  System.out.println("this is test case 2");
  }
  @Test
  public void testCase3() 
  {
	  System.out.println("this is test case 3");
  }
  @Test(enabled=false)
  public void testCase4() 
  {
	  System.out.println("this is test case 4");
  }
}
