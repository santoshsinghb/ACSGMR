package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Methods.CommonMethods;
import Methods.WebDriverMethod;

public class BasePage {
	
	public WebDriver driver;
	boolean verify = false;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public BasePage(WebDriver driver,WebDriverMethod wm)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public BasePage(WebDriver driver,WebDriverMethod wm,CommonMethods cm)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*public BasePage(WebDriver driver,WebDriverMethod wm,CommonMethods cm,CommonOprations co,GeneralOprations go,Export_FVR_Messaging_xpath msg)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}*/

//	public BasePage(WebDriver driver,WebDriverMethod wm,CommonMethods cm,CommonOprations co,Airline_xpath AIRLINE)
//	{
//		this.driver=driver;
//		PageFactory.initElements(driver, this);
//	}
//
//	public BasePage(WebDriver driver,WebDriverMethod wm,CommonMethods cm,CommonOprations co,Airline_xpath AIRLINE,GSA_Xpaths GSA)
//	{
//		this.driver=driver;
//		PageFactory.initElements(driver, this);
//	}
}
