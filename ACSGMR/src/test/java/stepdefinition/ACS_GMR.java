package stepdefinition;

import static Helper.BaseObjects.go;
import static Helper.BaseObjects.gmr;
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

public class ACS_GMR {

	
	private static final String WebElement = null;
	private static final WebDriver Driver = null;
	public boolean verify;

	@When("I login with {string} user given in {string} sheet")
	public void i_login_with_user_given_in_sheet(String entity, String sheetName) throws Throwable {
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(4000);	
		
		
	}
	@Given("^To verify whether the user is able to Create Booking from e-Booking ACS_GMR$")
	public void To_verify_whether_the_user_is_able_to_Create_Booking_from_e_Booking_ACS_GMR() throws InterruptedException, AWTException {

	gmr.AllRadioBtn.click();
	Thread.sleep(2000);
	
	gmr.GmrHydRadioOKBtn.click();
	Thread.sleep(2000);
	
	
	//-----------------------------For Direct Shipment---------------------------------------------
	verify = wm.isElementPresent(driver, gmr.MAWBList);Thread.sleep(2000);
	CommonMethods.Verify1(verify, true);Thread.sleep(2000);
	
	/*Actions action = new Actions(driver);
	//Mouseover on an element
	action.moveToElement(gmr.eAWBTab).perform();
	Thread.sleep(1000);
	//----------------------------------------------------------------------------
	Actions action1 = new Actions(driver);
	//Mouseover on an element
	action1.moveToElement(gmr.CreateAWB).perform();
	Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmr.CreateAWB);Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmr.MsgPopupOkBtn);Thread.sleep(1000);
	 
	//--------------------------------------------------------------------------
	gmr.CreateAWBBtn.click();
	Thread.sleep(1000);
	
	Select dropdown = new Select(driver.findElement(By.id("ctl00_hldPage_drpCopyFrom")));  
	dropdown.selectByVisibleText("New");  
	
	Thread.sleep(2000);
    //----------------------------------------------------------------------------
	
	gmr.CTOBtn.click();
	Thread.sleep(1000);
	
	Select dropdown1 = new Select(driver.findElement(By.id("ctl00_hldPage_ddlCustodianName")));  
	dropdown1.selectByVisibleText("Kale_GHA1");  
	
	Thread.sleep(2000);
	
   //-----------------------------------------------------------------------------
	
	//gmr.Console.click();	Thread.sleep(1000); 
	
	//-------------------------------------------------------------------------------
	
	gmr.AWBNoPrefix.sendKeys("999"); Thread.sleep(1000);  
	
	gmr.AWBNo.sendKeys(TestDataReader.Create_AWB());
	Thread.sleep(2000);
	
	//--------------------------------Shippers Name and Address-----------------------------------------------

    gmr.ShippersNameAddBtn.click();Thread.sleep(1000); 
   
    System.out.print("ab checked....\n");Thread.sleep(500);
	
	wm.JavascriptExecutorClick(driver, gmr.HAWBCreationMsgBtn);Thread.sleep(2000);
	driver.switchTo().frame(0);
	
	//driver.switchTo().frame("IframConsignee");
	Thread.sleep(1000);

	System.out.print("In frame....");Thread.sleep(500);
	
	JavascriptExecutor scrollup = (JavascriptExecutor) driver;
	scrollup.executeScript("window.scrollBy(250,0)", "");
	
	
	gmr.ShippersName.click();Thread.sleep(1000);
	System.out.print("Shipper name checked....\n");Thread.sleep(500);
	gmr.ShippersName.sendKeys("ACS Shipper Swaranjali");Thread.sleep(2000);
	
	gmr.Address.click();Thread.sleep(1000);
	System.out.print("Address checked....\n");Thread.sleep(500);
	gmr.Address.sendKeys("Hydrabad");Thread.sleep(2000);
	
	
	
	//driver.switchTo().defaultContent();Thread.sleep(2000);
	
	gmr.country.click();Thread.sleep(1000);
	System.out.print("country checked....\n");Thread.sleep(500);
	gmr.country.sendKeys("in");Thread.sleep(2000);
	
	gmr.countryName.click();Thread.sleep(1000);
	System.out.print("country Name checked....\n");Thread.sleep(1000);
	
	gmr.city.click();Thread.sleep(1000);
	System.out.print("city checked....\n");Thread.sleep(1000);
	gmr.city.sendKeys("hyd");Thread.sleep(2000);
	
	gmr.cityName.click();Thread.sleep(1000);
	System.out.print("city name checked....\n");Thread.sleep(1000);
	
	gmr.ZipCode.click();Thread.sleep(1000);
	System.out.print("Zip code checked....\n");Thread.sleep(500);
	gmr.ZipCode.sendKeys("45456");Thread.sleep(2000);
	
	gmr.SaveForAddShipper.click();Thread.sleep(1000);
	System.out.print("saved all shipper data  checked....\n");Thread.sleep(200);
	
	driver.switchTo().parentFrame();Thread.sleep(2000);
	//Thread.sleep(2000);
	
	gmr.OkSaveForAddShipper.click();Thread.sleep(2000);
	
	
	
	//--------------------------------consignne Name and Address-----------------------------------------------
	
	gmr.ConsigneeNameAddBtn.click();Thread.sleep(1000); 
	
	driver.switchTo().frame("IframConsignee");
	Thread.sleep(1000);
	
	gmr.ConsigneeName.click();Thread.sleep(1000);
	gmr.ConsigneeName.sendKeys("ACS Consignee swaranjali");Thread.sleep(1000);
	System.out.print("Consignee name checked....\n");Thread.sleep(500);
	
	gmr.ConsigneeAddress.click();Thread.sleep(1000);
	gmr.ConsigneeAddress.sendKeys("Hydrabad");Thread.sleep(1000);
	System.out.print("Consignee name checked....\n");Thread.sleep(500);
	
	gmr.ConsigneeCounrty.click();Thread.sleep(1000);
	gmr.ConsigneeCounrty.sendKeys("ae");Thread.sleep(1000);
	System.out.print("consignee country checked....\n");Thread.sleep(500);
	
	gmr.ConsigneeCounrtyName.click();Thread.sleep(1000);
	
	gmr.ConsigneeCity.click();Thread.sleep(1000);
	gmr.ConsigneeCity.sendKeys("dxb");Thread.sleep(1000);
	System.out.print("consignee city checked....\n");Thread.sleep(500);
	
	gmr.ConsigneeCityName.click();Thread.sleep(1000);
	
	gmr.ConsigneeZipCode.click();Thread.sleep(1000);
	gmr.ConsigneeZipCode.sendKeys("56789");Thread.sleep(1000);
	System.out.print("consignee zip code checked....\n");Thread.sleep(500);
	
	gmr.ConsigneeSaveBtn.click();Thread.sleep(1000);
	System.out.print("consignee data saved checked....\n");Thread.sleep(500);
	
	driver.switchTo().defaultContent();Thread.sleep(2000);
	System.out.print("aa checked....\n");Thread.sleep(2000);
	
	//Thread.sleep(70000);
	gmr.ConsigneeOkBtn.click();Thread.sleep(2000);
	System.out.print("consignee data saved  ok checked....\n");Thread.sleep(500);
	
	//---------------------Routing-----------------------------------
	
	wm.JavascriptExecutorClick(driver, gmr.Routing);Thread.sleep(2000);
	
	Set<String> allwindowid = driver.getWindowHandles();
    Object[] windows = allwindowid.toArray();
    String window2 = windows[0].toString();        
    driver.switchTo().window(window2); 
    System.out.println(allwindowid);
    System.out.println(window2);
    Thread.sleep(5000);
	
	
	
    System.out.print("ab checked....\n");Thread.sleep(500);
    wm.JavascriptExecutorClick(driver, gmr.Routing);Thread.sleep(2000);
    //driver.switchTo().frame("IframConsignee");
    Thread.sleep(2000);
	
	System.out.print("abc checked....\n");Thread.sleep(500);
	gmr.DestPort.click();Thread.sleep(2000);
	gmr.DestPort.sendKeys("LHR");Thread.sleep(2000);
	
	gmr.DestPortCountry.click();Thread.sleep(1000);
	
	gmr.Via2.click();Thread.sleep(2000);
	
	//gmr.RoutingOk.click();Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmr.RoutingOk);Thread.sleep(2000);
	
	String window1 = windows[0].toString();
    driver.switchTo().window(window1);
    System.out.println(window1);
    Thread.sleep(5000);
    
    System.out.print("window closed....\n");Thread.sleep(2000);
	
	//----------------------------Flight Requested------------------------------------------------
	
	
    wm.JavascriptExecutorClick(driver, gmr.FlightNo);Thread.sleep(2000);
	
	gmr.FlightNo.sendKeys("276");Thread.sleep(2000);
	gmr.FlightNo.sendKeys("276");Thread.sleep(2000);
	
	//----------------------------Charge Code------------------------------------------------
	
	gmr.ChargeCode.click();
	Thread.sleep(2000);
	Select dropdown3 = new Select(driver.findElement(By.id("ctl00_hldPage_ddlChargeCode")));  
	dropdown3.selectByVisibleText("PP"); 
	
	Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.CustomBroker);Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmr.advikEnterpriesesdropdown);Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmr.CustomBroker1);Thread.sleep(2000);
	
	//----------------------------Reates Charge------------------------------------------------
	
	wm.scrollTillPageEnd();Thread.sleep(1000);
	
	gmr.UncheckRates.click();Thread.sleep(2000);
	
	gmr.RateCharges.click();Thread.sleep(2000);
	gmr.RateCharges.sendKeys("10");Thread.sleep(2000);
	gmr.RateCharges.sendKeys("10");Thread.sleep(1000);
	gmr.total.click();Thread.sleep(2000);
	
	//----------------------------Dimensions------------------------------------------------
	
	gmr.dimensions.click();Thread.sleep(2000);
	gmr.NumberOfPieces.click();Thread.sleep(2000);
	gmr.NumberOfPieces.sendKeys("12");Thread.sleep(2000);
	
	gmr.LengthOfPieces.click();Thread.sleep(2000);
	gmr.LengthOfPieces.sendKeys("30");Thread.sleep(2000);
	
	gmr.WidthOfPieces.click();Thread.sleep(2000);
	gmr.WidthOfPieces.sendKeys("20");Thread.sleep(2000);
	
	gmr.HightOfPieces.click();Thread.sleep(2000);
	gmr.HightOfPieces.sendKeys("10");Thread.sleep(2000);
	
	gmr.DimensionsOkBtn.click();Thread.sleep(2000);
	
	gmr.GrossWeight.click();Thread.sleep(2000);
	gmr.GrossWeight.sendKeys("120");Thread.sleep(2000);
	
	Select dropdown4 = new Select(driver.findElement(By.id("selRateClass_1")));  
	dropdown4.selectByVisibleText("Q");Thread.sleep(2000);
	
	gmr.total.click();Thread.sleep(2000);
	
	gmr.NatureOfGoods.click();Thread.sleep(2000);
	gmr.NatureOfGoods.sendKeys("Natural");Thread.sleep(2000);
	
	gmr.AgentChargesCode.click();
	gmr.AgentChargesCode.sendKeys("AWA");Thread.sleep(2000);
	
	gmr.AgentCharges.click();
	gmr.AgentCharges.sendKeys("121");Thread.sleep(2000);
	
	
	gmr.DueCarrierCode.click();
	gmr.DueCarrierCode.sendKeys("AWC");Thread.sleep(2000);
	
	gmr.DueCarrierCharges.click();
	gmr.DueCarrierCharges.sendKeys("141");Thread.sleep(2000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");Thread.sleep(2000);
	
	
	//gmr.SaveAsTemplate.click();Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmr.SaveAsTemplate);Thread.sleep(2000);
	
	gmr.SaveTemplateName.click();Thread.sleep(2000);
	//gmr.SaveTemplateName.sendKeys("GmrSwaranjali1");Thread.sleep(2000);
	gmr.SaveTemplateName.sendKeys("GmrSwaranjali1");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.Save);Thread.sleep(4000);
	
	wm.JavascriptExecutorClick(driver, gmr.Close);Thread.sleep(4000);
	
	wm.scrollTillPageUp();Thread.sleep(1000);wm.scrollTillPageUp();Thread.sleep(1000);
	
	
	wm.JavascriptExecutorClick(driver, gmr.FinalOk);Thread.sleep(4000);*/
	}
	
	
	@Then("^To verify whether the user is able to Create Consol AWB ACS_GMR$")
	public void To_verify_whether_the_user_is_able_to_Create_Consol_AWB_ACS_GMR() throws InterruptedException, AWTException {
		/*
		//--------------------Console Shipment-----------
		
		Actions action = new Actions(driver);
		//Mouseover on an element
		action.moveToElement(gmr.eAWBTab).perform();
		Thread.sleep(1000);
		//----------------------------------------------------------------------------
		Actions action1 = new Actions(driver);
		//Mouseover on an element
		action1.moveToElement(gmr.CreateAWB).perform();
		Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.CreateAWB);Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.MsgPopupOkBtn);Thread.sleep(1000);
		 
		//--------------------------------------------------------------------------
		gmr.CreateAWBBtn.click();
		Thread.sleep(1000);
		
		Select dropdown = new Select(driver.findElement(By.id("ctl00_hldPage_drpCopyFrom")));  
		dropdown.selectByVisibleText("New");  
		
		Thread.sleep(2000);
	    //----------------------------------------------------------------------------
		
		gmr.CTOBtn.click();
		Thread.sleep(1000);
		
		Select dropdown1 = new Select(driver.findElement(By.id("ctl00_hldPage_ddlCustodianName")));  
		dropdown1.selectByVisibleText("Kale_GHA1");  
		
		Thread.sleep(2000);
		
	   //-----------------------------------------------------------------------------
		
		gmr.Console.click();	Thread.sleep(1000); 
		
		//-------------------------------------------------------------------------------
		
		gmr.AWBNoPrefix.sendKeys("999"); Thread.sleep(1000);    
		
		gmr.AWBNo.sendKeys(TestDataReader.Create_AWBNo_Console());
		Thread.sleep(2000);
		
		WebElement icon = driver.findElement(By.id("ctl00_hldPage_lblawb"));
	    Actions ob = new Actions(driver);
	    ob.click(icon);
	    Action Clickaction  = ob.build();
	    Clickaction.perform();
	    Thread.sleep(2000);
	    
	    wm.JavascriptExecutorClick(driver, gmr.CreateHAWBPopup);Thread.sleep(2000);
	    
	    //-----------------Add House Manifest--------------------------------------------
	    
	    driver.switchTo().frame(0);
	    Thread.sleep(1000);
	    
	    wm.JavascriptExecutorClick(driver, gmr.HouseManifestHAWBNo);Thread.sleep(2000);
	    gmr.HouseManifestHAWBNo.sendKeys("h1");Thread.sleep(2000);
	    
	    wm.JavascriptExecutorClick(driver, gmr.HouseManifestOrigin);Thread.sleep(2000);
	    gmr.HouseManifestOrigin.sendKeys("HYD");Thread.sleep(2000);
	    
	    wm.JavascriptExecutorClick(driver, gmr.HouseManifestDest);Thread.sleep(2000);
	    gmr.HouseManifestDest.sendKeys("LHR");Thread.sleep(2000);
	    
	    wm.JavascriptExecutorClick(driver, gmr.HouseManifestNoP);Thread.sleep(2000);
	    gmr.HouseManifestNoP.sendKeys("12");Thread.sleep(2000);
	    
	    wm.JavascriptExecutorClick(driver, gmr.HouseManifestGrossWt);Thread.sleep(2000);
	    gmr.HouseManifestGrossWt.sendKeys("120");Thread.sleep(2000);
	    
	    Select chargecode = new Select(driver.findElement(By.id("ctl00_hldPageHeader_rptHouse_ctl01_ddlChargeCode")));  
	    chargecode.selectByVisibleText("CA");Thread.sleep(2000);
	    
	    wm.JavascriptExecutorClick(driver, gmr.HouseManifestCargoDescription);Thread.sleep(2000);
	    gmr.HouseManifestCargoDescription.sendKeys("Natural");Thread.sleep(2000);
	    
	    wm.JavascriptExecutorClick(driver, gmr.HouseManifestOCIDetails);Thread.sleep(2000);
	    
	    Select infoidentifier = new Select(driver.findElement(By.id("selInfidenfier_1")));  
	    infoidentifier.selectByVisibleText("AGT");Thread.sleep(2000);
	    
	    Select tradeidentificationcode = new Select(driver.findElement(By.id("selociOperator_1")));  
	    tradeidentificationcode.selectByVisibleText("TRADE IDENTIFICATION");Thread.sleep(2000);
	    
	    wm.JavascriptExecutorClick(driver, gmr.TradeIdentificationCodeText);Thread.sleep(2000);
	    gmr.TradeIdentificationCodeText.sendKeys("Trade");Thread.sleep(2000);
	    
	    wm.JavascriptExecutorClick(driver, gmr.TradeIdentificationCodePopupOk);Thread.sleep(2000);
	    
	    wm.JavascriptExecutorClick(driver, gmr.SLAC);Thread.sleep(2000);
	    
	    wm.JavascriptExecutorClick(driver, gmr.HSCode);Thread.sleep(2000);
	    
	    wm.JavascriptExecutorClick(driver, gmr.HSCodeDetail);Thread.sleep(2000);
	    gmr.HSCodeDetail.sendKeys("123456");Thread.sleep(2000);
	    
	    JavascriptExecutor scrolldown = (JavascriptExecutor) driver;
	    scrolldown.executeScript("window.scrollBy(0,150)", "");
	    Thread.sleep(1000);
	    
	   // WebElement hscodeicon = driver.findElement(By.id("ctl00_hldPage_lblawb"));
	   // Actions hscodeob = new Actions(driver);
	    //ob.click(hscodeicon);
	    //Action hscodeaction  = hscodeob.build();
	   // hscodeaction.perform();
	    //Thread.sleep(2000);
	    
	   // driver.switchTo().frame("1");
	   // Thread.sleep(1000);
	    wm.JavascriptExecutorClick(driver, gmr.HSCodeDetailOk);Thread.sleep(2000);
	    
	    Select assigncha = new Select(driver.findElement(By.id("ctl00_hldPageHeader_rptHouse_ctl01_mltSlctCHAForHAWB")));  
	    assigncha.selectByVisibleText("ADVIK ENTERPRISES");Thread.sleep(2000);
	    
		//--------------------------------Shippers Name and Address-----------------------------------------------
		
	    gmr.ShippersNameAddBtn.click();Thread.sleep(1000); 
	   
	    System.out.print("ab checked....\n");Thread.sleep(500);
		
		wm.JavascriptExecutorClick(driver, gmr.HAWBCreationMsgBtn);Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		//driver.switchTo().frame("IframConsignee");
		Thread.sleep(1000);

		System.out.print("In frame....");Thread.sleep(500);
		
		wm.scrollTillPageUp();
		Thread.sleep(2000);
		wm.scrollTillPageUp();
		Thread.sleep(2000);
		wm.scrollTillPageUp();
		Thread.sleep(2000);
		wm.scrollTillPageUp();
		Thread.sleep(2000);
		wm.scrollTillPageUp();
		Thread.sleep(2000);
		wm.scrollTillPageUp();
		Thread.sleep(2000);
		
		gmr.ShippersName.click();Thread.sleep(1000);
		System.out.print("Shipper name checked....\n");Thread.sleep(500);
		gmr.ShippersName.sendKeys("ACS Shipper Swaranjali");Thread.sleep(2000);
		
		gmr.Address.click();Thread.sleep(1000);
		System.out.print("Address checked....\n");Thread.sleep(500);
		gmr.Address.sendKeys("Hydrabad");Thread.sleep(2000);
		
		
		
		//driver.switchTo().defaultContent();Thread.sleep(2000);
		
		gmr.country.click();Thread.sleep(1000);
		System.out.print("country checked....\n");Thread.sleep(500);
		gmr.country.sendKeys("in");Thread.sleep(2000);
		
		gmr.countryName.click();Thread.sleep(1000);
		System.out.print("country Name checked....\n");Thread.sleep(1000);
		
		gmr.city.click();Thread.sleep(1000);
		System.out.print("city checked....\n");Thread.sleep(1000);
		gmr.city.sendKeys("hyd");Thread.sleep(2000);
		
		gmr.cityName.click();Thread.sleep(1000);
		System.out.print("city name checked....\n");Thread.sleep(1000);
		
		gmr.ZipCode.click();Thread.sleep(1000);
		System.out.print("Zip code checked....\n");Thread.sleep(500);
		gmr.ZipCode.sendKeys("45456");Thread.sleep(2000);
		
		gmr.SaveForAddShipper.click();Thread.sleep(1000);
		System.out.print("saved all shipper data  checked....\n");Thread.sleep(200);
		
		driver.switchTo().parentFrame();Thread.sleep(2000);
		//Thread.sleep(2000);
		
		gmr.OkSaveForAddShipper.click();Thread.sleep(2000);
		
		
		
		//--------------------------------consignne Name and Address-----------------------------------------------
		
		gmr.ConsigneeNameAddBtn.click();Thread.sleep(1000); 
		
		driver.switchTo().frame("IframConsignee");
		Thread.sleep(1000);
		
		gmr.ConsigneeName.click();Thread.sleep(1000);
		gmr.ConsigneeName.sendKeys("ACS Consignee swaranjali");Thread.sleep(1000);
		System.out.print("Consignee name checked....\n");Thread.sleep(500);
		
		gmr.ConsigneeAddress.click();Thread.sleep(1000);
		gmr.ConsigneeAddress.sendKeys("Hydrabad");Thread.sleep(1000);
		System.out.print("Consignee name checked....\n");Thread.sleep(500);
		
		gmr.ConsigneeCounrty.click();Thread.sleep(1000);
		gmr.ConsigneeCounrty.sendKeys("ae");Thread.sleep(1000);
		System.out.print("consignee country checked....\n");Thread.sleep(500);
		
		gmr.ConsigneeCounrtyName.click();Thread.sleep(1000);
		
		gmr.ConsigneeCity.click();Thread.sleep(1000);
		gmr.ConsigneeCity.sendKeys("dxb");Thread.sleep(1000);
		System.out.print("consignee city checked....\n");Thread.sleep(500);
		
		gmr.ConsigneeCityName.click();Thread.sleep(1000);
		
		gmr.ConsigneeZipCode.click();Thread.sleep(1000);
		gmr.ConsigneeZipCode.sendKeys("56789");Thread.sleep(1000);
		System.out.print("consignee zip code checked....\n");Thread.sleep(500);
		
		gmr.ConsigneeSaveBtn.click();Thread.sleep(1000);
		System.out.print("consignee data saved checked....\n");Thread.sleep(500);
		
		driver.switchTo().defaultContent();Thread.sleep(2000);
		System.out.print("aa checked....\n");Thread.sleep(2000);
		
		//Thread.sleep(70000);
		gmr.ConsigneeOkBtn.click();Thread.sleep(2000);
		System.out.print("consignee data saved  ok checked....\n");Thread.sleep(500);
		
		//---------------------Routing-----------------------------------
		
		wm.JavascriptExecutorClick(driver, gmr.Routing);Thread.sleep(2000);
		
		Set<String> allwindowid = driver.getWindowHandles();
	    Object[] windows = allwindowid.toArray();
	    String window2 = windows[0].toString();        
	    driver.switchTo().window(window2); 
	    System.out.println(allwindowid);
	    System.out.println(window2);
	    Thread.sleep(5000);
		
		
		
	    System.out.print("ab checked....\n");Thread.sleep(500);
	    wm.JavascriptExecutorClick(driver, gmr.Routing);Thread.sleep(2000);
	    //driver.switchTo().frame("IframConsignee");
	    Thread.sleep(2000);
		
		System.out.print("abc checked....\n");Thread.sleep(500);
		gmr.DestPort.click();Thread.sleep(2000);
		gmr.DestPort.sendKeys("LHR");Thread.sleep(2000);
		
		gmr.DestPortCountry.click();Thread.sleep(1000);
		
		gmr.Via2.click();Thread.sleep(2000);
		
		//gmr.RoutingOk.click();Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.RoutingOk);Thread.sleep(2000);
		
		String window1 = windows[0].toString();
	    driver.switchTo().window(window1);
	    System.out.println(window1);
	    Thread.sleep(5000);
	    
	    System.out.print("window closed....\n");Thread.sleep(2000);
		
		//----------------------------Flight Requested------------------------------------------------
		
		
	    wm.JavascriptExecutorClick(driver, gmr.FlightNo);Thread.sleep(2000);
		
		gmr.FlightNo.sendKeys("276");Thread.sleep(2000);
		gmr.FlightNo.sendKeys("276");Thread.sleep(2000);
		
		//----------------------------Charge Code------------------------------------------------
		
		gmr.ChargeCode.click();
		Thread.sleep(2000);
		Select dropdown3 = new Select(driver.findElement(By.id("ctl00_hldPage_ddlChargeCode")));  
		dropdown3.selectByVisibleText("PP"); 
		
		Thread.sleep(2000);
		
		//wm.JavascriptExecutorClick(driver, gmr.CustomBroker);Thread.sleep(2000);
		//wm.JavascriptExecutorClick(driver, gmr.advikEnterpriesesdropdown);Thread.sleep(2000);
		//wm.JavascriptExecutorClick(driver, gmr.CustomBroker1);Thread.sleep(2000);
		
		//----------------------------Reates Charge------------------------------------------------
		
		wm.scrollTillPageEnd();Thread.sleep(1000);
		
		gmr.UncheckRates.click();Thread.sleep(2000);
		
		gmr.RateCharges.click();Thread.sleep(2000);
		gmr.RateCharges.sendKeys("10");Thread.sleep(2000);
		gmr.RateCharges.sendKeys("10");Thread.sleep(1000);
		gmr.total.click();Thread.sleep(2000);
		
		//----------------------------Dimensions------------------------------------------------
		
		gmr.dimensions.click();Thread.sleep(2000);
		gmr.NumberOfPieces.click();Thread.sleep(2000);
		gmr.NumberOfPieces.sendKeys("12");Thread.sleep(2000);
		
		gmr.LengthOfPieces.click();Thread.sleep(2000);
		gmr.LengthOfPieces.sendKeys("30");Thread.sleep(2000);
		
		gmr.WidthOfPieces.click();Thread.sleep(2000);
		gmr.WidthOfPieces.sendKeys("20");Thread.sleep(2000);
		
		gmr.HightOfPieces.click();Thread.sleep(2000);
		gmr.HightOfPieces.sendKeys("10");Thread.sleep(2000);
		
		gmr.DimensionsOkBtn.click();Thread.sleep(2000);
		
		gmr.GrossWeight.click();Thread.sleep(2000);
		gmr.GrossWeight.sendKeys("120");Thread.sleep(2000);
		
		Select dropdown4 = new Select(driver.findElement(By.id("selRateClass_1")));  
		dropdown4.selectByVisibleText("Q");Thread.sleep(2000);
		
		gmr.total.click();Thread.sleep(2000);
		
		gmr.NatureOfGoods.click();Thread.sleep(2000);
		gmr.NatureOfGoods.sendKeys("Natural");Thread.sleep(2000);
		
		gmr.AgentChargesCode.click();
		gmr.AgentChargesCode.sendKeys("AWA");Thread.sleep(2000);
		
		gmr.AgentCharges.click();
		gmr.AgentCharges.sendKeys("121");Thread.sleep(2000);
		
		
		gmr.DueCarrierCode.click();
		gmr.DueCarrierCode.sendKeys("AWC");Thread.sleep(2000);
		
		gmr.DueCarrierCharges.click();
		gmr.DueCarrierCharges.sendKeys("141");Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");Thread.sleep(2000);
		
		
		//gmr.SaveAsTemplate.click();Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.SaveAsTemplate);Thread.sleep(2000);
		
		gmr.SaveTemplateName.click();Thread.sleep(2000);
		//gmr.SaveTemplateName.sendKeys("GmrSwaranjali1");Thread.sleep(2000);
		gmr.SaveTemplateName.sendKeys("GmrSwaranjali1");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.Save);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.Close);Thread.sleep(4000);
		
		wm.scrollTillPageUp();Thread.sleep(1000);wm.scrollTillPageUp();Thread.sleep(1000);
		
		
		wm.JavascriptExecutorClick(driver, gmr.FinalOk);Thread.sleep(4000);*/
		
		
	}
	
