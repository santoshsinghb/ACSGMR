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
		Thread.sleep(4000);	
		
		
	}
	
	@Given("^To verify whether user is able to create Direct Shipment from Add MAWB/HAWB screen ACS_GMR_Import$")
	public void To_verify_whether_user_is_able_to_create_Direct_Shipment_from_Add_MAWB_HAWB_screen_ACS_GMR_Import() throws InterruptedException, AWTException {

	gmr.AllRadioBtn.click();
	Thread.sleep(2000);
	
	gmr.GmrHydRadioOKBtn.click();
	Thread.sleep(2000);
	
	gmrImport.Imports.click();
	Thread.sleep(2000);
	
	WebElement Element = driver.findElement(By.id("ctl00_hldPage_btnGenerateToken"));

    //This will scroll the page till the element is found	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", Element);
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,1000)", "");
	Thread.sleep(2000);
	
	gmrImport.AddHAWBMAWBBtn.click();
	Thread.sleep(2000);
	
	gmrImport.MAWBNoPrefix.click();Thread.sleep(1000);
	gmrImport.MAWBNoPrefix.sendKeys("999");Thread.sleep(1000);
	
	gmrImport.AWBNo.click();Thread.sleep(1000);
	gmrImport.AWBNo.sendKeys("56435610");Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmrImport.MAWBCalendar);Thread.sleep(4000);
	wm.JavascriptExecutorClick(driver, gmrImport.MAWBDate);Thread.sleep(4000);
	
	//gmrImport.MAWBCalendar.click();Thread.sleep(1000);
	//gmrImport.MAWBDate.click();Thread.sleep(1000); //------------------Every should change
	
	gmrImport.OrgAirportCode.click();Thread.sleep(1000);
	gmrImport.OrgAirportCode.sendKeys("lhr");Thread.sleep(1000);
	
	Robot down = new Robot();
	down.delay(2000);
	
	down.keyPress(KeyEvent.VK_DOWN);
	down.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	
	gmrImport.FlightNo.click();Thread.sleep(1000);
	gmrImport.FlightNo.sendKeys("5352");Thread.sleep(1000);
	
	gmrImport.FlightCalendar.click();Thread.sleep(1000);
	 gmrImport.FlightDate.click();	                       //------------------Every should change
	 Thread.sleep(2000);
	
	gmrImport.IGMNo.click();Thread.sleep(1000);
	gmrImport.IGMNo.sendKeys("8594034");Thread.sleep(1000); 
	
	gmrImport.IGMCalendar.click();Thread.sleep(1000);
	gmrImport.IGMDate.click();Thread.sleep(1000);            //------------------Every should change
		
	gmrImport.NoOfPckg.click();Thread.sleep(1000);
	gmrImport.NoOfPckg.sendKeys("2");Thread.sleep(1000);
	 
	gmrImport.GrossWt.click();Thread.sleep(1000);
	gmrImport.GrossWt.sendKeys("120");Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmrImport.ChrgWt);Thread.sleep(2000);
	gmrImport.ChrgWt.sendKeys("140");Thread.sleep(1000);
	
	//------------------------------------HAWB Details------------------------------------------------
	
	gmrImport.HAWBNo.click();Thread.sleep(1000);
	gmrImport.HAWBNo.sendKeys("h1");Thread.sleep(1000);
	
	gmrImport.HAWBDetailsCalendar.click();Thread.sleep(1000);
	gmrImport.HAWBDetailsDate.click();Thread.sleep(1000);
	
	gmrImport.origin.click();Thread.sleep(1000);
	gmrImport.origin.sendKeys("LHR");Thread.sleep(1000);
	
	gmrImport.Package.click();Thread.sleep(1000);
	gmrImport.Package.sendKeys("2");Thread.sleep(1000);
	
	gmrImport.GrossWtOfHAWBDetails.click();Thread.sleep(1000);
	gmrImport.GrossWtOfHAWBDetails.sendKeys("120");Thread.sleep(1000);
	
	gmrImport.ChargeWtOfHAWBDetails.click();Thread.sleep(1000);
	gmrImport.ChargeWtOfHAWBDetails.clear();Thread.sleep(1000);
	gmrImport.ChargeWtOfHAWBDetails.sendKeys("140");Thread.sleep(1000);
	
	gmrImport.ReceivedPckgOfHAWBDetails.click();Thread.sleep(1000);
	gmrImport.ReceivedPckgOfHAWBDetails.sendKeys("1");Thread.sleep(1000);
	
	gmrImport.ReceivedGrossWtOfHAWBDetails.click();Thread.sleep(1000);
	gmrImport.ReceivedGrossWtOfHAWBDetails.sendKeys("120");Thread.sleep(1000);
	
	gmrImport.ReceivedChrgWtOfHAWBDetails.click();Thread.sleep(1000);
	
	
	
	gmrImport.DescriptionOfHAWBDetails.click();Thread.sleep(1000);
	gmrImport.DescriptionOfHAWBDetails.sendKeys("Done");Thread.sleep(1000);
	
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,200)", "");
	Thread.sleep(1000);
	
	gmrImport.HAWBDetailsSaveBtn.click();Thread.sleep(1000);
	
	gmrImport.MAWBDetailsSuccessPoupMsgBtn.click();Thread.sleep(1000);
	
	
	//-----------------------------Generate Token---------------------------------------
	gmrImport.MAWBNOInShipmentDetails.click();Thread.sleep(2000);
	gmrImport.MAWBNOInShipmentDetails.sendKeys("67854323");Thread.sleep(2000);
	
	//gmrImport.MAWBNOInShipmentDetailsDownArrow.click();Thread.sleep(2000);
	//gmrImport.Contains.click();Thread.sleep(4000);
	//gmrImport.Imports.click();
	//Thread.sleep(4000);
	
	gmrImport.AirlinrDo.click();Thread.sleep(2000);
	
	Thread.sleep(8000);

	wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");

	Thread.sleep(8000);
	}
	
	@Then("I login with {string} airline user given in {string} sheet ACS_GMR_Import")
	public void i_login_with_airline_user_given_in_sheet_ACS_GMR_Import(String entity, String sheetName) throws Throwable {
//	gmrImport.CloseBtn.click();
		Thread.sleep(4000);
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(4000);	
		
		
		wm.JavascriptExecutorClick(driver, gmrImport.ImportsForAirline);Thread.sleep(2000);
	
		Actions shipmentdetails = new Actions(driver);
		//Mouseover on an element
		shipmentdetails.moveToElement(gmrImport.ShipmentDetails).perform();
		Thread.sleep(2000);
	
		wm.JavascriptExecutorClick(driver, gmrImport.ShipmentDetails);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ShipmentDetailscheckbox);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ApproveDeliveryOredr);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmrImport.ApproveDeliveryOredrpopup);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutArrow);Thread.sleep(2000);
			
		wm.JavascriptExecutorClick(driver, gmr.AirlineLogout);Thread.sleep(2000);
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
			
			//gmrImport.MAWBNOInShipmentDetails.click();Thread.sleep(2000);
			//gmrImport.MAWBNOInShipmentDetails.sendKeys("56789342");Thread.sleep(2000);
			
			//gmrImport.MAWBNOInShipmentDetailsDownArrow.click();Thread.sleep(2000);
			//gmrImport.Contains.click();Thread.sleep(4000);
			gmr.AllRadioBtn.click();
			Thread.sleep(2000);
			
			gmr.GmrHydRadioOKBtn.click();
			Thread.sleep(2000);
			
			gmrImport.Imports.click();
			Thread.sleep(2000);
			
		wm.JavascriptExecutorClick(driver, gmrImport.WeightVerification);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.WeightVerificationUploadDocs);Thread.sleep(2000);
		
		driver.switchTo().frame(0);Thread.sleep(1000);
		
		//wm.JavascriptExecutorClick(driver, gmrImport.UploadHAWBDocRadioBtn);Thread.sleep(2000);
		
		//wm.JavascriptExecutorClick(driver, gmrImport.UploadHAWBDocchoosefile);Thread.sleep(2000);
		
		
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
		
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBtn);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBtnPopup);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBtnPopupClose);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ChargWtExcelUpload);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ChargWtExcelUploadChooseFile);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmrImport.ChargWtExcelUploadChooseFile);Thread.sleep(2000);
		
		
		
	      
	      WebElement destname = driver.findElement(By.id("ctl00_hldPage_fuuploadexcel"));
	      Actions dest = new Actions(driver);
	      dest.click(destname);
	      Action destnameaction  = dest.build();
	      destnameaction.perform();Thread.sleep(2000);
	      
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
			
		wm.JavascriptExecutorClick(driver, gmrImport.DownloadSampleExcelTemplate);Thread.sleep(2000);
			
		wm.JavascriptExecutorClick(driver, gmrImport.ChargeWtpopupUpload);Thread.sleep(2000);
			
		wm.JavascriptExecutorClick(driver, gmrImport.wtVerificationsubmit);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.wtVerificationsubmitpopup);Thread.sleep(2000);
			
		wm.JavascriptExecutorClick(driver, gmrImport.ConsoleDoRevoke);Thread.sleep(8000);
		
		//wm.JavascriptExecutorClick(driver, gmrImport.ConsoleDoCBdropdwon);Thread.sleep(8000);
		
		WebElement icon0 = driver.findElement(By.id("ctl00_hldPage_ddlCHA"));
        Actions ob0 = new Actions(driver);
        ob0.click(icon0);
        Action action0  = ob0.build();
        action0.perform();
		Thread.sleep(4000);
        
        gmrImport.AADHYALOGISTICS.click();
		
	    wm.JavascriptExecutorClick(driver, gmrImport.ConsoleDoSubmit);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ConsoleDoSubmittedSuccessfully);Thread.sleep(2000);
	    
	    gmrImport.FFlogOutArrow.click();Thread.sleep(2000);
	    gmrImport.FFlogOutTab.click();Thread.sleep(4000);
	    
	   
	    
	    // -------------------CB login------------------BOE--------------------->
	   
	    //gmrImport.CloseBtn.click();Thread.sleep(2000);
	    
	    TestDataReader.CBloginAadhya();
	    gmrImport.Usernametxtbox.sendKeys(Username); Thread.sleep(2000);
	    gmrImport.Passwordtxtbox.sendKeys(Password); Thread.sleep(2000);
	    loginScreen.loginbutton.click();Thread.sleep(4000);
	    
	    
	   // wm.JavascriptExecutorClick(driver, gmrImport.AllRadioBtn);Thread.sleep(2000);
	    gmrImport.AllRadioBtn.click();
		Thread.sleep(2000);
		
		gmrImport.CBImportTab.click();
		Thread.sleep(2000);
		
		//Actions reports = null;
		//reports.moveToElement(gmrImport.BussinessLine).perform();
		//Thread.sleep(4000);
		
		Actions action2 = new Actions(driver);
		action2.moveToElement(gmrImport.BussinessLine).perform();
		
		gmrImport.CustomerBroker.click();Thread.sleep(4000);
	  
		wm.JavascriptExecutorClick(driver, gmrImport.BoE);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.BoENumber);Thread.sleep(2000);
		gmrImport.BoENumber.sendKeys("7474745");Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.BoEDateCalender);Thread.sleep(4000);
	    
		
		
		gmrImport.TodayDate.click();Thread.sleep(2000);
		 
		Select boetype = new Select(driver.findElement(By.id("drpSBType")));  
		boetype.selectByVisibleText("Manual");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.CAVValue);Thread.sleep(2000);
		gmrImport.CAVValue.sendKeys("123456789123");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.NoPForBoE);Thread.sleep(2000);
		gmrImport.NoPForBoE.sendKeys("1");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBoE);Thread.sleep(2000);
		
		driver.switchTo().frame(0);Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBoEChooseFile);Thread.sleep(2000);
		
		WebElement boeupload = driver.findElement(By.id("ctl00_hldPage_fuctlUploadDocs"));
	    Actions boe = new Actions(driver);
	    boe.click(boeupload);
	    Action uploadboeaction  = boe.build();
	    uploadboeaction.perform();Thread.sleep(2000);
		
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
			driver.switchTo().defaultContent();Thread.sleep(2000);
			 wm.JavascriptExecutorClick(driver, gmrImport.UploadBoEBtnChooseFileCloseBtn);Thread.sleep(4000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.BillEntryDetailsSaveBtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmrImport.BillEntryBackbtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmrImport.SavemsgOkbtn);Thread.sleep(2000);
	
		
			
			//-----------------------------Pick order------------------------------------------	
			
			wm.JavascriptExecutorClick(driver, gmrImport.PickOrderSubmitbtn);Thread.sleep(2000);
			gmrImport.PieceForExaminationtxtbox.sendKeys("1");Thread.sleep(2000);
			gmrImport.Remarkstxtbox.sendKeys("Examination");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmrImport.PickOrdersavebtn);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmrImport.PickOrdersaveOkbtn);Thread.sleep(2000);
			
			
			
			//----------------OoC-----------------------------
			
