package stepdefinition;

import static Helper.BaseObjects.go;
import static Helper.BaseObjects.gmr;
import static Helper.BaseObjects.gmrImport;
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
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.graphbuilder.math.Expression;

import Methods.CommonMethods;
import Methods.WebDriverMethod;
import TestDataOperations.TestDataReader;
import groovyjarjarantlr.collections.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ACS_GMR_Import {


	private static final String WebElement = null;
	private static final WebDriver Driver = null;
	public boolean verify;
	private String entity;
	
	
	
	
	@When("I login with {string} user given in {string} sheet ACS_GMR_Import")
	public void i_login_with_user_given_in_sheet_ACS_GMR_Import(String entity, String sheetName) throws Throwable {
		//gmrImport.CloseBtn.click();
		Thread.sleep(4000);
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(6000);	
		
		
	}
	
	@Given("^To verify whether user is able to create Direct Shipment from Add MAWB/HAWB screen ACS_GMR_Import$")
	public void To_verify_whether_user_is_able_to_create_Direct_Shipment_from_Add_MAWB_HAWB_screen_ACS_GMR_Import() throws Throwable {

	gmr.AllRadioBtn.click();
	Thread.sleep(4000);
	
	//gmr.GmrHydRadioOKBtn.click();
	//Thread.sleep(4000);
	
	wm.JavascriptExecutorClick(driver, gmrImport.Imports);Thread.sleep(4000);
	
	
	WebElement Element = driver.findElement(By.id("ctl00_hldPage_btnGenerateToken"));       

    //This will scroll the page till the element is found	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", Element);
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,1000)", "");
	Thread.sleep(4000);
	
	wm.JavascriptExecutorClick(driver, gmrImport.AddHAWBMAWBBtn);Thread.sleep(4000);
	Thread.sleep(4000);
	
	gmrImport.MAWBNoPrefix.click();Thread.sleep(2000);
	gmrImport.MAWBNoPrefix.sendKeys("999");Thread.sleep(2000);
	
	
	TestDataReader.AWBno();
    gmrImport.AWBNo.sendKeys(Username); Thread.sleep(2000);
	//gmrImport.AWBNo.sendKeys("56432622");Thread.sleep(4000);
	
	wm.JavascriptExecutorClick(driver, gmrImport.MAWBCalendar);Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmrImport.MAWBDate);Thread.sleep(2000);
	
	//gmrImport.MAWBCalendar.click();Thread.sleep(4000);
	//gmrImport.MAWBDate.click();Thread.sleep(4000); //------------------Every should change
	wm.JavascriptExecutorClick(driver, gmrImport.OrgAirportCode);Thread.sleep(2000);
	//gmrImport.OrgAirportCode.click();Thread.sleep(2000);
	gmrImport.OrgAirportCode.sendKeys("lhr");Thread.sleep(2000);
	
	Robot down = new Robot();
	down.delay(2000);
	
	down.keyPress(KeyEvent.VK_DOWN);
	down.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(4000);
	
	gmrImport.FlightNo.click();Thread.sleep(2000);
	gmrImport.FlightNo.sendKeys("5352");Thread.sleep(2000);
	
	gmrImport.FlightCalendar.click();Thread.sleep(2000);
	 gmrImport.FlightDate.click();	                       //------------------Every should change
	 Thread.sleep(2000);
	
	gmrImport.IGMNo.click();Thread.sleep(2000);
	gmrImport.IGMNo.sendKeys("8594034");Thread.sleep(2000); 
	
	gmrImport.IGMCalendar.click();Thread.sleep(2000);
	gmrImport.IGMDate.click();Thread.sleep(2000);            //------------------Every should change
		
	gmrImport.NoOfPckg.click();Thread.sleep(2000);
	gmrImport.NoOfPckg.sendKeys("3");Thread.sleep(2000);
	 
	gmrImport.GrossWt.click();Thread.sleep(2000);
	gmrImport.GrossWt.sendKeys("120");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrImport.ChrgWt);Thread.sleep(2000);
	gmrImport.ChrgWt.sendKeys("140");Thread.sleep(2000);
	
	//------------------------------------HAWB Details------------------------------------------------
	
	gmrImport.HAWBNo.click();Thread.sleep(2000);
	gmrImport.HAWBNo.sendKeys("h1");Thread.sleep(2000);
	
	gmrImport.HAWBDetailsCalendar.click();Thread.sleep(2000);
	gmrImport.HAWBDetailsDate.click();Thread.sleep(2000);
	
	gmrImport.origin.click();Thread.sleep(2000);
	gmrImport.origin.sendKeys("LHR");Thread.sleep(2000);
	
	gmrImport.Package.click();Thread.sleep(2000);
	gmrImport.Package.sendKeys("3");Thread.sleep(2000);
	
	gmrImport.GrossWtOfHAWBDetails.click();Thread.sleep(2000);
	gmrImport.GrossWtOfHAWBDetails.sendKeys("120");Thread.sleep(2000);
	
	gmrImport.ChargeWtOfHAWBDetails.click();Thread.sleep(2000);
	gmrImport.ChargeWtOfHAWBDetails.clear();Thread.sleep(2000);
	gmrImport.ChargeWtOfHAWBDetails.sendKeys("140");Thread.sleep(2000);
	
	gmrImport.ReceivedPckgOfHAWBDetails.click();Thread.sleep(2000);
	gmrImport.ReceivedPckgOfHAWBDetails.sendKeys("3");Thread.sleep(2000);
	
	gmrImport.ReceivedGrossWtOfHAWBDetails.click();Thread.sleep(2000);
	gmrImport.ReceivedGrossWtOfHAWBDetails.sendKeys("120");Thread.sleep(2000);
	
	gmrImport.ReceivedChrgWtOfHAWBDetails.click();Thread.sleep(2000);
	
	
	
	gmrImport.DescriptionOfHAWBDetails.click();Thread.sleep(2000);
	gmrImport.DescriptionOfHAWBDetails.sendKeys("Done");Thread.sleep(2000);
	
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,200)", "");
	Thread.sleep(4000);
	
	gmrImport.HAWBDetailsSaveBtn.click();Thread.sleep(2000);
	
	gmrImport.MAWBDetailsSuccessPoupMsgBtn.click();Thread.sleep(2000);
	
	
	}
	
	@Then("I login with {string} airline user given in {string} sheet ACS_GMR_Import")
	public void i_login_with_airline_user_given_in_sheet_ACS_GMR_Import(String entity, String sheetName) throws Throwable {
//	gmrImport.CloseBtn.click();
		   gmrImport.AirlinrDo.click();Thread.sleep(4000);
		
		
		
		wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");
	     
		Thread.sleep(8000);
		//Thread.sleep(4000);
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(4000);	
		
		
		wm.JavascriptExecutorClick(driver, gmrImport.ImportsForAirline);Thread.sleep(4000);
	
		Actions shipmentdetails = new Actions(driver);
		//Mouseover on an element
		shipmentdetails.moveToElement(gmrImport.ShipmentDetails).perform();
		Thread.sleep(4000);
	
		wm.JavascriptExecutorClick(driver, gmrImport.ShipmentDetails);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ShipmentDetailscheckbox);Thread.sleep(4000); 
		
		
	}
		@Then("user should be able to Approve the Airline DO request from Kale Airline account")
		public void to_verify_whether_the_user_is_able_to_approve_the_airline_do_request_from_kale_airline_account() throws InterruptedException {
		    
		
		
			wm.JavascriptExecutorClick(driver, gmrImport.ApproveDeliveryOredr);Thread.sleep(4000);
		wm.JavascriptExecutorClick(driver, gmrImport.ApproveDeliveryOredrpopup);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutArrow);Thread.sleep(4000);
			
		wm.JavascriptExecutorClick(driver, gmr.AirlineLogout);Thread.sleep(4000);
	}
		
		@Then("I logout with {string} airline user given in {string} sheet for request status ACS_GMR_Import")
		public void I_logout_with_airline_user_given_in_sheet_for_request_status_ACS_GMR_Import(String entity, String sheetName) throws Throwable {
			//gmrImport.CloseBtn.click();
			 Thread.sleep(4000);                    
			Entity = entity;
			TestDataReader.ReadLoginDetails(Entity);
			Thread.sleep(500);
			System.out.println("usr= " + Username);
			System.out.println("pwd= " + Password);
			// loginScreen.isLoginScreenDisplayed();
			loginScreen.Login(Entity, Username, Password);
			Thread.sleep(4000);	
			
			//gmrImport.MAWBNOInShipmentDetails.click();Thread.sleep(4000);
			//gmrImport.MAWBNOInShipmentDetails.sendKeys("56789342");Thread.sleep(4000);
			
			//gmrImport.MAWBNOInShipmentDetailsDownArrow.click();Thread.sleep(4000);
			//gmrImport.Contains.click();Thread.sleep(4000);
			//gmr.AllRadioBtn.click();
			//Thread.sleep(4000);
			
			//gmr.GmrHydRadioOKBtn.click();
		//	Thread.sleep(4000);
			
			//gmrImport.Imports.click();Thread.sleep(8000);
			wm.JavascriptExecutorClick(driver, gmrImport.Imports);Thread.sleep(4000);
			Thread.sleep(8000);
		}
		@Then("user should be able to do Weight verification of Consol Shipment")
			public void to_verify_whether_the_user_is_able_to_do_weight_verification_of_consol_shipment() throws Throwable {
			    
			
			
			wm.JavascriptExecutorClick(driver, gmrImport.WeightVerification);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.WeightVerificationUploadDocs);Thread.sleep(4000);
		
		driver.switchTo().frame(0);Thread.sleep(4000);
		
		//wm.JavascriptExecutorClick(driver, gmrImport.UploadHAWBDocRadioBtn);Thread.sleep(4000);
		
		//wm.JavascriptExecutorClick(driver, gmrImport.UploadHAWBDocchoosefile);Thread.sleep(4000);
		
		
		//-------------------Upload MAWB documents----------------
		 
		
		WebElement icon = driver.findElement(By.id("ctl00_hldPage_GridMAWBFILE_ctl02_fuctlUploadDocs"));
	      Actions ob = new Actions(driver);
	      ob.click(icon);
	      Action action  = ob.build();
	      action.perform();
		
		Robot uploaddoc = new Robot();
		uploaddoc.delay(2000);

		StringSelection sss1 = new StringSelection("D:\\dummy documents\\pdf1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sss1, null);

		uploaddoc.keyPress(KeyEvent.VK_CONTROL);
		uploaddoc.keyPress(KeyEvent.VK_V);
		uploaddoc.delay(2000);

		uploaddoc.keyPress(KeyEvent.VK_ENTER);
//		uploaddoc.keyPress(KeyEvent.VK_ENTER);
		uploaddoc.delay(1000);
		
		
		//------------upload consol manifest documents----------------------------------
		
	   WebElement icon1 = driver.findElement(By.id("ctl00_hldPage_GrdUploadConsolfile_ctl02_fuctlUploadDocs2"));
	      Actions ob1 = new Actions(driver);
	      ob1.click(icon1);
	      Action action1  = ob1.build();
	      action1.perform();
		
		Robot uploaddoc1 = new Robot();
		uploaddoc1.delay(2000);

		StringSelection sss11 = new StringSelection("D:\\dummy documents\\pdf1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sss11, null);

		uploaddoc1.keyPress(KeyEvent.VK_CONTROL);
		uploaddoc1.keyPress(KeyEvent.VK_V);
		uploaddoc1.delay(2000);

		uploaddoc1.keyPress(KeyEvent.VK_ENTER);
//		uploaddoc.keyPress(KeyEvent.VK_ENTER);
		uploaddoc1.delay(1000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBtn);Thread.sleep(4000);
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBtnPopup);Thread.sleep(4000);
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBtnPopupClose);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ChargWtExcelUpload);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ChargWtExcelUploadChooseFile);Thread.sleep(4000);
		wm.JavascriptExecutorClick(driver, gmrImport.ChargWtExcelUploadChooseFile);Thread.sleep(4000);
		
		
		
	      
	      WebElement destname = driver.findElement(By.id("ctl00_hldPage_fuuploadexcel"));
	      Actions dest = new Actions(driver);
	      dest.click(destname);
	      Action destnameaction  = dest.build();
	      destnameaction.perform();Thread.sleep(4000);
	      
	   
			
		wm.JavascriptExecutorClick(driver, gmrImport.DownloadSampleExcelTemplate);Thread.sleep(4000);
			
		wm.JavascriptExecutorClick(driver, gmrImport.ChargeWtpopupUpload);Thread.sleep(4000);
			
		wm.JavascriptExecutorClick(driver, gmrImport.wtVerificationsubmit);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.wtVerificationsubmitpopup);Thread.sleep(4000);
		
		}
		
    @Then("user should be able to do Consol DO and assign the shipment to another CB")
		public void to_verify_whether_the_user_is_able_to_do_consol_do_and_assign_the_shipment_to_another_cb() throws Throwable {
		    
		
			
    	wm.JavascriptExecutorClick(driver, gmrImport.ConsoleDoRevoke);Thread.sleep(8000);
		
		//wm.JavascriptExecutorClick(driver, gmrImport.ConsoleDoCBdropdwon);Thread.sleep(8000);
		
		WebElement icon0 = driver.findElement(By.id("ctl00_hldPage_ddlCHA"));
        Actions ob0 = new Actions(driver);
        ob0.click(icon0);
        Action action0  = ob0.build();
        action0.perform();
		Thread.sleep(4000);
        
        gmrImport.AADHYALOGISTICS.click();
		
	    wm.JavascriptExecutorClick(driver, gmrImport.ConsoleDoSubmit);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ConsoleDoSubmittedSuccessfully);Thread.sleep(4000);
	    
	    gmrImport.FFlogOutArrow.click();Thread.sleep(4000);
	    gmrImport.FFlogOutTab.click();Thread.sleep(4000);
	    
    }
	  @Then("user should be able to do BoE for Direct\\/Consol Shipment")
	  public void to_verify_whether_the_user_is_able_to_do_bo_e_for_direct_consol_shipment() throws Throwable {
	       
	     
	    // -------------------CB login------------------BOE--------------------->
	   
	    //gmrImport.CloseBtn.click();Thread.sleep(4000);
	    
		  TestDataReader.CBloginAadhya();
	    gmrImport.Usernametxtbox.sendKeys(Username); Thread.sleep(4000);
	    gmrImport.Passwordtxtbox.sendKeys(Password); Thread.sleep(4000);
	    loginScreen.loginbutton.click();Thread.sleep(4000);
	    gmr.AllRadioBtn.click();
		Thread.sleep(4000);
		
		gmr.GmrHydRadioOKBtn.click();
		Thread.sleep(6000);
	    
	   // wm.JavascriptExecutorClick(driver, gmrImport.AllRadioBtn);Thread.sleep(4000);
	  //  gmrImport.AllRadioBtn.click();
		//Thread.sleep(4000);
		
		//gmrImport.CBImportTab.click();
		//Thread.sleep(4000);
		
		//Actions reports = null;
		//reports.moveToElement(gmrImport.BussinessLine).perform();
		//Thread.sleep(4000);
		
		Actions action2 = new Actions(driver);
		action2.moveToElement(gmrImport.BussinessLine).perform();
		
		gmrImport.CustomerBroker.click();Thread.sleep(6000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.Imports);Thread.sleep(8000);
	  
		wm.JavascriptExecutorClick(driver, gmrImport.BoE);Thread.sleep(6000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.BoENumber);Thread.sleep(4000);
		gmrImport.BoENumber.sendKeys("7474745");Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.BoEDateCalender);Thread.sleep(4000);
	    
		
		
		gmrImport.TodayDate.click();Thread.sleep(4000);
		 
		Select boetype = new Select(driver.findElement(By.id("drpSBType")));  
		boetype.selectByVisibleText("Manual");Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.CAVValue);Thread.sleep(4000);
		gmrImport.CAVValue.sendKeys("123456789123");Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.NoPForBoE);Thread.sleep(4000);
		gmrImport.NoPForBoE.sendKeys("3");Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBoE);Thread.sleep(4000);
		
		driver.switchTo().frame(0);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBoEChooseFile);Thread.sleep(4000);
		
		WebElement boeupload = driver.findElement(By.id("ctl00_hldPage_fuctlUploadDocs"));
	    Actions boe = new Actions(driver);
	    boe.click(boeupload);
	    Action uploadboeaction  = boe.build();
	    uploadboeaction.perform();Thread.sleep(4000);
		
		 Robot uploadboe = new Robot();
		 uploadboe.delay(2000);

			StringSelection ss11 = new StringSelection("D:\\dummy documents\\pdf1.pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss11, null);

			uploadboe.keyPress(KeyEvent.VK_CONTROL);
			uploadboe.keyPress(KeyEvent.VK_V);
			uploadboe.delay(2000);

			uploadboe.keyPress(KeyEvent.VK_ENTER);
//			uploaddoc.keyPress(KeyEvent.VK_ENTER);
			uploadboe.delay(1000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.UploadBoEBtnChooseFile);Thread.sleep(4000);
			 //gmrImport.UploadBoEBtnChooseFileCloseBtn.click();Thread.sleep(4000);
			driver.switchTo().defaultContent();Thread.sleep(4000);
			 wm.JavascriptExecutorClick(driver, gmrImport.UploadBoEBtnChooseFileCloseBtn);Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.BillEntryDetailsSaveBtn);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmrImport.BillEntryBackbtn);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmrImport.SavemsgOkbtn);Thread.sleep(4000);
	
	  }
	
		@Then("user should be able to do Pick Order for Direct\\/Consol Shipment")
		public void to_verify_whether_the_user_is_able_to_do_pick_order_for_direct_consol_shipment() throws Throwable {
			    
			
			
			//-----------------------------Pick order------------------------------------------	
			
				wm.JavascriptExecutorClick(driver, gmrImport.PickOrderSubmitbtn);Thread.sleep(4000);
			gmrImport.PieceForExaminationtxtbox.sendKeys("3");Thread.sleep(4000);
			gmrImport.Remarkstxtbox.sendKeys("Examination");Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmrImport.PickOrdersavebtn);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmrImport.PickOrdersaveOkbtn);Thread.sleep(4000);
		}
			
			
	    @When("user should be able to do OOC for Direct\\/Consol Shipment")
		public void to_verify_whether_the_user_is_able_to_do_ooc_for_direct_consol_shipment() throws Throwable {
			   
			
			//----------------OoC-----------------------------
			
//			
			
	    		wm.JavascriptExecutorClick(driver, gmrImport.OoCSubmitbtn);Thread.sleep(4000);
			gmrImport.OoCtxtboxno.sendKeys("4567897876");Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmrImport.BoEDateCalender);Thread.sleep(4000);
			gmrImport.Ooctodaydate.click();Thread.sleep(4000);
			Select boetype1 = new Select(driver.findElement(By.id("drpSBType")));  
			boetype1.selectByVisibleText("Manual");Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmrImport.OocUploaddocbtn);Thread.sleep(4000);
			driver.switchTo().frame(0);Thread.sleep(4000);
			
			WebElement boeupload1 = driver.findElement(By.id("ctl00_hldPage_fuctlUploadDocs"));
		    Actions boe1 = new Actions(driver);
		    boe1.click(boeupload1);
		    Action uploadboeaction1  = boe1.build();
		    uploadboeaction1.perform();Thread.sleep(4000);
			
			 Robot uploadboe1 = new Robot();
			 uploadboe1.delay(2000);

				StringSelection ss111 = new StringSelection("D:\\dummy documents\\pdf1.pdf");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss111, null);

				uploadboe1.keyPress(KeyEvent.VK_CONTROL);
				uploadboe1.keyPress(KeyEvent.VK_V);
				uploadboe1.delay(2000);

				uploadboe1.keyPress(KeyEvent.VK_ENTER);
