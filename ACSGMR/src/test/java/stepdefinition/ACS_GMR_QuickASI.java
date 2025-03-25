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

import TestDataOperations.TestDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ACS_GMR_QuickASI {
	
	private static final CharSequence AWB_QUICKASI_DIRECT_BONDED = "11102416";
	private static final CharSequence AWB_QUICKASI_DIRECT_NONBONDED = "11102453";
	private static final CharSequence AWB_QUICKASI_CONSOLE_BONDED = "11102431";
	private static final CharSequence AWB_QUICKASI_CONSOLE_NONBONDED = "11102442";

	private static final String WebElement = null;
	private static final WebDriver Driver = null;
	public boolean verify;

	@When("I login with {string} user given in {string} sheet ACS_GMR QuickASI")
	public void i_login_with_user_given_in_sheet_ACS_GMR_QuickASI(String entity, String sheetName) throws Throwable {
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(4000);	;
}
	@Then("^To verify whether User is able to view Quick ASI Tab in e-AWB drop down ACS_GMR QuickASI$")
	public void To_verify_whether_User_is_able_to_view_Quick_ASI_Tab_in_e_AWB_drop_down_ACS_GMR_QuickASI() throws InterruptedException, AWTException {

		gmr.AllRadioBtn.click();
		Thread.sleep(2000);
		
		//gmr.GmrHydRadioOKBtn.click();
		//Thread.sleep(2000);
		
		//--------------------------Quick ASI For Direct Non Bonded-------------------------------------------------------
		
		Actions action1 = new Actions(driver);
		action1.moveToElement(gmr.eAWBTab).perform();
		Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASI);Thread.sleep(2000);
		
		Select ctoforquickASI = new Select(driver.findElement(By.id("ctl00_hldPage_ddlCustodianName")));  
		ctoforquickASI.selectByVisibleText("Kale_GHA1");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIDirectRadioBtn);Thread.sleep(2000);
		
		
		Select shipmenttypequickASI = new Select(driver.findElement(By.id("ctl00_hldPage_ddlShipmentType")));  
		shipmenttypequickASI.selectByVisibleText("Non-Bonded");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIMAWBNoPrefix);Thread.sleep(2000);
		gmr.QuickASIMAWBNoPrefix.sendKeys("999");Thread.sleep(2000);
		
		gmr.QuickASIMAWBNo.sendKeys(AWB_QUICKASI_DIRECT_NONBONDED);
		Thread.sleep(2000);
		
		WebElement icon = driver.findElement(By.id("ctl00_hldPage_txtDestAirport"));
	    Actions ob = new Actions(driver);
	    ob.click(icon);
	    Action destaction  = ob.build();
	    destaction.perform();Thread.sleep(1000);
		
		//wm.JavascriptExecutorClick(driver, gmr.QuickASIDestination);Thread.sleep(2000);
		gmr.QuickASIDestination.sendKeys("LHR");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASINoP);Thread.sleep(2000);
		gmr.QuickASINoP.sendKeys("12");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIGrossWt);Thread.sleep(2000);
		gmr.QuickASIGrossWt.sendKeys("100");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIChargeableWt);Thread.sleep(2000);
		gmr.QuickASIChargeableWt.sendKeys("120");Thread.sleep(3000);
		
		//wm.JavascriptExecutorClick(driver, gmr.QuickASICarrierField);Thread.sleep(2000);
		//gmr.QuickASIFlightNo.sendKeys("BA");Thread.sleep(2000);
		
		WebElement icon1 = driver.findElement(By.id("ctl00_hldPage_txtCarrier1"));
	    Actions ob1 = new Actions(driver);
	    ob1.click(icon1);
	    Action destaction1  = ob1.build();
	    destaction1.perform();Thread.sleep(2000);
	    
	    gmr.QuickASICarrierField.sendKeys("BA");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIFlightNo);Thread.sleep(2000);
		gmr.QuickASIFlightNo.sendKeys("1234");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHA);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHAAdvikEnterprises);Thread.sleep(2000);
		//wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHAAdhyaLogistics);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHA1);Thread.sleep(2000);
		
		//wm.JavascriptExecutorClick(driver, gmr.NatureOfGoods_QuickASI);Thread.sleep(2000);
		//gmr.QuickASIFlightNo.sendKeys("Natural");Thread.sleep(2000);
		
		WebElement natureofgoods = driver.findElement(By.id("ctl00_hldPage_txtCargoDesc"));
	    Actions natureofgoodsob = new Actions(driver);
	    natureofgoodsob.click(natureofgoods);
	    Action natureofgoodsaction  = natureofgoodsob.build();
	    natureofgoodsaction.perform();Thread.sleep(2000);
	    
	    driver.findElement(By.id("ctl00_hldPage_txtCargoDesc")).sendKeys("Natural");
	    Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASISave);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASISuccessMsg);Thread.sleep(2000);

}
	
	@Then("^For Bonded shipments verify whether the user is able to sent the CO request to Bonded Trucker ACS_GMR QuickASI Direct NonBonded$")
	public void For_Bonded_shipments_verify_whether_the_user_is_able_to_sent_the_CO_request_to_Bonded_Trucker_ACS_GMR_QuickASI_Direct_NonBonded() throws InterruptedException, AWTException {

		//wm.JavascriptExecutorClick(driver, gmr.ClearFilterQuickASI);Thread.sleep(4000);
		//-------------------------------MAWB List Tab-------------------------------------------------
		
		//wm.JavascriptExecutorClick(driver, gmr.MAWBListInput);Thread.sleep(2000);
		
//		gmr.MAWBListInput.sendKeys(AWB_QUICKASI_DIRECT_NONBONDED);
//		Thread.sleep(2000);
//		
//		gmr.MAWBListInputDownArrow.click();Thread.sleep(2000);
//		
//		gmr.Contains.click();Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.MawbASI);Thread.sleep(2000);
		//gmr.MawbASI.click();Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.MawbASIOkBtn);Thread.sleep(1000);
		//gmr.CO.click();Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.CO);Thread.sleep(8000);
		
		Select airlineselectionQuickASI = new Select(driver.findElement(By.id("ctl00_hldPage_drpAirlineList")));  
		airlineselectionQuickASI.selectByVisibleText("AADHYA BONDED TRUCKER");Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.COYesBtn);Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.COOkBtn);Thread.sleep(1000);
		
		Thread.sleep(8000);

		wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/Upliftlogin.aspx");

		Thread.sleep(8000);
		}
		
		@Then("I login with {string} Adhya user given in {string} sheet ACS_GMR QuickASI Direct NonBonded")
		public void I_login_with_Adhya_user_given_in_sheet_ACS_GMR_QuickASI_Direct_NonBonded(String entity, String sheetName) throws Throwable {
			
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
			
			wm.JavascriptExecutorClick(driver, gmr.COApprovalQuickASI);Thread.sleep(2000);
			
			
			wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNoQuickASI);Thread.sleep(4000);
			//gmr.CartingOrderShipmentMAWBNo.sendKeys("99924052081");Thread.sleep(2000); 
			
			gmr.CartingOrderShipmentMAWBNoQuickASI.sendKeys("999" + AWB_QUICKASI_DIRECT_NONBONDED);
			Thread.sleep(2000);//-------------AWB--------
			
			wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNoSearchBtnQuickASI);Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.COApprovalActionQuickASI);Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.ApproveQuickASI);Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmr.ApproveOkQuickASI);Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutArrowQuickASI);Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutQuickASI);
			Thread.sleep(2000);
		
	}
		
		@Then("I logout with {string} airline user given in {string} sheet ACS_GMR QuickASI Direct NonBonded")
		public void i_logout_with_airline_user_given_in_sheet_ACS_GMR_Direct_NonBonded(String entity, String sheetName) throws Throwable {

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
			Thread.sleep(4000);

	
	}
		
		@Then("^To verify whether the user is able to submit the SB ASI details ACS_GMR QuickASI Direct NonBonded$")
		public void To_verify_whether_the_user_is_able_to_submit_the_SB_ASI_details_ACS_GMR_QuickASI_Direct_NonBonded() throws InterruptedException, AWTException {
	
		gmr.MAWBListInput.click();Thread.sleep(2000);
		gmr.MAWBListInput.sendKeys(AWB_QUICKASI_DIRECT_NONBONDED);
		Thread.sleep(2000);
			
		gmr.MAWBListInputDownArrow.click();Thread.sleep(2000);
			
		gmr.Contains.click();Thread.sleep(4000);
			
		wm.JavascriptExecutorClick(driver, gmr.AddSB);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBNumber);Thread.sleep(4000);
		gmr.SBNumber.sendKeys("5467891");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBDate);Thread.sleep(2000);//18 May 2023
		wm.JavascriptExecutorClick(driver, gmr.Calendar);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.CalendarDateForQuickASI);Thread.sleep(2000);//----you can put any date
		 
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
		
		wm.JavascriptExecutorClick(driver, gmr.SBDetailsQuickASI);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBASI);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBASIProceed);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBASIConfirmation);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBASIOk);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.TSP);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.EdocketMsg);Thread.sleep(2000);
		
		//wm.JavascriptExecutorClick(driver, gmr.SBASIBackBtn);Thread.sleep(2000);
		//---------------------------------Edocket-------------------------------------------
		