//			
			
			wm.JavascriptExecutorClick(driver, gmrImport.OoCSubmitbtn);Thread.sleep(2000);
			gmrImport.OoCtxtboxno.sendKeys("4567897876");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmrImport.BoEDateCalender);Thread.sleep(4000);
			gmrImport.Ooctodaydate.click();Thread.sleep(2000);
			Select boetype1 = new Select(driver.findElement(By.id("drpSBType")));  
			boetype1.selectByVisibleText("Manual");Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmrImport.OocUploaddocbtn);Thread.sleep(2000);
			driver.switchTo().frame(0);Thread.sleep(1000);
			
			WebElement boeupload1 = driver.findElement(By.id("ctl00_hldPage_fuctlUploadDocs"));
		    Actions boe1 = new Actions(driver);
		    boe1.click(boeupload1);
		    Action uploadboeaction1  = boe1.build();
		    uploadboeaction1.perform();Thread.sleep(2000);
			
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
				
				wm.JavascriptExecutorClick(driver, gmrImport.Oocuploadbtn);Thread.sleep(2000);
				driver.switchTo().defaultContent();Thread.sleep(2000);
				wm.JavascriptExecutorClick(driver, gmrImport.OocUploaddocClosebtn);Thread.sleep(2000);
				wm.JavascriptExecutorClick(driver, gmrImport.Oocsavebtn);Thread.sleep(2000);
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
				wm.JavascriptExecutorClick(driver, gmrImport.BOEASIsaveOKbtn);Thread.sleep(2000);
				
				
				
				//--------------------TSP--------------------------------
				 
				wm.JavascriptExecutorClick(driver, gmrImport.TSPicon);Thread.sleep(2000);
				wm.JavascriptExecutorClick(driver, gmrImport.TSPproceedbtn);Thread.sleep(2000);
				//wm.JavascriptExecutorClick(driver, gmrImport.CommodityTypedropdown);Thread.sleep(4000);
				//wm.JavascriptExecutorClick(driver, gmrImport.GeneralCargo);Thread.sleep(4000);
				driver.findElement(By.id("ctl00_hldPage_ddlTSPCommodityGroup")).sendKeys("General Cargo");
				Thread.sleep(2000);
				//wm.JavascriptExecutorClick(driver, gmrImport.CommodityNamedropdown);Thread.sleep(4000);
				//wm.JavascriptExecutorClick(driver, gmrImport.AIRCRAFTAPD);Thread.sleep(4000);
			    driver.findElement(By.id("ctl00_hldPage_ddlComodityTypeName")).sendKeys("AIRCRAFT(APD):GEN");
			    Thread.sleep(2000);
			    gmrImport.HSNcodtxtbox.sendKeys("567865");Thread.sleep(4000);
				gmrImport.TransactionPasswordtxtbox.sendKeys("Kale@123");Thread.sleep(4000);
				wm.JavascriptExecutorClick(driver, gmrImport.TSPpaynowbtn);Thread.sleep(2000);
				wm.JavascriptExecutorClick(driver, gmrImport.Yesbtn);Thread.sleep(2000);
				wm.JavascriptExecutorClick(driver, gmrImport.GenerateTSPYesbtn);Thread.sleep(4000);
				
			
	
		//<<<<------------------	Generate Token ---------------------->>>>>>>	
				
				
   //wm.JavascriptExecutorClick(driver, gmrImport.VehicleTokencheckbox);Thread.sleep(4000);
				
  //  wm.JavascriptExecutorClick(driver, gmrImport.GeneratetokenTab);Thread.sleep(4000);
				
	gmrImport.VehicleNo.sendKeys("MH127896");Thread.sleep(2000);
	
	gmrImport.DriverLicenseNo.sendKeys("MH7896");Thread.sleep(2000);
	
	gmrImport.DriverName.sendKeys("John");Thread.sleep(2000);
	
	gmrImport.DriverMobileNo.sendKeys("1234567891");Thread.sleep(2000);
	
	gmrImport.AgentMobileNo.sendKeys("2234567891");Thread.sleep(4000);
	
	wm.JavascriptExecutorClick(driver, gmrImport.GeneratetokenBtn);Thread.sleep(4000);
	
	gmrImport.OKbtn.click();Thread.sleep(2000);
	//gmrImport.VehicleDetailsAdd.click();Thread.sleep(1000);
	
	
	//----------------------------E-Docket-----------------------------------------------------------
	
	gmrImport.eDocketIcon.click();Thread.sleep(4000);
	gmrImport.close.click();Thread.sleep(2000);
	
	
	//-----------------------Track and Trace----------------------------------------

	Actions action2111 = new Actions(driver);
	action2111.moveToElement(gmrImport.BussinessLine).perform();
	gmrImport.FF.click();Thread.sleep(4000);
	
	Actions tracktrace = new Actions(driver);
	//Mouseover on an element
	tracktrace.moveToElement(gmrImport.TrackTrace).perform();
	Thread.sleep(1000);
	
	gmrImport.TrackTrace.click();Thread.sleep(2000);
	
	Actions gstinfo = new Actions(driver);
	//Mouseover on an element
	gstinfo.moveToElement(gmrImport.GSTInfo).perform();
	Thread.sleep(1000);
	
	gmrImport.GSTInfo.click();Thread.sleep(1000);
	
	Actions reports = new Actions(driver);
	//Mouseover on an element
	reports.moveToElement(gmrImport.Reports).perform();
	Thread.sleep(1000);
	
	gmrImport.TransactionReports.click();Thread.sleep(1000);
	
	Select cto = new Select(driver.findElement(By.id("ctl00_hldPage_ddlTerminal")));  
	cto.selectByVisibleText("Kale_GHA1");
	
	gmrImport.ExportToExcelTransactionReport.click();Thread.sleep(1000);
	
	
	//Mouseover on an element
	reports.moveToElement(gmrImport.Reports).perform();
	Thread.sleep(1000);
	
	gmrImport.DwellTimeReport.click();Thread.sleep(1000);
	
	gmrImport.DwellTimeReportExportToExcel.click();Thread.sleep(1000);
	
	reports.moveToElement(gmrImport.Reports).perform();
	Thread.sleep(1000);
	
	gmrImport.TonnageReport.click();Thread.sleep(1000);
	
	gmrImport.TonnageReportAirport.click();Thread.sleep(1000);
	gmrImport.TonnageReportAirport.sendKeys("HYD");Thread.sleep(1000);
	
	gmrImport.TonnageReportExportToExcel.click();Thread.sleep(1000);
	
	Actions ecustom = new Actions(driver);
	//Mouseover on an element
	ecustom.moveToElement(gmrImport.Ecustom).perform();
	Thread.sleep(1000);
	
	gmrImport.Ecustom.click();Thread.sleep(1000);
	
	}
		
}
