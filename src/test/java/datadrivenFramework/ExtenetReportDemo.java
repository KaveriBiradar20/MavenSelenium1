package datadrivenFramework;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtenetReportDemo {
  @Test
  public void reportTest()
  {
	  //Create ExtentReports object
	  ExtentReports extent = new ExtentReports();
	  //Using reporter we can add path
	  ExtentSparkReporter spark = new ExtentSparkReporter("Reports/Automation.html"); // automatically Reports folder
	  //is created so we set the path where v get reportes under Reportes folder with the name Automation
	  
	  // Setup any conguguration
	  spark.config().setDocumentTitle("Sprint1 report");
	  spark.config().setReportName("Automation Testing Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  //attach report
	  extent.attachReporter(spark);
	  
	  //Create Test-using ExtentTest class
	 ExtentTest test= extent.createTest("Test1"); //with the help of this object we can add the logs
			 
		//how to add logs	 
			 
	   test.pass("Test Case is passed");
	   test.fail("Test case is faile");
	   test.info("Testing is in progress");
	   test.skip("test case is skipped");
	   
	   test.log(Status.PASS, "Testcase is passed ");
	   
	   //to exit from report
	  extent.flush(); //it will return the output in html
  }
}