//				uploaddoc.keyPress(KeyEvent.VK_ENTER);
				uploadboe1.delay(1000);
				
				wm.JavascriptExecutorClick(driver, gmrImport.Oocuploadbtn);Thread.sleep(4000);
				driver.switchTo().defaultContent();Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.OocUploaddocClosebtn);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.Oocsavebtn);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.OocsavemsgOkbtn);Thread.sleep(4000);
				
	  }
				
		@Then("user should be able to BoE ASI and View the ACS Receipt for Direct\\/Consol Shipment")
		public void to_verify_whether_the_user_is_able_to_bo_e_asi_and_view_the_acs_receipt_for_direct_consol_shipment() throws Throwable {
				   
				
				//---------------BOE ASI-------------
		         
				 
			wm.JavascriptExecutorClick(driver, gmrImport.BOEASIicon);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.Proceedbtn);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.BOEASIsaveOKbtn);Thread.sleep(4000);
				
		}	
		@Then("user should be able to assign the shipment to Consignee to create TSP for Direct\\/Consol shipment")
		public void to_check_if_user_is_able_to_assign_the_shipment_to_consignee_to_create_tsp_for_direct_consol_shipment() throws Throwable {
		    
		
					
				//--------------------TSP--------------------------------
				 
					wm.JavascriptExecutorClick(driver, gmrImport.TSPicon);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.TSPproceedbtn);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.ShipmentIntegrationApproacgproceedbtn);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.CommodityTypedropdown);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.GeneralCargo);Thread.sleep(4000);
				//driver.findElement(By.id("ctl00_hldPage_ddlTSPCommodityGroup")).sendKeys("General Cargo");
				Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.CommodityNamedropdown);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.AIRCRAFTAPD);Thread.sleep(4000);
			  //  driver.findElement(By.id("ctl00_hldPage_ddlComodityTypeName")).sendKeys("AIRCRAFT(APD):GEN");
			    Thread.sleep(70000);
			    