//		gmr.EDocket();
//		
//	   //---------------------------TSP---------------------------------------------------------------------------
//				
//		wm.JavascriptExecutorClick(driver, gmr.SBDetailsQuickASI);Thread.sleep(4000);
//		wm.JavascriptExecutorClick(driver, gmr.SBDetailsTSP);Thread.sleep(4000);
//			
//				
//				
//		Select cargotypes = new Select(driver.findElement(By.id("ctl00_hldPage_ddlTypeTxt")));  
//		cargotypes.selectByVisibleText("General Cargo"); Thread.sleep(2000); 
//				
//		WebElement comname = driver.findElement(By.id("ctl00_hldPage_ddlComodityTypeName"));
//		Actions ct1 = new Actions(driver);
//		ct1.click(comname);
//	    Action comnameaction  = ct1.build();
//		comnameaction.perform();Thread.sleep(5000);  
//			      
//	    Robot robot=new Robot();
//	    robot.keyPress(KeyEvent.VK_DOWN);
//	    robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//			      
//				
//	    wm.JavascriptExecutorClick(driver, gmr.HSNCode);Thread.sleep(2000);
//				
//		wm.JavascriptExecutorClick(driver, gmr.TransactionPaswrd);Thread.sleep(2000);
//		gmr.TransactionPaswrd.sendKeys("Kale@JAN20241");Thread.sleep(2000);
//				
//		wm.JavascriptExecutorClick(driver, gmr.TSPPayNow);Thread.sleep(2000);
//		wm.JavascriptExecutorClick(driver, gmr.PaymentConfimationOkBtn);Thread.sleep(2000);
//		wm.JavascriptExecutorClick(driver, gmr.TokenConfimationOkBtn);Thread.sleep(2000);
//				
//		//-------------------------------Vehicle Token----------------------------------------------------------
//				//wm.JavascriptExecutorClick(driver, gmr.SBDetails);Thread.sleep(4000);//---------kadun takne
//				//wm.JavascriptExecutorClick(driver, gmr.VehicleToken);Thread.sleep(2000);
//		wm.JavascriptExecutorClick(driver, gmr.VehicleNumber);Thread.sleep(2000);
//		wm.JavascriptExecutorClick(driver, gmr.VehicleNumber);Thread.sleep(2000);
//		gmr.VehicleNumber.sendKeys("23456");
//		wm.JavascriptExecutorClick(driver, gmr.DriverLicenseNo);Thread.sleep(2000);
//		gmr.DriverLicenseNo.sendKeys("MH12-3036");
//		wm.JavascriptExecutorClick(driver, gmr.DriverName);Thread.sleep(2000);
//		gmr.DriverName.sendKeys("Jordhen");
//		wm.JavascriptExecutorClick(driver, gmr.DriverMobileNo);Thread.sleep(2000);
//		gmr.DriverMobileNo.sendKeys(cm.RandomNo(10));
//		wm.JavascriptExecutorClick(driver, gmr.AgentMobileNo);Thread.sleep(2000);
//		gmr.AgentMobileNo.sendKeys(cm.RandomNo(10));
//		wm.JavascriptExecutorClick(driver, gmr.GenerateToken);Thread.sleep(2000);
//		wm.JavascriptExecutorClick(driver, gmr.VehicleTokenConfimationOkBtn);Thread.sleep(2000);
//				
//		//-----------------------------------Cons AWB List------------------
//				
//		wm.JavascriptExecutorClick(driver, gmr.ConsAWBList);Thread.sleep(2000);
//				
//		driver.switchTo().frame("IframEdocket");
//		Thread.sleep(1000);
//				
//		wm.JavascriptExecutorClick(driver, gmr.MenifestToAirlineEmail);Thread.sleep(2000);
//		gmr.MenifestToAirlineEmail.sendKeys("Swaranjali.Kharat@Kalelogistics.com");Thread.sleep(2000);
//				
//		wm.JavascriptExecutorClick(driver, gmr.SendEmailBtn);Thread.sleep(2000);
//				
//		wm.JavascriptExecutorClick(driver, gmr.SendEmailCloseBtn);Thread.sleep(2000);
//		driver.switchTo().defaultContent();
//		Thread.sleep(4000);
//			
//		//------------------------------------------ACS Receipt-------------------------------------------
//		
//		wm.JavascriptExecutorClick(driver, gmr.ACSReceipt);Thread.sleep(1000);
//			
//		Set<String> allwindowid = driver.getWindowHandles();
//		Object[] windows = allwindowid.toArray();
//		String window2 = windows[0].toString();        
//		driver.switchTo().window(window2); 
//		System.out.println(allwindowid);
//		System.out.println(window2);
//		Thread.sleep(5000);
//		    
//		 String window1 = windows[0].toString();
//		 driver.switchTo().window(window1);
//		 System.out.println(window1);
//		 Thread.sleep(5000);
//
//        //---------------------------------------------Action-----------------------------------------------
//		    
//		   // wm.JavascriptExecutorClick(driver, gmr.EditMAWBActionTab);Thread.sleep(2000);
//		  //wm.JavascriptExecutorClick(driver, gmr.EditMAWBActionTabSave);Thread.sleep(2000);
//		 //wm.JavascriptExecutorClick(driver, gmr.EditMAWBActionTabSavePopup);Thread.sleep(2000);
//			
//		 wm.JavascriptExecutorClick(driver, gmr.ActionTab);Thread.sleep(2000);
//		 wm.JavascriptExecutorClick(driver, gmr.CopyAWBConfirmationYesBtnQuickASI);
//		 Thread.sleep(2000);...
			//Thread.sleep(700000);
			
	
		}
		
		//----------------------------Quick ASI Direct Bonded-------------------------------------------------------------------
		
		@Given("^To verify whether User is able to view Quick ASI Tab in e-AWB drop down ACS_GMR QuickASI Direct Bonded$")
	    public void To_verify_whether_User_is_able_to_view_Quick_ASI_Tab_in_e_AWB_drop_down_ACS_GMR_QuickASI_Direct_Bonded() throws InterruptedException, AWTException {
		 
		Actions action = new Actions(driver);
		action.moveToElement(gmr.eAWBTab).perform();
		Thread.sleep(1000);
				
		wm.JavascriptExecutorClick(driver, gmr.QuickASI);Thread.sleep(2000);
				
		Select ctoquickASI = new Select(driver.findElement(By.id("ctl00_hldPage_ddlCustodianName")));  
		ctoquickASI.selectByVisibleText("Kale_GHA1");Thread.sleep(2000);
				
		wm.JavascriptExecutorClick(driver, gmr.QuickASIDirectRadioBtn);Thread.sleep(2000);
				
				
		Select shipmenttypeQuickASI = new Select(driver.findElement(By.id("ctl00_hldPage_ddlShipmentType")));  
		shipmenttypeQuickASI.selectByVisibleText("Bonded");Thread.sleep(2000);
				
		wm.JavascriptExecutorClick(driver, gmr.QuickASIMAWBNoPrefix);Thread.sleep(2000);
		gmr.QuickASIMAWBNoPrefix.sendKeys("999");Thread.sleep(2000);
				
		gmr.QuickASIMAWBNo.sendKeys(AWB_QUICKASI_DIRECT_BONDED);
		Thread.sleep(2000);
				
		WebElement desticon = driver.findElement(By.id("ctl00_hldPage_txtDestAirport"));
	    Actions destob = new Actions(driver);
	    destob.click(desticon);
	    Action Destaction  = destob.build();
	    Destaction.perform();Thread.sleep(2000);
				
				//wm.JavascriptExecutorClick(driver, gmr.QuickASIDestination);Thread.sleep(2000);
		gmr.QuickASIDestination.sendKeys("LHR");Thread.sleep(2000);
				
		wm.JavascriptExecutorClick(driver, gmr.QuickASINoP);Thread.sleep(2000);
		gmr.QuickASINoP.sendKeys("12");Thread.sleep(2000);
				
		wm.JavascriptExecutorClick(driver, gmr.QuickASIGrossWt);Thread.sleep(2000);
		gmr.QuickASIGrossWt.sendKeys("100");Thread.sleep(2000);
				
		wm.JavascriptExecutorClick(driver, gmr.QuickASIChargeableWt);Thread.sleep(2000);
		gmr.QuickASIChargeableWt.sendKeys("120");Thread.sleep(2000);
		
		//wm.JavascriptExecutorClick(driver, gmr.QuickASICarrierField);Thread.sleep(2000);
		//gmr.QuickASIFlightNo.sendKeys("BA");Thread.sleep(2000);
		
		WebElement icon1 = driver.findElement(By.id("ctl00_hldPage_txtCarrier1"));
	    Actions ob1 = new Actions(driver);
	    ob1.click(icon1);
	    Action destaction1  = ob1.build();
	    destaction1.perform();Thread.sleep(2000);
	    
	    gmr.QuickASICarrierField.sendKeys("BA");Thread.sleep(2000);
				
		wm.JavascriptExecutorClick(driver, gmr.QuickASIFlightNo);Thread.sleep(2000);
		gmr.QuickASIFlightNo.sendKeys("1234");Thread.sleep(2000);
				
		wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHA);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHAAdvikEnterprises);Thread.sleep(2000);
		//wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHAAdhyaLogistics);Thread.sleep(2000);
				
		wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHA1);Thread.sleep(2000);
		
		WebElement natureofgoods1 = driver.findElement(By.id("ctl00_hldPage_txtCargoDesc"));
	    Actions natureofgoodsob1 = new Actions(driver);
	    natureofgoodsob1.click(natureofgoods1);
	    Action natureofgoodsaction1  = natureofgoodsob1.build();
	    natureofgoodsaction1.perform();Thread.sleep(2000);
	    
	    driver.findElement(By.id("ctl00_hldPage_txtCargoDesc")).sendKeys("Natural");
	    Thread.sleep(2000);
	    
		
		Select bondedtruckerQuickASI = new Select(driver.findElement(By.id("ctl00_hldPage_ddlBondedTruckers")));  
		bondedtruckerQuickASI.selectByVisibleText("AADHYA BONDED TRUCKER");Thread.sleep(2000);
				
		wm.JavascriptExecutorClick(driver, gmr.QuickASISave);Thread.sleep(2000);
				
		wm.JavascriptExecutorClick(driver, gmr.QuickASISuccessMsg);Thread.sleep(2000);
		
		}	
		

		@Then("^For Bonded shipments verify whether the user is able to sent the CO request to Bonded Trucker ACS_GMR QuickASI Direct Bonded$")
		public void For_Bonded_shipments_verify_whether_the_user_is_able_to_sent_the_CO_request_to_Bonded_Trucker_ACS_GMR_QuickASI_Direct_Bonded() throws InterruptedException, AWTException {

		
			//-------------------------------MAWB List Tab-------------------------------------------------
			//Actions action = new Actions(driver);
			//action.moveToElement(gmr.eAWBTab).perform();
			//Thread.sleep(1000);
			
			//wm.JavascriptExecutorClick(driver, gmr.MAWBListTab);Thread.sleep(2000);
			
			
//			gmr.MAWBListInput.click();Thread.sleep(2000);
//			gmr.MAWBListInput.sendKeys(AWB_QUICKASI_DIRECT_BONDED);
//			Thread.sleep(2000);
//			
//			gmr.MAWBListInputDownArrow.click();Thread.sleep(2000);
//			
//			gmr.Contains.click();Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmr.MawbASI);Thread.sleep(4000);
			//gmr.MawbASI.click();Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.MawbASIOkBtn);Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.CO);Thread.sleep(2000);
			
			Select airlineselectionQuickASI = new Select(driver.findElement(By.id("ctl00_hldPage_drpAirlineList")));  
			airlineselectionQuickASI.selectByVisibleText("AADHYA BONDED TRUCKER");Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.COYesBtn);Thread.sleep(1000);
			
			wm.JavascriptExecutorClick(driver, gmr.COOkBtn);Thread.sleep(1000);
			
			Thread.sleep(8000);

			wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");

			Thread.sleep(8000);
			}
			
			@Then("I login with {string} Adhya user given in {string} sheet ACS_GMR QuickASI Direct Bonded")
			public void I_login_with_Adhya_user_given_in_sheet_ACS_GMR_QuickASI_Direct_Bonded(String entity, String sheetName) throws Throwable {
				
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
				
				wm.JavascriptExecutorClick(driver, gmr.COApprovalQuickASI);Thread.sleep(2000);
				
				
				wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNoQuickASI);Thread.sleep(2000);
				//gmr.CartingOrderShipmentMAWBNo.sendKeys("99924052081");Thread.sleep(2000); 
				
				gmr.CartingOrderShipmentMAWBNoQuickASI.sendKeys("999" + AWB_QUICKASI_DIRECT_BONDED);
				Thread.sleep(2000);//-------------AWB--------
				
				wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNoSearchBtnQuickASI);Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.COApprovalActionQuickASI);Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.ApproveQuickASI);Thread.sleep(4000);
				
				wm.JavascriptExecutorClick(driver, gmr.ApproveOkQuickASI);Thread.sleep(4000);
				
				wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutArrowQuickASI);Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutQuickASI);Thread.sleep(2000);
				
			
		}
			
			@Then("I logout with {string} airline user given in {string} sheet ACS_GMR QuickASI Direct Bonded")
			public void i_logout_with_airline_user_given_in_sheet_ACS_GMR_Direct_Bonded(String entity, String sheetName) throws Throwable {

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
			
			@Then("^To verify whether the user is able to submit the SB ASI details ACS_GMR QuickASI Direct Bonded$")
			public void To_verify_whether_the_user_is_able_to_submit_the_SB_ASI_details_ACS_GMR_QuickASI_Direct_Bonded() throws InterruptedException, AWTException {
		
				gmr.MAWBListInput.click();Thread.sleep(3000);
				gmr.MAWBListInput.sendKeys(AWB_QUICKASI_DIRECT_BONDED);
				Thread.sleep(2000);
				
				gmr.MAWBListInputDownArrow.click();Thread.sleep(2000);
				
				gmr.Contains.click();Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.AddSB);Thread.sleep(4000);
				//gmr.AddSB.click();Thread.sleep(2000);
				
				//gmr.AddSB.click();Thread.sleep(500);
			
			wm.JavascriptExecutorClick(driver, gmr.SBNumber);Thread.sleep(2000);
			gmr.SBNumber.sendKeys("5467891");Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.SBDate);Thread.sleep(2000);//18 May 2023
			wm.JavascriptExecutorClick(driver, gmr.Calendar);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.CalendarDateForQuickASI);Thread.sleep(2000);//----you can put any date
			 
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
			
			//wm.JavascriptExecutorClick(driver, gmr.SBDetails);Thread.sleep(4000);
				Thread.sleep(1000);
			gmr.SBDetailsQuickASI.click();Thread.sleep(2000);
			
			//wm.JavascriptExecutorClick(driver, gmr.SBASI);Thread.sleep(2000);