	@Then("^To verify Whether User is able to Upload the HAWB Details From sub-menu of e-AWB ACS_GMR$")
	public void To_verify_Whether_User_is_able_to_Upload_the_HAWB_Details_From_sub_menu_of_e_AWB_ACS_GMR() throws InterruptedException, AWTException {
	/*
	//------------------------HAWB List Tab For Console Shipment----------------------------------------------------
	Actions action = new Actions(driver);
	action.moveToElement(gmr.eAWBTab).perform();
	Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmr.HAWBList);Thread.sleep(2000);
	
	//--------------------------House Manifest Tab--------------------------------------------------
	
	action.moveToElement(gmr.eAWBTab).perform();
	Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmr.HouseManifest);Thread.sleep(2000);
	
	//--------------------------House Deatils Upload-------------------------------------------------------
	
	action.moveToElement(gmr.eAWBTab).perform();
	Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmr.HAWBDetailsUpload);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.HAWBNoHAWBDetailsUpload);Thread.sleep(2000);*/
		
		
	//-------------------------------MAWB List Tab-------------------------------------------------
	Actions action = new Actions(driver);
	action.moveToElement(gmr.eAWBTab).perform();
	Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmr.MAWBListTab);Thread.sleep(2000);
	
	
	gmr.MAWBListInput.click();Thread.sleep(2000);
	gmr.MAWBListInput.sendKeys(TestDataReader.AWBNo());
	Thread.sleep(2000);
	
	
   gmr.AWBNoLink.click();Thread.sleep(2000); 
	