//			    wm.JavascriptExecutorClick(driver,gmrImport.HSNcodtxtbox);Thread.sleep(4000);
			    JavascriptExecutor js = (JavascriptExecutor) driver;

			    js.executeScript("window.scrollBy(10000,0)");Thread.sleep(4000);
			  //  TestDataReader.TransactionPassword();
			   // gmrImport.TransactionPasswordtxtbox.sendKeys(Username); Thread.sleep(4000);
				gmrImport.TransactionPasswordtxtbox.sendKeys("Kale@123");Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.TSPpaynowbtn);Thread.sleep(4000);
				
				wm.JavascriptExecutorClick(driver, gmrImport.OK);Thread.sleep(4000);
				//gmrImport.TransactionPasswordtxtbox.sendKeys("Kale@123");Thread.sleep(4000);
				//wm.JavascriptExecutorClick(driver, gmrImport.TSPpaynowbtn);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.Yesbtn);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.GenerateTSPYesbtn);Thread.sleep(4000);
				Thread.sleep(80000);
		}	
	@When("user should be able to create single VT for single BoE  from TSP pop up")
		public void to_check_if_user_is_able_to_create_single_vt_for_single_bo_e_from_tsp_pop_up() throws InterruptedException {
				    
				
		//<<<<------------------	Generate Token ---------------------->>>>>>>	
				
				
   wm.JavascriptExecutorClick(driver, gmrImport.VehicleTokencheckbox);Thread.sleep(4000);
				
    wm.JavascriptExecutorClick(driver, gmrImport.GeneratetokenTab);Thread.sleep(4000);
				
		gmrImport.VehicleNo.sendKeys("MH127896");Thread.sleep(4000);
	
	gmrImport.DriverLicenseNo.sendKeys("MH7896");Thread.sleep(4000);
	
	gmrImport.DriverName.sendKeys("John");Thread.sleep(4000);
	
	gmrImport.DriverMobileNo.sendKeys("1234567891");Thread.sleep(4000);
	
	gmrImport.AgentMobileNo.sendKeys("2234567891");Thread.sleep(4000);
	}
	
 @When("user should be able to generate the token on click of Generate Token button")
 public void to_verify_whether_user_is_able_to_generate_the_token_on_click_of_generate_token_button() throws InterruptedException {
	    
	 wm.JavascriptExecutorClick(driver, gmrImport.GeneratetokenBtn);Thread.sleep(4000);
	
	gmrImport.OKbtn.click();Thread.sleep(4000);
	gmrImport.VehicleDetailsAdd.click();Thread.sleep(4000);
	}
	
 @Then("user should be able to view Complete icon for Dock In\\/Dock Out on Track and Trace screen when the CTO perform Dock In\\/Dock Out activity.")
 public void to_verify_whether_the_user_is_able_to_view_complete_icon_for_dock_in_dock_out_on_track_and_trace_screen_when_the_cto_perform_dock_in_dock_out_activity() throws InterruptedException {
	  
	
	
	//----------------------------E-Docket-----------------------------------------------------------
	
	//gmrImport.eDocketIcon.click();Thread.sleep(4000);
 }
	@Then("To check whether the system displays proper status for ARR,RCF,NFD,ADO,DI,Consol DO, BoE, RFE,FFE,OOC, TSP,VT,GD with proper date and timestamp.")
	public void to_check_whether_the_system_displays_proper_status_for_arr_rcf_nfd_ado_di_consol_do_bo_e_rfe_ffe_ooc_tsp_vt_gd_with_proper_date_and_timestamp() throws InterruptedException {
		gmrImport.close.click();Thread.sleep(4000);
	
	
	//-----------------------Track and Trace----------------------------------------

	Actions action2111 = new Actions(driver);
	action2111.moveToElement(gmrImport.BussinessLine).perform();
	gmrImport.FF.click();Thread.sleep(4000);
	
	Actions tracktrace = new Actions(driver);
	//Mouseover on an element
	tracktrace.moveToElement(gmrImport.TrackTrace).perform();
	Thread.sleep(4000);
	}
	@Then("user should be able to clicks on AWB number and it should display its  details and correct status in its respective fields.")
	public void to_check_when_user_clicks_on_awb_number_and_it_should_display_its_details_and_correct_status_in_its_respective_fields() throws InterruptedException {
	    
	
	
		gmrImport.TrackTrace.click();Thread.sleep(4000);
	
	Actions gstinfo = new Actions(driver);
	//Mouseover on an element
	gstinfo.moveToElement(gmrImport.GSTInfo).perform();
	Thread.sleep(4000);
	
	gmrImport.GSTInfo.click();Thread.sleep(4000);
	}
	@Then("user should be able to View the Transaction Report From Sub-menu of Reports")
	public void to_verify_whether_user_is_able_to_view_the_transaction_report_from_sub_menu_of_reports() throws InterruptedException {
	    
	
	
	Actions reports = new Actions(driver);
	//Mouseover on an element
	reports.moveToElement(gmrImport.Reports).perform();
	Thread.sleep(4000);
	
	gmrImport.TransactionReports.click();Thread.sleep(4000);
	
	Select cto = new Select(driver.findElement(By.id("ctl00_hldPage_ddlTerminal")));  
	cto.selectByVisibleText("Kale_GHA1");
	
	gmrImport.ExportToExcelTransactionReport.click();Thread.sleep(4000);
	
}
	
	@When("user should be able to View the Dwell Time Report From Sub-menu of Reports")
	public void to_verify_whether_user_is_able_to_view_the_dwell_time_report_from_sub_menu_of_reports() throws InterruptedException {
	//Mouseover on an element
		Actions reports = new Actions(driver);
	reports.moveToElement(gmrImport.Reports).perform();
	Thread.sleep(4000);
	
	    
	
	
	gmrImport.DwellTimeReport.click();Thread.sleep(4000);
	
	gmrImport.DwellTimeReportExportToExcel.click();Thread.sleep(4000);
	
	reports.moveToElement(gmrImport.Reports).perform();
	Thread.sleep(4000);
	}
	
	@Then("user should be able to View the Tonnage Report")
	public void to_verify_whether_user_is_able_to_view_the_tonnage_report() throws InterruptedException {
	   
	
	
	gmrImport.TonnageReport.click();Thread.sleep(4000);
	
	gmrImport.TonnageReportAirport.click();Thread.sleep(4000);
	gmrImport.TonnageReportAirport.sendKeys("HYD");Thread.sleep(4000);
	
	gmrImport.TonnageReportExportToExcel.click();Thread.sleep(4000);
	
	}
   
	
	@Then("user should be able to release and revoke DO in bulk.")
   public void to_verify_whether_user_is_able_to_release_and_revoke_do_in_bulk() throws InterruptedException {
	

	
		Actions ecustom = new Actions(driver);
	//Mouseover on an element
	ecustom.moveToElement(gmrImport.Ecustom).perform();
	Thread.sleep(4000);
	
	gmrImport.Ecustom.click();Thread.sleep(4000);
		Thread.sleep(5000);
		
	
	}
	
		