//		gmr.SBASI.click();Thread.sleep(2000);
			
//			wm.JavascriptExecutorClick(driver, gmr.SBASIProceed);Thread.sleep(2000);
//			
//			wm.JavascriptExecutorClick(driver, gmr.SBASIConfirmation);Thread.sleep(3000);
//			
//			wm.JavascriptExecutorClick(driver, gmr.SBASIOk);Thread.sleep(3000);
//			
//			wm.JavascriptExecutorClick(driver, gmr.TSP);Thread.sleep(2000);
//			
//			wm.JavascriptExecutorClick(driver, gmr.EdocketMsg);Thread.sleep(2000);
			
			//wm.JavascriptExecutorClick(driver, gmr.SBASIBackBtn);Thread.sleep(2000);
		
			//---------------------------------Edocket-------------------------------------------
			
//			gmr.EDocket();
//			
//					
//					
//					
//					//---------------------------TSP---------------------------------------------------------------------------
//					
//					wm.JavascriptExecutorClick(driver, gmr.SBDetailsQuickASI);Thread.sleep(2000);
////					wm.JavascriptExecutorClick(driver, gmr.SBASIQuickASI);Thread.sleep(2000);
////					wm.JavascriptExecutorClick(driver, gmr.SBASIQuickASIProceed);Thread.sleep(2000);
////					wm.JavascriptExecutorClick(driver, gmr.SBASIQuickASIProceedConfirmation);Thread.sleep(2000);
////					wm.JavascriptExecutorClick(driver, gmr.SBASIQuickASIProceedConfirmationOk);Thread.sleep(2000);
//					
//					wm.JavascriptExecutorClick(driver, gmr.SBDetailsTSP);Thread.sleep(4000);
//				
//					
//					
//					Select cargotypes = new Select(driver.findElement(By.id("ctl00_hldPage_ddlTypeTxt")));  
//					cargotypes.selectByVisibleText("Human Remains"); Thread.sleep(2000); 
//					
//					WebElement comname = driver.findElement(By.id("ctl00_hldPage_ddlComodityTypeName"));
//				      Actions ct1 = new Actions(driver);
//				      ct1.click(comname);
//				      Action comnameaction  = ct1.build();
//				      comnameaction.perform();Thread.sleep(5000);  
//				      
//				      Robot robot=new Robot();
//				       robot.keyPress(KeyEvent.VK_DOWN);
//				       robot.keyPress(KeyEvent.VK_ENTER);
//				      // robot.keyRelease(KeyEvent.VK_DOWN);
//				       //robot.keyRelease(KeyEvent.VK_ENTER);
//				     
//				      Thread.sleep(2000);
//				      
//					
//				      wm.JavascriptExecutorClick(driver, gmr.HSNCode);Thread.sleep(2000);
//					
//					wm.JavascriptExecutorClick(driver, gmr.TransactionPaswrd);Thread.sleep(2000);
//					gmr.TransactionPaswrd.sendKeys("Kale@JAN20241");Thread.sleep(2000);
//					
//					wm.JavascriptExecutorClick(driver, gmr.TSPPayNow);Thread.sleep(3000);
//					wm.JavascriptExecutorClick(driver, gmr.PaymentConfimationOkBtn);Thread.sleep(3000);
//					wm.JavascriptExecutorClick(driver, gmr.TokenConfimationOkBtn);Thread.sleep(3000);
			
			}
			@Then("^Able to generate single VT for 2 different AWB ACS_GMR QuickASI Direct Bonded$")
			public void able_to_generate_single_VT_for_2_different_AWB_ACS_GMR_QuickASI_Direct_Bonded() throws InterruptedException, AWTException{ 
					
//					//-------------------------------Vehicle Token----------------------------------------------------------
//				    wm.JavascriptExecutorClick(driver, gmr.AddShipment);Thread.sleep(2000);
//			   	
//			   	    driver.switchTo().frame(0);Thread.sleep(1000);
//			   	    wm.JavascriptExecutorClick(driver, gmr.SBCheckBox);Thread.sleep(2000);
//			   	
//			   	    wm.JavascriptExecutorClick(driver, gmr.AddBtnSBCheckBox);Thread.sleep(2000);
//					//wm.JavascriptExecutorClick(driver, gmr.SBDetails);Thread.sleep(4000);//---------kadun takne
//					//wm.JavascriptExecutorClick(driver, gmr.VehicleToken);Thread.sleep(2000);
//					wm.JavascriptExecutorClick(driver, gmr.VehicleNumber);Thread.sleep(2000);
//					wm.JavascriptExecutorClick(driver, gmr.VehicleNumber);Thread.sleep(2000);
//					gmr.VehicleNumber.sendKeys("23456");
//					wm.JavascriptExecutorClick(driver, gmr.DriverLicenseNo);Thread.sleep(2000);
//					gmr.DriverLicenseNo.sendKeys("MH12-3036");
//					wm.JavascriptExecutorClick(driver, gmr.DriverName);Thread.sleep(2000);
//					gmr.DriverName.sendKeys("Jordhen");
//					wm.JavascriptExecutorClick(driver, gmr.DriverMobileNo);Thread.sleep(2000);
//					gmr.DriverMobileNo.sendKeys(cm.RandomNo(10));
//					wm.JavascriptExecutorClick(driver, gmr.AgentMobileNo);Thread.sleep(2000);
//					gmr.AgentMobileNo.sendKeys(cm.RandomNo(10));
//					wm.JavascriptExecutorClick(driver, gmr.GenerateToken);Thread.sleep(2000);
//					wm.JavascriptExecutorClick(driver, gmr.VehicleTokenConfimationOkBtn);Thread.sleep(2000);
//					
//					
//					
//					//-----------------------------------Cons AWB List------------------
//					
//					wm.JavascriptExecutorClick(driver, gmr.ConsAWBList);Thread.sleep(2000);
//					
//					driver.switchTo().frame("IframEdocket");
//					Thread.sleep(1000);
//					
//					wm.JavascriptExecutorClick(driver, gmr.MenifestToAirlineEmail);Thread.sleep(2000);
//					gmr.MenifestToAirlineEmail.sendKeys("Swaranjali.Kharat@Kalelogistics.com");Thread.sleep(2000);
//					
//					wm.JavascriptExecutorClick(driver, gmr.SendEmailBtn);Thread.sleep(2000);
//					
//					wm.JavascriptExecutorClick(driver, gmr.SendEmailCloseBtn);Thread.sleep(2000);
//					driver.switchTo().defaultContent();
//					Thread.sleep(4000);
//				
//				//------------------------------------------ACS Receipt-------------------------------------------
//				wm.JavascriptExecutorClick(driver, gmr.ACSReceipt);Thread.sleep(1000);
//				
//				Set<String> allwindowid = driver.getWindowHandles();
//			    Object[] windows = allwindowid.toArray();
//			    String window2 = windows[0].toString();        
//			    driver.switchTo().window(window2); 
//			    System.out.println(allwindowid);
//			    System.out.println(window2);
//			    Thread.sleep(5000);
//			    
//			    String window1 = windows[0].toString();
//			    driver.switchTo().window(window1);
//			    System.out.println(window1);
//			    Thread.sleep(5000);
//				
//				//---------------------------------------------Action-----------------------------------------------
//			    
////			    wm.JavascriptExecutorClick(driver, gmr.EditMAWBActionTab);Thread.sleep(2000);
//			    
////			    wm.JavascriptExecutorClick(driver, gmr.EditMAWBActionTabSave);Thread.sleep(2000);
//			    
////			    wm.JavascriptExecutorClick(driver, gmr.EditMAWBActionTabSavePopup);Thread.sleep(2000);
//				
//				wm.JavascriptExecutorClick(driver, gmr.ActionTab);Thread.sleep(2000);
//				wm.JavascriptExecutorClick(driver, gmr.CopyAWBConfirmationYesBtnQuickASI);Thread.sleep(2000);
				
				//Thread.sleep(800000);
				
				
			}
			
			//-----------------Quick ASI Console Non Bonded-------------------------------------------------------------
		
			@Then("^To Verify whether User is able to view enable Add HAWB button after selecting radiobutton for Consol ACS_GMR QuickASI Console NonBonded$")
			public void To_Verify_whether_User_is_able_to_view_enable_Add_HAWB_button_after_selecting_radiobutton_for_Consol_ACS_GMR_QuickASI_Console_NonBonded() throws InterruptedException, AWTException {

				
			Actions action = new Actions(driver);
			action.moveToElement(gmr.eAWBTab).perform();
			Thread.sleep(1000);
						
			wm.JavascriptExecutorClick(driver, gmr.QuickASI);Thread.sleep(2000);
						
			Select ctoforquickASI = new Select(driver.findElement(By.id("ctl00_hldPage_ddlCustodianName")));  
			ctoforquickASI.selectByVisibleText("Kale_GHA1");Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.QuickASIConsoleRadioBtn);Thread.sleep(2000);
						
						
			Select shipmenttypequickASI = new Select(driver.findElement(By.id("ctl00_hldPage_ddlShipmentType")));  
			shipmenttypequickASI.selectByVisibleText("Non-Bonded");Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.QuickASIMAWBNoPrefix);Thread.sleep(2000);
			gmr.QuickASIMAWBNoPrefix.sendKeys("999");Thread.sleep(2000);
						
			gmr.QuickASIMAWBNo.sendKeys(AWB_QUICKASI_CONSOLE_NONBONDED);
			Thread.sleep(2000);
						
			WebElement icon = driver.findElement(By.id("ctl00_hldPage_txtDestAirport"));
			Actions ob = new Actions(driver);
			ob.click(icon);
		    Action destaction  = ob.build();
			destaction.perform();Thread.sleep(1000);
						
			//wm.JavascriptExecutorClick(driver, gmr.QuickASIDestination);Thread.sleep(2000);
			gmr.QuickASIDestination.sendKeys("LHR");Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.QuickASINoP);Thread.sleep(2000);
			gmr.QuickASINoP.sendKeys("12");Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.QuickASIGrossWt);Thread.sleep(2000);
			gmr.QuickASIGrossWt.sendKeys("100");Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.QuickASIChargeableWt);Thread.sleep(2000);
			gmr.QuickASIChargeableWt.sendKeys("120");Thread.sleep(2000);
			
			WebElement icon1 = driver.findElement(By.id("ctl00_hldPage_txtCarrier1"));
		    Actions ob1 = new Actions(driver);
		    ob1.click(icon1);
		    Action destaction1  = ob1.build();
		    destaction1.perform();Thread.sleep(2000);
		    
		    gmr.QuickASICarrierField.sendKeys("BA");Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.QuickASIFlightNo);Thread.sleep(2000);
			gmr.QuickASIFlightNo.sendKeys("1234");Thread.sleep(2000);
						
			WebElement natureofgoods = driver.findElement(By.id("ctl00_hldPage_txtCargoDesc"));
			Actions natureofgoodsob = new Actions(driver);
			natureofgoodsob.click(natureofgoods);
			Action natureofgoodsaction  = natureofgoodsob.build();
			natureofgoodsaction.perform();Thread.sleep(2000);
			driver.findElement(By.id("ctl00_hldPage_txtCargoDesc")).sendKeys("Natural");
			Thread.sleep(2000);
						
						
			//wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHA1);Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.QuickASISave);Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.QuickASISuccessMsg);Thread.sleep(2000);
						
		 //--------------------------Quick ASI Add HAWB for Console----------------------------------
						
			wm.JavascriptExecutorClick(driver, gmr.AddHAWBQuickASI);Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.HAWBNoQuickASI);Thread.sleep(2000);
			gmr.HAWBNoQuickASI.sendKeys("h1");Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.OriginAddHAWBQuickASI);Thread.sleep(2000);
			gmr.OriginAddHAWBQuickASI.sendKeys("hyd");Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.DestAddHAWBQuickASI);Thread.sleep(2000);
			gmr.DestAddHAWBQuickASI.sendKeys("lhr");Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.NoPAddHAWBQuickASI);Thread.sleep(2000);
			gmr.NoPAddHAWBQuickASI.sendKeys("6");Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.GrossWtAddHAWBQuickASI);Thread.sleep(2000);
			gmr.GrossWtAddHAWBQuickASI.sendKeys("60");Thread.sleep(2000);
						
			Select assignCHAaddhawbquickASI = new Select(driver.findElement(By.id("ctl00_hldPage_rptHouse_ctl01_mltSlctCHAForHAWB")));  
			assignCHAaddhawbquickASI.selectByVisibleText("ADVIK ENTERPRISES");Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.CopyAddHAWBQuickASI);Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.HAWBNo2QuickASI);Thread.sleep(2000);
			gmr.HAWBNo2QuickASI.sendKeys("h2");Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.AddHAWBDeleteBtnQuickASI);Thread.sleep(2000);
						
		    wm.JavascriptExecutorClick(driver, gmr.AddHAWBDeleteOkBtnQuickASI);Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.AddHAWBDeleteOkPopupBtnQuickASI);Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.AddHAWBAddBtnQuickASI);Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.SaveHAWBAddBtnQuickASI);Thread.sleep(2000);
						
			wm.JavascriptExecutorClick(driver, gmr.SavePopupHAWBAddBtnQuickASI);Thread.sleep(2000);

}
			
			@Then("^For Bonded shipments verify whether the user is able to sent the CO request to Bonded Trucker ACS_GMR QuickASI Console NonBonded$")
			public void For_Bonded_shipments_verify_whether_the_user_is_able_to_sent_the_CO_request_to_Bonded_Trucker_ACS_GMR_QuickASI_Console_NonBonded() throws InterruptedException, AWTException {

				//wm.JavascriptExecutorClick(driver, gmr.ClearFilterQuickASI);Thread.sleep(2000);
				//-------------------------------MAWB List Tab-------------------------------------------------
				
				//gmr.ClearFilterQuickASI.click();Thread.sleep(4000);
				//Actions action = new Actions(driver);
				//action.moveToElement(gmr.eAWBTab).perform();
				//Thread.sleep(1000);
				
				//wm.JavascriptExecutorClick(driver, gmr.MAWBListTab);Thread.sleep(2000);
				
				
				//gmr.MAWBListInput.click();Thread.sleep(2000);
//				wm.JavascriptExecutorClick(driver, gmr.MAWBListInput);Thread.sleep(2000);
//				
//				gmr.MAWBListInput.sendKeys(AWB_QUICKASI_CONSOLE_NONBONDED);
//				Thread.sleep(2000);
//				
//				gmr.MAWBListInputDownArrow.click();Thread.sleep(2000);
//				
//				gmr.Contains.click();Thread.sleep(4000);
				
				
			   //gmr.AWBNoLinkQuickASI.click();Thread.sleep(2000); 
				
				//gmr.SendPdfToAirline.click();Thread.sleep(2000);
				
				//gmr.SendPdfToAirlinePopup.click();Thread.sleep(2000);
				
				//gmr.MasterInfoBack.click();Thread.sleep(2000);
				
				//gmr.MAWBListInput.click();Thread.sleep(2000);
				//gmr.MAWBListInput.sendKeys(TestDataReader.AWBNo_Direct_Bonded());
				//Thread.sleep(2000);
				
				//gmr.MAWBListInputDownArrow.click();Thread.sleep(2000);
				
				//gmr.Contains.click();Thread.sleep(4000);
				
				wm.JavascriptExecutorClick(driver, gmr.MawbASI);Thread.sleep(2000);
				//gmr.MawbASI.click();Thread.sleep(2000);
				wm.JavascriptExecutorClick(driver, gmr.MawbASIOkBtn);Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.CO);Thread.sleep(4000);
				
				Select airlineselectionQuickASI = new Select(driver.findElement(By.id("ctl00_hldPage_drpAirlineList")));  
				airlineselectionQuickASI.selectByVisibleText("AADHYA BONDED TRUCKER");Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.COYesBtn);Thread.sleep(1000);
				
				wm.JavascriptExecutorClick(driver, gmr.COOkBtn);Thread.sleep(1000);
				
				Thread.sleep(8000);

				wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");

				Thread.sleep(8000);
				}
				
				@Then("I login with {string} Adhya user given in {string} sheet ACS_GMR QuickASI Console NonBonded")
				public void I_login_with_Adhya_user_given_in_sheet_ACS_GMR_QuickASI_Console_NonBonded(String entity, String sheetName) throws Throwable {
					
					Entity = entity;
					TestDataReader.ReadLoginDetails(Entity);
					Thread.sleep(500);
					System.out.println("usr= " + Username);
					System.out.println("pwd= " + Password);
					// loginScreen.isLoginScreenDisplayed();
					loginScreen.Login(Entity, Username, Password);
					Thread.sleep(4000);	
					
					//wm.JavascriptExecutorClick(driver, gmr.AllForAirline);Thread.sleep(2000);
					
				//	wm.JavascriptExecutorClick(driver, gmr.AllForAirlineOk);Thread.sleep(2000);
					
					wm.JavascriptExecutorClick(driver, gmr.COApprovalQuickASI);Thread.sleep(2000);
					
					
					wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNoQuickASI);Thread.sleep(2000);
					//gmr.CartingOrderShipmentMAWBNo.sendKeys("99924052081");Thread.sleep(2000); 
					
					gmr.CartingOrderShipmentMAWBNoQuickASI.sendKeys("999" + AWB_QUICKASI_CONSOLE_NONBONDED);
					Thread.sleep(2000);//-------------AWB--------
					
					wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNoSearchBtnQuickASI);Thread.sleep(2000);
					
					wm.JavascriptExecutorClick(driver, gmr.COApprovalActionQuickASI);Thread.sleep(2000);
					
					wm.JavascriptExecutorClick(driver, gmr.ApproveQuickASI);Thread.sleep(4000);
					
					wm.JavascriptExecutorClick(driver, gmr.ApproveOkQuickASI);Thread.sleep(4000);
					
					wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutArrowQuickASI);Thread.sleep(2000);
					
					wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutQuickASI);
					Thread.sleep(2000);
					
				
			}
				
				@Then("I logout with {string} airline user given in {string} sheet ACS_GMR QuickASI Console NonBonded")
				public void i_logout_with_airline_user_given_in_sheet_ACS_GMR_Console_NonBonded(String entity, String sheetName) throws Throwable {

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
				
				@Then("^To verify whether the user is able to submit the SB ASI details ACS_GMR QuickASI Console NonBonded$")
				public void To_verify_whether_the_user_is_able_to_submit_the_SB_ASI_details_ACS_GMR_QuickASI_Console_NonBonded() throws InterruptedException, AWTException {
			
					gmr.MAWBListInput.click();Thread.sleep(5000);
					gmr.MAWBListInput.sendKeys(AWB_QUICKASI_CONSOLE_NONBONDED);
					Thread.sleep(5000);
					
					gmr.MAWBListInputDownArrow.click();Thread.sleep(2000);
					
					gmr.Contains.click();Thread.sleep(4000);
					
					wm.JavascriptExecutorClick(driver, gmr.AddSB);Thread.sleep(4000);
				
				wm.JavascriptExecutorClick(driver, gmr.SBNumber);Thread.sleep(4000);
				gmr.SBNumber.sendKeys("5467891");Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.SBDate);Thread.sleep(2000);//18 May 2023
				wm.JavascriptExecutorClick(driver, gmr.Calendar);Thread.sleep(2000);
				wm.JavascriptExecutorClick(driver, gmr.CalendarDateForQuickASI);Thread.sleep(2000);//----you can put any date
				 
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
				
				wm.JavascriptExecutorClick(driver, gmr.SBDetailsQuickASI);Thread.sleep(4000);
				
				wm.JavascriptExecutorClick(driver, gmr.SBASI);Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.SBASIProceed);Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.SBASIConfirmation);Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.SBASIOk);Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.TSP);Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.EdocketMsg);Thread.sleep(2000);
				
				//wm.JavascriptExecutorClick(driver, gmr.SBASIBackBtn);Thread.sleep(2000);
			
				//---------------------------------Edocket-------------------------------------------
				
				gmr.EDocket();
				
