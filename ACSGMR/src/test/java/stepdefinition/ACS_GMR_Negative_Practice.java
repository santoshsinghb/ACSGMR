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

import Methods.CommonMethods;
import TestDataOperations.TestDataReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ACS_GMR_Negative_Practice {
	
	//private static final CharSequence AWB_ACSGMR_04 = "07072096";


		private static final String WebElement = null;
		private static final WebDriver Driver = null;
		public boolean verify;

		@When("I login with {string} user given in {string} sheet ACS_GMR_Practice")
		public void i_login_with_user_given_in_sheet_ACS_GMR_Practice(String entity, String sheetName) throws Throwable {
			Entity = entity;
			TestDataReader.ReadLoginDetails(Entity);
			Thread.sleep(500);
			System.out.println("usr= " + Username);
			System.out.println("pwd= " + Password);
			// loginScreen.isLoginScreenDisplayed();
			loginScreen.Login(Entity, Username, Password);
			Thread.sleep(4000);	
			
		}	
		
//		TC 5,6,17
		
		@Then("To verify user able to create Direct AWB in FF login ACS_GMR_Practice {string}")
		public void To_verify_user_able_to_create_Direct_AWB_in_FF_login_ACS_GMR_Practice(String mawbno_17) throws InterruptedException, AWTException {
		
		gmr.QuickASITab();Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.QuickASIMAWBNoPrefix);Thread.sleep(2000);
		gmr.QuickASIMAWBNoPrefix.sendKeys("999");Thread.sleep(2000);

		gmr.QuickASIMAWBNo.sendKeys(mawbno_17);
		Thread.sleep(2000);
		gmr.QuickASIForAadhya();
		Thread.sleep(2000);
		gmr.MAWBListInput.click();Thread.sleep(2000);
		gmr.MAWBListInput.sendKeys(mawbno_17);
		gmr.MAWBInput();
		gmr.MAWBASI();	
		gmr.CO();
		
		wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");

		Thread.sleep(1000);
		}
		
		
		@Then("To verify Airline login ACS_GMR_Practice {string}")
		public void To_verify_Airline_login_ACS_GMR_Practice(String mawbno_17) throws InterruptedException, AWTException {
			
			gmr.Airline();
			gmr.CartingOrderShipmentMAWBNo.sendKeys("999" + mawbno_17);
			Thread.sleep(2000);
			gmr.AirlineApprove();
			
			Thread.sleep(2000);
			wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");

			Thread.sleep(1000);
			
		}	
						
		
		@Then("^add 2SB details and generate single VT in CB login ACS_GMR_Practice$")
		public void add_2SB_details_and_generate_single_VT_in_CB_login_ACS_GMR_Practice() throws InterruptedException, AWTException {

			wm.JavascriptExecutorClick(driver, gmr.AllForAirline);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AllForAirlineOk);Thread.sleep(2000);
			
			Actions bondedaction = new Actions(driver);
			bondedaction.moveToElement(gmr.FFDropdownForAAdyaLogistics).perform();
			Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.FFCustomBroker);Thread.sleep(2000);
			
			
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
			gmr.SBNoOfPieces.sendKeys("6");Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.SBGrossWt);Thread.sleep(2000);
			gmr.SBGrossWt.sendKeys("60");Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.SBVolumetricWt);Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsNoPieces);Thread.sleep(2000);
			gmr.SBDimensionsNoPieces.sendKeys("6");Thread.sleep(2000);
			
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
		
			wm.JavascriptExecutorClick(driver, gmr.AddShippingBillDetails);Thread.sleep(2000);
			
			gmr.AddSB2();
		    
			wm.JavascriptExecutorClick(driver, gmr.SBDetailsAadhya);Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmr.SBASI);Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.SBASI2ndCheckbox);Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.SBASIProceed);Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.SBASIConfirmation);Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.SBASIOk);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.TSP);Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.EdocketMsg);Thread.sleep(2000);
			
			gmr.EDocket();
			
			gmr.TSP1(); 
			
			wm.JavascriptExecutorClick(driver, gmr.AddShipment);Thread.sleep(2000);
			
		   	
		    driver.switchTo().frame(0);Thread.sleep(1000);
		    
		
		    wm.JavascriptExecutorClick(driver, gmr.SBNumberInput);Thread.sleep(2000);
		    gmr.SBNumberInput.sendKeys("5467892");Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.SBNumberSearchBtn);Thread.sleep(2000);
		    
		    wm.JavascriptExecutorClick(driver, gmr.SBCheckBox);Thread.sleep(2000);
		    
		    wm.JavascriptExecutorClick(driver, gmr.AddBtnSBCheckBox);Thread.sleep(2000);
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
		wm.JavascriptExecutorClick(driver, gmr.VehicleTokenConfimationOkBtn);Thread.sleep(3000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBDetails1);Thread.sleep(40000);
		//gmr.SBDetails1.click();Thread.sleep(2000);
			
		gmr.TSP2(); 
        wm.JavascriptExecutorClick(driver, gmr.AddShipment);Thread.sleep(2000);
			
		   	
		 driver.switchTo().frame(0);Thread.sleep(1000);
		    
		
	     wm.JavascriptExecutorClick(driver, gmr.SBNumberInput);Thread.sleep(2000);
	     gmr.SBNumberInput.sendKeys("5467891");Thread.sleep(2000);
	     wm.JavascriptExecutorClick(driver, gmr.SBNumberSearchBtn);Thread.sleep(2000);
	    wm.JavascriptExecutorClick(driver, gmr.SBCheckBox);Thread.sleep(2000);
	    wm.JavascriptExecutorClick(driver, gmr.AddBtnSBCheckBox);Thread.sleep(2000);
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
		wm.JavascriptExecutorClick(driver, gmr.VehicleTokenConfimationOkBtn);Thread.sleep(4000);
		
		//wm.JavascriptExecutorClick(driver, gmr.SBDetails1);Thread.sleep(4000);
		
		//wm.JavascriptExecutorClick(driver, gmr.VehicleToken1);Thread.sleep(4000);
		
		//wm.JavascriptExecutorClick(driver, gmr.VehicleToken2);Thread.sleep(2000);
			
		//wm.JavascriptExecutorClick(driver, gmr.VehicleNumber);Thread.sleep(2000);
		//wm.JavascriptExecutorClick(driver, gmr.VehicleNumber);Thread.sleep(2000);
		//gmr.VehicleNumber.sendKeys("23459");Thread.sleep(2000);
		
		//Thread.sleep(8000);
		//wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");

		//Thread.sleep(1000);
		 }
		
		//TC 13,26,27,29,48,50,54,55,56,61,63,65,67
		
		@Then("To verify user able to create consol AWB in FF login add 1SB ACS_GMR_Practice {string}")
		public void To_verify_user_able_to_create_consol_AWB_in_FF_login_add_1SB_ACS_GMR_Practice(String mawbno_13) throws InterruptedException, AWTException {
		
			
			//gmr.AllRaadioBtn();Thread.sleep(2000);
			
			//gmr.AllRadioBtn.click();
			//Thread.sleep(2000);
			
			gmr.GmrHydRadioOKBtn.click();
			Thread.sleep(2000);
			
			gmr.QuickASITab();
			wm.JavascriptExecutorClick(driver, gmr.QuickASIMAWBNoPrefix);Thread.sleep(2000);
			gmr.QuickASIMAWBNoPrefix.sendKeys("999");Thread.sleep(2000);

			gmr.QuickASIMAWBNo.sendKeys(mawbno_13);
			Thread.sleep(3000);
			gmr.QuickASIConsoleForAadhya();
			Thread.sleep(2000);
			gmr.AddHAWBForAadhya();
			
			Actions action1 = new Actions(driver);
			action1.moveToElement(gmr.eAWBTab).perform();
			Thread.sleep(1000);
			gmr.MAWBList.click();Thread.sleep(2000);
			
			gmr.MAWBListInput.click();Thread.sleep(2000);
			gmr.MAWBListInput.sendKeys(mawbno_13);
			gmr.MAWBInput();
			gmr.MAWBASI();	Thread.sleep(2000);
			gmr.CO();
			
			Thread.sleep(8000);
			wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");

			Thread.sleep(3000);
		
		}
		
		
		
		@Then("To verify airline login ACS_GMR_Practice {string}")
		public void To_verify_airline_login_ACS_GMR_Practice(String mawbno_13) throws InterruptedException, AWTException {
		
			gmr.Airline();
			gmr.CartingOrderShipmentMAWBNo.sendKeys("999" + mawbno_13);
			Thread.sleep(2000);
			gmr.AirlineApprove();
			
			Thread.sleep(8000);
			wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");
			Thread.sleep(1000);
			
			
			
		}
		
		@Then("TSP process from airline login in CB login ACS_GMR_Practice {string}")
		public void TSP_process_from_airline_login_in_CB_login_ACS_GMR_Practice(String mawbno_13) throws InterruptedException, AWTException {
		
			gmr.AllRaadioBtn();Thread.sleep(1000);
			
			Actions bondedaction = new Actions(driver);
			bondedaction.moveToElement(gmr.FFDropdownForAAdyaLogistics).perform();
			Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.FFCustomBroker);
			Thread.sleep(1000);
		}
		
		@Then("To verify whether the user is able to do multiple SB ASI for all SB in CB login ACS_GMR_Practice {string}")
		public void To_verify_whether_the_user_is_able_to_do_multiple_SB_ASI_for_all_SB_in_CB_login_ACS_GMR_Practice(String mawbno_13) throws InterruptedException, AWTException {
			
			//ADDSB1
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
			gmr.SBNoOfPieces.sendKeys("2");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBGrossWt);Thread.sleep(2000);
			gmr.SBGrossWt.sendKeys("20");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBVolumetricWt);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsNoPieces);Thread.sleep(2000);
			gmr.SBDimensionsNoPieces.sendKeys("2");Thread.sleep(2000);
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
			wm.JavascriptExecutorClick(driver, gmr.AddShippingBillDetails);Thread.sleep(2000);
			
		//ADDSB2	
			wm.JavascriptExecutorClick(driver, gmr.AddSBNumber);Thread.sleep(4000);
			gmr.AddSBNumber.sendKeys("5467892");Thread.sleep(2000);
			//wm.JavascriptExecutorClick(driver, gmr.AddSBDate);Thread.sleep(2000);//18 May 2023
			wm.JavascriptExecutorClick(driver, gmr.AddCalendar);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddCalendarDateForQuickASI);Thread.sleep(3000);
			Select SelectSBTypeManual2 = new Select(gmr.AddSBTypeManual);Thread.sleep(500);
            SelectSBTypeManual2.selectByVisibleText("Manual");Thread.sleep(500);
			//wm.JavascriptExecutorClick(driver, gmr.AddSBTypeManual);Thread.sleep(2000);
			gmr.AddSBNoOfPieces.click();Thread.sleep(2000);
			gmr.AddSBNoOfPieces.sendKeys("2");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBGrossWt);Thread.sleep(2000);
			gmr.AddSBGrossWt.sendKeys("20");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBVolumetricWt);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsNoPieces);Thread.sleep(2000);
			gmr.SBDimensionsNoPieces.sendKeys("2");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionslength);Thread.sleep(2000);
			gmr.SBDimensionslength.sendKeys("14");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionswidth);Thread.sleep(2000);
			gmr.SBDimensionswidth.sendKeys("15");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsHeight);Thread.sleep(2000);
			gmr.SBDimensionsHeight.sendKeys("30");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsVolumeCBM);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsOkBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.ChargeableGrossWt);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddFOBValue);Thread.sleep(2000);
			gmr.AddFOBValue.sendKeys(cm.RandomNo(4));Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddExporterName);Thread.sleep(2000);
			gmr.AddExporterName.sendKeys("ADVIK");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddShippingBillDetails);Thread.sleep(2000);
			
	//ADDSB3
			
			wm.JavascriptExecutorClick(driver, gmr.AddSBNumber3);Thread.sleep(4000);
			gmr.AddSBNumber3.sendKeys("5467893");Thread.sleep(2000);
			//wm.JavascriptExecutorClick(driver, gmr.AddSBDate);Thread.sleep(2000);//18 May 2023
			wm.JavascriptExecutorClick(driver, gmr.AddCalendar3);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddCalendarDateForQuickASI);Thread.sleep(3000);
			Select SelectSBTypeManual3 = new Select(gmr.AddSBTypeManual3);Thread.sleep(500);
            SelectSBTypeManual3.selectByVisibleText("Manual");Thread.sleep(500);
			//wm.JavascriptExecutorClick(driver, gmr.AddSBTypeManual);Thread.sleep(2000);
			gmr.AddSBNoOfPieces3.click();Thread.sleep(2000);
			gmr.AddSBNoOfPieces3.sendKeys("2");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBGrossWt3);Thread.sleep(2000);
			gmr.AddSBGrossWt3.sendKeys("20");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBVolumetricWt3);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsNoPieces);Thread.sleep(2000);
			gmr.SBDimensionsNoPieces.sendKeys("2");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionslength);Thread.sleep(2000);
			gmr.SBDimensionslength.sendKeys("14");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionswidth);Thread.sleep(2000);
			gmr.SBDimensionswidth.sendKeys("15");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsHeight);Thread.sleep(2000);
			gmr.SBDimensionsHeight.sendKeys("30");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsVolumeCBM);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsOkBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.ChargeableGrossWt);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddFOBValue3);Thread.sleep(2000);
			gmr.AddFOBValue3.sendKeys(cm.RandomNo(4));Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddExporterName3);Thread.sleep(2000);
			gmr.AddExporterName3.sendKeys("ADVIK");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddShippingBillDetails);Thread.sleep(2000);
			
			
			//ADDSB4
			
			wm.JavascriptExecutorClick(driver, gmr.AddSBNumber4);Thread.sleep(4000);
			gmr.AddSBNumber4.sendKeys("5467894");Thread.sleep(2000);
			//wm.JavascriptExecutorClick(driver, gmr.AddSBDate);Thread.sleep(2000);//18 May 2023
			wm.JavascriptExecutorClick(driver, gmr.AddCalendar4);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddCalendarDateForQuickASI);Thread.sleep(3000);
			Select SelectSBTypeManual4 = new Select(gmr.AddSBTypeManual4);Thread.sleep(500);
            SelectSBTypeManual4.selectByVisibleText("Manual");Thread.sleep(500);
			//wm.JavascriptExecutorClick(driver, gmr.AddSBTypeManual);Thread.sleep(2000);
			gmr.AddSBNoOfPieces4.click();Thread.sleep(2000);
			gmr.AddSBNoOfPieces4.sendKeys("3");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBGrossWt4);Thread.sleep(2000);
			gmr.AddSBGrossWt4.sendKeys("30");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBVolumetricWt4);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsNoPieces);Thread.sleep(2000);
			gmr.SBDimensionsNoPieces.sendKeys("3");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionslength);Thread.sleep(2000);
			gmr.SBDimensionslength.sendKeys("14");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionswidth);Thread.sleep(2000);
			gmr.SBDimensionswidth.sendKeys("15");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsHeight);Thread.sleep(2000);
			gmr.SBDimensionsHeight.sendKeys("30");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsVolumeCBM);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsOkBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.ChargeableGrossWt);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddFOBValue4);Thread.sleep(2000);
			gmr.AddFOBValue4.sendKeys(cm.RandomNo(4));Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddExporterName4);Thread.sleep(2000);
			gmr.AddExporterName4.sendKeys("ADVIK");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddShippingBillDetails);Thread.sleep(2000);
			
			//ADDSB5
			
			wm.JavascriptExecutorClick(driver, gmr.AddSBNumber5);Thread.sleep(4000);
			gmr.AddSBNumber5.sendKeys("5467895");Thread.sleep(2000);
			//wm.JavascriptExecutorClick(driver, gmr.AddSBDate);Thread.sleep(2000);//18 May 2023
			wm.JavascriptExecutorClick(driver, gmr.AddCalendar5);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddCalendarDateForQuickASI);Thread.sleep(3000);
			Select SelectSBTypeManual5 = new Select(gmr.AddSBTypeManual5);Thread.sleep(500);
            SelectSBTypeManual5.selectByVisibleText("Manual");Thread.sleep(500);
			//wm.JavascriptExecutorClick(driver, gmr.AddSBTypeManual);Thread.sleep(2000);
			gmr.AddSBNoOfPieces5.click();Thread.sleep(2000);
			gmr.AddSBNoOfPieces5.sendKeys("3");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBGrossWt5);Thread.sleep(2000);
			gmr.AddSBGrossWt5.sendKeys("30");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBVolumetricWt5);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsNoPieces);Thread.sleep(2000);
			gmr.SBDimensionsNoPieces.sendKeys("3");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionslength);Thread.sleep(2000);
			gmr.SBDimensionslength.sendKeys("14");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionswidth);Thread.sleep(2000);
			gmr.SBDimensionswidth.sendKeys("15");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsHeight);Thread.sleep(2000);
			gmr.SBDimensionsHeight.sendKeys("30");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsVolumeCBM);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsOkBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.ChargeableGrossWt);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddFOBValue5);Thread.sleep(2000);
			gmr.AddFOBValue5.sendKeys(cm.RandomNo(4));Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddExporterName5);Thread.sleep(2000);
			gmr.AddExporterName5.sendKeys("ADVIK");Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.SBSaveBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBOk);
			Thread.sleep(1000);
		}
		
		@Then("To verify whether the user is able to delete SB details of existing SB before doing SB ASI from CB login ACS_GMR_Practice {string}")
		public void To_verify_whether_the_user_is_able_to_delete_SB_details_of_existing_SB_before_doing_SB_ASI_from_CB_login_ACS_GMR_Practice(String mawbno_13) throws InterruptedException, AWTException {
		
			wm.JavascriptExecutorClick(driver, gmr.AddSB);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBDeleteBtn5);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBDeleteConfirmationBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBSaveBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBOk);
			Thread.sleep(1000);
		
		}
		
		@Then("To verify whether the user is able to edit SB details of existing SB before doing SB ASI from CB login ACS_GMR_Practice {string}")
		public void To_verify_whether_the_user_is_able_to_edit_SB_details_of_existing_SB_before_doing_SB_ASI_from_CB_login_ACS_GMR_Practice(String mawbno_13) throws InterruptedException, AWTException {
			
			wm.JavascriptExecutorClick(driver, gmr.AddSB);Thread.sleep(4000);
			gmr.AddFOBValue3.clear();Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddFOBValue3);Thread.sleep(2000);
			gmr.AddFOBValue3.sendKeys(cm.RandomNo(4));Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBSaveBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBOk);Thread.sleep(2000);
			
			//SBDetails
			
			wm.JavascriptExecutorClick(driver, gmr.SBDetailsAadhya);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmr.SBASI);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBASICheck2);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBASIProceed);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBASIConfirmation);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBASIOk);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.TSP);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.EdocketMsg);
			Thread.sleep(1000);
			}
		
		@Then("To verify whether the user is able to delete SB details of existing SB after doing SB ASI from CB login ACS_GMR_Practice {string}")
		public void To_verify_whether_the_user_is_able_to_delete_SB_details_of_existing_SB_after_doing_SB_ASI_from_CB_login_ACS_GMR_Practice(String mawbno_13) throws InterruptedException, AWTException {
		
			wm.JavascriptExecutorClick(driver, gmr.AddSB);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBDeleteBtn4);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBDeleteConfirmationBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBSaveBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBOk);
			Thread.sleep(1000);
			
		}
			
			
			@Then("To verify whether the user is able to edit SB details of existing SB after doing SB ASI from CB login ACS_GMR_Practice {string}")
			public void To_verify_whether_the_user_is_able_to_edit_SB_details_of_existing_SB_after_doing_SB_ASI_from_CB_login_ACS_GMR_Practice(String mawbno_13) throws InterruptedException, AWTException {
			
			//wm.JavascriptExecutorClick(driver, gmr.SBDetailsAadhya);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmr.AddSB);Thread.sleep(4000);
			gmr.AddExporterName3.clear();Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddExporterName3);Thread.sleep(2000);
			gmr.AddExporterName3.sendKeys("ADDHYA");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBSaveBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBOk);Thread.sleep(2000);
				
			gmr.EDocket();
		    
			gmr.TSP1();
			wm.JavascriptExecutorClick(driver, gmr.VehicleTokenBackBtn);Thread.sleep(2000);
			gmr.TSP2();
			wm.JavascriptExecutorClick(driver, gmr.VehicleTokenBackBtn);
			Thread.sleep(1000);
		}
			
			
			@Then("To verify whether the system allow the user to do SB ASI for submitted SB ASI TSP done for 2 SB Addition of 3rd SB and Submission of SB ASI in CB login ACS_GMR_Practice {string}")
			public void To_verify_whether_the_system_allow_the_user_to_do_SB_ASI_for_submitted_SB_ASI_TSP_done_for_2_SB_Addition_of_3rd_SB_and_Submission_of_SB_ASI_in_CB_login_ACS_GMR_Practice(String mawbno_13) throws InterruptedException, AWTException {
			
				
			wm.JavascriptExecutorClick(driver, gmr.SBDetailsAadhya);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmr.SBASI3);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBASIProceed);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBASIConfirmation);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBASIOk);Thread.sleep(2000);
			
			gmr.TSP3.click();Thread.sleep(2000);
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
			Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.HSNCode);Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.TransactionPaswrd);Thread.sleep(2000);
			gmr.TransactionPaswrd.sendKeys("12345678");Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.TSPPayNow);Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.PaymentConfimationOkBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.TokenConfimationOkBtn);Thread.sleep(4000);

			wm.JavascriptExecutorClick(driver, gmr.VehicleTokenBackBtn);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmr.SBDetailsAadhya);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmr.UsedTSP);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.TSPPrint);Thread.sleep(2000);
			
			Set<String> allwindowid = driver.getWindowHandles();
		    Object[] windows = allwindowid.toArray();
		    String window2 = windows[0].toString();        
		    driver.switchTo().window(window2); 
		    System.out.println(allwindowid);
		    System.out.println(window2);
		    Thread.sleep(8000);
		    
		    String window1 = windows[0].toString();
		    driver.switchTo().window(window1);
		    System.out.println(window1);
		    Thread.sleep(5000);
		    
		    wm.JavascriptExecutorClick(driver, gmr.TSPPaymentClose);
		    Thread.sleep(1000);
		}
		    
		    @Then("To verify user able to create consol AWB in FF login add 1SB and generate multiple VT in CB login or not ACS_GMR_Practice {string}")
			public void To_verify_user_able_to_create_consol_AWB_in_FF_login_add_1SB_and_generate_multiple_VT_in_CB_login_or_not_ACS_GMR_Practice(String mawbno_13) throws InterruptedException, AWTException {  
		    
		    
		    wm.JavascriptExecutorClick(driver, gmr.VehicleToken);Thread.sleep(4000);
		    
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
			wm.JavascriptExecutorClick(driver, gmr.VTNOP);Thread.sleep(2000);
			gmr.VTNOP.clear();Thread.sleep(2000);
			gmr.VTNOP.sendKeys("1");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.VTGrossWT);Thread.sleep(2000);
			gmr.VTGrossWT.clear();Thread.sleep(2000);
			gmr.VTGrossWT.sendKeys("10");Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.VehicleTokenAddBtn);Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.VehicleNumber2);Thread.sleep(2000);
			gmr.VehicleNumber2.sendKeys("23458");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.DriverLicenseNo2);Thread.sleep(2000);
			gmr.DriverLicenseNo2.sendKeys("64572365");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.DriverName2);Thread.sleep(2000);
			gmr.DriverName2.sendKeys("Ajeet");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.DriverMobNo2);Thread.sleep(2000);
			gmr.DriverMobNo2.sendKeys(cm.RandomNo(10));Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AgentMobNo2);Thread.sleep(2000);
			gmr.AgentMobNo2.sendKeys(cm.RandomNo(10));Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.VTNOP2);Thread.sleep(2000);
			gmr.VTNOP2.clear();Thread.sleep(2000);
			gmr.VTNOP2.sendKeys("1");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.VTGrossWT2);Thread.sleep(2000);
			gmr.VTGrossWT2.clear();Thread.sleep(2000);
			gmr.VTGrossWT2.sendKeys("10");Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.GenerateToken);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.VehicleTokenConfimationOkBtn);
			Thread.sleep(1000);
		    }
		    
		    
		    @Then("To verify whether the user is able to view the TSP and VT Print as well as in CB login ACS_GMR_Practice {string}")
			public void To_verify_whether_the_user_is_able_to_view_the_TSP_and_VT_Print_as_well_as_in_CB_login_ACS_GMR_Practice(String mawbno_13) throws InterruptedException, AWTException {  
		    
		    
		    wm.JavascriptExecutorClick(driver, gmr.SBDetailsAadhya);Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.VehicleToken);Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.VehicleTokenPrintAll);Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.VehicleTokenTSPVT);Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.VehicleTokenOnlyVTPrint);Thread.sleep(2000);
		    
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
		    Thread.sleep(2000);
		    }
		    
		    
		    @Then("VT print from CB login ACS_GMR_Practice {string}")
			public void VT_print_from_CB_login_ACS_GMR_Practice(String mawbno_13) throws InterruptedException, AWTException { 	    
		    
		    	wm.JavascriptExecutorClick(driver, gmr.VehicleTokenPrintAll);Thread.sleep(2000);
			    wm.JavascriptExecutorClick(driver, gmr.VehicleTokenOnlyVT);Thread.sleep(2000);
			    wm.JavascriptExecutorClick(driver, gmr.VehicleTokenOnlyVTPrint);Thread.sleep(2000);
			    
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
		    	
			    wm.JavascriptExecutorClick(driver, gmr.UsedVehicleTokenBackBtn);Thread.sleep(2000);
			    verify = wm.isElementPresent(driver, gmr.Delete);Thread.sleep(2000);
	            CommonMethods.Verify1(verify, true);
	            Thread.sleep(2000);
		    
		    }
		
		
		@Then("To verify whether the user is able to rejection of CO till TSP process from airline login ACS_GMR_Practice {string}")
		public void To_verify_whether_the_user_is_able_to_rejection_of_CO_till_TSP_process_from_airline_login_ACS_GMR_Practice(String mawbno_39) throws InterruptedException, AWTException {
		
			Thread.sleep(8000);
			wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");

			Thread.sleep(1000);
		
		}
		
		//For FF Login
		
		@Then("To verify whether the user is able to rejection of CO from airline login ACS_GMR_Practice {string}")
		public void To_verify_whether_the_user_is_able_to_rejection_of_CO_from_airline_login_ACS_GMR_Practice(String mawbno_39) throws InterruptedException, AWTException {
		
			gmr.QuickASITab();
			wm.JavascriptExecutorClick(driver, gmr.QuickASIMAWBNoPrefix);Thread.sleep(2000);
			gmr.QuickASIMAWBNoPrefix.sendKeys("999");Thread.sleep(2000);

			gmr.QuickASIMAWBNo.sendKeys(mawbno_39);
			Thread.sleep(2000);
			gmr.QuickASIForAdvik();
			Thread.sleep(2000);
			gmr.MAWBListInput.click();Thread.sleep(2000);
			gmr.MAWBListInput.sendKeys(mawbno_39);
			gmr.MAWBInput();
			gmr.MAWBASI();	
			gmr.CO();
			
			Thread.sleep(8000);
			wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");

			Thread.sleep(8000);
		
		}
		
		@Then("To verify rejection of airline login ACS_GMR_Practice {string}")
		public void To_verify_rejection_of_airline_login_ACS_GMR_Practice(String mawbno_39) throws InterruptedException, AWTException {
			
			gmr.Airline();
			gmr.CartingOrderShipmentMAWBNo.sendKeys("999" + mawbno_39);
			Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNoSearchBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.Action);Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmr.Reject);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.RejectionReason);Thread.sleep(2000);
			gmr.RejectionReason.sendKeys("want to another flight");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.RejectionReasonSubmit);Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.RejectedOk);Thread.sleep(4000);
			
			Thread.sleep(8000);
			wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");

			Thread.sleep(1000);
			
			
			
		}
		
		@Then("To verify whether the user is able to rejection of CO ACS_GMR_Practice {string}")
		public void To_verify_whether_the_user_is_able_to_rejection_of_CO_ACS_GMR_Practice(String mawbno_39) throws InterruptedException, AWTException {
		
			gmr.AllRaadioBtn();Thread.sleep(1000);
			gmr.MAWBListInput.click();Thread.sleep(2000);
			gmr.MAWBListInput.sendKeys(mawbno_39);
			gmr.MAWBInput();
			wm.JavascriptExecutorClick(driver, gmr.CO);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.COYesBtn);Thread.sleep(1000);
			wm.JavascriptExecutorClick(driver, gmr.COOkBtn);Thread.sleep(1000);
			Thread.sleep(8000);
			wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");
			Thread.sleep(1000);
			
			
			
		}
		
		@Then("till TSP process from airline login ACS_GMR_Practice {string}")
		public void till_TSP_process_from_airline_login_ACS_GMR_Practice(String mawbno_39) throws InterruptedException, AWTException {
			gmr.Airline();
			
			gmr.CartingOrderShipmentMAWBNo.sendKeys("999" + mawbno_39);
			Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNoSearchBtn);Thread.sleep(2000);
		
		    wm.JavascriptExecutorClick(driver, gmr.Action);Thread.sleep(4000);
		    gmr.FlightNo.clear();Thread.sleep(2000);
		    gmr.FlightNo.sendKeys("45678");Thread.sleep(2000);
		
		    wm.JavascriptExecutorClick(driver, gmr.Approve);Thread.sleep(4000);
		
		    wm.JavascriptExecutorClick(driver, gmr.ApproveOk);Thread.sleep(4000);
			
			Thread.sleep(8000);
			wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");
			Thread.sleep(1000);
			
			
		}
		
		@Then("TSP process from airline login ACS_GMR_Practice {string}")
		public void TSP_process_from_airline_login_ACS_GMR_Practice(String mawbno_39) throws InterruptedException, AWTException {
		
			gmr.AllRaadioBtn();Thread.sleep(1000);
			gmr.MAWBListInput.click();Thread.sleep(2000);
			gmr.MAWBListInput.sendKeys(mawbno_39);
			gmr.MAWBInput();
			Thread.sleep(1000);
		}
		
		@Then("To verify whether the user is able to do multiple SB ASI for all SB ACS_GMR_Practice {string}")
		public void To_verify_whether_the_user_is_able_to_do_multiple_SB_ASI_for_all_SB_ACS_GMR_Practice(String mawbno_39) throws InterruptedException, AWTException {
			
			//ADDSB1
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
			gmr.SBNoOfPieces.sendKeys("2");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBGrossWt);Thread.sleep(2000);
			gmr.SBGrossWt.sendKeys("20");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBVolumetricWt);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsNoPieces);Thread.sleep(2000);
			gmr.SBDimensionsNoPieces.sendKeys("2");Thread.sleep(2000);
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
			wm.JavascriptExecutorClick(driver, gmr.AddShippingBillDetails);Thread.sleep(2000);
			
		//ADDSB2	
			wm.JavascriptExecutorClick(driver, gmr.AddSBNumber);Thread.sleep(4000);
			gmr.AddSBNumber.sendKeys("5467892");Thread.sleep(2000);
			//wm.JavascriptExecutorClick(driver, gmr.AddSBDate);Thread.sleep(2000);//18 May 2023
			wm.JavascriptExecutorClick(driver, gmr.AddCalendar);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddCalendarDateForQuickASI);Thread.sleep(3000);
			Select SelectSBTypeManual2 = new Select(gmr.AddSBTypeManual);Thread.sleep(500);
            SelectSBTypeManual2.selectByVisibleText("Manual");Thread.sleep(500);
			//wm.JavascriptExecutorClick(driver, gmr.AddSBTypeManual);Thread.sleep(2000);
			gmr.AddSBNoOfPieces.click();Thread.sleep(2000);
			gmr.AddSBNoOfPieces.sendKeys("2");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBGrossWt);Thread.sleep(2000);
			gmr.AddSBGrossWt.sendKeys("20");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBVolumetricWt);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsNoPieces);Thread.sleep(2000);
			gmr.SBDimensionsNoPieces.sendKeys("2");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionslength);Thread.sleep(2000);
			gmr.SBDimensionslength.sendKeys("14");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionswidth);Thread.sleep(2000);
			gmr.SBDimensionswidth.sendKeys("15");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsHeight);Thread.sleep(2000);
			gmr.SBDimensionsHeight.sendKeys("30");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsVolumeCBM);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsOkBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.ChargeableGrossWt);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddFOBValue);Thread.sleep(2000);
			gmr.AddFOBValue.sendKeys(cm.RandomNo(4));Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddExporterName);Thread.sleep(2000);
			gmr.AddExporterName.sendKeys("ADVIK");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddShippingBillDetails);Thread.sleep(2000);
			
	//ADDSB3
			
			wm.JavascriptExecutorClick(driver, gmr.AddSBNumber3);Thread.sleep(4000);
			gmr.AddSBNumber3.sendKeys("5467893");Thread.sleep(2000);
			//wm.JavascriptExecutorClick(driver, gmr.AddSBDate);Thread.sleep(2000);//18 May 2023
			wm.JavascriptExecutorClick(driver, gmr.AddCalendar3);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddCalendarDateForQuickASI);Thread.sleep(3000);
			Select SelectSBTypeManual3 = new Select(gmr.AddSBTypeManual3);Thread.sleep(500);
            SelectSBTypeManual3.selectByVisibleText("Manual");Thread.sleep(500);
			//wm.JavascriptExecutorClick(driver, gmr.AddSBTypeManual);Thread.sleep(2000);
			gmr.AddSBNoOfPieces3.click();Thread.sleep(2000);
			gmr.AddSBNoOfPieces3.sendKeys("2");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBGrossWt3);Thread.sleep(2000);
			gmr.AddSBGrossWt3.sendKeys("20");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBVolumetricWt3);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsNoPieces);Thread.sleep(2000);
			gmr.SBDimensionsNoPieces.sendKeys("2");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionslength);Thread.sleep(2000);
			gmr.SBDimensionslength.sendKeys("14");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionswidth);Thread.sleep(2000);
			gmr.SBDimensionswidth.sendKeys("15");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsHeight);Thread.sleep(2000);
			gmr.SBDimensionsHeight.sendKeys("30");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsVolumeCBM);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsOkBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.ChargeableGrossWt);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddFOBValue3);Thread.sleep(2000);
			gmr.AddFOBValue3.sendKeys(cm.RandomNo(4));Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddExporterName3);Thread.sleep(2000);
			gmr.AddExporterName3.sendKeys("ADVIK");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddShippingBillDetails);Thread.sleep(2000);
			
			
			//ADDSB4
			
			wm.JavascriptExecutorClick(driver, gmr.AddSBNumber4);Thread.sleep(4000);
			gmr.AddSBNumber4.sendKeys("5467894");Thread.sleep(2000);
			//wm.JavascriptExecutorClick(driver, gmr.AddSBDate);Thread.sleep(2000);//18 May 2023
			wm.JavascriptExecutorClick(driver, gmr.AddCalendar4);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddCalendarDateForQuickASI);Thread.sleep(3000);
			Select SelectSBTypeManual4 = new Select(gmr.AddSBTypeManual4);Thread.sleep(500);
            SelectSBTypeManual4.selectByVisibleText("Manual");Thread.sleep(500);
			//wm.JavascriptExecutorClick(driver, gmr.AddSBTypeManual);Thread.sleep(2000);
			gmr.AddSBNoOfPieces4.click();Thread.sleep(2000);
			gmr.AddSBNoOfPieces4.sendKeys("3");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBGrossWt4);Thread.sleep(2000);
			gmr.AddSBGrossWt4.sendKeys("30");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBVolumetricWt4);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsNoPieces);Thread.sleep(2000);
			gmr.SBDimensionsNoPieces.sendKeys("3");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionslength);Thread.sleep(2000);
			gmr.SBDimensionslength.sendKeys("14");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionswidth);Thread.sleep(2000);
			gmr.SBDimensionswidth.sendKeys("15");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsHeight);Thread.sleep(2000);
			gmr.SBDimensionsHeight.sendKeys("30");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsVolumeCBM);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsOkBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.ChargeableGrossWt);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddFOBValue4);Thread.sleep(2000);
			gmr.AddFOBValue4.sendKeys(cm.RandomNo(4));Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddExporterName4);Thread.sleep(2000);
			gmr.AddExporterName4.sendKeys("ADVIK");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddShippingBillDetails);Thread.sleep(2000);
			
			//ADDSB5
			
			wm.JavascriptExecutorClick(driver, gmr.AddSBNumber5);Thread.sleep(4000);
			gmr.AddSBNumber5.sendKeys("5467895");Thread.sleep(2000);
			//wm.JavascriptExecutorClick(driver, gmr.AddSBDate);Thread.sleep(2000);//18 May 2023
			wm.JavascriptExecutorClick(driver, gmr.AddCalendar5);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddCalendarDateForQuickASI);Thread.sleep(3000);
			Select SelectSBTypeManual5 = new Select(gmr.AddSBTypeManual5);Thread.sleep(500);
            SelectSBTypeManual5.selectByVisibleText("Manual");Thread.sleep(500);
			//wm.JavascriptExecutorClick(driver, gmr.AddSBTypeManual);Thread.sleep(2000);
			gmr.AddSBNoOfPieces5.click();Thread.sleep(2000);
			gmr.AddSBNoOfPieces5.sendKeys("3");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBGrossWt5);Thread.sleep(2000);
			gmr.AddSBGrossWt5.sendKeys("30");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBVolumetricWt5);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsNoPieces);Thread.sleep(2000);
			gmr.SBDimensionsNoPieces.sendKeys("3");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionslength);Thread.sleep(2000);
			gmr.SBDimensionslength.sendKeys("14");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionswidth);Thread.sleep(2000);
			gmr.SBDimensionswidth.sendKeys("15");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsHeight);Thread.sleep(2000);
			gmr.SBDimensionsHeight.sendKeys("30");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsVolumeCBM);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDimensionsOkBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.ChargeableGrossWt);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddFOBValue5);Thread.sleep(2000);
			gmr.AddFOBValue5.sendKeys(cm.RandomNo(4));Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddExporterName5);Thread.sleep(2000);
			gmr.AddExporterName5.sendKeys("ADVIK");Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.SBSaveBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBOk);
			Thread.sleep(2000);
		}
		
		@Then("To verify whether the user is able to delete SB details of existing SB before doing SB ASI from FF login ACS_GMR_Practice {string}")
		public void To_verify_whether_the_user_is_able_to_delete_SB_details_of_existing_SB_before_doing_SB_ASI_from_FF_login_ACS_GMR_Practice(String mawbno_39) throws InterruptedException, AWTException {
		
			wm.JavascriptExecutorClick(driver, gmr.AddSB);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBDeleteBtn5);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBDeleteConfirmationBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBSaveBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBOk);
			Thread.sleep(2000);
		
		}
		
		@Then("To verify whether the user is able to edit SB details of existing SB before doing SB ASI from FF login ACS_GMR_Practice {string}")
		public void To_verify_whether_the_user_is_able_to_edit_SB_details_of_existing_SB_before_doing_SB_ASI_from_FF_login_ACS_GMR_Practice(String mawbno_39) throws InterruptedException, AWTException {
			
			wm.JavascriptExecutorClick(driver, gmr.AddSB);Thread.sleep(4000);
			gmr.AddFOBValue3.clear();Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddFOBValue3);Thread.sleep(2000);
			gmr.AddFOBValue3.sendKeys(cm.RandomNo(4));Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBSaveBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBOk);Thread.sleep(2000);
			
			//SBDetails
			
			wm.JavascriptExecutorClick(driver, gmr.SBDetailsAadhya);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmr.SBASI);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBASICheck2);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBASIProceed);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBASIConfirmation);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBASIOk);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.TSP);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.EdocketMsg);
			Thread.sleep(2000);
			}
		
		@Then("To verify whether the user is able to delete SB details of existing SB after doing SB ASI from FF login ACS_GMR_Practice {string}")
		public void To_verify_whether_the_user_is_able_to_delete_SB_details_of_existing_SB_after_doing_SB_ASI_from_FF_login_ACS_GMR_Practice(String mawbno_39) throws InterruptedException, AWTException {
		
			wm.JavascriptExecutorClick(driver, gmr.AddSB);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBDeleteBtn4);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddSBDeleteConfirmationBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBSaveBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBOk);
			Thread.sleep(2000);
			
		}
			
			
			@Then("To verify whether the user is able to edit SB details of existing SB after doing SB ASI from FF login ACS_GMR_Practice {string}")
			public void To_verify_whether_the_user_is_able_to_edit_SB_details_of_existing_SB_after_doing_SB_ASI_from_FF_login_ACS_GMR_Practice(String mawbno_39) throws InterruptedException, AWTException {
			
			//wm.JavascriptExecutorClick(driver, gmr.SBDetailsAadhya);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmr.AddSB);Thread.sleep(4000);
			gmr.AddExporterName3.clear();Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.AddExporterName3);Thread.sleep(2000);
			gmr.AddExporterName3.sendKeys("ADDHYA");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBSaveBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBOk);Thread.sleep(2000);
				
			gmr.EDocket();
			gmr.TSP1();
			wm.JavascriptExecutorClick(driver, gmr.VehicleTokenBackBtn);Thread.sleep(2000);
			gmr.TSP2();
			wm.JavascriptExecutorClick(driver, gmr.VehicleTokenBackBtn);
			Thread.sleep(2000);
		}
			
			
			@Then("To verify whether the system allow the user to do SB ASI for submitted SB ASI TSP done for 2 SB Addition of 3rd SB and Submission of SB ASI ACS_GMR_Practice {string}")
			public void To_verify_whether_the_system_allow_the_user_to_do_SB_ASI_for_submitted_SB_ASI_TSP_done_for_2_SB_Addition_of_3rd_SB_and_Submission_of_SB_ASI_ACS_GMR_Practice(String mawbno_39) throws InterruptedException, AWTException {
			
				
			wm.JavascriptExecutorClick(driver, gmr.SBDetailsAadhya);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmr.SBASI3);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBASIProceed);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBASIConfirmation);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBASIOk);Thread.sleep(2000);
			
			gmr.TSP3.click();Thread.sleep(2000);
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
			Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.HSNCode);Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.TransactionPaswrd);Thread.sleep(2000);
			gmr.TransactionPaswrd.sendKeys("12345678");Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.TSPPayNow);Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.PaymentConfimationOkBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.TokenConfimationOkBtn);Thread.sleep(2000);

			wm.JavascriptExecutorClick(driver, gmr.VehicleTokenBackBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.SBDetailsAadhya);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmr.UsedTSP);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.TSPPrint);Thread.sleep(2000);
			
			Set<String> allwindowid = driver.getWindowHandles();
		    Object[] windows = allwindowid.toArray();
		    String window2 = windows[0].toString();        
		    driver.switchTo().window(window2); 
		    System.out.println(allwindowid);
		    System.out.println(window2);
		    Thread.sleep(8000);
		    
		    String window1 = windows[0].toString();
		    driver.switchTo().window(window1);
		    System.out.println(window1);
		    Thread.sleep(5000);
		    
		    wm.JavascriptExecutorClick(driver, gmr.TSPPaymentClose);
		    Thread.sleep(2000);
		}
		    
		    @Then("To verify whether the user is able to view the TSP and VT Print as well as ACS_GMR_Practice {string}")
			public void To_verify_whether_the_user_is_able_to_view_the_TSP_and_VT_Print_as_well_as_ACS_GMR_Practice(String mawbno_39) throws InterruptedException, AWTException {  
		    
		    
		    wm.JavascriptExecutorClick(driver, gmr.VehicleToken);Thread.sleep(4000);
		    gmr.VehicleToken();
		    
		    wm.JavascriptExecutorClick(driver, gmr.SBDetailsAadhya);Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.VehicleToken);Thread.sleep(3000);
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,250)", "");
		    gmr.EditVehicleToken.click();Thread.sleep(2000);
		    gmr.DriverName.clear();Thread.sleep(2000);
		    gmr.DriverName.sendKeys("John");Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.EditedVehicleTokenSaveBtn);Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.EditedVehicleTokenOkBtn);Thread.sleep(2000);
		    
		    wm.JavascriptExecutorClick(driver, gmr.SBDetailsAadhya);Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.VehicleToken);Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.VehicleTokenPrintAll);Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.VehicleTokenTSPVT);Thread.sleep(2000);
		    wm.JavascriptExecutorClick(driver, gmr.VehicleTokenOnlyVTPrint);Thread.sleep(2000);
		    
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
		    Thread.sleep(500);
		    }
		    
		    
		    @Then("VT print from FF login ACS_GMR_Practice {string}")
			public void VT_print_from_FF_login_ACS_GMR_Practice(String mawbno_39) throws InterruptedException, AWTException { 	    
		    
		    	wm.JavascriptExecutorClick(driver, gmr.VehicleTokenPrintAll);Thread.sleep(2000);
			    wm.JavascriptExecutorClick(driver, gmr.VehicleTokenOnlyVT);Thread.sleep(2000);
			    wm.JavascriptExecutorClick(driver, gmr.VehicleTokenOnlyVTPrint);Thread.sleep(2000);
			    
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
		    	
//			    verify = wm.isElementPresent(driver, gmr.Delete);Thread.sleep(2000);
//	            CommonMethods.Verify1(verify, true);Thread.sleep(2000);
		    	
		    	
		    Thread.sleep(8000);
			wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");
			Thread.sleep(500);
			
		}
		
		@Then("To verify whether the user is able to rejection of CO from Airline login or not for those AWB TSP already process ACS_GMR_Practice {string}")
		public void To_verify_whether_the_user_is_able_to_rejection_of_CO_from_Airline_login_or_not_for_those_AWB_TSP_already_process_ACS_GMR_Practice_ACS_GMR_Practice(String mawbno_39) throws InterruptedException, AWTException {
		
            gmr.Airline();
			
			gmr.CartingOrderShipmentMAWBNo.sendKeys("999" + mawbno_39);
			Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNoSearchBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.Action);Thread.sleep(4000);
			
			//wm.JavascriptExecutorClick(driver, gmr.AirlineFlightNo);Thread.sleep(4000);
			//gmr.AirlineFlightNo.clear();Thread.sleep(2000);
			//gmr.AirlineFlightNo.sendKeys("5678");Thread.sleep(2000);
			
			//wm.JavascriptExecutorClick(driver, gmr.Approve);Thread.sleep(4000);
			
			//wm.JavascriptExecutorClick(driver, gmr.ApproveOk);Thread.sleep(4000);
			Thread.sleep(4000);
		}
		}
