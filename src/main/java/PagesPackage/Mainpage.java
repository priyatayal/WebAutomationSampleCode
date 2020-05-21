package PagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Base;

public class Mainpage extends Base
{
	//object repository
	public static String searchTitle;
	
@FindBy(xpath ="//strong")
WebElement phn;


@FindBy(id = "search_query_top")
WebElement textbox;


@FindBy(xpath = "//button[@type='submit' and @name ='submit_search']")
WebElement clickbutton;

public Mainpage()

{
	super();
	PageFactory.initElements(Base.driver, this);
	
}
public  String verifymobilephn()
{
	/*System.out.println("_________________LOGGING______________");*/
String number =phn.getText();
 return number;
}
	
public String searchbox(String text)
{
	textbox.sendKeys(text);
    clickbutton.click();
    searchTitle=Base.driver.getTitle();
    System.out.println(searchTitle);
    return searchTitle;
}
  
}