//				//---------------------------TSP---------------------------------------------------------------------------
						
				wm.JavascriptExecutorClick(driver, gmr.SBDetailsQuickASI);Thread.sleep(4000);
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
			   gmr.TransactionPaswrd.sendKeys("Kale@JAN20241");Thread.sleep(2000);
						
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

			 //---------------------------------------------Action-----------------------------------------------
				    
				   // wm.JavascriptExecutorClick(driver, gmr.EditMAWBActionTab);Thread.sleep(2000);
				    
				    //wm.JavascriptExecutorClick(driver, gmr.EditMAWBActionTabSave);Thread.sleep(2000);
				    
				    //wm.JavascriptExecutorClick(driver, gmr.EditMAWBActionTabSavePopup);Thread.sleep(2000);
					
			  wm.JavascriptExecutorClick(driver, gmr.ActionTab);Thread.sleep(2000);
			  wm.JavascriptExecutorClick(driver, gmr.CopyAWBConfirmationYesBtnQuickASI);
			  Thread.sleep(2000);
			
					//gmr.AdvikLogout();
				//	Thread.sleep(700000);
					
					
					
}
				
           //------------------Quick ASI Console Bonded----------------------------------------------------------
				
				@Then("^To Verify whether User is able to view enable Add HAWB button after selecting radiobutton for Consol ACS_GMR QuickASI Console Bonded$")
				public void To_Verify_whether_User_is_able_to_view_enable_Add_HAWB_button_after_selecting_radiobutton_for_Consol_ACS_GMR_QuickASI_Console_Bonded() throws InterruptedException, AWTException {
				
				Actions bondedaction = new Actions(driver);
				bondedaction.moveToElement(gmr.eAWBTab).perform();
				Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.QuickASI);Thread.sleep(4000);
				
				Select ctoQuickASI = new Select(driver.findElement(By.id("ctl00_hldPage_ddlCustodianName")));  
				ctoQuickASI.selectByVisibleText("Kale_GHA1");Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.QuickASIConsoleRadioBtn);Thread.sleep(2000);
				
				
				Select ShipmenttypequickASI = new Select(driver.findElement(By.id("ctl00_hldPage_ddlShipmentType")));  
				ShipmenttypequickASI.selectByVisibleText("Bonded");Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.QuickASIMAWBNoPrefix);Thread.sleep(2000);
				gmr.QuickASIMAWBNoPrefix.sendKeys("999");Thread.sleep(2000);
				
				gmr.QuickASIMAWBNo.sendKeys(AWB_QUICKASI_CONSOLE_BONDED);
				Thread.sleep(2000);
				
				WebElement consolebondedicon = driver.findElement(By.id("ctl00_hldPage_txtDestAirport"));
			    Actions consolebondedob = new Actions(driver);
			    consolebondedob.click(consolebondedicon);
			    Action consolebondedaction  = consolebondedob.build();
			    consolebondedaction.perform();Thread.sleep(1000);
				
				//wm.JavascriptExecutorClick(driver, gmr.QuickASIDestination);Thread.sleep(2000);
				gmr.QuickASIDestination.sendKeys("LHR");Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.QuickASINoP);Thread.sleep(2000);
				gmr.QuickASINoP.sendKeys("12");Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.QuickASIGrossWt);Thread.sleep(2000);
				gmr.QuickASIGrossWt.sendKeys("100");Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.QuickASIChargeableWt);Thread.sleep(2000);
				gmr.QuickASIChargeableWt.sendKeys("120");Thread.sleep(2000);
				
				WebElement icon1 = driver.findElement(By.id("ctl00_hldPage_txtCarrier1"));
			    Actions ob1 = new Actions(driver);
			    ob1.click(icon1);
			    Action destaction1  = ob1.build();
			    destaction1.perform();Thread.sleep(2000);
			    
			    gmr.QuickASICarrierField.sendKeys("BA");Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.QuickASIFlightNo);Thread.sleep(2000);
				gmr.QuickASIFlightNo.sendKeys("1234");Thread.sleep(2000);
				
				
				wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHA1);Thread.sleep(2000);
				wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHA1_Search);Thread.sleep(4000);
				
				gmr.QuickASIAssignCHA1_Search.sendKeys("Aadhya bonded Trucker");Thread.sleep(2000);
				wm.JavascriptExecutorClick(driver, gmr.Aadhya_Bonded_Trucker);Thread.sleep(4000);
				
				
				WebElement natureofgoods1 = driver.findElement(By.id("ctl00_hldPage_txtCargoDesc"));
			    Actions natureofgoodsob1 = new Actions(driver);
			    natureofgoodsob1.click(natureofgoods1);
			    Action natureofgoodsaction1  = natureofgoodsob1.build();
			    natureofgoodsaction1.perform();Thread.sleep(2000);
			    
			    driver.findElement(By.id("ctl00_hldPage_txtCargoDesc")).sendKeys("Natural");
			    Thread.sleep(2000);
				
				Select bondedtruckerQuickASI = new Select(driver.findElement(By.id("ctl00_hldPage_ddlBondedTruckers")));  
				bondedtruckerQuickASI.selectByVisibleText("AADHYA BONDED TRUCKER");Thread.sleep(4000);

				
				wm.JavascriptExecutorClick(driver, gmr.QuickASISave);Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.QuickASISuccessMsg);Thread.sleep(2000);
				
				//--------------------------Quick ASI Add HAWB for Console----------------------------------
				
				wm.JavascriptExecutorClick(driver, gmr.AddHAWBQuickASI);Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.HAWBNoQuickASI);Thread.sleep(2000);
				gmr.HAWBNoQuickASI.sendKeys("h1");Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.OriginAddHAWBQuickASI);Thread.sleep(2000);
				gmr.OriginAddHAWBQuickASI.sendKeys("hyd");Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.DestAddHAWBQuickASI);Thread.sleep(2000);
				gmr.DestAddHAWBQuickASI.sendKeys("lhr");Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.NoPAddHAWBQuickASI);Thread.sleep(2000);
				gmr.NoPAddHAWBQuickASI.sendKeys("6");Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.GrossWtAddHAWBQuickASI);Thread.sleep(2000);
				gmr.GrossWtAddHAWBQuickASI.sendKeys("60");Thread.sleep(2000);
				
				Select AssignCHAaddhawbquickASI = new Select(driver.findElement(By.id("ctl00_hldPage_rptHouse_ctl01_mltSlctCHAForHAWB")));  
				AssignCHAaddhawbquickASI.selectByVisibleText("ADVIK ENTERPRISES");Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.CopyAddHAWBQuickASI);Thread.sleep(3000);
				
				wm.JavascriptExecutorClick(driver, gmr.HAWBNo2QuickASI);Thread.sleep(3000);
				gmr.HAWBNo2QuickASI.sendKeys("h2");Thread.sleep(3000);
				
				wm.JavascriptExecutorClick(driver, gmr.AddHAWBDeleteBtnQuickASI);Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.AddHAWBDeleteOkBtnQuickASI);Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.AddHAWBDeleteOkPopupBtnQuickASI);Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.AddHAWBAddBtnQuickASI);Thread.sleep(2000);
				
				wm.JavascriptExecutorClick(driver, gmr.SaveHAWBAddBtnQuickASI);Thread.sleep(2000);
				
				
				wm.JavascriptExecutorClick(driver, gmr.SavePopupHAWBAddBtnQuickASI);Thread.sleep(2000);
	               
	}
