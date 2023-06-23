package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class GeneralOprations extends Pages.BasePage {

	public GeneralOprations(WebDriver driver) {
		super(driver);
	
	}


	@FindBy(xpath = "//*[@class='dashboardDefault']")
	public WebElement ExportModule;
		
	@FindBy(xpath = "//*[@title='Export']")
		public WebElement ExportModuleArrow;
		
	@FindBy(xpath = "//*[text()='Job Maintenance']")
	//@FindBy(xpath = "//*[text()='Job Maintenance']/parent::a/parent::div/parent::li/parent::ul/parent::div/parent::li/parent::ul/li[6]/div/ul/li[1]/div/a/span")
		public WebElement JobMaintenance;
	
	@FindBy(xpath = "//*[@title = 'Job Maintenance']/div/a/span")
	public WebElement JobMaintenance1;
	
	//house job tab
	@FindBy(xpath = "(//*[@class='listview__top-tabs'])/ul/li[2]")
	public WebElement HouseJobTabUpper;
	
	@FindBy(xpath = "(//*[@class='listview__top-tabs'])/ul/li[1]")
	public WebElement MasterJobTabUpper;
	
	//Click on new job button
	@FindBy(xpath = "//*[@class='floating-btn']")
    public WebElement NewJob;
	
	
	// XPath for new job
	@FindBy(xpath = "(//*[text()='(Add Shipper)'])[1]")
    public WebElement NewJob_AddShipper;
		
	@FindBy(xpath = "(//*[text()='(Add Consignee)'])[1]")
    public WebElement NewJob_AddConsignee;
		

	@FindBy(xpath = "//*[@formcontrolname='Code']")
    public WebElement NewJob_AddShipper_Code;
		
//	@FindBy(id = "txtCodeId")
//    public WebElement NewJob_AddShipper_Code;
		

	@FindBy(xpath = "//*[@id='txtNameId']")
    public WebElement NewJob_AddShipper_Name;
		
	@FindBy(xpath = "//*[@formcontrolname='Address1']")
	//@FindBy(xpath = "(//*[@formcontrolname='Address1'])[2]")
    public WebElement NewJob_AddShipper_Address1;
		

	@FindBy(xpath = "//*[@formcontrolname='Address2']")
    public WebElement NewJob_AddShipper_Address2;
		

	@FindBy(xpath = "//*[@formcontrolname='Address3']")
    public WebElement NewJob_AddShipper_Address3;
		

	@FindBy(xpath = "(//*[@commonlabel='Airport *'])/form/igx-input-group/div/div/input")
    public WebElement NewJob_AddShipper_Airport;
		
	@FindBy(xpath = "//*[@aria-label='DXB-Dubai International Airport']")
    public WebElement NewJob_AddShipper_Airport_DXB_Dubai;
	
	@FindBy(xpath = "//*[@id=\"igx-drop-down-item-218\"]/span")
    public WebElement NewJob_AddShipper_Airport_DXB_Dubai_Select;
	

	@FindBy(xpath = "//*[@aria-label='LHR-Heathrow Airport']/span")
    public WebElement NewJob_AddShipper_Airport_LHR_Select;

	@FindBy(xpath = "//*[@aria-label='LHR - Heathrow Airport ( United Kingdom ) ']/span")
    public WebElement NewJob_Destinatio_Airport_LHR_Select;	
	
	@FindBy(xpath = "//*[@id=\"igx-drop-down-71-list\"]")
    public WebElement NewJob_AddShipper_Airport_drpdwn_List;
	
	@FindBy(xpath = "//*[@formcontrolname='EmailId']")
	//@FindBy(xpath = "(//*[@formcontrolname='EmailId'])[2]")
    public WebElement NewJob_AddShipper_EmailId;
		

	@FindBy(xpath = "//*[@formcontrolname='ISDCode']")
    public WebElement NewJob_AddShipper_ISDCode;
		

	@FindBy(xpath = "//*[@formcontrolname='Telephone']")
	//@FindBy(xpath = "(//*[@formcontrolname='Telephone'])[2]")
    public WebElement NewJob_AddShipper_Telephone;
		
	
	@FindBy(xpath = "//*[@formcontrolname='MobileNo']")
    public WebElement NewJob_AddShipper_MobileNo;
		

	@FindBy(xpath = "//*[@formcontrolname='Fax']")
    public WebElement NewJob_AddShipper_Fax;
		

	@FindBy(xpath = "//*[@formcontrolname='ZipCode']")
    public WebElement NewJob_AddShipper_ZipCode;
		

	@FindBy(xpath = "//*[@id='btnsaveId']")
    public WebElement NewJob_AddShipper_save;
		

	@FindBy(xpath = "(//*[@id='btncloseId'])[5]")
    public WebElement NewJob_AddShipper_close;
		

	@FindBy(xpath = "(//*[text()='(Add Shipper)'])[1]/parent::p/parent::div/parent::div/following-sibling::igx-input-group/div/div/input")
    public WebElement NewJob_Add_shipper_input;	 
	
	@FindBy(xpath = "(//*[text()='Shipper *'])/parent::div/input")
    public WebElement ShipperNameDropdown;
	
	  @FindBy(xpath = "//*[@aria-label='PriyankaIndustries(8391)']/span/span")
	  public WebElement NewJob_Add_shipper_input_Name;
	  
	  @FindBy(xpath = "//*[@aria-label='DiyaIndustries(1428)']/span/span")
	  public WebElement NewJob_Add_shipper_input_Name1;
		
	@FindBy(xpath = "(//*[text()='Consignee'])[2]/parent::div/input")
    public WebElement ConsineeNameDropdown;
	
	 @FindBy(xpath = "//*[@aria-label='ChetanIndustries(2689)']/span/span")
	  public WebElement NewJob_Add_Consinee_input_Name;
	 
	 @FindBy(xpath = "//*[@aria-label='SikchiIndustries(1617)']/span/span")
	  public WebElement NewJob_Add_Consinee_input_Name1;

	@FindBy(xpath = "//*[@id='txtReferenceNo']")
    public WebElement NewJob_Agent_Reference_No;
		
	@FindBy(xpath = "(//*[text()='Create Export Job'])/parent::div/parent::div/parent::div/parent::div/div/div[5]/div[2]/div/div[3]/button")
	//@FindBy(xpath = "//*[text()='TODAY']")
    public WebElement NewJob_TODAY;
		
	@FindBy(xpath = "//*[text()='TOMORROW']")
    public WebElement NewJob_TOMORROW;
		
	@FindBy(xpath = "//*[text()='Document Type']/parent::div/igx-buttongroup/div/button[1]")
    public WebElement NewJob_AWB;
	
	
	@FindBy(xpath = "//*[text()='Document Type']/parent::div/div/span[2]/label")	
	//@FindBy(xpath = "//*[text()='Document Type']/parent::div/igx-buttongroup/div/button[2]")
    public WebElement NewJob_CBV;
		
	@FindBy(xpath = "//*[text()='Document Type']/parent::div/div/span[3]/label")
	//@FindBy(xpath = "//*[text()='Document Type']/parent::div/igx-buttongroup/div/button[3]")
    public WebElement NewJob_HAWB;
		
	@FindBy(xpath = "//*[text()='Package Type']/parent::div/igx-buttongroup/div/button[1]")
    public WebElement NewJob_Loose;
		
	@FindBy(xpath = "//*[text()='Package Type']/parent::div/igx-buttongroup/div/button[2]")
    public WebElement NewJob_ULD;
	
	@FindBy(xpath = "(//*[text()='Cargo Type'])/parent::div/input")
    public WebElement NewJob_CargoType;	
			
	@FindBy(xpath = "//*[@title='General']/span")
    public WebElement NewJob_CargoType_General;		
	
	@FindBy(xpath = "(//*[@title='Courier'])[1]/span")
    public WebElement NewJob_CargoType_Courier;
		
	@FindBy(xpath = "//*[@title='Airport-to-Airport']/span")
    public WebElement NewJob_MovementType_Airport_to_Airport;
		
	@FindBy(xpath = "//*[@title='Airport-to-Door']/span")
    public WebElement NewJob_MovementType_Airport_to_Door;
		
	@FindBy(xpath = "//*[@title='Door-to-Airport']/span")
    public WebElement NewJob_MovementType_Door_to_Airport;
		
	@FindBy(xpath = "//*[@title='Door-to-Door']/span")
    public WebElement NewJob_MovementType_Door_to_Door;
		
	@FindBy(xpath = "//*[text()='Origin Airport *']/parent::div/input")
    public WebElement NewJob_Origin_Airport;
		
	@FindBy(xpath = "//*[text()='Destination Airport *']/parent::div/input")
    public WebElement NewJob_Destination_Airport;
		
	//@FindBy(xpath = "//*[@class='cargo-summary-component']/div/div[2]/button")
	@FindBy(xpath = "(//*[@class='cargo-summary-component'])[1]/div/div[2]/button")
    public WebElement NewJob_cargo_summary_Dimention;
		
	@FindBy(xpath = "(//*[@id='gridcustomerflow_0_1'])[2]/igx-input-group/div/div/input")
    public WebElement NewJob_cargo_summary_Dimention_Pieces;
		
	//@FindBy(xpath = "(//*[@id='gridcustomerflow_0_1'])[3]/igx-input-group/div/div/input")
    //public WebElement NewJob_cargo_summary_Dimention_Pieces;
	
	@FindBy(xpath = "(//*[@id='gridcustomerflow_0_2'])[2]/igx-input-group/div/div/input")
    public WebElement NewJob_cargo_summary_Dimention_Length;
	
	@FindBy(xpath = "(//*[@id='gridcustomerflow_0_1'])[3]/igx-input-group/div/div/input")
    public WebElement NewJob_cargo_summary_Dimention_Pieces1;
        
    @FindBy(xpath = "(//*[@id='gridcustomerflow_0_2'])[3]/igx-input-group/div/div/input")
    public WebElement NewJob_cargo_summary_Dimention_Length1;
		
	@FindBy(xpath = "(//*[@id='gridcustomerflow_0_3'])[2]/igx-input-group/div/div/input")
    public WebElement NewJob_cargo_summary_Dimention_Width;
		
	@FindBy(xpath = "(//*[@id='gridcustomerflow_0_4'])[2]/igx-input-group/div/div/input")
    public WebElement NewJob_cargo_summary_Dimention_Height;
		
	@FindBy(xpath = "(//*[@id='gridcustomerflow_0_5'])[2]/igx-input-group/div/div/input")
    public WebElement NewJob_cargo_summary_Dimention_UOM;
	
	//@FindBy(xpath = "(//*[@id='gridcustomerflow_0_5'])[2]")
    //public WebElement NewJob_cargo_summary_Dimention_UOM;
	
	@FindBy(xpath = "//*[@id='igx-icon-31']")
    public WebElement NewJob_cargo_summary_Dimention_UOM1;
		
	
	
	@FindBy(xpath = "(//*[@title='IN'])[2]")
    public WebElement NewJob_cargo_summary_Dimention_UOM_IN;
		
	@FindBy(xpath = "(//*[@title='FT'])[2]")
    public WebElement NewJob_cargo_summary_Dimention_UOM_FT;
		
	@FindBy(xpath = "(//*[@title='CM'])[2]")
    public WebElement NewJob_cargo_summary_Dimention_UOM_CM;
		
	@FindBy(xpath = "(//*[text()='Yes'])[2]")
    public WebElement NewJob_cargo_summary_Dimention_YES;
		
	@FindBy(xpath = "//*[text()='No']")
    public WebElement NewJob_cargo_summary_Dimention_No;
		
	@FindBy(xpath = "(//*[@title='DXB - Dubai Internatinal Airport ( United Arab Emirates )'])[2]/parent::strong/parent::div/parent::div/parent::div/parent::div/div[3]/div[2]/button")
    public WebElement NewJob_cargo_summary_Dimention_upload_dimention;
		
	@FindBy(xpath = "(//*[@title='DXB - Dubai International Airport (United Arab Emirates)'])[2]/parent::strong/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/div/div[3]/div/button[2]")
    public WebElement NewJob_cargo_summary_Dimention_save_button;
	
	@FindBy(xpath = "(//*[text()='Cargo Information (Detail)'])[2]/parent::div/parent::div/div[3]/div/button[2]")
    public WebElement NewJob_cargo_summary_Dimention_save_button1;
		
	@FindBy(xpath = "//*[@id='TotNoOfPieces']")
    public WebElement NewJob_TotNoOfPieces;
	
	@FindBy(xpath = "(//*[@id='TotNoOfPieces'])[2]")
    public WebElement Edit_TotNoOfPieces;
		
	@FindBy(xpath = "//*[@id='GrossWeight']")
    public WebElement NewJob_GrossWeight;
	
	@FindBy(xpath = "(//*[@id='GrossWeight'])[2]")
    public WebElement Edit_GrossWeight;
		
	@FindBy(xpath = "//*[@formcontrolname='TotVol']")
    public WebElement NewJob_TotVolue;
		
	@FindBy(xpath = "//*[text()=' KG']")
    public WebElement NewJob_GrossWeight_KG;
		
	@FindBy(xpath = "//*[text()=' LB']")
    public WebElement NewJob_GrossWeight_LB;
		
	
	@FindBy(xpath = "//*[text()=' CBM']")
    public WebElement NewJob_TotVolue_CBM;
	
	@FindBy(xpath = "//*[text()=' CF']")
    public WebElement NewJob_TotVolue_CF;
	
	@FindBy(xpath = "//*[text()='SHC *']/parent::div/input")
    public WebElement NewJob_SHC;
	
	//@FindBy(xpath = "//*[@id='igx-checkbox-56']/div/span//*[@xmlns='http://www.w3.org/2000/svg']")
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/igx-display-container/igx-combo-item/igx-checkbox/div/span")
	public WebElement NewJob_SHC_checkbox1;
	
    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/igx-display-container/igx-combo-item[1]/igx-checkbox/div/span")
	public WebElement NewJob_SHC_checkbox2;
	
    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/igx-display-container/igx-combo-item[2]/igx-checkbox/div/span")
	public WebElement NewJob_SHC_checkbox3;
    
    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/igx-display-container/igx-combo-item[3]/igx-checkbox/div/span")
	public WebElement NewJob_SHC_checkbox4;
    
	@FindBy(xpath = "//*[text()='Commodity']/parent::div/input")
    public WebElement NewJob_Commodity;
	
	@FindBy(xpath = "//*[@aria-label='AIR - AIRCRAFT PARTS']/span")
    public WebElement NewJob_CommodityAIR_AIRCRAFT_PARTS;
	
	@FindBy(xpath = "//*[text()='HSCC']/parent::div/input")
    public WebElement NewJob_HSCC;
	
	@FindBy(xpath = "//*[@aria-label='37051000 - PHOT PLTS AND FLM FOR OFFSET REPRODUCTION']/span")
    public WebElement NewJob_HSCC_37051000;
	
	@FindBy(xpath = "(//*[@id='txtCargoDescription'])[1]")
    public WebElement NewJob_Cargo_Description;
	
	
	//@FindBy(xpath = "//*[@id='chkIsAgree']/div/label")
	@FindBy(xpath = "//*[@id='chkIsAgree']/div/span//*[@xmlns='http://www.w3.org/2000/svg']")
    public WebElement NewJob_chkIsAgree;
	
	
	@FindBy(xpath = "//*[@id='chkIsAgree']/parent::div/parent::div/parent::div/div[11]/div/button[3]")
    public WebElement NewJob_SAVE_JOB;
	
	@FindBy(xpath = "//*[@id='chkIsAgree']/parent::div/parent::div/parent::div/div[3]/div[2]/span/button")
    public WebElement NewJob_Cancel;
	
	@FindBy(xpath = "//*[@id='chkIsAgree']/parent::div/parent::div/parent::div/div[3]/div[3]/span/button")
    public WebElement NewJob_Clear;
	
	//----------------------------------------
	
	@FindBy(xpath = "(//*[@class='igx-switch__composite-thumb'])[8]")
    public WebElement FinalizeHAWBButton;
	
	@FindBy(xpath = "(//*[text()='Yes'])[2]")
    public WebElement FinalizeHAWBButtonYes;
	
	@FindBy(xpath = "(//*[text()='House Jobs'])[1]/parent::div/parent::div/div[3]/div/igx-navbar/nav/div[2]/span/i")
    public WebElement ConsolidateHouseJob;
	
	@FindBy(xpath = "(//*[text()='Show All Jobs'])")
    public WebElement ShowAllHouseJobs;
	
	//@FindBy(xpath = "(//*[text()='DXB'])[7]/parent::div/parent::div/span/input")
	@FindBy(xpath = "(//*[text()='DXB'])[2]/parent::div/parent::div/span/input")
    public WebElement AddHouseCheckbox;
	
	@FindBy(xpath = "(//*[text()='DXB'])/parent::div/parent::div/span/input")
    public WebElement MasterAddHouseCheckbox;
	
	@FindBy(xpath = "(//*[text()='Job Summary'])")
    public WebElement AddHouseJobScreen;
	
	//@FindBy(xpath = "(//*[text()='DXB'])[3]/parent::div/parent::div/span/input")
	@FindBy(xpath = "(//*[text()='DXB'])/parent::div/parent::div/parent::h4/parent::div/parent::div/div[2]/h4/div/span/input")
    public WebElement MasterAddHouseCheckboxMultiple;
	
	@FindBy(xpath = "(//*[text()='Job Summary'])/parent::div/parent::div/div[7]/button")
    public WebElement CreateConsolJobButton;
	
	@FindBy(xpath = "(//*[text()='House Jobs'])")
    public WebElement HouseJobTabLower;
	
	@FindBy(xpath = "(//*[@class='IsHouseJob'])/div/div/div[2]/div/div/button")
    public WebElement AddHouseJobButton;
	
	// remove house job from associated house job tab
	@FindBy(xpath = "(//*[@class='listview__accordion-HAWB-title'])/div/div[9]/button")
    public WebElement RemoveHouseJob;
	
	@FindBy(xpath = "(//*[text()='Rates'])[1]")
	public WebElement RatesTab;
	
	@FindBy(xpath = "(//*[text()='Published'])/parent::p/parent::div/parent::div/div[7]/button")
	public WebElement MarkupArrowBeforeAccept;
	
	@FindBy(xpath = "(//*[text()='Published'])/parent::p/parent::div/parent::div/parent::h5/parent::div/parent::div/div[2]/div/div/div/div/div[2]/div[7]/span/button")
	public WebElement MarkupAccept;
	
	@FindBy(xpath = "(//*[text()='Published'])/parent::p/parent::div/parent::div/parent::h5/parent::div/parent::div/div/h5/div/div[11]/igx-navbar/nav/div[2]/button/igx-icon")
	public WebElement MarkupSelectDot;
	
	@FindBy(xpath = "(//*[text()='Published'])/parent::p/parent::div/parent::div/div[11]/div/div/div/div/div/igx-drop-down-item[2]/span/span/button")
	//@FindBy(xpath = "(//*[text()=' NGC'])[1]/parent::div/parent::div/div[5]/div/div/div/div/div/igx-drop-down-item/span/span/button")
	public static WebElement MarkupEditText;
	
	@FindBy(xpath = "(//*[@aria-describedby='igx-grid-9_MarkUp'])[1]/igx-input-group/div/div/input")
	public WebElement MarkupAmount;
	
	@FindBy(xpath = "(//*[@id='btnAddApplyChanges'])[3]")
	public WebElement RatesApplyChanges;
	
	@FindBy(xpath = "(//*[text()='Flights'])[1]")
	public WebElement FilghtsTab;
	
	//@FindBy(xpath = "(//*[text()='LHR'])[1]/parent::div/parent::div/div[7]/button[2]")
	//@FindBy(xpath = "(//*[@src='https://acsintapi.kalelogistics.com/Upload/Logo/EK_5549.png'])[2]/parent::div/parent::div/div[7]/button[2]")
	@FindBy(xpath = "(//*[@src='https://acsintapi.kalelogistics.com/Upload/Logo/download_5549.png'])[2]/parent::div/parent::div/div[7]/button[2]")
	public WebElement SelectFlight;
	
	@FindBy(xpath = "(//*[@src='https://acsintapi.kalelogistics.com/Upload/Logo/download_5549.png'])[5]/parent::div/parent::div/div[7]/button[2]")
	public WebElement SelectFlight1;
	
	@FindBy(xpath = "(//*[@id='txtAllotmentId'])[2]")
	public WebElement FlightAllotmentID;
	
	@FindBy(xpath = "(//*[text()='Stock Type *'])[2]/parent::div/input")
	public WebElement FlightStockType;
	
	@FindBy(xpath = "(//*[@title='Community'])[2]/span")
	public WebElement FlightStockTypeCommunity;
	    
	@FindBy(xpath = "(//*[@title='Contractual'])[2]/span")
	public WebElement FlightStockTypeContractual;
	
	@FindBy(xpath = "//*[text()='Preferred Carrier']")
	public WebElement FlightsIconPreferredCarrier_Text;
				     
	//@FindBy(xpath = "(//*[text()='(Optional)'])[2]/parent::div/parent::div/parent::div/parent::div/div[10]/div/button[2]")
	@FindBy(xpath = "(//*[text()='(Optional)'])[2]/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::form/div/div[3]/div/button[2]")
	public WebElement FlightBookingRequest;
	
	//@FindBy(xpath = "(//*[text()='(Optional)'])[3]/parent::div/parent::div/parent::div/parent::div/div[10]/div/button[2]")
	@FindBy(xpath = "(//*[text()='(Optional)'])[3]/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::form/div/div[3]/div/button[2]")
	public WebElement FlightBookingRequest1;
	
	@FindBy(xpath = "//li[@title = 'Logout']")
	public WebElement Logout;
	
	@FindBy(xpath = "//li[@title = 'Booking Request']")
	public WebElement BookingRequest;
	
	@FindBy(xpath = "(//*[@class='listview__accordion-content ng-star-inserted'])/parent::div/div[2]/div[4]/div/span[2]")
	public WebElement MaximumWeightAirline;
	
	@FindBy(xpath = "(//*[@id= 'txtApproverRemarks'])/parent::div/parent::div/parent::igx-input-group/parent::div/parent::div/parent::form/parent::div/parent::div/parent::div/div[6]/button[4]")
	public WebElement ConfirlFlightBooking;
	
	@FindBy(xpath = "(//*[text() = 'KG'])[3]/parent::strong/parent::div/parent::div/div[4]/span/button[2]")
	public WebElement ExecuteAWBButton;
	
	@FindBy(xpath = "(//*[text()='As Agreed'])/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/div[6]/div/p/igx-checkbox/div/span")
	public WebElement Checkbox_Term_Condition;
	
	//@FindBy(xpath = "(//*[text()='Rate to be printed on AWB'])/parent::div/parent::div/parent::div/parent::div/div[3]/div/button[2]")
	@FindBy(xpath = "(//*[text()='Rate to be printed on AWB'])/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/div[3]/div/button[2]")
	public WebElement ExecuteAWBChangeButton;
	
	@FindBy(xpath = "(//*[@id='listview__tab-CargoDetails'])")
	public WebElement CargoDetails;
	
	@FindBy(xpath = "(//*[text()='SHC *'])[2]")
	public WebElement CargoSHCDetails;
	
	@FindBy(xpath = "(//*[@class='cargo-summary-component'])[2]/div/div/div/b")
	public static WebElement  CargoChargableWeight;
	
	@FindBy(xpath = "(//*[@class='listview__top-tabs'])/ul/li[3]")
	public WebElement ExecutedAWBTab;
	
	@FindBy(xpath = "(//*[text()='Consol Manifest'])")
	public WebElement ConsolManifestButton;
	
	@FindBy(xpath = "(//*[text()='PRINT '])[1]/parent::div/span[2]/button[2]")
	public WebElement PrintHAWB;
	
	@FindBy(xpath = "(//*[text()='Print'])[4]")
	public WebElement PrintButton;
	
	@FindBy(xpath = "(//*[text()='Label'])[1]/parent::span/parent::div/span[3]/button")
	public WebElement PreviewHAWB;
	
	//---------------------Consol Job toggle button--------------------------
	
	@FindBy(xpath = "(//*[@class='igx-switch__composite-thumb'])[1]")
	public WebElement ConsolJobButton;
	
	@FindBy(xpath = "(//*[text()='This is a Consol Job'])[2]/parent::div/igx-switch/span/div")
	public WebElement ConsolJobMasterButton;
	
	@FindBy(xpath = "(//*[text()='Finalize Associate'])/parent::div/igx-switch/span/div")
	public WebElement FinalizeAssociatedHouseJob;
	
	@FindBy(xpath = "(//*[@id='hide-in-flight-tab'])/div/button[2]")
	public WebElement SaveButton;
	
	@FindBy(xpath = "(//*[text()='Job Details'])[1]")
	public WebElement JobDetailTab;
	
	@FindBy(xpath = "(//*[text() = 'Consignee Name or Code'])/parent::div/input")
	public WebElement ConsineeNameJobDetailTab;
	
	@FindBy(xpath = "(//*[text()='Search'])[1]/parent::div/input")
	public WebElement SearchJObParadox;
	
	@FindBy(xpath = "(//*[text() = 'Job Status'])/parent::igx-drop-down-item-group/igx-drop-down-item/span/span")
	public WebElement SelectJobSearch;
	
	@FindBy(xpath = "(//*[text() = 'Shipper Name'])/parent::igx-drop-down-item-group/igx-drop-down-item/span/span")
	public WebElement SelectJobShipperName;
	
	@FindBy(xpath = "(//*[text() = 'HAWB Status'])/parent::igx-drop-down-item-group/igx-drop-down-item[1]/span/span")
	public WebElement SelectHouseJobSearch;
	
	@FindBy(xpath = "(//*[text() = 'Association Status'])/parent::igx-drop-down-item-group/igx-drop-down-item[1]/span/span")
	public WebElement SelectHouseJobSearchAssociationStatus;
	
	@FindBy(xpath = "(//*[@class = 'filter'])[1]/parent::div/button/i")
	public WebElement MasterJobFilter;
	
	@FindBy(xpath = "(//*[text()= 'Name'])/parent::div/div[1]/igx-checkbox/div/span")
	public WebElement MasterJobFilterName;
	
	@FindBy(xpath = "(//*[@igxbutton= 'raised'])[1]")
	public WebElement MasterJobFilterDone;
	
	@FindBy(xpath = "(//*[@class='listview__accordion-HAWB-title'])/parent::div/h4/div/div[1]/span")
	public WebElement SearchHouseJob;
	
	@FindBy(xpath = "(//*[text() = 'HAWB Number'])/parent::igx-drop-down-item-group/igx-drop-down-item/span/span")
	public WebElement SelectHouseJobSearchNo;
	
	@FindBy(xpath = "(//*[@title='Total charges 0'])/parent::strong/parent::div/parent::div/div[4]/button")
	public WebElement CancelJob;
	
	
	/*-----------------------   CBV Process ---------------------- */
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div/div/igx-display-container/igx-combo-item/igx-checkbox/div/span")
	public WebElement NewJob_SHC_checkbox11;
	
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div/div/igx-display-container/igx-combo-item[1]/igx-checkbox/div/span")
	public WebElement NewJob_SHC_checkbox22;
	
	@FindBy(xpath = "(//*[text()='Job Details'])[2]/parent::div/parent::div/parent::div/parent::div/parent::div/div[2]/div[2]/h4/strong")
	public WebElement CBV_Process_Informatin_Screen;
	
	@FindBy(xpath = "(//*[@id='txtSenderReferenceNumber'])")
	public WebElement CBV_Process_Sender_Reference_Number;
	
	@FindBy(xpath = "(//*[@id='txtMiscellaneousReferenceNumber'])")
	public WebElement CBV_Process_Misc_Reference_Number;
	
	@FindBy(xpath = "(//*[@id='txtPassengerName '])")
	public WebElement CBV_Process_Passenger_Name;
	
	@FindBy(xpath = "(//*[@id='txtTicketNumber '])")
	public WebElement CBV_Process_Ticket_Number;
	
	@FindBy(xpath = "(//*[@id='txtBaggageTagNumber '])")
	public WebElement CBV_Process_Baggage_Tag_Number;
	
	@FindBy(xpath = "(//input[@name='IsCourierDutiable'])/parent::igx-checkbox/parent::p/parent::div/p/igx-checkbox/div/span")
	public WebElement CBV_Process_Courier_Dutiable_Checkbox;
	
	@FindBy(xpath = "(//*[@id='txtFreeAllowance'])")
	public WebElement CBV_Process_Free_Allowance;
	
	@FindBy(xpath = "(//*[@aria-describedby='igx-grid-11_MarkUp'])[1]/igx-input-group/div/div/input")
	public WebElement CBV_Process_MarkupAmount;
	
	@FindBy(xpath = "(//*[text()='Flight Details'])")
	public WebElement CBV_Process_Verify_Flight_Details;
	
	@FindBy(xpath = "(//*[text() = 'Organization Name'])/parent::igx-drop-down-item-group/igx-drop-down-item/span/span")
	public WebElement SelectAirlineOrgName;
	
	@FindBy(xpath = "(//*[text()='PRINT'])/parent::strong/parent::div/parent::div/div[2]/span[2]/button")
	public WebElement CBV_Process_Print_Button;
	
	@FindBy(xpath = "(//*[text() = 'KG'])[3]/parent::strong/parent::div/parent::div/div[4]/span/button[2]")
	public WebElement CBV_Process_Execute_CBV_Button;
	
	@FindBy(xpath = "(//*[text()='Yes'])[2]")
    public WebElement CBV_Process_Execute_CBV_Button_Yes;
	
	//@FindBy(xpath = "(//*[text()='PriyankaIndustries'])[6]/parent::div/parent::div/div[4]/span/button[2]")
	//public WebElement CBV_Process_Execute_CBV_Button1;
	
	@FindBy(xpath = "(//*[text()='As Agreed'])/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/div[6]/div/p/igx-checkbox/div/span")
	public WebElement CBV_Process_Checkbox_Term_Condition;
	
	@FindBy(xpath = "(//*[text()='Rate to be printed on CBV'])/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/div[3]/div/button[2]")
	public WebElement CBV_Process_Execute_Changes_Button;
	
	@FindBy(xpath = "(//*[text()='SHC : '])/parent::div/parent::div/div[2]/button")
	public WebElement CBV_Process_Print_CBV;
	
	@FindBy(xpath = "(//*[text()='Print'])[3]")
	public WebElement CBV_Process_Print_CBV_Details;
	
	//----------------------- Validation XPath -------------------
	
	@FindBy(xpath = "(//*[text()='Loose'])[2]/parent::div/parent::div/parent::div/parent::div/strong")
	public WebElement CBV_Process_AWB_CBV_Number;
	
	@FindBy(xpath = "(//*[text()='Loose'])[2]/parent::div/parent::div/parent::div/parent::div/parent::div/div[2]/div/strong")
	public WebElement CBV_Process_CBV_Number_Courier_Process;
	
	@FindBy(xpath = "(//*[text() = 'KG'])[3]/parent::strong/parent::div/parent::div/div[4]/span/button[1]")
	public WebElement CBV_Process_Assign_AWB_CBV_Button;
	
	@FindBy(xpath = "(//*[@disabled='IsAWBNoDisable'])/parent::div/parent::div/parent::div/div[2]/div/button[2]")
	public WebElement CBV_Process_Assign_AWB_CBV_Close_Button;
	
	@FindBy(xpath = "(//*[text() = 'KG'])[3]/parent::strong/parent::div/parent::div/div[4]/span/button[2]")
	public WebElement CBV_Process_Amend_CBV_Button;
	
	@FindBy(xpath = "(//*[text()='Flight Details'])/parent::div/parent::div/parent::div/div[3]/div/div/div[2]/strong")
	public WebElement CBV_Process_Flight_Number;
	
	@FindBy(xpath = "(//*[text()='Flight Details'])/parent::div/parent::div/parent::div/div[3]/div/div/div[2]/p")
	public WebElement CBV_Process_Flight_Date;
	
	@FindBy(xpath = "(//*[@src='https://acsintapi.kalelogistics.com/Upload/Logo/download_5549.png'])[1]/parent::div/parent::div/div[2]/strong")
	public WebElement CBV_Process_Airline_Flight_Number;
	
	@FindBy(xpath = "(//*[@src='https://acsintapi.kalelogistics.com/Upload/Logo/download_5549.png'])[1]/parent::div/parent::div/div[2]/p")
	public WebElement CBV_Process_Airline_Flight_Date;
	
	@FindBy(xpath = "(//*[text()='Yes'])[2]")
    public WebElement CBV_Process_Stock_Type_Change;
	
	
	
	
	
	
	
	
	
	
	
	
    
}