//ACS_GMR_2Import

		@Then("logout with airline ane login with FF.")
		public void logout_with_airline_ane_login_with_ff() throws Throwable {
			
			
				TestDataReader.FFlogin();
		    gmrImport.Usernametxtbox.sendKeys(Username); Thread.sleep(4000);
		    gmrImport.Passwordtxtbox.sendKeys(Password); Thread.sleep(4000);
		    loginScreen.loginbutton.click();Thread.sleep(4000);
			
			//gmrImport.MAWBNOInShipmentDetails.click();Thread.sleep(4000);
			//gmrImport.MAWBNOInShipmentDetails.sendKeys("56789342");Thread.sleep(4000);
			
			//gmrImport.MAWBNOInShipmentDetailsDownArrow.click();Thread.sleep(4000);
			//gmrImport.Contains.click();Thread.sleep(4000);
			//gmr.AllRadioBtn.click();
			//Thread.sleep(4000);
			
		    wm.JavascriptExecutorClick(driver, gmr.GmrHydRadioOKBtn);Thread.sleep(4000);
			Thread.sleep(4000);
			
		    wm.JavascriptExecutorClick(driver, gmrImport.Imports);Thread.sleep(4000);
			Thread.sleep(4000); 
			
		wm.JavascriptExecutorClick(driver, gmrImport.WeightVerification);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.WeightVerificationUploadDocs);Thread.sleep(4000);
		
		driver.switchTo().frame(0);Thread.sleep(4000);
		
		//wm.JavascriptExecutorClick(driver, gmrImport.UploadHAWBDocRadioBtn);Thread.sleep(4000);
		
		//wm.JavascriptExecutorClick(driver, gmrImport.UploadHAWBDocchoosefile);Thread.sleep(4000);
		
		
		//-------------------Upload MAWB documents----------------
		 
		
		WebElement icon = driver.findElement(By.id("ctl00_hldPage_GridMAWBFILE_ctl02_fuctlUploadDocs"));
	      Actions ob = new Actions(driver);
	      ob.click(icon);
	      Action action  = ob.build();
	      action.perform();
		
		Robot uploaddoc = new Robot();
		uploaddoc.delay(2000);

		StringSelection sss1 = new StringSelection("D:\\dummy documents\\pdf1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sss1, null);

		uploaddoc.keyPress(KeyEvent.VK_CONTROL);
		uploaddoc.keyPress(KeyEvent.VK_V);
		uploaddoc.delay(2000);

		uploaddoc.keyPress(KeyEvent.VK_ENTER);
//		uploaddoc.keyPress(KeyEvent.VK_ENTER);
		uploaddoc.delay(1000);
		
		
		//------------upload consol manifest documents----------------------------------
		
	   WebElement icon1 = driver.findElement(By.id("ctl00_hldPage_GrdUploadConsolfile_ctl02_fuctlUploadDocs2"));
	      Actions ob1 = new Actions(driver);
	      ob1.click(icon1);
	      Action action1  = ob1.build();
	      action1.perform();
		
		Robot uploaddoc1 = new Robot();
		uploaddoc1.delay(2000);

		StringSelection sss11 = new StringSelection("D:\\dummy documents\\pdf1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sss11, null);

		uploaddoc1.keyPress(KeyEvent.VK_CONTROL);
		uploaddoc1.keyPress(KeyEvent.VK_V);
		uploaddoc1.delay(2000);

		uploaddoc1.keyPress(KeyEvent.VK_ENTER);
//		uploaddoc.keyPress(KeyEvent.VK_ENTER);
		uploaddoc1.delay(1000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBtn);Thread.sleep(4000);
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBtnPopup);Thread.sleep(4000);
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBtnPopupClose);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ChargWtExcelUpload);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ChargWtExcelUploadChooseFile);Thread.sleep(4000);
		wm.JavascriptExecutorClick(driver, gmrImport.ChargWtExcelUploadChooseFile);Thread.sleep(4000);
		
		
		
	      
	      WebElement destname = driver.findElement(By.id("ctl00_hldPage_fuuploadexcel"));
	      Actions dest = new Actions(driver);
	      dest.click(destname);
	      Action destnameaction  = dest.build();
	      destnameaction.perform();Thread.sleep(4000);
	      
	      Robot uploaddoc2 = new Robot();
			uploaddoc2.delay(2000);

			StringSelection ss1 = new StringSelection("D:\\dummy documents\\pdf1.pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);

			uploaddoc2.keyPress(KeyEvent.VK_CONTROL);
			uploaddoc2.keyPress(KeyEvent.VK_V);
			uploaddoc2.delay(2000);

			uploaddoc2.keyPress(KeyEvent.VK_ENTER);
//			uploaddoc.keyPress(KeyEvent.VK_ENTER);
			uploaddoc2.delay(1000);
			
		wm.JavascriptExecutorClick(driver, gmrImport.DownloadSampleExcelTemplate);Thread.sleep(4000);
			
		wm.JavascriptExecutorClick(driver, gmrImport.ChargeWtpopupUpload);Thread.sleep(4000);
			
		wm.JavascriptExecutorClick(driver, gmrImport.wtVerificationsubmit);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.wtVerificationsubmitpopup);Thread.sleep(4000);
			
		wm.JavascriptExecutorClick(driver, gmrImport.ConsoleDoRevoke);Thread.sleep(8000);
		
		//wm.JavascriptExecutorClick(driver, gmrImport.ConsoleDoCBdropdwon);Thread.sleep(8000);
		
		WebElement icon0 = driver.findElement(By.id("ctl00_hldPage_ddlCHA"));
        Actions ob0 = new Actions(driver);
        ob0.click(icon0);
        Action action0  = ob0.build();
        action0.perform();
		Thread.sleep(4000);
        
        gmrImport.AADHYALOGISTICS.click();
		
	    wm.JavascriptExecutorClick(driver, gmrImport.ConsoleDoSubmit);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ConsoleDoSubmittedSuccessfully);Thread.sleep(4000);
	    
	    gmrImport.FFlogOutArrow.click();Thread.sleep(4000);
	    gmrImport.FFlogOutTab.click();Thread.sleep(4000);
	    
	   
	    
	    // -------------------CB login------------------BOE--------------------->
	   
	    //gmrImport.CloseBtn.click();Thread.sleep(4000);
	    
	    TestDataReader.CBloginAadhya();
	    gmrImport.Usernametxtbox.sendKeys(Username); Thread.sleep(4000);
	    gmrImport.Passwordtxtbox.sendKeys(Password); Thread.sleep(4000);
	    loginScreen.loginbutton.click();Thread.sleep(4000);
	    
	    
	   // wm.JavascriptExecutorClick(driver, gmrImport.AllRadioBtn);Thread.sleep(4000);
	    gmrImport.AllRadioBtn.click();
		Thread.sleep(4000);
		
		//gmrImport.CBImportTab.click();
		//Thread.sleep(4000);
		
		//Actions reports = null;
		//reports.moveToElement(gmrImport.BussinessLine).perform();
		//Thread.sleep(4000);
		
		Actions action2 = new Actions(driver);
		action2.moveToElement(gmrImport.BussinessLine).perform();
		
        gmrImport.CustomerBroker.click();Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.Imports);Thread.sleep(4000);
	  
		wm.JavascriptExecutorClick(driver, gmrImport.BoE);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.BoENumber);Thread.sleep(4000);
		gmrImport.BoENumber.sendKeys("7474745");Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.BoEDateCalender);Thread.sleep(4000);
	    
		
		
		gmrImport.TodayDate.click();Thread.sleep(4000);
		 
		Select boetype = new Select(driver.findElement(By.id("drpSBType")));  
		boetype.selectByVisibleText("Manual");Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.CAVValue);Thread.sleep(4000);
		gmrImport.CAVValue.sendKeys("123456789123");Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.NoPForBoE);Thread.sleep(4000);
		gmrImport.NoPForBoE.sendKeys("3");Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBoE);Thread.sleep(4000);
		
		driver.switchTo().frame(0);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBoEChooseFile);Thread.sleep(4000);
		
		WebElement boeupload = driver.findElement(By.id("ctl00_hldPage_fuctlUploadDocs"));
	    Actions boe = new Actions(driver);
	    boe.click(boeupload);
	    Action uploadboeaction  = boe.build();
	    uploadboeaction.perform();Thread.sleep(4000);
		
		 Robot uploadboe = new Robot();
		 uploadboe.delay(2000);

			StringSelection ss11 = new StringSelection("D:\\dummy documents\\pdf1.pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss11, null);

			uploadboe.keyPress(KeyEvent.VK_CONTROL);
			uploadboe.keyPress(KeyEvent.VK_V);
			uploadboe.delay(2000);

			uploadboe.keyPress(KeyEvent.VK_ENTER);
//			uploaddoc.keyPress(KeyEvent.VK_ENTER);
			uploadboe.delay(1000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.UploadBoEBtnChooseFile);Thread.sleep(4000);
			 //gmrImport.UploadBoEBtnChooseFileCloseBtn.click();Thread.sleep(4000);
			driver.switchTo().defaultContent();Thread.sleep(4000);
			 wm.JavascriptExecutorClick(driver, gmrImport.UploadBoEBtnChooseFileCloseBtn);Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.BillEntryDetailsSaveBtn);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmrImport.BillEntryBackbtn);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmrImport.SavemsgOkbtn);Thread.sleep(4000);
	
		
			
			//-----------------------------Pick order------------------------------------------	
			
			wm.JavascriptExecutorClick(driver, gmrImport.PickOrderSubmitbtn);Thread.sleep(4000);
			gmrImport.PieceForExaminationtxtbox.sendKeys("1");Thread.sleep(4000);
			gmrImport.Remarkstxtbox.sendKeys("Examination");Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmrImport.PickOrdersavebtn);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmrImport.PickOrdersaveOkbtn);Thread.sleep(4000);
			
			
			
			//----------------OoC-----------------------------
			