	gmr.SendPdfToAirline.click();Thread.sleep(2000);
	
	gmr.SendPdfToAirlinePopup.click();Thread.sleep(2000);
	
	gmr.MasterInfoBack.click();Thread.sleep(2000);
	
	gmr.MAWBListInput.click();Thread.sleep(2000);
	gmr.MAWBListInput.sendKeys(TestDataReader.AWBNo());
	Thread.sleep(2000);
	
	gmr.MAWBListInputDownArrow.click();Thread.sleep(2000);
	
	gmr.Contains.click();Thread.sleep(4000);
	
	
	gmr.MawbASI.click();Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmr.MawbASIOkBtn);Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmr.CO);Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmr.COYesBtn);Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmr.COOkBtn);Thread.sleep(1000);
	
	Thread.sleep(8000);

	wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");

	Thread.sleep(8000);
	}
	
	@Then("I login with {string} airline user given in {string} sheet ACS_GMR")
	public void i_login_with_airline_user_given_in_sheet_ACS_GMR(String entity, String sheetName) throws Throwable {
		
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(4000);	
		
		wm.JavascriptExecutorClick(driver, gmr.AllForAirline);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AllForAirlineOk);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.COApproval);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNo);Thread.sleep(2000);
		//gmr.CartingOrderShipmentMAWBNo.sendKeys("99924052081");Thread.sleep(2000); 
		
		gmr.CartingOrderShipmentMAWBNo.sendKeys("999" + TestDataReader.AWBNo());
		Thread.sleep(2000);//-------------AWB--------
		
		wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNoSearchBtn);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.Action);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.Approve);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.ApproveOk);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutArrow);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AirlineLogout);Thread.sleep(2000);
		
	
}
	
	@Then("I logout with {string} airline user given in {string} sheet ACS_GMR")
	public void i_logout_with_airline_user_given_in_sheet_ACS_GMR(String entity, String sheetName) throws Throwable {

		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(4000);	
		
		gmr.AllRadioBtn.click();
		Thread.sleep(1000);
		
		gmr.GmrHydRadioOKBtn.click();
		Thread.sleep(1000);
	}
		
		@Then("^To verify whether the user is able to do SB ASI and TSP payment in MAWB list for direct AWB ACS_GMR$")
		public void To_verify_whether_the_user_is_able_to_do_SB_ASI_and_TSP_payment_in_MAWB_list_for_direct_AWB_ACS_GMR() throws InterruptedException, AWTException {
	
		wm.JavascriptExecutorClick(driver, gmr.AddSB);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBNumber);Thread.sleep(4000);
		gmr.SBNumber.sendKeys("5467891");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBDate);Thread.sleep(2000);//18 May 2023
		wm.JavascriptExecutorClick(driver, gmr.Calendar);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.CalendarDate);Thread.sleep(2000);//----you can put any date
		 
		 Thread.sleep(2000);
		 
		
		Select sbtype = new Select(driver.findElement(By.id("drpSBType")));  
		sbtype.selectByVisibleText("Manual");
		
		wm.JavascriptExecutorClick(driver, gmr.SBNoOfPieces);Thread.sleep(2000);
		gmr.SBNoOfPieces.sendKeys("12");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBGrossWt);Thread.sleep(2000);
		gmr.SBGrossWt.sendKeys("120");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBVolumetricWt);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBDimensionsNoPieces);Thread.sleep(2000);
		gmr.SBDimensionsNoPieces.sendKeys("12");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBDimensionslength);Thread.sleep(2000);
		gmr.SBDimensionslength.sendKeys("14");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBDimensionswidth);Thread.sleep(2000);
		gmr.SBDimensionswidth.sendKeys("15");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBDimensionsHeight);Thread.sleep(2000);
		gmr.SBDimensionsHeight.sendKeys("30");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBDimensionsVolumeCBM);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBDimensionsOkBtn);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.ChargeableGrossWt);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.FOBValue);Thread.sleep(2000);
		gmr.FOBValue.sendKeys(cm.RandomNo(4));Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.ExporterName);Thread.sleep(2000);
		gmr.ExporterName.sendKeys("ADVIK");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBSaveBtn);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBOk);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBDetails);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBASI);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBASIProceed);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBASIConfirmation);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBASIOk);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.TSP);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.EdocketMsg);Thread.sleep(2000);
		
		//wm.JavascriptExecutorClick(driver, gmr.SBASIBackBtn);Thread.sleep(2000);
		
		//---------------------------------Edocket-------------------------------------------
		
		wm.JavascriptExecutorClick(driver, gmr.Edocket);Thread.sleep(2000);
		
		driver.switchTo().frame("IframEdocket1");
		 Thread.sleep(4000);
	      
	      WebElement icon = driver.findElement(By.id("ctl00_hldPage_fuctlUploadDocs5"));
	      Actions ob = new Actions(driver);
	      ob.click(icon);
	      Action action  = ob.build();
	      action.perform();
		
		Robot uploaddoc = new Robot();
		uploaddoc.delay(2000);

		StringSelection sss1 = new StringSelection("E:\\dummy1 documents\\pdf1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sss1, null);

		uploaddoc.keyPress(KeyEvent.VK_CONTROL);
		uploaddoc.keyPress(KeyEvent.VK_V);
		uploaddoc.delay(2000);

		uploaddoc.keyPress(KeyEvent.VK_ENTER);
//		uploaddoc.keyPress(KeyEvent.VK_ENTER);
		uploaddoc.delay(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.CSDDoccument_UpoadBtn);Thread.sleep(2000);	
		
		wm.JavascriptExecutorClick(driver, gmr.RecordSelectionCheckbox);Thread.sleep(2000);
		

		wm.JavascriptExecutorClick(driver, gmr.CSDDoccument_Submit);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.DocSelectedOkBtn);Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		
		//---------------------------TSP---------------------------------------------------------------------------
		
		wm.JavascriptExecutorClick(driver, gmr.SBDetails);Thread.sleep(4000);
		wm.JavascriptExecutorClick(driver, gmr.SBDetailsTSP);Thread.sleep(4000);
	
		
		
		Select cargotypes = new Select(driver.findElement(By.id("ctl00_hldPage_ddlTypeTxt")));  
		cargotypes.selectByVisibleText("General Cargo"); Thread.sleep(2000); 
		
		WebElement comname = driver.findElement(By.id("ctl00_hldPage_ddlComodityTypeName"));
	      Actions ct1 = new Actions(driver);
	      ct1.click(comname);
	      Action comnameaction  = ct1.build();
	      comnameaction.perform();Thread.sleep(5000);  
	      
	      Robot robot=new Robot();
	       robot.keyPress(KeyEvent.VK_DOWN);
	       robot.keyPress(KeyEvent.VK_ENTER);
	       robot.keyRelease(KeyEvent.VK_DOWN);
	       robot.keyRelease(KeyEvent.VK_ENTER);
	     
	      Thread.sleep(2000);
	      
		
	      wm.JavascriptExecutorClick(driver, gmr.HSNCode);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.TransactionPaswrd);Thread.sleep(2000);
		gmr.TransactionPaswrd.sendKeys("12345678");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.TSPPayNow);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.PaymentConfimationOkBtn);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.TokenConfimationOkBtn);Thread.sleep(2000);
		
		//-------------------------------Vehicle Token----------------------------------------------------------
		//wm.JavascriptExecutorClick(driver, gmr.SBDetails);Thread.sleep(4000);//---------kadun takne
		//wm.JavascriptExecutorClick(driver, gmr.VehicleToken);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.VehicleNumber);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.VehicleNumber);Thread.sleep(2000);
		gmr.VehicleNumber.sendKeys("23456");
		wm.JavascriptExecutorClick(driver, gmr.DriverLicenseNo);Thread.sleep(2000);
		gmr.DriverLicenseNo.sendKeys("MH12-3036");
		wm.JavascriptExecutorClick(driver, gmr.DriverName);Thread.sleep(2000);
		gmr.DriverName.sendKeys("Jordhen");
		wm.JavascriptExecutorClick(driver, gmr.DriverMobileNo);Thread.sleep(2000);
		gmr.DriverMobileNo.sendKeys(cm.RandomNo(10));
		wm.JavascriptExecutorClick(driver, gmr.AgentMobileNo);Thread.sleep(2000);
		gmr.AgentMobileNo.sendKeys(cm.RandomNo(10));
		wm.JavascriptExecutorClick(driver, gmr.GenerateToken);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.VehicleTokenConfimationOkBtn);Thread.sleep(2000);
		
		//-----------------------------------Cons AWB List------------------
		
		wm.JavascriptExecutorClick(driver, gmr.ConsAWBList);Thread.sleep(2000);
		
		driver.switchTo().frame("IframEdocket");
		Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.MenifestToAirlineEmail);Thread.sleep(2000);
		gmr.MenifestToAirlineEmail.sendKeys("Swaranjali.Kharat@Kalelogistics.com");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SendEmailBtn);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SendEmailCloseBtn);Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
	
	//------------------------------------------ACS Receipt-------------------------------------------
	wm.JavascriptExecutorClick(driver, gmr.ACSReceipt);Thread.sleep(1000);
	
	Set<String> allwindowid = driver.getWindowHandles();
    Object[] windows = allwindowid.toArray();
    String window2 = windows[0].toString();        
    driver.switchTo().window(window2); 
    System.out.println(allwindowid);
    System.out.println(window2);
    Thread.sleep(5000);
    
    String window1 = windows[0].toString();
    driver.switchTo().window(window1);
    System.out.println(window1);
    Thread.sleep(5000);

	
	//ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
    //switch to new tab
	//driver.switchTo().window(newTb.get(1));Thread.sleep(1000);
   // driver.switchTo().window(newTb.get(0));Thread.sleep(1000);
