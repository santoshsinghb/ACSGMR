package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ACS_GMR_Admin_Xpath extends Pages.BasePage {

	public ACS_GMR_Admin_Xpath(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//*[@id='ctl00_btnadmin']")
	public WebElement Admin;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtBankName']")
	public WebElement BankName;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtBranchName']")
	public WebElement BranchName;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtRefNo']")
	public WebElement ChequeNo;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtAmount']")
	public WebElement Amount;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_fuctlUploadDocs']")
	public WebElement ChooseFileForAdmin;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnUpload']")
	public WebElement UploadBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSubmit']")
	public WebElement SaveBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[4]/div/div/div[3]/input")
	public WebElement SaveBtnSucesspoup;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl02_HyperLink1']")
	public WebElement AccountManagement;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl02_Repeater1_ctl02_HyperLink2']")
	public WebElement AccountLeadger;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnViewAccDtls']")
	public WebElement View;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnExcel']")
	public WebElement ExportToExcel;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnExcel']")
	public WebElement ExportToPDF;
	
	@FindBy(xpath = "//*[@class='ui-datepicker-trigger']")
	public WebElement calenderIcon ;
	
	@FindBy(xpath = "//*[@class='ui-icon ui-icon-circle-triangle-w']")
	public WebElement calenderArrow ;
	
	@FindBy(xpath = "//*[@class='ui-state-default']")
	public WebElement firstjune ;
	
	
	
	@FindBy(xpath = "//*[text()='Advance Receipts']")
	public WebElement AdvanceReciept ;
	
    @FindBy(xpath = "//*[@class='select100per']")
	public WebElement creditTypedropdown ;
    
    @FindBy(xpath = "//*[text()='Cheque/DD/PO']")
	public WebElement ChequeOption ;
    
    @FindBy(xpath = "//*[text()='Bank Transfer']")
	public WebElement BankTransferOption ;
    
    @FindBy(xpath = "//*[text()='CASH']")
	public WebElement CashOption ;
    
    @FindBy(xpath = "//*[@id='ctl00_hldPage_btnsearch']")
   	public WebElement SearchBtn ;
    
    @FindBy(xpath = "//*[@id= 'ctl00_hldPage_grdData_ctl02_updVwRecpt']")
   	public WebElement viewRecieptLink ;
    
    @FindBy(xpath = "/html/body/pdf-viewer//viewer-toolbar//div/div[3]/viewer-download-controls//cr-icon-button")
   	public WebElement downloadbtn ;
    
    @FindBy(xpath = "//*[text()='Refund Receipts']")
	public WebElement RefundReciept ;
    
    @FindBy(xpath = "//*[text()='CTO Ledger']")
	public WebElement CTOLedger ;
    
    @FindBy(xpath = "//*[@id='ctl00_hldPage_drppda']")
	public WebElement SelectCTOdropdown ;
    
    @FindBy(xpath = "//*[text()='GMR HYD']")
	public WebElement GMRHYD ;
    
    @FindBy(xpath = "//*[@class='ui-state-default ui-state-active']")
	public WebElement septdate ;
    
    
    
    
    
	
    
	
}