//			
			
			wm.JavascriptExecutorClick(driver, gmrImport.OoCSubmitbtn);Thread.sleep(5000);
			gmrImport.OoCtxtboxno.sendKeys("4567897876");Thread.sleep(5000);
			wm.JavascriptExecutorClick(driver, gmrImport.BoEDateCalender);Thread.sleep(4000);
			gmrImport.Ooctodaydate.click();Thread.sleep(4000);
			Select boetype1 = new Select(driver.findElement(By.id("drpSBType")));  
			boetype1.selectByVisibleText("Manual");Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmrImport.OocUploaddocbtn);Thread.sleep(4000);
			driver.switchTo().frame(0);Thread.sleep(4000);
			
			WebElement boeupload1 = driver.findElement(By.id("ctl00_hldPage_fuctlUploadDocs"));
		    Actions boe1 = new Actions(driver);
		    boe1.click(boeupload1);
		    Action uploadboeaction1  = boe1.build();
		    uploadboeaction1.perform();Thread.sleep(4000);
			
			 Robot uploadboe1 = new Robot();
			 uploadboe1.delay(2000);

				StringSelection ss111 = new StringSelection("D:\\dummy documents\\pdf1.pdf");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss111, null);

				uploadboe1.keyPress(KeyEvent.VK_CONTROL);
				uploadboe1.keyPress(KeyEvent.VK_V);
				uploadboe1.delay(2000);

				uploadboe1.keyPress(KeyEvent.VK_ENTER);