//	driver.navigate().to("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/FFMAWBNew.aspx#1");Thread.sleep(2000);

	
	//---------------------------------------------Action-----------------------------------------------
	
	wm.JavascriptExecutorClick(driver, gmr.ActionTab);Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmr.CopyAWBConfirmationYesBtn);Thread.sleep(2000);
	
	//-----------------------------------E-Booking--------------------------------------------------------
	
	Actions ebooking = new Actions(driver);
	//Mouseover on an element
	ebooking.moveToElement(gmr.eBooking).perform();
	Thread.sleep(1000);
	
	//wm.JavascriptExecutorClick(driver, gmr.eBooking);Thread.sleep(1000);
	
	Actions ebookingcreate = new Actions(driver);
	//Mouseover on an element
	ebookingcreate.moveToElement(gmr.eBookingCreate).perform();
	Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmr.eBookingCreate);Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmr.eFreightEnable);Thread.sleep(1000);
	
	Select cargotypes1 = new Select(driver.findElement(By.id("ctl00_hldPage_drpCode")));Thread.sleep(1000); 
	cargotypes1.selectByVisibleText("EAP"); Thread.sleep(2000); 
	
	wm.JavascriptExecutorClick(driver, gmr.LCShipment);Thread.sleep(1000);
	gmr.LCShipment.sendKeys("abcdefghi");
	
	//---------------------------------------------Upload File for ebooking-----------------------------
	
	wm.JavascriptExecutorClick(driver, gmr.ChooseFileForEbooking);Thread.sleep(1000);
	
	Robot uploaddocebooking = new Robot();
	uploaddocebooking.delay(2000);

	StringSelection ssss1 = new StringSelection("E:\\dummy1 documents\\pdf1.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ssss1, null);

	uploaddocebooking.keyPress(KeyEvent.VK_CONTROL);
	uploaddocebooking.keyPress(KeyEvent.VK_V);
	uploaddocebooking.delay(2000);

	uploaddocebooking.keyPress(KeyEvent.VK_ENTER);
	
	wm.JavascriptExecutorClick(driver, gmr.ChooseFileForEbookingUpload);Thread.sleep(2000);
	
//-----------------------------------Shipper Details for ebooking-------------------------------------------
	
	
	
	
	
	
	wm.JavascriptExecutorClick(driver, gmr.ShipperNameForEbooking);Thread.sleep(1000);
	gmr.ShipperNameForEbooking.sendKeys("ACS shipper");Thread.sleep(2000);
	
	
	Robot down=new Robot();
	down.keyPress(KeyEvent.VK_DOWN);
	down.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	
	driver.switchTo().alert().accept();Thread.sleep(2000);
    
	wm.JavascriptExecutorClick(driver, gmr.ConsigneeForEbooking);Thread.sleep(1000);
	gmr.ConsigneeForEbooking.sendKeys("ACS Consignee Swaranjali");Thread.sleep(2000);
	
	//Robot down=new Robot();
	down.keyPress(KeyEvent.VK_DOWN);
	down.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	
	//----------------------Destination----------------------------------------------------
	
	//wm.JavascriptExecutorClick(driver, gmr.DestinationForEbooking);Thread.sleep(2000)

	WebElement destname = driver.findElement(By.id("ctl00_hldPage_AirlineDestinationPort_txtCode"));
    Actions dest = new Actions(driver);
    dest.click(destname);
    Action destnameaction  = dest.build();
    destnameaction.perform();Thread.sleep(2000); 
	driver.findElement(By.id("ctl00_hldPage_AirlineDestinationPort_txtCode")).sendKeys("lhr");Thread.sleep(1000);
	
	
	down.keyPress(KeyEvent.VK_DOWN);
	down.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	
	driver.findElement(By.id("ctl00_hldPage_GenericAutoFill2_txtCode")).click();Thread.sleep(1000);
	
	//--------------------------------Dimension For ebooking---------------------------------
	
	
	wm.JavascriptExecutorClick(driver, gmr.DimensionForEbooking);Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmr.NoofpiecesForEbooking);Thread.sleep(2000);
	gmr.NoofpiecesForEbooking.sendKeys("12");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.lengthForEbooking);Thread.sleep(2000);
	gmr.lengthForEbooking.sendKeys("14");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.widthForEbooking);Thread.sleep(2000);
	gmr.widthForEbooking.sendKeys("16");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.heightForEbooking);Thread.sleep(2000);
	gmr.heightForEbooking.sendKeys("18");Thread.sleep(2000);
	
