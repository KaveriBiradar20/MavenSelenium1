package TestNG_Demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo4_InvocationCount {
  @Test(priority=1)
  public void enrollforCourse()
  {
	  System.out.println("Student enroll for the course");
  }
  @Test(priority=2)
  public void training()
  {
	  System.out.println("Student get training for the course");
  }
  @Test(priority=3,invocationCount=3)
  public void placement()
  {
	  System.out.println("Student get placement call");
  }
  
  
}