//				uploaddoc.keyPress(KeyEvent.VK_ENTER);
				uploadboe1.delay(1000);
				
				wm.JavascriptExecutorClick(driver, gmrImport.Oocuploadbtn);Thread.sleep(4000);
				driver.switchTo().defaultContent();Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.OocUploaddocClosebtn);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.Oocsavebtn);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.OocsavemsgOkbtn);Thread.sleep(4000);
				//WebElement icon11 = driver.findElement(By.xpath("/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[2]/div/div/div[3]/input"));
		         //// Actions ob11 = new Actions(driver);
		         // ob11.click(icon11);
		         // Action action11  = ob11.build();
		         // action11.perform();
		         // Thread.sleep(4000);
		
				
				//---------------BOE ASI-------------
		         
				 
				wm.JavascriptExecutorClick(driver, gmrImport.BOEASIicon);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.Proceedbtn);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.BOEASIsaveOKbtn);Thread.sleep(4000);
				
				
				
				//--------------------TSP--------------------------------
				 
				wm.JavascriptExecutorClick(driver, gmrImport.TSPicon);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.TSPproceedbtn);Thread.sleep(4000);
				//wm.JavascriptExecutorClick(driver, gmrImport.CommodityTypedropdown);Thread.sleep(4000);
				//wm.JavascriptExecutorClick(driver, gmrImport.GeneralCargo);Thread.sleep(4000);
				driver.findElement(By.id("ctl00_hldPage_ddlTSPCommodityGroup")).sendKeys("General Cargo");
				Thread.sleep(4000);
				//wm.JavascriptExecutorClick(driver, gmrImport.CommodityNamedropdown);Thread.sleep(4000);
				//wm.JavascriptExecutorClick(driver, gmrImport.AIRCRAFTAPD);Thread.sleep(4000);
			    driver.findElement(By.id("ctl00_hldPage_ddlComodityTypeName")).sendKeys("AIRCRAFT(APD):GEN");
			    Thread.sleep(4000);
			    gmrImport.HSNcodtxtbox.sendKeys("567865");Thread.sleep(4000);
			    TestDataReader.TransactionPassword();
			    gmrImport.TransactionPasswordtxtbox.sendKeys(Username); Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.TSPpaynowbtn);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.Yesbtn);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.GenerateTSPYesbtn);Thread.sleep(4000);
				
		}	
	@Then("To check if user is able to create multiple VT for single BoE  from Shipment list page")
public void to_check_if_user_is_able_to_create_multiple_vt_for_single_bo_e_from_shipment_list_page() throws InterruptedException {
		//<<<<------------------	Multiple Generate Token ---------------------->>>>>>>	
				
		Thread.sleep(4000);		
//    wm.JavascriptExecutorClick(driver, gmrImport.VehicleTokencheckbox);Thread.sleep(4000);
				
//    wm.JavascriptExecutorClick(driver, gmrImport.GeneratetokenTab);Thread.sleep(4000);
				
		gmrImport.VehicleNo.sendKeys("MH127896");Thread.sleep(4000);
	
	gmrImport.DriverLicenseNo.sendKeys("MH7896");Thread.sleep(4000);
	
	gmrImport.DriverName.sendKeys("John");Thread.sleep(4000);
	
	gmrImport.DriverMobileNo.sendKeys("1234567891");Thread.sleep(4000);
	
	gmrImport.AgentMobileNo.sendKeys("2234567891");Thread.sleep(4000);
	
	gmrImport.NoP1.clear();
	
	gmrImport.NoP1.sendKeys("2");
	
	gmrImport.Grosswt1.clear();
	
	gmrImport.Grosswt1.sendKeys("60");;
	
	//gmrImport.VehicleDetailsAdd.click();Thread.sleep(4000);
	wm.JavascriptExecutorClick(driver, gmrImport.vehicaltokenplusbtn);Thread.sleep(4000);
	
	gmrImport.Vehicleno2.sendKeys("MH127896");Thread.sleep(4000);
	gmrImport.Driverlicenseno2.sendKeys("MH7896");Thread.sleep(4000);
	gmrImport.Drivername2.sendKeys("John");Thread.sleep(4000);
	gmrImport.Drivermobno2.sendKeys("1234567891");Thread.sleep(4000);
	gmrImport.Agentmobno2.sendKeys("2234567891");Thread.sleep(4000);
	gmrImport.NoP2.sendKeys("1");Thread.sleep(4000);
	gmrImport.Grosswt2.sendKeys("60");
    
	wm.JavascriptExecutorClick(driver, gmrImport.GeneratetokenBtn);Thread.sleep(4000);
	gmrImport.OKbtn.click();Thread.sleep(4000);
	
	}
	@When("To verify whether user is able to Cancel the token on click of Cancel Token Button from VCT screen")
public void to_verify_whether_user_is_able_to_cancel_the_token_on_click_of_cancel_token_button_from_vct_screen() throws InterruptedException {
	
		wm.JavascriptExecutorClick(driver, gmrImport.vehicletokendonesign);Thread.sleep(4000);
	wm.JavascriptExecutorClick(driver, gmrImport.Cancelvehicletokentab);Thread.sleep(4000);
	wm.JavascriptExecutorClick(driver, gmrImport.Cancelokmsg);Thread.sleep(4000);
	
	wm.JavascriptExecutorClick(driver, gmrImport.Vehicletokencheckbox);Thread.sleep(4000);
	wm.JavascriptExecutorClick(driver, gmrImport.Generateatoken);Thread.sleep(4000);
   
	
	
   // gmrImport.NoP1.sendKeys("3");
	
	gmrImport.Grosswt1.sendKeys("120");
	}
	@Then("To check if user is able to create single VT  for multiple BoE  from shipment list page")
public void to_check_if_user_is_able_to_create_single_vt_for_multiple_bo_e_from_shipment_list_page() throws InterruptedException {
	//-------------------multiple BOE--------------------------------
	
	
		gmrImport.AddShipmentTab.click();Thread.sleep(4000);
	driver.switchTo().frame(0);
	gmrImport.firstaddshipchkbox.click();Thread.sleep(4000);
	//driver.switchTo().defaultContent();Thread.sleep(4000);
	gmrImport.Addbtn.click();Thread.sleep(4000);
	driver.switchTo().defaultContent();Thread.sleep(4000);
	
	
	gmrImport.VehicleNo.sendKeys("MH127896");Thread.sleep(4000);
	gmrImport.DriverLicenseNo.sendKeys("MH7896");Thread.sleep(4000);
	gmrImport.DriverName.sendKeys("John");Thread.sleep(4000);
	gmrImport.DriverMobileNo.sendKeys("1234567891");Thread.sleep(4000);
	gmrImport.AgentMobileNo.sendKeys("2234567891");Thread.sleep(4000);
	
	
	wm.JavascriptExecutorClick(driver, gmrImport.GeneratetokenBtn);Thread.sleep(4000);
	gmrImport.OKbtn.click();Thread.sleep(4000);
	
	
	
	
	
	
	
	
	//----------------------------E-Docket-----------------------------------------------------------
	
	gmrImport.eDocketIcon.click();Thread.sleep(4000);
	gmrImport.close.click();Thread.sleep(4000);
	
	
	//-----------------------Track and Trace----------------------------------------

	Actions action2111 = new Actions(driver);
	action2111.moveToElement(gmrImport.BussinessLine).perform();
	gmrImport.FF.click();Thread.sleep(4000);
	
	Actions tracktrace = new Actions(driver);
	//Mouseover on an element
	tracktrace.moveToElement(gmrImport.TrackTrace).perform();
	Thread.sleep(4000);
	
	gmrImport.TrackTrace.click();Thread.sleep(4000);
	
	Actions gstinfo = new Actions(driver);
	//Mouseover on an element
	gstinfo.moveToElement(gmrImport.GSTInfo).perform();
	Thread.sleep(4000);
	
	gmrImport.GSTInfo.click();Thread.sleep(4000);
	
	Actions reports = new Actions(driver);
	//Mouseover on an element
	reports.moveToElement(gmrImport.Reports).perform();
	Thread.sleep(4000);
	
	gmrImport.TransactionReports.click();Thread.sleep(4000);
	
	Select cto = new Select(driver.findElement(By.id("ctl00_hldPage_ddlTerminal")));  
	cto.selectByVisibleText("Kale_GHA1");
	
	gmrImport.ExportToExcelTransactionReport.click();Thread.sleep(4000);
	
	
	//Mouseover on an element
	reports.moveToElement(gmrImport.Reports).perform();
	Thread.sleep(4000);
	
	gmrImport.DwellTimeReport.click();Thread.sleep(4000);
	
	gmrImport.DwellTimeReportExportToExcel.click();Thread.sleep(4000);
	
	reports.moveToElement(gmrImport.Reports).perform();
	Thread.sleep(4000);
	
	gmrImport.TonnageReport.click();Thread.sleep(4000);
	
	gmrImport.TonnageReportAirport.click();Thread.sleep(4000);
	gmrImport.TonnageReportAirport.sendKeys("HYD");Thread.sleep(4000);
	
	gmrImport.TonnageReportExportToExcel.click();Thread.sleep(4000);
	
	Actions ecustom = new Actions(driver);
	//Mouseover on an element
	ecustom.moveToElement(gmrImport.Ecustom).perform();
	Thread.sleep(4000);
	
	gmrImport.Ecustom.click();Thread.sleep(4000);
		Thread.sleep(7000);
	
	}