//	wm.JavascriptExecutorClick(driver, gmr.volumecbmForEbooking);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.dimensionSaveForEbooking);Thread.sleep(2000);
	
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,450)", "");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.GrWtForEbooking);Thread.sleep(2000);
	gmr.GrWtForEbooking.sendKeys("120");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.ChargeableWtForEbooking);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.CargoDescriptionForEbooking);Thread.sleep(2000);
	gmr.CargoDescriptionForEbooking.sendKeys("General");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.HazardousForEbooking);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.UNNumberForEbooking);Thread.sleep(2000);
	gmr.UNNumberForEbooking.sendKeys("2244");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.ClassForEbooking);Thread.sleep(2000);
	gmr.ClassForEbooking.sendKeys("first class");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.CargoDetailsActionForEbooking);Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmr.CargoDetailsActionMinusForEbooking);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.CustomerBrokerForEbooking);Thread.sleep(2000);
	
	Select custombroker = new Select(driver.findElement(By.id("ctl00_hldPage_drpCHAOrganization")));Thread.sleep(2000);  
	custombroker.selectByVisibleText("ADVIK ENTERPRISES"); Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.FinalSaveForEbooking);Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmr.FinalSaveNoBtnForEbooking);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.SavedTabActionForEbooking);Thread.sleep(2000);
	
	
	//--------------------------Template tab--------------------------------------------------------------
	
	
	wm.JavascriptExecutorClick(driver, gmr.SaveAsTemplateForEbooking);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.SaveAsTemplateNameForEbooking);Thread.sleep(2000);
	gmr.SaveAsTemplateNameForEbooking.sendKeys("Template For Swaranjali");Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmr.SaveAsTemplateNamesavebtnForEbooking);Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmr.TemplateStatusOkBtnForEbooking);Thread.sleep(2000);
	
	//Actions ebooking = new Actions(driver);
	//Mouseover on an element
	ebooking.moveToElement(gmr.eBooking).perform();
	Thread.sleep(1000);
	
	Actions savedtab = new Actions(driver);
	//Mouseover on an element
	savedtab.moveToElement(gmr.SavedTabForEbooking).perform();
	Thread.sleep(1000);
	wm.JavascriptExecutorClick(driver, gmr.SavedTabForEbooking);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.SavedTabActionForEbooking);Thread.sleep(2000);
	
	
	//--------------------------Draft tab--------------------------------------------------------------
	
	wm.JavascriptExecutorClick(driver, gmr.SaveAsDraftForEbooking);Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmr.SaveAsDraftNameForEbooking);Thread.sleep(2000);
	gmr.SaveAsDraftNameForEbooking.sendKeys("Draft For Swaranjali");Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmr.SaveAsDraftNamesavebtnForEbooking);Thread.sleep(4000);
	wm.JavascriptExecutorClick(driver, gmr.DraftstatusokbtnForEbooking);Thread.sleep(2000);
	
	//--------------------------E-docket for ebooking-------------------------------------------------------
	
	ebooking.moveToElement(gmr.eBooking).perform();
	Thread.sleep(1000);
	
	Actions edockettab = new Actions(driver);
	//Mouseover on an element
	edockettab.moveToElement(gmr.edocketForEbooking).perform();
	Thread.sleep(1000);
	wm.JavascriptExecutorClick(driver, gmr.edocketForEbooking);Thread.sleep(2000);
	
	Select jobtype = new Select(driver.findElement(By.id("ctl00_hldPage_ddlJobType")));Thread.sleep(2000);  
	jobtype.selectByVisibleText("Booking"); Thread.sleep(2000);
	
	Select jobid = new Select(driver.findElement(By.id("ctl00_hldPage_ddlJobs")));Thread.sleep(2000);  
	jobid.selectByVisibleText("343"); Thread.sleep(2000);
	
	}
	
	@Then("^To verify whether the user is able to forward jobs to airline from Receive sub-menu of e-booking ACS_GMR$")
	public void To_verify_whether_the_user_is_able_to_forward_jobs_to_airline_from_Receive_sub_menu_of_e_booking_ACS_GMR() throws InterruptedException, AWTException {
	
		
		Actions ebooking = new Actions(driver);
		ebooking.moveToElement(gmr.eBooking).perform();
		Thread.sleep(1000);
		
		Actions savedtab = new Actions(driver);
		//Mouseover on an element
		savedtab.moveToElement(gmr.SavedTabForEbooking).perform();
		Thread.sleep(1000);
		wm.JavascriptExecutorClick(driver, gmr.SavedTabForEbooking);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.savedDetailsCheckboxForEbooking);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.ForwardToAirlineForEbooking);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.ShipmentTypeSubmitBtnForEbooking);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SchedulecalendarForEbooking);Thread.sleep(2000);
		
		LocalDate scheduledateforebooking = LocalDate.now();
		DateTimeFormatter scheduledateforebookingformatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		 String scheduledateforebookingdate = scheduledateforebooking.format(scheduledateforebookingformatter);
		 gmr.SchedulecalendarForEbooking.sendKeys(scheduledateforebookingdate);	
		 Thread.sleep(2000);

		
		//wm.JavascriptExecutorClick(driver, gmr.ScheduleDateForEbooking);Thread.sleep(2000);// 17 may---------------------------------------------------
		
		wm.JavascriptExecutorClick(driver, gmr.GetScheduleBtnForBookingShipment);Thread.sleep(18000);
		
		wm.JavascriptExecutorClick(driver, gmr.ScheduleAirlineCheckbobForBookingShipment);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AirwayBillPrefixForBookingShipment);Thread.sleep(2000);
		gmr.AirwayBillPrefixForBookingShipment.sendKeys("999");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AirwayBillNumberForBookingShipment);Thread.sleep(2000);//----------AWB-----------------
		//gmr.AirwayBillNumberForBookingShipment.sendKeys("24052081");Thread.sleep(2000);
		
		gmr.AirwayBillNumberForBookingShipment.sendKeys(TestDataReader.AWBNo());
		Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.FlightNoForBookingShipment);Thread.sleep(2000);
		gmr.FlightNoForBookingShipment.sendKeys("1234");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SubmitFlightDetailsBtnForBookingShipment);Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.BookinhRequestOkBtnForBookingShipment);Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.createMAWBpoupNoBtnForBookingShipment);Thread.sleep(1000);
		
		ebooking.moveToElement(gmr.eBooking).perform();
		Thread.sleep(1000);
		
		Actions senttab = new Actions(driver);
		//Mouseover on an element
		senttab.moveToElement(gmr.SentTabForEbooking).perform();
		Thread.sleep(1000);
		wm.JavascriptExecutorClick(driver, gmr.SentTabForEbooking);Thread.sleep(2000);
	}
	
	@Then("^To Verify Whether user is able to View the All Records of AWB in Track and Trace ACS_GMR$")
	public void To_Verify_Whether_user_is_able_to_View_the_All_Records_of_AWB_in_Track_and_Trace_ACS_GMR() throws InterruptedException, AWTException {
	
		Actions tracktrace = new Actions(driver);
		tracktrace.moveToElement(gmr.TrackTraceTab).perform();
		Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.TrackTraceTab);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.TrackTraceTabAWBNo);Thread.sleep(2000);
		gmr.TrackTraceTabAWBNo.sendKeys("24052081");
	}
	
	@Then("^To verify whether user is able to send request of AWB stock to airline login ACS_GMR$")
	public void To_verify_whether_user_is_able_to_send_request_of_AWB_stock_to_airline_login_ACS_GMR() throws InterruptedException, AWTException {
	
		Actions awbstock = new Actions(driver);
		awbstock.moveToElement(gmr.AWBStock).perform();
		Thread.sleep(1000);
	
		
		
		awbstock.moveToElement(gmr.AWBStock).perform();
		Thread.sleep(1000);
		
		Actions reqawbstock = new Actions(driver);
		reqawbstock.moveToElement(gmr.RequestForAWBStock).perform();
		Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.RequestForAWBStock);Thread.sleep(2000);
		
		Select selectairlinereqforawbstock = new Select(driver.findElement(By.id("ctl00_hldPage_ddlAirline")));Thread.sleep(2000);  
		selectairlinereqforawbstock.selectByVisibleText("Kale Airline 1"); Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QtyRequestForAWBStock);Thread.sleep(2000);
		gmr.QtyRequestForAWBStock.sendKeys("5");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.RemarksRequestForAWBStock);Thread.sleep(2000);
		gmr.RemarksRequestForAWBStock.sendKeys("Done");Thread.sleep(2000);
		
		Select uploaddocreqforawbstock = new Select(driver.findElement(By.id("ctl00_hldPage_drpdocumenttype")));Thread.sleep(2000);  
		uploaddocreqforawbstock.selectByVisibleText("Cover Letter"); Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.ChooseFileRequestForAWBStock);Thread.sleep(2000);
		
		WebElement reqawbstockchoosefile = driver.findElement(By.id("ctl00_hldPage_fileUpload"));
	      Actions reqawbstockchoosefileob = new Actions(driver);
	      reqawbstockchoosefileob.click(reqawbstockchoosefile);
	      Action reqawbstockchoosefileaction  = reqawbstockchoosefileob.build();
	      reqawbstockchoosefileaction.perform();
		
		Robot reqawbstockchoosefileuploaddoc = new Robot();
		reqawbstockchoosefileuploaddoc.delay(2000);

		StringSelection sss1 = new StringSelection("E:\\dummy1 documents\\pdf1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sss1, null);

		reqawbstockchoosefileuploaddoc.keyPress(KeyEvent.VK_CONTROL);
		reqawbstockchoosefileuploaddoc.keyPress(KeyEvent.VK_V);
		reqawbstockchoosefileuploaddoc.delay(2000);

		reqawbstockchoosefileuploaddoc.keyPress(KeyEvent.VK_ENTER);
//		uploaddoc.keyPress(KeyEvent.VK_ENTER);
		reqawbstockchoosefileuploaddoc.delay(1000);
		Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.UploadFileRequestForAWBStock);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SendRequestForAWBStock);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SendMsgPopupRequestForAWBStock);Thread.sleep(2000);
		
		Thread.sleep(8000);

		wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");

		Thread.sleep(8000);
	}
	
	@Then("I login with {string} airline user given in {string} sheet for request status ACS_GMR")
	public void I_login_with_airline_user_given_in_sheet_for_request_status_ACS_GMR(String entity, String sheetName) throws Throwable {
		
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(4000);
		
        wm.JavascriptExecutorClick(driver, gmr.AllForAirline);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AllForAirlineOk);Thread.sleep(4000);
		
		Actions awbstockforairline = new Actions(driver);
		awbstockforairline.moveToElement(gmr.AWBStockTabForAirline).perform();
		Thread.sleep(1000);
		
		Actions reqstatusforairline = new Actions(driver);
		reqstatusforairline.moveToElement(gmr.RequestStatusForAirline).perform();
		Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.RequestStatusForAirline);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.ApproveActionForAirline);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.FromStockForAirline);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.FromStockSubmitForAirline);Thread.sleep(2000);
		

		
		//wm.JavascriptExecutorClick(driver, gmr.IssuedQtyForAirline);Thread.sleep(2000);
		
		WebElement issuedqty = driver.findElement(By.id("ctl00_hldPage_txtIssQty"));
	      Actions issuedqtyob = new Actions(driver);
	      issuedqtyob.click(issuedqty);
	      Action issuedqtyaction  = issuedqtyob.build();
	      issuedqtyaction.perform();Thread.sleep(5000); 
		gmr.IssuedQtyForAirline.sendKeys("5");Thread.sleep(2000);
		
		
		WebElement issuedqtychk = driver.findElement(By.id("ctl00_hldPage_gvIssuedAWB_ctl02_lblAWBFrom"));
	      Actions issuedqtychkob = new Actions(driver);
	      issuedqtychkob.click(issuedqtychk);
	      Action issuedqtychkaction  = issuedqtychkob.build();
	      issuedqtychkaction.perform();Thread.sleep(5000); 
		
		//wm.JavascriptExecutorClick(driver, gmr.IssuedQtyClickForAirline);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.IssuedQtyCheckForAirline);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.IssueBtnForAirline);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.IssueOkBtnForAirline);Thread.sleep(2000);
		
      wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutArrow);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AirlineLogout);Thread.sleep(2000);
		
	
}
	
	@Then("I logout with {string} airline user given in {string} sheet for request status ACS_GMR")
	public void i_logout_with_airline_user_given_in_sheet_for_request_status_ACS_GMR(String entity, String sheetName) throws Throwable {

		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(4000);	
		
		gmr.AllRadioBtn.click();
		Thread.sleep(2000);
		
		gmr.GmrHydRadioOKBtn.click();
		Thread.sleep(2000);
	}
	
	@Then("^To verify whether the user is able to assign AWB from Assign to Sub Agent from AWB Stock Inventory ACS_GMR$")
	public void To_verify_whether_the_user_is_able_to_assign_AWB_from_Assign_to_Sub_Agent_from_AWB_Stock_Inventory_ACS_GMR() throws InterruptedException, AWTException {
       
		Actions awbstock = new Actions(driver);
		awbstock.moveToElement(gmr.AWBStock).perform();
		Thread.sleep(1000);
	
		wm.JavascriptExecutorClick(driver, gmr.AWBStockInventory);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStockInventoryAssign);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStockInventoryAssignIssuedQty);Thread.sleep(2000);
		gmr.AWBStockInventoryAssignIssuedQty.sendKeys("5");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStockInventoryAssignIssuedQtyChk);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStockInventoryIssueBtn);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStockInventoryIssueOkBtn);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStockInventoryDetails);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStockInventoryAvailable);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStockInventoryUsed);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStockInventoryWithdrawn);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStockInventoryExportExcel);Thread.sleep(2000);
	}
	
	@Then("^To verify the AWB Status ACS_GMR$")
	public void To_verify_the_AWB_Status_ACS_GMR() throws InterruptedException, AWTException {
	
		Actions awbstock = new Actions(driver);
		awbstock.moveToElement(gmr.AWBStock).perform();
		Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStatus);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStatusprefix);Thread.sleep(2000);
		gmr.AWBStatusprefix.sendKeys("999");
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStatusAWBNo);Thread.sleep(2000);
		//gmr.AWBStatusAWBNo.sendKeys("24052081");                                 //-------------------AWB----------------
		
		gmr.AWBStatusAWBNo.sendKeys(TestDataReader.AWBNo());
		Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStatusAvailable);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStatusUsed);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStatusWithdrwan);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AWBStatusExportToExcel);Thread.sleep(2000);
	}
	
	@Then("^To verify whether the user is able to view the AWB from Sub Agent Inventory ACS_GMR$")
	public void To_verify_whether_the_user_is_able_to_view_the_AWB_from_Sub_Agent_Inventory_ACS_GMR() throws InterruptedException, AWTException {
	
		Actions awbstock = new Actions(driver);
		awbstock.moveToElement(gmr.AWBStock).perform();
		Thread.sleep(1000);
	
		wm.JavascriptExecutorClick(driver, gmr.SubAgentIssuedInventory);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SubAgentIssuedInventoryFromDate);Thread.sleep(2000);
		
		gmr.SubAgentIssuedInventoryFromDate.sendKeys("01 May 2023");
		
		wm.JavascriptExecutorClick(driver, gmr.SubAgentIssuedInventoryToDate);Thread.sleep(2000);
		
		LocalDate dateObj = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		String date = dateObj.format(formatter);
		gmr.SubAgentIssuedInventoryToDate.sendKeys(date);
		Thread.sleep(2000);
		 
		 wm.JavascriptExecutorClick(driver, gmr.SubAgentIssuedInventorySearch);Thread.sleep(2000);
		 
		 //--------------------------Sub agent received inventory---------------------------------------------
		 
		awbstock.moveToElement(gmr.AWBStock).perform();
		Thread.sleep(1000);
			
		wm.JavascriptExecutorClick(driver, gmr.SubAgentReceivedInventory);Thread.sleep(2000);
		
		gmr.SubAgentReceivedInventoryFromDate.sendKeys("01 May 2023");
		
		LocalDate subagentreceivedinventory = LocalDate.now();
		DateTimeFormatter subagentreceivedinventoryformatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		 String subagentreceivedinventorydate = subagentreceivedinventory.format(subagentreceivedinventoryformatter);
		 gmr.SubAgentIssuedInventoryToDate.sendKeys(date);	
		 Thread.sleep(2000);
		 
		 wm.JavascriptExecutorClick(driver, gmr.SubAgentReceivedInventorySearch);Thread.sleep(2000);
		 
		//--------------------------Sub agent awb status---------------------------------------------
		 
		 awbstock.moveToElement(gmr.AWBStock).perform();
		 Thread.sleep(1000);
				
		wm.JavascriptExecutorClick(driver, gmr.SubAgentAWBStatus);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SubAgentAWBStatusprefix);Thread.sleep(2000);
		gmr.SubAgentAWBStatusprefix.sendKeys("999");
		
		wm.JavascriptExecutorClick(driver, gmr.SubAgentAWBStatusAWBNo);Thread.sleep(2000);
		//gmr.SubAgentAWBStatusAWBNo.sendKeys("24052081");                                                     //-----------------AWB--------------------------------
		
		gmr.SubAgentAWBStatusAWBNo.sendKeys(TestDataReader.AWBNo());
		Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SubAgentAWBStatusAvailable);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SubAgentAWBStatusUsed);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SubAgentAWBStatusWithdrawn);Thread.sleep(2000);
		
		//wm.JavascriptExecutorClick(driver, gmr.SubAgentAWBStatusExportToExcel);Thread.sleep(2000);
	}
	
	@Then("^To verify whether user is able to View the Transaction Report From Sub-menu of Reports ACS_GMR$")
	public void To_verify_whether_user_is_able_to_View_the_Transaction_Report_From_Sub_menu_of_Reports_ACS_GMR() throws InterruptedException, AWTException {

		Actions reports = new Actions(driver);
		reports.moveToElement(gmr.Reports).perform();
		Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.TransactionReports);Thread.sleep(2000);
		
		Select transactionreportcto = new Select(driver.findElement(By.id("ctl00_hldPage_ddlTerminal")));Thread.sleep(2000);  
		transactionreportcto.selectByVisibleText("Kale_GHA1"); Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.TransactionReportExportExcel);Thread.sleep(2000);
		
		reports.moveToElement(gmr.Reports).perform();
		Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.DwellTimeReport);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.DwellTimeReportExportToExcel);Thread.sleep(2000);
		
		/*ChromeOptions options = new ChromeOptions();
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "75.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability(ChromeOptions.CAPABILITY, options);
	    //WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		Thread.sleep(1000);*/
		
		reports.moveToElement(gmr.Reports).perform();
		Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.TonnageReport);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.TonnageReportAirport);Thread.sleep(2000);
		gmr.TonnageReportAirport.sendKeys("HYD");
		
		wm.JavascriptExecutorClick(driver, gmr.TonnageReportExportToExcel);Thread.sleep(2000);
	  }
	}
	
