package Helper;

import org.openqa.selenium.WebDriver;

import Methods.API_Methods;
import Methods.CommonMethods;
import Methods.PropertyFileUtils;
import Methods.ReadExcelMethod;
import Methods.ScreenShotMethod;
import Methods.WebDriverMethod;
//import Methods.WebdriverMethods;


import Pages.CommonOprations;

import Pages.GeneralOprations;
import Pages.Export_xpath;
import Pages.ACS_GMR_Admin_Xpath;
import Pages.ACS_GMR_Import_Xpath;
import Pages.ACS_GMR_Xpath;

import Pages.Login_Screen;
import TestDataOperations.POJO;
import TestDataOperations.TestDataReader;

public class BaseObjects {

	
	public static WebDriver driver;
	public static ReadExcelMethod read;
	public static POJO pojo;
	
	public static WebDriverMethod wm;	
	public static CommonMethods cm;
	
	public static CommonOprations co;
	public static GeneralOprations go;
	public static ACS_GMR_Xpath gmr;
	public static ACS_GMR_Import_Xpath gmrImport;
	public static ACS_GMR_Admin_Xpath gmrAdmin;
	
	public static ScreenShotMethod ss;
	public static PropertyFileUtils prop;
	public static API_Methods Post;
	
	
	//public static Business_validations Business;
	
	
	
public static Login_Screen loginScreen;
//	public static Home_Screen homeScreen;
//	public static ExportsPage exportsScreen;
//	public static ImportsPage importscreen;
	
	public static TestDataReader testData;
	
	
	

}