@Then("^For Bonded shipments verify whether the user is able to sent the CO request to Bonded Trucker ACS_GMR QuickASI Console Bonded$")
public void For_Bonded_shipments_verify_whether_the_user_is_able_to_sent_the_CO_request_to_Bonded_Trucker_ACS_GMR_QuickASI_Console_Bonded() throws InterruptedException, AWTException {

	//wm.JavascriptExecutorClick(driver, gmr.ClearFilterQuickASI);Thread.sleep(2000);
	//-------------------------------MAWB List Tab-------------------------------------------------
	
	wm.JavascriptExecutorClick(driver, gmr.MAWBListInput);Thread.sleep(2000);
	
	gmr.MAWBListInput.sendKeys(AWB_QUICKASI_CONSOLE_BONDED);
	Thread.sleep(2000);
	
	gmr.MAWBListInputDownArrow.click();Thread.sleep(2000);
	
	gmr.Contains.click();Thread.sleep(4000);
	
	
	gmr.MawbASI.click();Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmr.MawbASIOkBtn);Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmr.CO);Thread.sleep(2000);
	
	Select airlineselectionQuickASI = new Select(driver.findElement(By.id("ctl00_hldPage_drpAirlineList")));  
	airlineselectionQuickASI.selectByVisibleText("AADHYA BONDED TRUCKER");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.COYesBtn);Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmr.COOkBtn);Thread.sleep(1000);
	
	Thread.sleep(8000);

	wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");

	Thread.sleep(8000);
	}
	
	@Then("I login with {string} Adhya user given in {string} sheet ACS_GMR QuickASI Console Bonded")
	public void I_login_with_Adhya_user_given_in_sheet_ACS_GMR_QuickASI_Console_Bonded(String entity, String sheetName) throws Throwable {
		
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(4000);	
		
		//wm.JavascriptExecutorClick(driver, gmr.AllForAirline);Thread.sleep(2000);
		
		//wm.JavascriptExecutorClick(driver, gmr.AllForAirlineOk);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.COApprovalQuickASI);Thread.sleep(2000);
		
		
		wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNoQuickASI);Thread.sleep(2000);
		//gmr.CartingOrderShipmentMAWBNo.sendKeys("99924052081");Thread.sleep(2000); 
		
		gmr.CartingOrderShipmentMAWBNoQuickASI.sendKeys("999" + AWB_QUICKASI_CONSOLE_BONDED);
		Thread.sleep(2000);//-------------AWB--------
		
		wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNoSearchBtnQuickASI);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.COApprovalActionQuickASI);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.ApproveQuickASI);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.ApproveOkQuickASI);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutArrowQuickASI);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutQuickASI);
		Thread.sleep(2000);
		
	
}
	
	@Then("I logout with {string} airline user given in {string} sheet ACS_GMR QuickASI Console Bonded")
	public void i_logout_with_airline_user_given_in_sheet_ACS_GMR_Console_Bonded(String entity, String sheetName) throws Throwable {

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
	
	@Then("^To verify whether the user is able to submit the SB ASI details ACS_GMR QuickASI Console Bonded$")
	public void To_verify_whether_the_user_is_able_to_submit_the_SB_ASI_details_ACS_GMR_QuickASI_Console_Bonded() throws InterruptedException, AWTException {

		gmr.MAWBListInput.click();Thread.sleep(2000);
		gmr.MAWBListInput.sendKeys(AWB_QUICKASI_CONSOLE_BONDED);
		Thread.sleep(2000);
		
		gmr.MAWBListInputDownArrow.click();Thread.sleep(2000);
		
		gmr.Contains.click();Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.AddSB);Thread.sleep(4000);
	
	wm.JavascriptExecutorClick(driver, gmr.SBNumber);Thread.sleep(4000);
	gmr.SBNumber.sendKeys("5467891");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.SBDate);Thread.sleep(2000);//18 May 2023
	wm.JavascriptExecutorClick(driver, gmr.Calendar);Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmr.CalendarDateForQuickASI);Thread.sleep(2000);//----you can put any date
	 
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
	
	wm.JavascriptExecutorClick(driver, gmr.SBDetailsQuickASI);Thread.sleep(4000);
	
	wm.JavascriptExecutorClick(driver, gmr.SBASI);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.SBASIProceed);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.SBASIConfirmation);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.SBASIOk);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.TSP);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.EdocketMsg);Thread.sleep(2000);
	
	//wm.JavascriptExecutorClick(driver, gmr.SBASIBackBtn);Thread.sleep(2000);

	//---------------------------------Edocket-------------------------------------------
	
	gmr.EDocket();
	Thread.sleep(2000);
	
	//---------------------------TSP---------------------------------------------------------------------------
			
			wm.JavascriptExecutorClick(driver, gmr.SBDetailsQuickASI);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmr.SBDetailsTSP);Thread.sleep(4000);
		
			
			
			Select cargotypes = new Select(driver.findElement(By.id("ctl00_hldPage_ddlTypeTxt")));  
			cargotypes.selectByVisibleText("Human Remains"); Thread.sleep(2000); 
			
			WebElement comname = driver.findElement(By.id("ctl00_hldPage_ddlComodityTypeName"));
		      Actions ct1 = new Actions(driver);
		      ct1.click(comname);
		      Action comnameaction  = ct1.build();
		      comnameaction.perform();Thread.sleep(5000);  
		      
		      Robot robot=new Robot();
		       robot.keyPress(KeyEvent.VK_DOWN);
		       robot.keyPress(KeyEvent.VK_ENTER);
		       //robot.keyRelease(KeyEvent.VK_DOWN);
		       //robot.keyRelease(KeyEvent.VK_ENTER);
		     
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


		
		//---------------------------------------------Action-----------------------------------------------
	    
	   // wm.JavascriptExecutorClick(driver, gmr.EditMAWBActionTab);Thread.sleep(2000);
	    
	    //wm.JavascriptExecutorClick(driver, gmr.EditMAWBActionTabSave);Thread.sleep(2000);
	    
	    //wm.JavascriptExecutorClick(driver, gmr.EditMAWBActionTabSavePopup);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.ActionTab);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.CopyAWBConfirmationYesBtnQuickASI);
		Thread.sleep(20000);
		
		Thread.sleep(700000);
		
	
				
}
}
