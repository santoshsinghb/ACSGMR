package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ACS_GMR_Import_Xpath extends Pages.BasePage {

	public ACS_GMR_Import_Xpath(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "/html/body/div/div/a")
	public WebElement CloseBtn;
	
	
	@FindBy(xpath = "//*[@id='ctl00_btnimp']")
	public WebElement Imports;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_BtnLoadFromFile1']")
	public WebElement AddHAWBMAWBBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtAirlinePrefix']")
	public WebElement MAWBNoPrefix;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtMAWBNumber']")
	public WebElement AWBNo;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[1]/fieldset/table/tbody/tr[2]/td[4]/img")
	public WebElement MAWBCalendar;
	
	@FindBy(xpath = "//*[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']")
	public WebElement MAWBDate;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[1]/fieldset/table/tbody/tr[4]/td[4]/img")
	public WebElement FlightCalendar;
	
	@FindBy(xpath = "//*[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']")
	public WebElement FlightDate;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_GenericAutoFillCityDeparture_txtCode']")
	public WebElement OrgAirportCode;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtIGMNo']")
	public WebElement IGMNo;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[1]/fieldset/table/tbody/tr[5]/td[4]/img")
	public WebElement IGMCalendar;
	
	@FindBy(xpath = "//*[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']")
	public WebElement IGMDate;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtFlightNo']")
	public WebElement FlightNo;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtCarriarCode']")
	public WebElement FlightPrefix;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtNumberOfPackages']")
	public WebElement NoOfPckg;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtGrossWeight']")
	public WebElement GrossWt;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtChargeableWeight']")
	public WebElement ChrgWt;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtHAWBNumber']")
	public WebElement HAWBNo;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[1]/table/tbody/tr[1]/td/fieldset/div[2]/span/table/tbody/tr[2]/td[2]/img")
	public WebElement HAWBDetailsCalendar;
	
	@FindBy(xpath = "/html/body/div[5]/table/tbody/tr[4]/td[2]/a")
	public WebElement HAWBDetailsDate;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtOrigin']")
	public WebElement origin;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtHAWBNumberOfPackages']")
	public WebElement Package;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtHAWBGrossWeight']")
	public WebElement GrossWtOfHAWBDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtHAWBChargeableWeight']")
	public WebElement ChargeWtOfHAWBDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtRcvdHAWBNumberOfPackages']")
	public WebElement ReceivedPckgOfHAWBDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtRcvdHAWBGrossWeight']")
	public WebElement ReceivedGrossWtOfHAWBDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtRcvdHAWBChargeableWeight']")
	public WebElement ReceivedChrgWtOfHAWBDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtHAWBDescription']")
	public WebElement DescriptionOfHAWBDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSaveMAWB']")
	public WebElement HAWBDetailsSaveBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[2]/div/div/div[3]/input")
	public WebElement MAWBDetailsSuccessPoupMsgBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnGenerateToken']")
	public WebElement GenerateTokenBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rblCTOTokenList_1']")
	public WebElement CTOKaleGHA1;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnCTOTokenProceed']")
	public WebElement CTOKaleGHA1Proceed;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl02_HyperLink1']")
	public WebElement TrackTrace;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl13_HyperLink1']")
	public WebElement GSTInfo;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl15_HyperLink1']")
	public WebElement Reports;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl15_Repeater1_ctl01_HyperLink2']")
	public WebElement TransactionReports;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnExcel']")
	public WebElement ExportToExcelTransactionReport;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl15_Repeater1_ctl02_HyperLink2']")
	public WebElement DwellTimeReport;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnExcel']")
	public WebElement DwellTimeReportExportToExcel;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl15_Repeater1_ctl03_HyperLink2']")
	public WebElement TonnageReport;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtAirport']")
	public WebElement TonnageReportAirport;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_Button1']")
	public WebElement TonnageReportExportToExcel;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl16_HyperLink1']")
	public WebElement Ecustom;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_chkTokenSelect']")
	public WebElement VehicleTokencheckbox;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnGenerateToken']")
	public WebElement GeneratetokenTab;
	
	@FindBy(xpath = "//*[@id='txtVehNo']")
	public WebElement VehicleNo;
	
	@FindBy(xpath = "//*[@id='txtDriverLicNo']")
	public WebElement DriverLicenseNo;
	
	@FindBy(xpath = "//*[@id='txtDriverName']")
	public WebElement DriverName;
	
	@FindBy(xpath = "//*[@id='txtDriverMobNo']")
	public WebElement DriverMobileNo;
	
	@FindBy(xpath = "//*[@id='txtAgentMobNo']")
	public WebElement AgentMobileNo;
	
	@FindBy(xpath = "//*[@id='txtNOP']")
	public WebElement NumberOfPieces;
	
	@FindBy(xpath = "//*[@id='txtGrossWt']")
	public WebElement GrossWtForVehicleDetails;
	
	@FindBy(xpath = "//*[@id='AddRow']")
	public WebElement VehicleDetailsAdd;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSaveAwb']")
	public WebElement GeneratetokenBtn;
	
	
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[9]/div/div/div[3]/input")
	public WebElement OKbtn;
	
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl01_txtFilter8']")
	public WebElement MAWBNOInShipmentDetails;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[2]/div/div[2]/div/div[2]/fieldset/div[2]/div[2]/div/table/tbody/tr[1]/th[6]/table/tbody/tr/td[1]/input")
	public WebElement MAWBNOInShipmentDetailsDownArrow;
	
	@FindBy(xpath = "//*[@id='filterMenucontains']")
	public WebElement Contains;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_btnAirlineDO']")
	public WebElement AirlinrDo;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl05_HyperLink1']")
	public WebElement ShipmentDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdADO_ctl02_chkSelectADO']")
	public WebElement ShipmentDetailscheckbox;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnApprovedADO']")
	public WebElement ApproveDeliveryOredr;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[10]/div/div/div[3]/input")
	public WebElement ApproveDeliveryOredrpopup;
	
	@FindBy(xpath = "//*[@id='ctl00_btnimp']")
	public WebElement ImportsForAirline;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_btnwtVerification']")
	public WebElement WeightVerification;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnUploadDocument']")
	public WebElement WeightVerificationUploadDocs;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rdbuttonhouse']")
	public WebElement UploadHAWBDocRadioBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdWTVerificationDetails_ctl02_fuctlUploadDocs1']")
	public WebElement UploadHAWBDocchoosefile;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnUploadfile']")
	public WebElement UploadBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[2]/div/div[2]/div[5]/div/div/div[3]/button")
	public WebElement UploadBtnPopup;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnClosePopup']")
	public WebElement UploadBtnPopupClose;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnChrgWtExcepUpload']")
	public WebElement ChargWtExcelUpload;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_fuuploadexcel']")
	public WebElement ChargWtExcelUploadChooseFile;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_lbDownloadExcelDownload']")
	public WebElement DownloadSampleExcelTemplate;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnExcelUpload']")
	public WebElement ChargeWtpopupUpload;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnwtSubmit']")
	public WebElement wtVerificationsubmit;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[4]/div/div/div[3]/input")
	public WebElement wtVerificationsubmitpopup;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[8]/div/div/div[3]/input")
	public WebElement ConsoleDopoup;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_btnConsolDO']")
	public WebElement ConsoleDoRevoke;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[5]/div/div/div/div[2]/div/table/tbody/tr/td[1]/select")
	public WebElement ConsoleDoCBdropdwon;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[5]/div/div/div/div[2]/div/table/tbody/tr/td[1]/select/option[3]")
	public WebElement AADHYALOGISTICS;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnDOSubmit']")
	public WebElement ConsoleDoSubmit;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[12]/div/div/div[3]/input")
	public WebElement ConsoleDoSubmittedSuccessfully;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_HyperLinkSB']")
	public WebElement BoE;
	
	@FindBy(xpath = "//*[@id='txtSBNumber']")
	public WebElement BoENumber;
	
	@FindBy(xpath = "//*[@class='ui-datepicker-trigger']")
	public WebElement BoEDateCalender;
	
	@FindBy(xpath = "//*[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']")
	public WebElement TodayDate;
	
	@FindBy(xpath = "//*[@id='txtCAV']")
	public WebElement CAVValue;
	
	@FindBy(xpath = "//*[@id='txtNOP']")
	public WebElement NoPForBoE;
	
	@FindBy(xpath = "//*[@id='btnSaveAWB']")
	public WebElement BillEntryDetailsSaveBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_ShippingBill_HyperLinkSB']")
	public WebElement UploadBoE;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_fuctlUploadDocs']")
	public WebElement UploadBoEChooseFile;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnUploadSave']")
	public WebElement UploadBoEBtnChooseFile;
	
	@FindBy(xpath = "(//*[@class='ui-button ui-corner-all ui-widget'])[3]")
	public WebElement UploadBoEBtnChooseFileCloseBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[1]/div[3]/div/div[2]/div")
	public WebElement FFlogOutArrow;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[1]/div[3]/div/div[2]/div/div/div")
	public WebElement FFlogOutTab;
	
	@FindBy(xpath = "//*[@id='txtUsrName']")
	public WebElement Usernametxtbox;
	
	@FindBy(xpath = "//*[@id='txtPswd']")
	public WebElement Passwordtxtbox;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnCTOYes']")
	public WebElement AllRadioBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[1]/div[1]/div/div/a[2]")
	public WebElement CBImportTab;
	
	@FindBy(xpath = "//*[@id='ctl00_lblbusinessline']")
	public WebElement BussinessLine;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[1]/div[2]/div/ul/li[6]/ul/li[1]/a")
	public WebElement CustomerBroker;
	
	@FindBy(xpath = "//*[@id='btnCancelSaveAWB']")
	public WebElement BillEntryBackbtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[5]/div/div/div[3]/button")
	public WebElement SavemsgOkbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_btnPickOrder2']")
	public WebElement PickOrderSubmitbtn;
	
	@FindBy(xpath = "(//*[@class='createbol-txtbox'])[4]")
	public WebElement PieceForExaminationtxtbox;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtRemarks']")
	public WebElement Remarkstxtbox;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnBack']")
	public WebElement PickOrdersavebtn;
	
	@FindBy(xpath = "//*[@id='btnOk']")
	public WebElement PickOrdersaveOkbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_lnkOOCStatus']")
	public WebElement OoCSubmitbtn;
	
	@FindBy(xpath = "//*[@id='txtOoCNumber']")
	public WebElement OoCtxtboxno;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_ShippingBill_HyperLinkSB']")
	public WebElement OocUploaddocbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_fuctlUploadDocs']")
	public WebElement ChooseFile;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnUploadSave']")
	public WebElement Oocuploadbtn;
	
	@FindBy(xpath = "/html/body/form/div[8]/div[3]/div/button")
	public WebElement OocUploaddocClosebtn;
	
	@FindBy(xpath = "//*[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']")
	public WebElement Ooctodaydate;
	
	@FindBy(xpath = "//*[@id='btnSaveAWB']")
	public WebElement Oocsavebtn;
	
	@FindBy(xpath = "(//*[@class='green-button-white-text'])[1]")
	public WebElement OocsavemsgOkbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_imgASISBStatus']")
	public WebElement BOEASIicon;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnASIProceed']")
	public WebElement Proceedbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnASIOK']")
	public WebElement BOEASIsaveOKbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_imgbTSPBOE']")
	public WebElement TSPicon;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnProceedTP']")
	public WebElement TSPproceedbtn;
	
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnInteAppProceed']")
	public WebElement ShipmentIntegrationApproacgproceedbtn;
	
	
	
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_ddlTSPCommodityGroup']")
	public WebElement CommodityTypedropdown;
	
	@FindBy(xpath = "//*[text()='General Cargo']")
	public WebElement GeneralCargo;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_ddlComodityTypeName']")
	public WebElement CommodityNamedropdown;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[2]/div/div[2]/div/div[4]/div/div/div[2]/div[2]/div/table[1]/tbody/tr[1]/td[4]/select/option[6]")
	public WebElement AIRCRAFTAPD;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtHSNCode']")
	public WebElement HSNcodtxtbox;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtTSPPassword']")
	public WebElement TransactionPasswordtxtbox;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnTSPPay']")
	public WebElement TSPpaynowbtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[5]/div/div/div[3]/button")
	public WebElement OK;
	
	
	
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnTSPConfirm']")
	public WebElement Yesbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnGenerateTokenFromTSPConfirm']")
	public WebElement GenerateTSPYesbtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_btnEDocket']")
	public WebElement eDocketIcon;
	
	@FindBy(xpath = "//*[@class='ui-button ui-corner-all ui-widget']")
	public WebElement close;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[1]/div[2]/div/ul/li[6]/ul/li[2]/a")
	public WebElement FF;
	
	@FindBy(xpath = "//*[@class='.rowfy-addrow']")
	public WebElement vehicaltokenplusbtn ;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[7]/div/div/div/div[3]/div/table/tbody/tr[2]/td[2]/input")
	public WebElement Vehicleno2;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[7]/div/div/div/div[3]/div/table/tbody/tr[2]/td[3]/input")
	public WebElement Driverlicenseno2 ;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[7]/div/div/div/div[3]/div/table/tbody/tr[2]/td[4]/input")
	public WebElement Drivername2;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[7]/div/div/div/div[3]/div/table/tbody/tr[2]/td[5]/input")
	public WebElement Drivermobno2 ;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[7]/div/div/div/div[3]/div/table/tbody/tr[2]/td[6]/input")
	public WebElement Agentmobno2;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[7]/div/div/div/div[3]/div/table/tbody/tr[1]/td[7]/input")
	public WebElement NoP1 ;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[7]/div/div/div/div[3]/div/table/tbody/tr[2]/td[7]/input")
	public WebElement NoP2;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[7]/div/div/div/div[3]/div/table/tbody/tr[1]/td[8]/input")
	public WebElement Grosswt1 ;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_chkTokenSelect']")
	public WebElement Vehicletokencheckbox;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnCancelToken']")
	public WebElement Cancelvehicletokentab ;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[11]/div/div/div[3]/input")
	public WebElement Cancelokmsg ;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnGenerateToken']")
	public WebElement Generateatoken ;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[7]/div/div/div/div[3]/div/table/tbody/tr[2]/td[8]/input")
	public WebElement Grosswt2 ;
	
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_lnkVTNo']")
	public WebElement vehicletokendonesign ;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[7]/div/div/div/div[2]/div/input")
	public WebElement AddShipmentTab ;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdSBWiseShipments_ctl02_chkRecord']")
	public WebElement firstaddshipchkbox ;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnAssign']")
	public WebElement Addbtn ;
	
	@FindBy(xpath = "//*[@class='GreenBGTheme blue-butn'][3]")
	public WebElement AddOKbtn ;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[2]/div/div[2]/div/div[2]/fieldset/div[2]/div[2]/div/table/tbody/tr[2]/td[15]/input[1]")
	public WebElement DisabledWtVarification ;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_btnwtVerification']")
	public WebElement EnableWtVarification ;
	
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[2]/div/div[2]/div/div[2]/fieldset/div[2]/div[2]/div/table/tbody/tr[2]/td[16]/input[1]")
	public WebElement DisabledConsolDo ;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_btnPickOrder2']")
	public WebElement DirectShipPickorderTab;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_btnEDocket']")
	public WebElement DirecteDocketTab;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