//@ACS_GMR_3Import ----------- for direct shipment--------------

		

	
	@Given("To verify whether user is able to create Direct Shipment from Add MAWB screen ACS_GMR_Import")
	public void to_verify_whether_user_is_able_to_create_direct_shipment_from_add_mawb_screen_acs_gmr_import() throws Throwable {
	    
	



			gmr.AllRadioBtn.click();
			Thread.sleep(4000);
			
			gmr.GmrHydRadioOKBtn.click();
			Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.Imports);Thread.sleep(4000);
			
			
			WebElement Element = driver.findElement(By.id("ctl00_hldPage_btnGenerateToken"));

		    //This will scroll the page till the element is found	
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();", Element);
			
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.AddHAWBMAWBBtn);Thread.sleep(4000);
			Thread.sleep(4000);
			
			gmrImport.MAWBNoPrefix.click();Thread.sleep(4000);
			gmrImport.MAWBNoPrefix.sendKeys("999");Thread.sleep(4000);
			
			TestDataReader.AWBno();
            gmrImport.AWBNo.sendKeys(Username); Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.MAWBCalendar);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmrImport.MAWBDate);Thread.sleep(4000);
			
			//gmrImport.MAWBCalendar.click();Thread.sleep(4000);
			//gmrImport.MAWBDate.click();Thread.sleep(4000); //------------------Every should change
			
			gmrImport.OrgAirportCode.click();Thread.sleep(4000);
			gmrImport.OrgAirportCode.sendKeys("lhr");Thread.sleep(4000);
			
			Robot down = new Robot();
			down.delay(2000);
			
			down.keyPress(KeyEvent.VK_DOWN);
			down.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
			
			gmrImport.FlightNo.click();Thread.sleep(4000);
			gmrImport.FlightNo.sendKeys("5352");Thread.sleep(4000);
			
			gmrImport.FlightCalendar.click();Thread.sleep(4000);
			 gmrImport.FlightDate.click();	                       //------------------Every should change
			 Thread.sleep(4000);
			
			gmrImport.IGMNo.click();Thread.sleep(4000);
			gmrImport.IGMNo.sendKeys("8594034");Thread.sleep(4000); 
			
			gmrImport.IGMCalendar.click();Thread.sleep(4000);
			gmrImport.IGMDate.click();Thread.sleep(4000);            //------------------Every should change
				
			gmrImport.NoOfPckg.click();Thread.sleep(4000);
			gmrImport.NoOfPckg.sendKeys("3");Thread.sleep(4000);
			 
			gmrImport.GrossWt.click();Thread.sleep(4000);
			gmrImport.GrossWt.sendKeys("120");Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.ChrgWt);Thread.sleep(4000);
			gmrImport.ChrgWt.sendKeys("140");Thread.sleep(4000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,200)", "");
			Thread.sleep(4000);
			
			gmrImport.HAWBDetailsSaveBtn.click();Thread.sleep(4000);
			gmrImport.MAWBDetailsSuccessPoupMsgBtn.click();Thread.sleep(4000);
			
			
			//gmrImport.DisabledWtVarification.isEnabled();Thread.sleep(4000);
			
		//	System.out.println(gmrImport.DisabledWtVarification.isEnabled());
			
			
			//---------------------Airline DO for direct console-------------------------
			
			
			
			
			gmrImport.AirlinrDo.click();Thread.sleep(4000);
			
			
			
			wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");
		     
			Thread.sleep(8000);
			TestDataReader.Airline();
		    gmrImport.Usernametxtbox.sendKeys(Username); Thread.sleep(4000);
		    gmrImport.Passwordtxtbox.sendKeys(Password); Thread.sleep(4000);
		    loginScreen.loginbutton.click();Thread.sleep(4000);
			
			
			wm.JavascriptExecutorClick(driver, gmrImport.ImportsForAirline);Thread.sleep(4000);
		
			Actions shipmentdetails = new Actions(driver);
			//Mouseover on an element
			shipmentdetails.moveToElement(gmrImport.ShipmentDetails).perform();
			Thread.sleep(4000);
		
			wm.JavascriptExecutorClick(driver, gmrImport.ShipmentDetails);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmrImport.ShipmentDetailscheckbox);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmrImport.ApproveDeliveryOredr);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmrImport.ApproveDeliveryOredrpopup);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutArrow);Thread.sleep(4000);
			wm.JavascriptExecutorClick(driver, gmr.AirlineLogout);Thread.sleep(4000);
	}
		@When("user should be able to do BoE for Direct\\/Consol Shipment for direct shipment")
		public void user_should_be_able_to_do_bo_e_for_direct_consol_shipment_for_direct_shipment() throws Throwable {
			    
			
			TestDataReader.FFlogin();
		    gmrImport.Usernametxtbox.sendKeys(Username); Thread.sleep(4000);
		    gmrImport.Passwordtxtbox.sendKeys(Password); Thread.sleep(4000);
		    loginScreen.loginbutton.click();Thread.sleep(4000);
		    
		    
		    gmr.AllRadioBtn.click();
			Thread.sleep(4000);
			gmr.GmrHydRadioOKBtn.click();
			Thread.sleep(4000);
			
			//gmrImport.Imports.click();Thread.sleep(8000);
			wm.JavascriptExecutorClick(driver, gmrImport.Imports);Thread.sleep(4000);
			Thread.sleep(8000);
			
			System.out.println(gmrImport.EnableWtVarification.isEnabled());Thread.sleep(4000);
			System.out.println(gmrImport.DisabledConsolDo.isEnabled());Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.BoE);Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.BoENumber);Thread.sleep(4000);
			gmrImport.BoENumber.sendKeys("7474745");Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.BoEDateCalender);Thread.sleep(4000);
		    
			
			
			gmrImport.TodayDate.click();Thread.sleep(4000);
			 
			Select boetype = new Select(driver.findElement(By.id("drpSBType")));  
			boetype.selectByVisibleText("Manual");Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.CAVValue);Thread.sleep(4000);
			gmrImport.CAVValue.sendKeys("123456789123");Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.NoPForBoE);Thread.sleep(4000);
			gmrImport.NoPForBoE.sendKeys("3");Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.UploadBoE);Thread.sleep(4000);
			
			driver.switchTo().frame(0);Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.UploadBoEChooseFile);Thread.sleep(4000);
			
			WebElement boeupload = driver.findElement(By.id("ctl00_hldPage_fuctlUploadDocs"));
		    Actions boe = new Actions(driver);
		    boe.click(boeupload);
		    Action uploadboeaction  = boe.build();
		    uploadboeaction.perform();Thread.sleep(4000);
			
			 Robot uploadboe = new Robot();
			 uploadboe.delay(2000);

				StringSelection ss11 = new StringSelection("D:\\dummy documents\\pdf1.pdf");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss11, null);

				uploadboe.keyPress(KeyEvent.VK_CONTROL);
				uploadboe.keyPress(KeyEvent.VK_V);
				uploadboe.delay(2000);

				uploadboe.keyPress(KeyEvent.VK_ENTER);
