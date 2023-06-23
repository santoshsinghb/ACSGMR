package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Methods.WebDriverMethod;

public class Export_xpath extends Pages.BasePage {

	
	
	
	public Export_xpath(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[6]/div/a/i")
	public WebElement DashboardIcon;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[6]/div/a ")
	public WebElement ExportBar;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[6]/div/ul/li[1]/div/a/span ")
	public WebElement JobMaintainenceBar;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/label[1] ")
	public WebElement NewJobButton;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[3]/div[1]/app-commonshipperautocomplete/form/div/div[3]/igx-input-group/div[1]/div/input ")
	public WebElement ShipperField;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[6]/div[1]/div/span[2]/label")
	public WebElement CBVclick;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[3]/div[2]/app-commonshipperautocomplete/form/div/div[2]/igx-input-group/div[1]/div/input ")
	public WebElement ConsineeField;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[7]/div[2]/app-commonautocomplete/form/igx-input-group/div[1]/div/input ")
	public WebElement DestinationAirportField;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[9]/div[1]/app-cargosummary/div/form/div[1]/div[1]/igx-input-group/div[1]/div/input ")
	public WebElement total_pieces;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[9]/div[1]/app-cargosummary/div/form/div[1]/div[2]/div/div[1]/igx-input-group/div[1]/div/input ")
	public WebElement gross_weight;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[9]/div/app-cargosummary/div/form/div[2]/div[1]/app-commonmultiselectdropdown/form/igx-combo/igx-input-group/div[1]/igx-suffix/igx-icon")
	public WebElement SHCdropdown;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/igx-input-group/div[1]/div/input")
	public WebElement SHCsearchBar;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[9]/div[1]/app-cargosummary/div/form/div[2]/div[2]/app-commonautocomplete/form/igx-input-group/div[1]/div/input ")
	public WebElement CommodityField;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[6]/div[2]/div/div[2]/app-commondropdown/form/igx-select/igx-input-group/div[1]/igx-suffix/igx-icon ")
	public WebElement CargoTypeDropdown;
	
	@FindBy(xpath=" /html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[6]/div[2]/div/div[3]/app-commondropdown/form/igx-select/igx-input-group/div[1]/igx-suffix/igx-icon")
	public WebElement MovementTypeDropdown;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[11]/div/button[3] ")
	public WebElement SaveButton;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[4]/span/button[1]")
	public WebElement AssignAwbButton;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[4]/span/button[1]")
	public WebElement AssignCBVButton;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[5]/form")
	public WebElement ExecuteAwbPopup;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[5]/form/div/div[1]/div[1]/igx-radio-group/igx-radio[2]/span[1]")
	public WebElement AssignAwbManual;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[5]/form/div/div[1]/div[2]/app-commondropdown/form/igx-select/igx-input-group/div[1]/div/input")
	public WebElement AssignAwbAutoStockType;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[5]/form/div/div[1]/div[3]/app-commondropdown/form/igx-select/igx-input-group/div[1]/div/input")
	public WebElement AssignAwbAutoAirline;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[5]/form/div/div[2]/div/button[3]")
	public WebElement AssignAwbAutoAssignButton;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[5]/form/div/div[1]/div[3]/app-commondropdown/form/igx-select/igx-input-group/div[1]/div/input")
	public WebElement AssignAwbManualAirline;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[5]/form/div/div[1]/div[5]/igx-input-group/div[1]/div/input")
	public WebElement AssignAwbManualAwbNumber;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[5]/form/div/div[1]/div[4]/app-commondropdown/form/igx-select/igx-input-group/div[1]/div/input")
	public WebElement AssignAwbManualPrefixNumber;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[5]/form/div/div[2]/div/button[3]")
	public WebElement Assignmanualassignbutton;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[3]/div[1]/span[2]/span[2]/button")
	public WebElement ExportChangeJobdetailsbutton;
	
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[3]/div[1]/div/form/div/div[1]/div[1]/igx-input-group/div[1]/div/input")
	public WebElement changejobdetailstocktype;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[3]/div[1]/div/form/div/div[2]/div/button[2]")
	public WebElement changeUnassignButton;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[3]/div[1]/div/form/div/div[2]/div/button[1]")
	public WebElement changecanclebutton;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[4]/div[3]")
	public WebElement flightbar;
	
	
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[5]/div[3]/app-flights/div/div[1]/div[1]/div[2]/button[1]")
	public WebElement manualbookingflightbutton;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div/div[9]/div/button[2]")
	public WebElement sendbookingrequestbutton;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div/div[9]/div/button[1]")
	public WebElement requestbookingclosebutton;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div/div/div/div/div/div[2]/div/button[2]")
	public WebElement requestcancleokbutton;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/div/div/div/div/div[4]/div[3]/app-time/form/igx-time-picker/igx-input-group/div[1]/igx-prefix/igx-icon")
	public WebElement requestbookingclockbutton;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div/div[4]/div[1]/div[2]/igx-input-group/div[1]/div/input")
	public WebElement flightnumberinput;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[4]/div[1]/span")
	public WebElement jobdetailsbutton;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[7]/div/div[2]/div/div[1]/div/igx-switch/span[1]/div")
	public WebElement finalizebutton;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[6]/div/button[1]")
	public WebElement fullfinalsavebutton;
	
	//-----------------602---------------------------
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[6]/div/button[2]")
	public WebElement savebutton602;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[4]/div[2]")
	public WebElement ratebutton602;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[5]/div[2]/app-rates/div[1]/div/div[3]/div[3]/div[2]/div[1]/h5/div/div[7]/button")
	public WebElement rateselectdropdownbar602;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[5]/div[2]/app-rates/div[1]/div/div[3]/div[3]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[7]/span/button")
	public WebElement rateacceptbuton602;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[4]/div[3]")
	public WebElement flighttab602 ;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[5]/div[3]/app-flights/div/div[1]/div[2]/div[3]/div/div/div[1]/div[7]/button[2]")
	public WebElement flightselctbutton602 ;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/form/div/div[2]/div/div[6]/div[1]/app-commondropdown/form/igx-select/igx-input-group/div[1]/igx-suffix/igx-icon")
	public WebElement stocktypeafterflight602 ;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/form/div/div[3]/div/button[2]")
	public WebElement seendbookingrequest602 ;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/form/div/div[2]/div/div[6]/div[3]/igx-input-group/div[1]/div/input")
	public WebElement AWBNUMBER602 ;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[6]/ul/li[2]/a")
	public WebElement logoutbutton602 ;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-blank-layout/app-login/div/div/div[2]/div[2]/form/div/div[1]/igx-input-group[1]/div[1]/div/input")
	public WebElement loginusername602 ;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-blank-layout/app-login/div/div/div[2]/div[2]/form/div/div[1]/igx-input-group[2]/div[1]/div/input")
	public WebElement loginuserpassword602 ;

	@FindBy(xpath="//*[@id='btnLoginId']")
	public WebElement signinbutton602 ;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[5]/div/a")
	public WebElement emirateexportbutton602 ;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[6]/div/a/em")
	public WebElement dropdownrequestbutton602 ;

	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[5]/div/ul/li[3]/div/a/span")
	public WebElement emiratebookingrequest602 ;

	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/span")
	public WebElement awbnumtext ;

	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-flight-booking-request/form/section/div/div/div[2]/div/div/div/div[1]/div[2]/div/app-search-job-dropdown/div[1]/div[1]/form/igx-input-group/div[1]/div/input")
	public WebElement searchbar602 ;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-flight-booking-request/form/section/div/div/div[3]/app-update-flight-booking-details/form/div[3]/div/div/div[2]/div[6]/button[4]")
	public WebElement confirmbookingbutton602 ;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div[2]/div/app-search-job-dropdown/div[1]/div[1]/form/igx-input-group/div[1]/div/input")
	public WebElement searchingbarmasterpage602 ;
	
	@FindBy(xpath="")
	public WebElement seen4 ;
	
	@FindBy(xpath="")
	public WebElement seen5 ;

}
