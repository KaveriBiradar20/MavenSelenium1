package datadrivenFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Usingarray 
{
//	@DataProvider(name="testdata1")
//	public Object[][] testData()
//	{
//	  Object data[][] = {{"Admin","admin123"},{"sarang", "sarang123"},{"Admin", "admin123"},{"pooja", "pooja123"}};
//	  return data;
//	
//	}
	
  @Test(dataProvider="testdata1", dataProviderClass = Customdata.class)//If data provider present in different class we go for this
  public void loginTest(String un, String psw)
  {
	  System.out.println("Username is "+un);
	  System.out.println("Password is "+ psw);
  }
  
  //Short sumary: first the testdata1 from @test will go to @dataProvider name=testdata1, from this testdata1
  //it will return the data whatever arguments v r passing, currently 2 column these two Admin, admin123 will
  //pass to logintest(),and then testcase will run 4 time with 4 different data set
  //this is how we achieve data driven test
}
