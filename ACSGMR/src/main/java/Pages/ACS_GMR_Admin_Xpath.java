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
	
	
}