//				uploaddoc.keyPress(KeyEvent.VK_ENTER);
				uploadboe.delay(1000);
				
				wm.JavascriptExecutorClick(driver, gmrImport.UploadBoEBtnChooseFile);Thread.sleep(4000);
				 //gmrImport.UploadBoEBtnChooseFileCloseBtn.click();Thread.sleep(4000);
				driver.switchTo().defaultContent();Thread.sleep(4000);
				 wm.JavascriptExecutorClick(driver, gmrImport.UploadBoEBtnChooseFileCloseBtn);Thread.sleep(4000);
				
				wm.JavascriptExecutorClick(driver, gmrImport.BillEntryDetailsSaveBtn);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.BillEntryBackbtn);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.SavemsgOkbtn);Thread.sleep(4000);
		}
			@Then("user should be able to do Pick Order for Direct\\/Consol Shipment for direct shipment.")
			public void user_should_be_able_to_do_pick_order_for_direct_consol_shipment_for_direct_shipment() throws InterruptedException {	
				
				//-----------------------------Pick order------------------------------------------	
				
					wm.JavascriptExecutorClick(driver, gmrImport.DirectShipPickorderTab);Thread.sleep(4000);
				gmrImport.PieceForExaminationtxtbox.sendKeys("1");Thread.sleep(4000);
				gmrImport.Remarkstxtbox.sendKeys("Examination");Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.PickOrdersavebtn);Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.PickOrdersaveOkbtn);Thread.sleep(4000);
	   }
				
			@When("user should be able to do OOC for Direct\\/Consol Shipment for direct shipment.")
			public void user_should_be_able_to_do_ooc_for_direct_consol_shipment_for_direct_shipment() throws InterruptedException, AWTException {
				//----------------OoC-----------------------------
				
//				
				
					wm.JavascriptExecutorClick(driver, gmrImport.OoCSubmitbtn);Thread.sleep(4000);
				gmrImport.OoCtxtboxno.sendKeys("4567897876");Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.BoEDateCalender);Thread.sleep(4000);
				gmrImport.Ooctodaydate.click();Thread.sleep(4000);
				Select boetype1 = new Select(driver.findElement(By.id("drpSBType")));  
				boetype1.selectByVisibleText("Manual");Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.OocUploaddocbtn);Thread.sleep(4000);
				driver.switchTo().frame(0);Thread.sleep(4000);
				
				WebElement boeupload1 = driver.findElement(By.id("ctl00_hldPage_fuctlUploadDocs"));
			    Actions boe1 = new Actions(driver);
			    boe1.click(boeupload1);
			    Action uploadboeaction1  = boe1.build();
			    uploadboeaction1.perform();Thread.sleep(4000);
				
				Robot uploadboe1 = new Robot();
				uploadboe1.delay(2000);

					StringSelection ss111 = new StringSelection("D:\\dummy documents\\pdf1.pdf");
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss111, null);

					uploadboe1.keyPress(KeyEvent.VK_CONTROL);
					uploadboe1.keyPress(KeyEvent.VK_V);
					uploadboe1.delay(2000);

					uploadboe1.keyPress(KeyEvent.VK_ENTER);
//					uploaddoc.keyPress(KeyEvent.VK_ENTER);
					uploadboe1.delay(1000);
					
					wm.JavascriptExecutorClick(driver, gmrImport.Oocuploadbtn);Thread.sleep(4000);
					driver.switchTo().defaultContent();Thread.sleep(4000);
					wm.JavascriptExecutorClick(driver, gmrImport.OocUploaddocClosebtn);Thread.sleep(4000);
					wm.JavascriptExecutorClick(driver, gmrImport.Oocsavebtn);Thread.sleep(4000);
					wm.JavascriptExecutorClick(driver, gmrImport.OocsavemsgOkbtn);Thread.sleep(4000);
					//WebElement icon11 = driver.findElement(By.xpath("/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[2]/div/div/div[3]/input"));
			         //// Actions ob11 = new Actions(driver);
			         // ob11.click(icon11);
			         // Action action11  = ob11.build();
			         // action11.perform();
			         // Thread.sleep(4000);
		}
				@Then("user should be able to BoE ASI and View the ACS Receipt for Direct\\/Consol Shipment for direct shipment.")
				public void user_should_be_able_to_bo_e_asi_and_view_the_acs_receipt_for_direct_consol_shipment_for_direct_shipment() throws InterruptedException {
					
		//	------------------------BOE ASI--------------------------------------------------
					
					 wm.JavascriptExecutorClick(driver, gmrImport.BOEASIicon);Thread.sleep(4000);
					wm.JavascriptExecutorClick(driver, gmrImport.Proceedbtn);Thread.sleep(4000);
					wm.JavascriptExecutorClick(driver, gmrImport.BOEASIsaveOKbtn);Thread.sleep(4000);
	    }	
			    @Then("To check if user can create TSP for Direct shipment as self assign.")
				public void to_check_if_user_can_create_tsp_for_direct_shipment_as_self_assign() throws Throwable {	
					
		//-------------------------TSP-------------------------------------------------------------			
					
			    		wm.JavascriptExecutorClick(driver, gmrImport.TSPicon);Thread.sleep(4000);
					wm.JavascriptExecutorClick(driver, gmrImport.TSPproceedbtn);Thread.sleep(4000);
					//wm.JavascriptExecutorClick(driver, gmrImport.CommodityTypedropdown);Thread.sleep(4000);
					//wm.JavascriptExecutorClick(driver, gmrImport.GeneralCargo);Thread.sleep(4000);
					driver.findElement(By.id("ctl00_hldPage_ddlTSPCommodityGroup")).sendKeys("General Cargo");
					Thread.sleep(4000);
					//wm.JavascriptExecutorClick(driver, gmrImport.CommodityNamedropdown);Thread.sleep(4000);
					//wm.JavascriptExecutorClick(driver, gmrImport.AIRCRAFTAPD);Thread.sleep(4000);
				    driver.findElement(By.id("ctl00_hldPage_ddlComodityTypeName")).sendKeys("AIRCRAFT(APD):GEN");
				    Thread.sleep(4000);
				    gmrImport.HSNcodtxtbox.sendKeys("567865");Thread.sleep(4000);
				    TestDataReader.TransactionPassword();
				    gmrImport.TransactionPasswordtxtbox.sendKeys(Username); Thread.sleep(4000);
					wm.JavascriptExecutorClick(driver, gmrImport.TSPpaynowbtn);Thread.sleep(4000);
					wm.JavascriptExecutorClick(driver, gmrImport.Yesbtn);Thread.sleep(4000);
					wm.JavascriptExecutorClick(driver, gmrImport.GenerateTSPYesbtn);Thread.sleep(4000);
			    	Thread.sleep(80000);
				
		
			//<<<<------------------	Generate Token ---------------------->>>>>>>	
					
					
//	   wm.JavascriptExecutorClick(driver, gmrImport.VehicleTokencheckbox);Thread.sleep(4000);
					
//	    wm.JavascriptExecutorClick(driver, gmrImport.GeneratetokenTab);Thread.sleep(4000);
					
			gmrImport.VehicleNo.sendKeys("MH127896");Thread.sleep(4000);
		
		gmrImport.DriverLicenseNo.sendKeys("MH7896");Thread.sleep(4000);
		
		gmrImport.DriverName.sendKeys("John");Thread.sleep(4000);
		
		gmrImport.DriverMobileNo.sendKeys("1234567891");Thread.sleep(4000);
		
		gmrImport.AgentMobileNo.sendKeys("2234567891");Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.GeneratetokenBtn);Thread.sleep(4000);
		
		gmrImport.OKbtn.click();Thread.sleep(4000);
		//gmrImport.VehicleDetailsAdd.click();Thread.sleep(4000);
		
		
		
		//----------------------------E-Docket-----------------------------------------------------------
		
		gmrImport.DirecteDocketTab.click();Thread.sleep(4000);
		gmrImport.close.click();Thread.sleep(4000);  
		
			
		
		
			
		



}
					
}
