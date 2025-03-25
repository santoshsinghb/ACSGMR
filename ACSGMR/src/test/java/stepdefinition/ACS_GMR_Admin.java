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
	}
	@When("User should be able to click on {string} mode and Account Credit request page should be displayed.")
	public void user_should_be_able_to_click_on_mode_and_account_credit_request_page_should_be_displayed(String string) throws InterruptedException, AWTException {
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.Admin);Thread.sleep(4000);
	
	}
	@Then("User should be able to select {string} from dropdown and In the dropdown Cheque DD\\/PO,Bank Transfer,Cash mode should be display")
	public void user_should_be_able_to_select_from_dropdown_and_in_the_dropdown_cheque_dd_po_bank_transfer_cash_mode_should_be_display(String string) throws InterruptedException {
	
	Select dropdown = new Select(driver.findElement(By.id("ctl00_hldPage_drpCreditType")));  
	dropdown.selectByVisibleText("Bank Transfer");
	
	}
	@Then("User should be able to enter {string},\"Branch Name\"and {string} in the textbox")
	public void user_should_be_able_to_enter_branch_name_and_in_the_textbox(String string, String string2) throws InterruptedException, AWTException {
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.BankName);Thread.sleep(2000);
	gmrAdmin.BankName.sendKeys("ICICI Bank");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.BranchName);Thread.sleep(2000);
	gmrAdmin.BranchName.sendKeys("Thane");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.ChequeNo);Thread.sleep(2000);
	gmrAdmin.ChequeNo.sendKeys("CHL34567");Thread.sleep(2000);
	}
	
	@Then("User should be able to enter amount range in the {string},enter the \"Remark\\(Opt.)\"and click on {string} and select the file to upload.File name should be displayed at the side of the {string} button.")
	public void user_should_be_able_to_enter_amount_range_in_the_enter_the_remark_opt_and_click_on_and_select_the_file_to_upload_file_name_should_be_displayed_at_the_side_of_the_button(String string, String string2, String string3) throws InterruptedException, AWTException {
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.Amount);Thread.sleep(2000);
	gmrAdmin.Amount.sendKeys("20000");Thread.sleep(2000);
	}
	@Then("User should be able to click on {string} to upload the file and  User should be able to click on {string} button")
	public void user_should_be_able_to_click_on_to_upload_the_file_and_user_should_be_able_to_click_on_button(String string, String string2) throws InterruptedException, AWTException {
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.ChooseFileForAdmin);Thread.sleep(2000);
	
	Robot uploaddoc = new Robot();
	uploaddoc.delay(2000);

	StringSelection sss1 = new StringSelection("D:\\dummy documents\\pdf1.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sss1, null);

	uploaddoc.keyPress(KeyEvent.VK_CONTROL);
	uploaddoc.keyPress(KeyEvent.VK_V);
	uploaddoc.delay(2000);

	uploaddoc.keyPress(KeyEvent.VK_ENTER);

	uploaddoc.delay(1000);
	

	wm.JavascriptExecutorClick(driver, gmrAdmin.UploadBtn);Thread.sleep(2000);
	}
	
	
	
	@Then("User should be able to click on {string} button of successful message dialogue box and Account Credit Request page should be displayed.")
	public void user_should_be_able_to_click_on_button_of_successful_message_dialogue_box_and_account_credit_request_page_should_be_displayed(String string) throws InterruptedException {
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.SaveBtn);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.SaveBtnSucesspoup);Thread.sleep(2000);
	
	Actions action = new Actions(driver);
	
	action.moveToElement(gmrAdmin.AccountManagement).perform();
	Thread.sleep(1000);
	}
	
	@Then("User should be able to view the Account Ledger and User should be able to login with FF credentials and  click on {string} mode.")
	public void user_should_be_able_to_view_the_account_ledger_and_user_should_be_able_to_login_with_ff_credentials_and_click_on_mode(String string) throws InterruptedException {
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.AccountManagement);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.AccountLeadger);Thread.sleep(2000);
	}
	//------------------------For Export dropdown-------------------------------------------
	
	
	@Then("User should be able to click on {string} sub-menu of Account Management menu.")
	public void user_should_be_able_to_click_on_sub_menu_of_account_management_menu(String string) throws InterruptedException {
	
	Select mode = new Select(driver.findElement(By.id("ctl00_hldPage_drppda")));  
	mode.selectByVisibleText("Exports");
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.View);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.ExportToExcel);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmrAdmin.ExportToPDF);Thread.sleep(1000);
	
	//driver.navigate().refresh();Thread.sleep(1000);
	
	//ChromeOptions options = new ChromeOptions();
	//DesiredCapabilities caps = new DesiredCapabilities();
    //caps.setCapability("browser", "Chrome");
    //caps.setCapability("browser_version", "75.0");
    //caps.setCapability("os", "Windows");
    //caps.setCapability("os_version", "10");
    //caps.setCapability(ChromeOptions.CAPABILITY, options);
    //WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	Thread.sleep(1000);
	// WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	//driver.switchTo().alert().accept();Thread.sleep(1000);
	
	}
	//------------------------For Import dropdown-------------------------------------------
	
	
	@Then("User should be able to select the Mode From Dropdown and In the dropdown Export, Import and Both mode should be display System should display the selected option.")
	public void user_should_be_able_to_select_the_mode_from_dropdown_and_in_the_dropdown_export_import_and_both_mode_should_be_display_system_should_display_the_selected_option() throws InterruptedException {
	
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
	
	
	DesiredCapabilities caps2 = new DesiredCapabilities();
    caps2.setCapability("browser", "Chrome");
    caps2.setCapability("browser_version", "75.0");
    caps2.setCapability("os", "Windows");
    caps2.setCapability("os_version", "10");
    
    String options2 = null;
	caps2.setCapability(ChromeOptions.CAPABILITY, options2);
	Thread.sleep(1000);
	}
	
	@Then("User should be able to select {string} from the calendar icon or can change the date by arrow keys from keyboard.")
	public void user_should_be_able_to_select_from_the_calendar_icon_or_can_change_the_date_by_arrow_keys_from_keyboard(String string) throws InterruptedException {
		wm.JavascriptExecutorClick(driver, gmrAdmin.calenderIcon);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmrAdmin.calenderArrow);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmrAdmin.calenderArrow);Thread.sleep(2000);
	}
	@Then("User should be able to click on {string} button and All the credits and debits for each AWB no. should be displayed in the grid.")
	public void user_should_be_able_to_click_on_button_and_all_the_credits_and_debits_for_each_awb_no_should_be_displayed_in_the_grid(String string) throws InterruptedException {
		wm.JavascriptExecutorClick(driver, gmrAdmin.firstjune);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrAdmin.View);Thread.sleep(20000);
	
	}
	
	@Then("User should be able to Click on {string} sub-menu of {string} menu and Advance Receipt page should be displayed.")
	public void user_should_be_able_to_click_on_sub_menu_of_menu_and_advance_receipt_page_should_be_displayed(String string, String string2) throws InterruptedException {
		wm.JavascriptExecutorClick(driver, gmrAdmin.AccountManagement);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrAdmin.AdvanceReciept);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrAdmin.calenderIcon);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrAdmin.calenderArrow);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrAdmin.calenderArrow);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrAdmin.firstjune);Thread.sleep(2000);
		
	
	
	}
	@Then("User should be able to select {string} from dropdown and In the dropdown Cheque DD\\/PO,Bank Transfer,Cash mode should be display.")
	public void user_should_be_able_to_select_from_dropdown_and_in_the_dropdown_cheque_dd_po_bank_transfer_cash_mode_should_be_display1(String string) throws InterruptedException {
		
		gmrAdmin.creditTypedropdown.click();Thread.sleep(2000);
		gmrAdmin.CashOption.click();Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmrAdmin.SearchBtn);Thread.sleep(2000);
		gmrAdmin.BankTransferOption.click();Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmrAdmin.SearchBtn);Thread.sleep(2000);
		
	}
	@Then("User should be able to click on {string} button and Records should be displayed to the user according to the applied filters.")
	public void user_should_be_able_to_click_on_button_and_records_should_be_displayed_to_the_user_according_to_the_applied_filters(String string) throws InterruptedException {
		
//		gmrAdmin.ChequeOption.click();Thread.sleep(2000);
//		wm.JavascriptExecutorClick(driver, gmrAdmin.SearchBtn);Thread.sleep(2000);
	}
	@Then("User should be able to click on View Recipt from grid and PDF file should be downloaded with the Recipt")
	public void user_should_be_able_to_click_on_view_recipt_from_grid_and_pdf_file_should_be_downloaded_with_the_recipt() throws InterruptedException {
		
		gmrAdmin.viewRecieptLink.click();Thread.sleep(6000);
		
		
		driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/PDAStatusListing.aspx");
		
		
	}

	
	@Then("User should be able to click on {string} sub-menu of  Account Management menu and Refund Receipt page should be displayed.")
	public void user_should_be_able_to_click_on_sub_menu_of_account_management_menu_and_refund_receipt_page_should_be_displayed(String string) throws InterruptedException {
        
		wm.JavascriptExecutorClick(driver, gmrAdmin.AccountManagement);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrAdmin.RefundReciept);Thread.sleep(2000);
		
		
		
	}
	@Then("User should be able to select {string} from the calendar icon or can change the date by arrow keys from keyboard and User should be able to click on {string} button and  Records should be displayed to the user according to the applied filters.")
	public void user_should_be_able_to_select_from_the_calendar_icon_or_can_change_the_date_by_arrow_keys_from_keyboard_and_user_should_be_able_to_click_on_button_and_records_should_be_displayed_to_the_user_according_to_the_applied_filters(String string, String string2) throws InterruptedException {
        
		wm.JavascriptExecutorClick(driver, gmrAdmin.calenderIcon);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrAdmin.calenderArrow);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrAdmin.calenderArrow);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrAdmin.firstjune);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrAdmin.SearchBtn);Thread.sleep(6000);
	}

	

	@Then("User should be able to click on {string} sub-menu of Account Management menu and PD Acc.Report page should be displayed.")
	public void user_should_be_able_to_click_on_sub_menu_of_account_management_menu_and_pd_acc_report_page_should_be_displayed(String string) throws InterruptedException {
        
		
		wm.JavascriptExecutorClick(driver, gmrAdmin.AccountManagement);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrAdmin.CTOLedger);Thread.sleep(2000);
		
       
	}
	@Then("User should be able to select the CTO From Dropdown and System should display the selected option.")
	public void user_should_be_able_to_select_the_cto_from_dropdown_and_system_should_display_the_selected_option() throws InterruptedException {
		
		
		
	}
	@Then("User should be able to select {string} from the calendar icon or can change the date by arrow keys from keyboard andUser should be able to click on {string} button All the credits and debits for each AWB no. should be displayed in the grid.")
	public void user_should_be_able_to_select_from_the_calendar_icon_or_can_change_the_date_by_arrow_keys_from_keyboard_and_user_should_be_able_to_click_on_button_all_the_credits_and_debits_for_each_awb_no_should_be_displayed_in_the_grid(String string, String string2) throws InterruptedException {
		   
		
		
		
		
		
		    wm.JavascriptExecutorClick(driver, gmrAdmin.calenderIcon);Thread.sleep(2000);
			
			
			
			wm.JavascriptExecutorClick(driver, gmrAdmin.septdate);Thread.sleep(2000);
			
			Select objSelect =new Select(driver.findElement(By.id("ctl00_hldPage_drppda")));
			objSelect.selectByVisibleText("GMR HYD");
			
			
			//wm.JavascriptExecutorClick(driver, gmrAdmin.SelectCTOdropdown);Thread.sleep(4000);
			//gmrAdmin.SelectCTOdropdown.click();Thread.sleep(2000);
			//wm.JavascriptExecutorClick(driver, gmrAdmin.GMRHYD);Thread.sleep(4000);
			//gmrAdmin.GMRHYD.click();Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmrAdmin.View);Thread.sleep(20000);
			
	}
	@Then("User should be able to click on {string} button and Excel file should be downloaded with the credits and debits details for each AWB no.")
	public void user_should_be_able_to_click_on_button_and_excel_file_should_be_downloaded_with_the_credits_and_debits_details_for_each_awb_no(String string) throws InterruptedException {
		
		wm.JavascriptExecutorClick(driver, gmrAdmin.ExportToExcel);Thread.sleep(2000);
		
		
	}
	@Then("User should be able to click on {string} button and PDF file should be downloaded with the credits and debits details for each AWB no")
	public void user_should_be_able_to_click_on_button_and_pdf_file_should_be_downloaded_with_the_credits_and_debits_details_for_each_awb_no(String string) throws InterruptedException {
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
