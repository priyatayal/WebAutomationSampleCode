package basepackage;
import java.io.FileInputStream;
import java.lang.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class Base
{
	public static WebDriver driver;
    
	public Base()
	{
		Properties prop = new Properties();
		FileInputStream file;
		try 
		{
			file = new FileInputStream("D:\\eclipse-workspace\\Automation\\src\\main\\resources\\parameters.properties");
			
			prop.load(file);
		} 
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void BrowserIntilization()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
		
}
 