package testpackage;
import static org.testng.Assert.assertEquals;
import Utility.Utility;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.TestNGException;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PagesPackage.Mainpage;
import basepackage.Base;
public class MainPageTest extends Base

{
	Logger log = Logger.getLogger(MainPageTest.class);
	
Mainpage mainpage;
ExtentReports report;
ExtentTest test;

public MainPageTest()

{
super();


}


@BeforeMethod()
public void setup()
{
BrowserIntilization();	
mainpage = new Mainpage();
report = new ExtentReports("D:\\eclipse-workspace\\Automation\\test-output\\ExtentReport.html",true);
test =report.startTest("Mobile Number");
test =report.startTest("validatesearchbox");
}
@Test(priority =0)
public void verifymobilenumber() throws IOException
{
	/*System.out.println("_______________logging___________");*/
String mobilenumber=mainpage.verifymobilephn();
System.out.println(mobilenumber);
Assert.assertTrue(mobilenumber.equals("0123-456-789"));
log.info("This is mobilenubervertification");

{
	String imagePath =Utility.takescreenshot();
test.addScreenCapture(imagePath);
test.log(LogStatus.PASS, "Mobile number is verified");
}	
}
@Test(priority =-1)
public void validatesearchbox()
{
	
String title =mainpage.searchbox("jeans");

Assert.assertTrue(title.equals("Search - My Store"));

log.info("This is search box testing");

test.log(LogStatus.PASS,"Search box is working fine" );
                              
}	
@AfterMethod()
public void teardown()
{
	driver.close();
	report.endTest(test);
	report.flush();
}		
}
