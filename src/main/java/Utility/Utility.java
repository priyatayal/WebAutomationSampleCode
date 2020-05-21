package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import basepackage.Base;

public class Utility extends Base
{

public static String takescreenshot() throws IOException 
{
String Destination="D:\\eclipse-workspace\\Automation\\test-output\\Moblile number.png";

File Dest = new File("D:\\eclipse-workspace\\Automation\\test-output\\Moblile number.png"); 
File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(source, Dest);

return Destination;

}
	


}

	
	
