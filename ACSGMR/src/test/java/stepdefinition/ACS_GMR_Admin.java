package stepdefinition;

import static Helper.BaseObjects.go;
import static Helper.BaseObjects.gmr;
import static Helper.BaseObjects.gmrImport;
import static Helper.BaseObjects.gmrAdmin;
import static Helper.BaseObjects.driver;
import static Helper.BaseObjects.loginScreen;
import static Helper.BaseObjects.wm;
import static Helper.BaseObjects.cm;
import static Helper.BaseObjects.co;
import static Helper.BaseVariables.Entity;
import static Helper.BaseVariables.Password;
import static Helper.BaseVariables.Username;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.graphbuilder.math.Expression;

import Methods.CommonMethods;
import Methods.WebDriverMethod;
import TestDataOperations.TestDataReader;
import groovyjarjarantlr.collections.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.net.URL;


public class ACS_GMR_Admin {
	
	private static final String WebElement = null;
	private static final WebDriverMethod Driver = null;
	public boolean verify;
	
	@When("I login with {string} user given in {string} sheet ACS_GMR_Admin")
	public void i_login_with_user_given_in_sheet_ACS_GMR_Import(String entity, String sheetName) throws Throwable {
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(4000);	
		
		
	}
	
	@Given("^To verify whether the user is able to login with there account and to send the Credit Request to Kale Finance ACS_GMR_Admin$")
	public void To_verify_whether_the_user_is_able_to_login_with_there_account_and_to_send_the_Credit_Request_to_Kale_Finance_ACS_GMR_Admin() throws InterruptedException, AWTException {

	gmr.AllRadioBtn.click();
	Thread.sleep(2000);
	
	gmr.GmrHydRadioOKBtn.click();
	Thread.sleep(4000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.Admin);Thread.sleep(4000);
	
	Select dropdown = new Select(driver.findElement(By.id("ctl00_hldPage_drpCreditType")));  
	dropdown.selectByVisibleText("Bank Transfer");
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.BankName);Thread.sleep(2000);
	gmrAdmin.BankName.sendKeys("ICICI Bank");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.BranchName);Thread.sleep(2000);
	gmrAdmin.BranchName.sendKeys("Thane");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.ChequeNo);Thread.sleep(2000);
	gmrAdmin.ChequeNo.sendKeys("CHL34567");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.Amount);Thread.sleep(2000);
	gmrAdmin.Amount.sendKeys("20000");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.ChooseFileForAdmin);Thread.sleep(2000);
	
	Robot uploaddoc = new Robot();
	uploaddoc.delay(2000);

	StringSelection sss1 = new StringSelection("D:\\dummy documents\\pdf1.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sss1, null);

	uploaddoc.keyPress(KeyEvent.VK_CONTROL);
	uploaddoc.keyPress(KeyEvent.VK_V);
	uploaddoc.delay(2000);

	uploaddoc.keyPress(KeyEvent.VK_ENTER);
//	uploaddoc.keyPress(KeyEvent.VK_ENTER);
	uploaddoc.delay(1000);
	

	wm.JavascriptExecutorClick(driver, gmrAdmin.UploadBtn);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.SaveBtn);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.SaveBtnSucesspoup);Thread.sleep(2000);
	
	Actions action = new Actions(driver);
	//Mouseover on an element
	action.moveToElement(gmrAdmin.AccountManagement).perform();
	Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.AccountManagement);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.AccountLeadger);Thread.sleep(2000);
	
	//------------------------For Export dropdown-------------------------------------------
	
	Select mode = new Select(driver.findElement(By.id("ctl00_hldPage_drppda")));  
	mode.selectByVisibleText("Exports");
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.View);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.ExportToExcel);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.ExportToPDF);Thread.sleep(1000);
	
	//driver.navigate().refresh();Thread.sleep(1000);
	
	/*ChromeOptions options = new ChromeOptions();
	DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("browser", "Chrome");
    caps.setCapability("browser_version", "75.0");
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "10");
    caps.setCapability(ChromeOptions.CAPABILITY, options);
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);*/
	Thread.sleep(1000);
	// WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	//driver.switchTo().alert().accept();Thread.sleep(1000);
	
	//------------------------For Import dropdown-------------------------------------------
	Select modeimport = new Select(driver.findElement(By.id("ctl00_hldPage_drppda"))); 
	modeimport.selectByVisibleText("Imports");Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.View);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.ExportToExcel);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.ExportToPDF);Thread.sleep(2000);
	
	DesiredCapabilities caps1 = new DesiredCapabilities();
    caps1.setCapability("browser", "Chrome");
    caps1.setCapability("browser_version", "75.0");
    caps1.setCapability("os", "Windows");
    caps1.setCapability("os_version", "10");
    
    String options1 = null;
	caps1.setCapability(ChromeOptions.CAPABILITY, options1);
	Thread.sleep(1000);
	
	//------------------------For Both dropdown-------------------------------------------
	Select modeboth = new Select(driver.findElement(By.id("ctl00_hldPage_drppda"))); 
    modeboth.selectByVisibleText("Both");
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.View);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.ExportToExcel);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.ExportToPDF);Thread.sleep(2000);
	//driver.switchTo().alert().accept();Thread.sleep(1000);
	
	DesiredCapabilities caps2 = new DesiredCapabilities();
    caps2.setCapability("browser", "Chrome");
    caps2.setCapability("browser_version", "75.0");
    caps2.setCapability("os", "Windows");
    caps2.setCapability("os_version", "10");
    
    String options2 = null;
	caps2.setCapability(ChromeOptions.CAPABILITY, options2);
	Thread.sleep(1000);
	}

}
