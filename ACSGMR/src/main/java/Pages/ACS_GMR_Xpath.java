package Pages;

import static Helper.BaseObjects.cm;
import static Helper.BaseObjects.driver;
import static Helper.BaseObjects.gmr;
import static Helper.BaseObjects.loginScreen;
import static Helper.BaseObjects.wm;
import static Helper.BaseVariables.Entity;
import static Helper.BaseVariables.Password;
import static Helper.BaseVariables.Username;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import TestDataOperations.TestDataReader;

public class ACS_GMR_Xpath extends Pages.BasePage {

	public ACS_GMR_Xpath(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id='ctl00_hldPage_rblCTO_0']")
	public WebElement AllRadioBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div[2]/div/div/div/div[2]/table/tbody/tr[3]/td/input")
	public WebElement GmrHydRadioOKBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[4]/div[3]/div/h5")
	public WebElement MAWBList;
	
	@FindBy(xpath = "//*[text()='e-AWB']")
	public WebElement eAWBTab;
	
	@FindBy(xpath = "//*[text()='Create AWB']")
	public WebElement CreateAWB;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_Button4']")
	public WebElement MsgPopupOkBtn;
	
	@FindBy(xpath = "//*[text()='New']")
	public WebElement CreateAWBDrpDown;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_drpCopyFrom']")
	public WebElement CreateAWBBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_ddlCustodianName']")
	public WebElement CTOBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rdoConsol']")
	public WebElement Console;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnYes']")
	public WebElement CreateHAWBPopup;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtHAWBNo']")
	public WebElement HouseManifestHAWBNo;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtOriginPortCode']")
	public WebElement HouseManifestOrigin;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtDestinationPortCode']")
	public WebElement HouseManifestDest;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtPkgs']")
	public WebElement HouseManifestNoP;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtWt']")
	public WebElement HouseManifestGrossWt;
	
	@FindBy(xpath = "//*[@id='OCI_1']")
	public WebElement HouseManifestOCIDetails;
	
	@FindBy(xpath = "//*[@id='txtocicode_1']")
	public WebElement TradeIdentificationCodeText;
	
	@FindBy(xpath = "/html/body/form/div[11]/div[3]/div/button")
	public WebElement TradeIdentificationCodePopupOk;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtSLAC']")
	public WebElement SLAC;
	
	@FindBy(xpath = "//*[@id='HSCode_1']")
	public WebElement HSCode;
	
	@FindBy(xpath = "//*[@id='txtHSCode_1']")
	public WebElement HSCodeDetail;
	
	@FindBy(xpath = "/html/body/form/div[11]/div[3]/div/button[1]")
	public WebElement HSCodeDetailOk;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtCargoDesc']")
	public WebElement HouseManifestCargoDescription;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtAWBPrefix']")
	public WebElement AWBNoPrefix;
	
	@FindBy(xpath = "//*[@class='createbol-txtbox text-right']")
	public WebElement AWBNo;
	
	@FindBy(xpath = "//*[@class='GreenBGTheme blue-butn']")
	public WebElement AWBNoOk;
	
	@FindBy(xpath = "/html/body")
	public WebElement justclick;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[3]/div/table/tbody/tr[1]/td/span/div[2]/div/button/span")
	public WebElement HAWBCreationMsgBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[3]/div/table/tbody/tr[2]/td/span/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td[1]/a/span/img")
	public WebElement ShippersNameAddBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_hrefViewMAWB']")
	public WebElement AWBNoLink;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSendToAirline']")
	public WebElement SendPdfToAirline;
	
	@FindBy(xpath = "/html/body/div[14]/div[3]/div/button")
	public WebElement SendPdfToAirlinePopup;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[2]/div[1]/a/span/input")
	public WebElement MasterInfoBack;
	
	//@FindBy(xpath = "(//*[text()='Shipper Name: '])[1]/parent::td/parent::tr/td[2]/input[1]")
	//public WebElement ShippersName;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[2]/div/div[2]/div[6]/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div/div[2]/table[2]/tbody/tr[1]/td[2]/input")
	public WebElement ShippersName;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_uclOrgAddressInformation_txtAddressLine1']")
	public WebElement Address;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_uclOrgAddressInformation_txtPinCode']")
	public WebElement ZipCode;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_uclOrgAddressInformation_GenericAutoFillCountry_txtCode']")
	public WebElement country;
	
	@FindBy(xpath = "//*[text()='IN-India']")
	public WebElement countryName;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_uclOrgAddressInformation_GenericAutoFillCity_txtCode']")
	public WebElement city;
	
	@FindBy(xpath = "//*[text()='HYD-Hyderabad']")
	public WebElement cityName;
	
	
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSaveShipConsignee']")
	public WebElement SaveForAddShipper;
	
	@FindBy(xpath = "(//*[text()='Ok'])[5]")
	public WebElement OkSaveForAddShipper;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[3]/div/table/tbody/tr[2]/td/span/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td[1]/a/span/img")
	public WebElement ConsigneeNameAddBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtConName']")
	public WebElement ConsigneeName;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_uclConsAddressInfo_txtAddressLine1']")
	public WebElement ConsigneeAddress;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_uclConsAddressInfo_GenericAutoFillCountry_txtCode']")
	public WebElement ConsigneeCounrty;
	
	@FindBy(xpath = "//*[text()='AE-United Arab Emirates']")
	public WebElement ConsigneeCounrtyName;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_uclConsAddressInfo_GenericAutoFillCity_txtCode']")
	public WebElement ConsigneeCity;
	
	@FindBy(xpath = "//*[text()='DXB-Dubai']")
	public WebElement ConsigneeCityName;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_uclConsAddressInfo_txtPinCode']")
	public WebElement ConsigneeZipCode;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSaveShipConsignee']")
	public WebElement ConsigneeSaveBtn;
	
	@FindBy(xpath = "/html/body/form/div[15]/div[3]/div/button[1]")
	public WebElement ConsigneeOkBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[3]/div/table/tbody/tr[2]/td/span/table/tbody/tr[4]/td/span/table/tbody/tr/td[1]/table/tbody/tr[5]/td/a")
	public WebElement Routing;
	
	@FindBy(css = "#ctl00_hldPage_GenericAutoFillDestAirport_txtCode")
	public WebElement DestPort;
	
	@FindBy(xpath = "//*[text()='LHR-London']")
	public WebElement DestPortCountry;
	
	@FindBy(css = "#ctl00_hldPage_ViaRoute2_txtCode")
	public WebElement Via2;
	
	@FindBy(xpath = "/html/body/form/div[13]/div[3]/div/button[1]")
	public WebElement RoutingOk;
	
	@FindBy(css = "#aspnetForm > div:nth-child(44) > div.ui-dialog-titlebar.ui-corner-all.ui-widget-header.ui-helper-clearfix > button")
	public WebElement RoutingClose;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtFlightNo']")
	public WebElement FlightNo;
	
	@FindBy(css = "#ctl00_hldPage_txtflightno1")
	public WebElement ChargeCode;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_Chkisaggreed']")
	public WebElement UncheckRates;
	
	@FindBy(xpath = "//*[@id='txtCgRate_1']")
	public WebElement RateCharges;
	
	@FindBy(xpath = "//*[@id='txtCgTotal_1']")
	public WebElement total;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtCargoDesc']")
	public WebElement NatureOfGoods;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[3]/div/table/tbody/tr[2]/td/span/table/tbody/tr[8]/td/div/table/tbody/tr[2]/td[1]/img")
	public WebElement dimensions;
	
	@FindBy(xpath = "//*[@id='txtNoPcs_1']")
	public WebElement NumberOfPieces;
	
	@FindBy(xpath = "//*[@id='txtLength_1']")
	public WebElement LengthOfPieces;
	
	@FindBy(xpath = "//*[@id='txtWidth_1']")
	public WebElement WidthOfPieces;
	
	@FindBy(xpath = "//*[@id='txtHeight_1']")
	public WebElement HightOfPieces;
	
	@FindBy(css = "body > div:nth-child(80) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div > button:nth-child(1)")
	public WebElement DimensionsOkBtn;
	
	@FindBy(xpath = "//*[@id='txtCgGrWt_1']")
	public WebElement GrossWeight;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_dlsDueAgent_ctl00_txtDueAgentchargelist']")
	public WebElement AgentChargesCode;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_dlsDueAgent_ctl00_txtDueAgentchargeAmount']")
	public WebElement AgentCharges;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_dlsDueCarrier_ctl00_txtDueCarrierchargelist']")
	public WebElement DueCarrierCode;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_dlsDueCarrier_ctl00_txtDueCarrierchargeAmount']")
	public WebElement DueCarrierCharges;
	
	@FindBy(css = "#ctl00_hldPage_divCB > div.dropdown-button.noselect > div.dropdown-label")
	public WebElement CustomBroker;
	
	@FindBy(xpath = "//*[text()='1  Selected']")
	public WebElement CustomBroker1;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_mltSlctCHA_3']")
	public WebElement advikEnterpriesesdropdown;
	
	//@FindBy(xpath = "(//*[@type='search'])/parent::div'])")
	//public WebElement CustomBroker;
	
	@FindBy(xpath = "//*[@id='awbtemplate']")
	public WebElement SaveAsTemplate;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_TxtTemplateName']")
	public WebElement SaveTemplateName;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSaveTemplate']")
	public WebElement TemplateNameSaveBtn;
	
	@FindBy(xpath = "//*[@id=\"ctl00_hldPage_btnSaveAwb\"]")
	public WebElement Save;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[11]/div/div/div/div/div[1]/button")
	public WebElement Close;
	
	//ctl00_hldPage_btnCHANo
	
	@FindBy(xpath = "//*[@id=\"ctl00_hldPage_btnCHANo\"]")
	public WebElement FinalOk;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl06_Repeater1_ctl35_HyperLink2']")
	public WebElement HouseManifest;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl06_Repeater1_ctl37_HyperLink2']")
	public WebElement HAWBDetailsUpload;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtHAWBNo']")
	public WebElement HAWBNoHAWBDetailsUpload;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl06_Repeater1_ctl03_HyperLink2']")
	public WebElement QuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rdoConsol']")
	public WebElement QuickASIConsoleRadioBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rdoDirect']")
	public WebElement QuickASIDirectRadioBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtAWBPrefix']")
	public WebElement QuickASIMAWBNoPrefix;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtAWBNo']")
	public WebElement QuickASIMAWBNo;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtDestAirport']")
	public WebElement QuickASIDestination;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtMasterNoOfPkg']")
	public WebElement QuickASINoP;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtMasterGrossWeight']")
	public WebElement QuickASIGrossWt;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtMasterChgWeight']")
	public WebElement QuickASIChargeableWt;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtCarrier1']")
	public WebElement QuickASICarrierField;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtflightno1']")
	public WebElement QuickASIFlightNo;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[4]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[12]/table/tbody/tr/td/div/div[1]/span")
	public WebElement QuickASIAssignCHA;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_mltSlctCHA_4']")
	public WebElement QuickASIAssignCHAAdvikEnterprises;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_mltSlctCHA_1']")
	public WebElement QuickASIAssignCHAAdhyaLogistics;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[4]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[12]/table/tbody/tr/td/div/div[1]/div[2]/span")
	public WebElement QuickASIAssignCHA1;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtCargoDesc']")
	public WebElement NatureOfGoods_QuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSaveAwb']")
	public WebElement QuickASISave;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnCHANo']")
	public WebElement QuickASISuccessMsg;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnAddHAWB']")
	public WebElement AddHAWBQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHouse_ctl01_txtHAWBNo']")
	public WebElement HAWBNoQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHouse_ctl01_txtOriginPortCode']")
	public WebElement OriginAddHAWBQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHouse_ctl01_txtDestinationPortCode']")
	public WebElement DestAddHAWBQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHouse_ctl01_txtPkgs']")
	public WebElement NoPAddHAWBQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHouse_ctl01_txtWt']")
	public WebElement GrossWtAddHAWBQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHouse_ctl01_btnCopyRow']")
	public WebElement CopyAddHAWBQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHouse_ctl02_txtHAWBNo']")
	public WebElement HAWBNo2QuickASI;
	
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHouse_ctl02_lnkHawBDeleteAWB']")
	public WebElement AddHAWBDeleteBtnQuickASI;
	
	@FindBy(xpath = "/html/body/div[30]/div[3]/div/button[2]")
	public WebElement AddHAWBDeleteOkBtnQuickASI;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[22]/div/div/div[3]/input")
	public WebElement AddHAWBDeleteOkPopupBtnQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHouse_ctl03_btnAddRow']")
	public WebElement AddHAWBAddBtnQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSave']")
	public WebElement SaveHAWBAddBtnQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnCHANo']")
	public WebElement SavePopupHAWBAddBtnQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl06_Repeater1_ctl15_HyperLink2']")
	public WebElement HAWBList;
	
	@FindBy(xpath = "//*[text()='MAWB List']")
	public WebElement MAWBListTab;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl01_txtFilter2']")
	public WebElement MAWBListInput;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl01_imgFilterOperator2']")
	public WebElement MAWBListInputDownArrow;
	
	@FindBy(xpath = "//*[text()=' Contains']")
	public WebElement Contains;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[4]/div[6]/div/div/div/fieldset/div[2]/table/tbody/tr[2]/td[2]/a")
	public WebElement AWBNoLinkQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_HplADDHAWB']")
	public WebElement AddHAWB;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtHAWBNo']")
	public WebElement HAWBNo;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtShipper']")
	public WebElement HAWBShipper;
	
	@FindBy(xpath = "//*[text()='ACS SHIPPER#LBS ROAD#HYD']")
	public WebElement HAWBACSShipper;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtConsignee']")
	public WebElement HAWBConsignee;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtOriginPortCode']")
	public WebElement HAWBOrigin;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtDestinationPortCode']")
	public WebElement HAWBDest;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtPkgs']")
	public WebElement HAWBNoP;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtWt']")
	public WebElement HAWBGrossWeight;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_rptHouse_ctl01_txtCargoDesc']")
	public WebElement HAWBCargoDescription;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_btnSave']")
	public WebElement HAWBSave;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPageHeader_btnSave']")
	public WebElement MawbList;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_lnkASI']")
	public WebElement MawbASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_Button4']")
	public WebElement MawbASIOkBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_hreApprovedCO']")
	public WebElement CO;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div[1]/div[31]/div/div/div[2]/div/table/tbody/tr[2]/td[2]/select/option[1]")
	public WebElement KaleAirline1;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnRequestCartingOrder']")
	public WebElement COYesBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnCORreq']")
	public WebElement COOkBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rblCTO_0']")
	public WebElement AllForAirline;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnCTOYes']")
	public WebElement AllForAirlineOk;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl03_HyperLink1']")
	public WebElement COApproval;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtAWBNo']")
	public WebElement CartingOrderShipmentMAWBNo;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSearch']")
	public WebElement CartingOrderShipmentMAWBNoSearchBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_AirLineHome_ctl02_imgAction']")
	public WebElement Action;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtFlightNo']")
	public WebElement AirlineFlightNo;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSubmit']")
	public WebElement Approve;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnReject']")
	public WebElement Reject;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtReason']")
	public WebElement RejectionReason;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnResSave']")
	public WebElement RejectionReasonSubmit;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_Button1']")
	public WebElement RejectedOk;
	
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_Button1']")
	public WebElement ApproveOk;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[1]/div[3]/div/div[2]/div/span")
	public WebElement AirlineLogoutArrow;
	
	@FindBy(xpath = "//*[@id='ctl00_LinkButton6']")
	public WebElement AirlineLogout;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_HyperLinkSB']")
	public WebElement AddSB;
	
	@FindBy(xpath = "//*[@id='txtSBNumber']")
	public WebElement SBNumber;
	
	@FindBy(xpath = "//*[@id='txtSBDate']")
	public WebElement SBDate;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/table[2]/tbody/tr/td[2]/img")
	public WebElement Calendar;
	
	@FindBy(xpath = "/html/body/div[7]/table/tbody/tr[3]/td[5]/a")
	public WebElement CalendarDate;
	
	@FindBy(xpath = "//*[@id='txtNOP']")
	public WebElement SBNoOfPieces;
	
	@FindBy(xpath = "//*[@id='txtGrossWt']")
	public WebElement SBGrossWt;
	
	@FindBy(xpath = "//*[@id='addDimensions_1']")
	public WebElement SBVolumetricWt;
	
	@FindBy(xpath = "//*[@id='txtNoPcs_1']")
	public WebElement SBDimensionsNoPieces;
	
	@FindBy(xpath = "//*[@id='txtLength_1']")
	public WebElement SBDimensionslength;
	
	@FindBy(xpath = "//*[@id='txtWidth_1']")
	public WebElement SBDimensionswidth;
	
	@FindBy(xpath = "//*[@id='txtHeight_1']")
	public WebElement SBDimensionsHeight;
	
	@FindBy(xpath = "//*[@id='txtVolume_1']")
	public WebElement SBDimensionsVolumeCBM;
	
	@FindBy(xpath = "/html/body/form/div[11]/div[3]/div/button[1]")
	public WebElement SBDimensionsOkBtn;
	
	@FindBy(xpath = "//*[@id='txtChargeableGrossWt']")
	public WebElement ChargeableGrossWt;
	
	@FindBy(xpath = "//*[@id='txtFOBValue']")
	public WebElement FOBValue;
	
	@FindBy(xpath = "//*[@id='txtExporterName']")
	public WebElement ExporterName;
	
	@FindBy(xpath = "//*[@id='AddRow']")
	public WebElement SBAddRow;
	
	@FindBy(xpath = "//*[@id='btnSaveAWB']")
	public WebElement SBSaveBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[2]/div/div/div[3]/input")
	public WebElement SBOk;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[4]/div[6]/div/div/div/fieldset/div[2]/table/tbody/tr[2]/td[15]/input")
	public WebElement SBDetails;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div[1]/div[2]/div[6]/div[4]/div[6]/div/div/div/fieldset/div[2]/div/table/tbody/tr[2]/td[17]/input")
	public WebElement SBDetailsAadya;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div[1]/div[2]/div[6]/div[4]/div[6]/div/div/div/fieldset/div[2]/div/table/tbody/tr[2]/td[16]/input")
	public WebElement SBDetails1;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdSBDetails_ctl02_imgASISBStatus']") 
	public WebElement SBASI;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[3]/div[1]/div/table/tbody/tr[2]/td[12]/input[1]") 
	public WebElement SBASI1;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdSBDetails_ctl04_imgASISBStatus']")
	public WebElement SBASI3;
	
	@FindBy(xpath = "//*[@id='btnASIProceed']")
	public WebElement SBASIProceed;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnASIYes']")
	public WebElement SBASIConfirmation;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnASIOK']")
	public WebElement SBASIOk;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[3]/div[2]/a/span/button")
	public WebElement SBASIBackBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdSBDetails_ctl02_imgSBTSP']")
	public WebElement TSP;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_hrefCreateBIALTSP']")
	public WebElement TSPMilestone;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[4]/div/div/div[3]/input")
	public WebElement EdocketMsg;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_imgDocket']")
	public WebElement Edocket;
	
	@FindBy(css = "#ctl00_hldPage_fuctlUploadDocs5")
	public WebElement CSDDoccument_UpoadFile;
	
	//@FindBy(xpath = "(//*[text()='Instructions: '])/parent::div/div[9]/div[1]/table[1]/tbody/tr/td/table/tbody/tr[1]/td[2]/input")
	//public WebElement CSDDoccument_UpoadFile;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnUploadSave']")
	public WebElement CSDDoccument_UpoadBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_trCSD']")
	public WebElement CSDDoccument_UpoadBtnClose;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSubmit']")
	public WebElement CSDDoccument_Submit;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptCSDUploadedDocument_ctl01_chkRecord']")
	public WebElement RecordSelectionCheckbox;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptCSDUploadedDocument_ctl02_chkRecord']")
	public WebElement RecordSelectionCheckbox2;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[2]/div/div[2]/div[6]/div[10]/div/div/div[3]/input")
	public WebElement DocSelectedOkBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdSBDetails_ctl02_imgSBTSP']")
	public WebElement SBDetailsTSP;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[5]/div/div/div/div[2]/div/table/tbody/tr[4]/td[1]/table/tbody/tr[2]/td[4]/select")

//	@FindBy(xpath = "//*[@id='ctl00_hldPage_ddlTypeTxt']")
	public WebElement TSPCargoTypes;
	
	@FindBy(css = "#ctl00_hldPage_ddlComodityTypeName > option:nth-child(2)")
	public WebElement TSPCommodityName;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[5]/div/div/div/div[2]/div/table/tbody/tr[5]/td/table/tbody/tr[8]/td[1]/div/div[2]/table/tbody/tr[2]/td[2]/input")
	public WebElement TransactionPaswrd;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnPayNow']")
	public WebElement TSPPayNow;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtHSNCode']")
	public WebElement HSNCode;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnTSPConfirm']")
	public WebElement PaymentConfimationOkBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnGenerateTokenFromTSPConfirm']")
	public WebElement TokenConfimationOkBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdSBDetails_ctl02_lnkVTNo']")
	public WebElement VehicleToken;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div[1]/div[2]/div[6]/div[4]/div[6]/div/div/div/fieldset/div[2]/div/table/tbody/tr[2]/td[18]/input[1]")
	public WebElement VehicleToken1;
	
	@FindBy(xpath = "//*[@id='txtVehNo']")
	public WebElement VehicleNumber;
	
	@FindBy(xpath = "//*[@id='txtDriverLicNo']")
	public WebElement DriverLicenseNo;
	
	@FindBy(xpath = "//*[@id='txtDriverName']")
	public WebElement DriverName;
	
	@FindBy(xpath = "//*[@id='txtDriverMobNo']")
	public WebElement DriverMobileNo;
	
	@FindBy(xpath = "//*[@id='txtAgentMobNo']")
	public WebElement AgentMobileNo;
	
	@FindBy(xpath = "//*[@id='txtNOP']")
	public WebElement VTNOP;
	
	@FindBy(xpath = "//*[@id='txtGrossWt']")
	public WebElement VTGrossWT;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSaveAwb']") 
	public WebElement GenerateToken;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[13]/div/div/div[3]/input")
	public WebElement VehicleTokenConfimationOkBtn;
	
	@FindBy(xpath = "//*[@id='lnkSendMail']")
	public WebElement ConsAWBList;
	
	@FindBy(xpath = "//*[@id='txtSendMail']")
	public WebElement MenifestToAirlineEmail;
	
	@FindBy(xpath = "//*[@id='btnSendMail']")
	public WebElement SendEmailBtn;
	
	@FindBy(xpath = "//*[@id='btnCancel']")
	public WebElement SendEmailCloseBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_imgbtnReceiptMAWBEnable']")
	public WebElement ACSReceipt;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_hrefCopyMAWB']")
	public WebElement ActionTab;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl04_hrfEditQuickASI']")
	public WebElement EditMAWBActionTab;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnYesCopyAWB']")
	public WebElement CopyAWBConfirmationYesBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl05_HyperLink1']")
	public WebElement eBooking;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl05_Repeater1_ctl04_HyperLink2']")
	public WebElement eBookingCreate;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_cbEFrightEnabled']")
	public WebElement eFreightEnable;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtLCNo']")
	public WebElement LCShipment;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_fuctlLoadFilePath']")
	public WebElement ChooseFileForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnFileCopyData']")
	public WebElement ChooseFileForEbookingUpload;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtShipperName']")
	public WebElement ShipperNameForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtCompanyName']")
	public WebElement CompanyNameForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtShipperAcctDetCode']")
	public WebElement IECodeForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtContactPersonEmailId']")
	public WebElement EmailIdForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_branchAddressInformation_txtAddressLine1']")
	public WebElement AddressLineForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_branchAddressInformation_txtPinCode']")
	public WebElement ZipCodeForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_branchAddressInformation_GenericAutoFillCountry_txtCode']")
	public WebElement CountryCodeForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_branchAddressInformation_GenericAutoFillCity_txtCode']")
	public WebElement CityCodeForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_branchAddressInformation_GenericAutoFillCity_txtName']")
	public WebElement OtherCityForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSave']")
	public WebElement SaveForEbooking;
	
	@FindBy(xpath = "/html/body/form/div[12]/div[3]/div/button[1]")
	public WebElement OkForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtConsigneeName']")
	public WebElement ConsigneeForEbooking;
	
	@FindBy(xpath = "//*[@id='ui-id-15']")
	public WebElement ACSShipper;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div[1]/div[2]/div[6]/div[5]/div/div[2]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td[1]/input[1]")
	public WebElement DestinationForEbooking;
	
	@FindBy(xpath = "//*[@id='addDimensions_1']")
	public WebElement DimensionForEbooking;
	
	@FindBy(xpath = "//*[@id='txtNoPcs_1']")
	public WebElement NoofpiecesForEbooking;
	
	@FindBy(xpath = "//*[@id='txtLength_1']")
	public WebElement lengthForEbooking;
	
	@FindBy(xpath = "//*[@id='txtWidth_1']")
	public WebElement widthForEbooking;
	
	@FindBy(xpath = "//*[@id='txtHeight_1']")
	public WebElement heightForEbooking;
	
	@FindBy(xpath = "//*[@id='txtVolume_1']")
	public WebElement volumecbmForEbooking;
	
	@FindBy(xpath = "/html/body/form/div[8]/div[3]/div/button[1]")
	public WebElement dimensionSaveForEbooking;
	
	@FindBy(xpath = "//*[@id='txtCgGrWt_1']")
	public WebElement GrWtForEbooking;
	
	@FindBy(xpath = "//*[@id='txtCgChargWt_1']")
	public WebElement ChargeableWtForEbooking;
	
	@FindBy(xpath = "//*[@id='txtCgDesc_1']")
	public WebElement CargoDescriptionForEbooking;
	
	@FindBy(xpath = "//*[@id='chkIsHazardous_1']")
	public WebElement HazardousForEbooking;
	
	@FindBy(xpath = "//*[@id='txtUnNo_1']")
	public WebElement UNNumberForEbooking;
	
	@FindBy(xpath = "//*[@id='txtClass_1']")
	public WebElement ClassForEbooking;
	
	@FindBy(xpath = "//*[@id='addCargo_1']")
	public WebElement CargoDetailsActionForEbooking;
	
	@FindBy(xpath = "//*[@id='ibtnCgDel_2']")
	public WebElement CargoDetailsActionMinusForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_chkCHA']")
	public WebElement CustomerBrokerForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSaveAsTemplate']")
	public WebElement SaveAsTemplateForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_TxtTemplateName']")
	public WebElement SaveAsTemplateNameForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSaveTemplate']")
	public WebElement SaveAsTemplateNamesavebtnForEbooking;
	
	@FindBy(xpath = "//*[@id='btnSaveDraft']")
	public WebElement SaveAsDraftForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnCreateBooking']")
	public WebElement FinalSaveForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_TxtDraftName']")
	public WebElement SaveAsDraftNameForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSaveAsDraft']")
	public WebElement SaveAsDraftNamesavebtnForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnCloseDialog']")
	public WebElement TemplateStatusOkBtnForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btn6No']")
	public WebElement FinalSaveNoBtnForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdBookingRecieved_ctl02_lnkCopyBooking']")
	public WebElement SavedTabActionForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl05_Repeater1_ctl10_HyperLink2']")
	public WebElement SavedTabForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnCloseDialog']")
	public WebElement DraftstatusokbtnForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl05_Repeater1_ctl15_HyperLink2']")
	public WebElement edocketForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdBookingRecieved_ctl02_chkSelectJob']")
	public WebElement savedDetailsCheckboxForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnForward']")
	public WebElement ForwardToAirlineForEbooking;
	
	@FindBy(xpath = "//*[@id='btnSphCanccel']")
	public WebElement ShipmentTypeSubmitBtnForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_lvGroupedCargos_ctrl0_btnGetSchedule']")
	public WebElement GetScheduleBtnForBookingShipment;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_lvGroupedCargos_ctrl0_TxtAirlineScheduleTime']")
	public WebElement SchedulecalendarForEbooking;
	
	@FindBy(xpath = "/html/body/div[14]/table/tbody/tr[3]/td[4]/a")
	public WebElement ScheduleDateForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_lvAirlines_ctrl0_ChkSelected']")
	public WebElement ScheduleAirlineCheckbobForBookingShipment;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_lvAirlines_ctrl0_txtFlightNo']")
	public WebElement FlightNoForBookingShipment;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_lvAirlines_ctrl0_txtAirlinePrefix']")
	public WebElement AirwayBillPrefixForBookingShipment;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_lvAirlines_ctrl0_txtMawbNo']")
	public WebElement AirwayBillNumberForBookingShipment;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_BtnForward']")
	public WebElement SubmitFlightDetailsBtnForBookingShipment;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnYes']")
	public WebElement BookinhRequestOkBtnForBookingShipment;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnViewMAWB']")
	public WebElement createMAWBpoupNoBtnForBookingShipment;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl05_Repeater1_ctl11_HyperLink2']")
	public WebElement SentTabForEbooking;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl01_HyperLink1']")
	public WebElement TrackTraceTab;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdAWB_ctl01_txtFilter0']")
	public WebElement TrackTraceTabAWBNo;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl11_HyperLink1']")
	public WebElement AWBStock;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl11_Repeater1_ctl01_HyperLink2']")
	public WebElement RequestStatusAWBStock;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_gvStockRequestSent_ctl02_lnkViewAWBList']")
	public WebElement RequestStatusAWBList;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[4]/div/div/div[1]/div[1]/button")
	public WebElement ViewAWBListCloseBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl11_Repeater1_ctl02_HyperLink2']")
	public WebElement RequestForAWBStock;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtQuantity']")
	public WebElement QtyRequestForAWBStock;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtRemarks']")
	public WebElement RemarksRequestForAWBStock;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_fileUpload']")
	public WebElement ChooseFileRequestForAWBStock;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnUpload']")
	public WebElement UploadFileRequestForAWBStock;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSend']")
	public WebElement SendRequestForAWBStock;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[4]/div/div/div[3]/input")
	public WebElement SendMsgPopupRequestForAWBStock;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl09_HyperLink1']")
	public WebElement AWBStockTabForAirline;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl09_Repeater1_ctl01_HyperLink2']")
	public WebElement RequestStatusForAirline;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_gvStockRequestSent_ctl02_btnApprove']")
	public WebElement ApproveActionForAirline;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[4]/div/div/div[2]/div[1]/center/div/label[1]")
	public WebElement FromStockForAirline;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnApprSubmit']")
	public WebElement FromStockSubmitForAirline;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtIssQty']")
	public WebElement IssuedQtyForAirline;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_gvIssuedAWB_ctl02_lblAWBFrom']")
	public WebElement IssuedQtyClickForAirline;
	
	@FindBy(xpath = "//*[@id='txtManAWBFrom']")
	public WebElement FromAWBNoForAirline;
	
	@FindBy(xpath = "//*[@id='txtManAWBTo']")
	public WebElement ToAWBNoForAirline;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtIssQty']")
	public WebElement TotalQtyForAirline;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnIssueFromStock']")
	public WebElement IssueBtnForAirline;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[2]/div/div/div[3]/input")
	public WebElement IssueOkBtnForAirline;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_gvIssuedAWB_ctl02_chkSelect']")
	public WebElement IssuedQtyCheckForAirline;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl11_Repeater1_ctl03_HyperLink2']")
	public WebElement AWBStockInventory;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_gvStockDetails_ctl02_lnkAssignSubagt']")
	public WebElement AWBStockInventoryAssign;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[2]/div/div/div/div[2]/div/div[2]/div[2]/input")
	public WebElement AWBStockInventoryAssignIssuedQty;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_gvIssuedAWB_ctl02_chkSelect']")
	public WebElement AWBStockInventoryAssignIssuedQtyChk;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnIssueFromStock']")
	public WebElement AWBStockInventoryIssueBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[3]/div/div/div[3]/input")
	public WebElement AWBStockInventoryIssueOkBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_gvStockDetails_ctl02_lnkViewAWBStatus']")
	public WebElement AWBStockInventoryDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnAvail']")
	public WebElement AWBStockInventoryAvailable;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnUsed']")
	public WebElement AWBStockInventoryUsed;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnWithdraw']")
	public WebElement AWBStockInventoryWithdrawn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnExportExcel']")
	public WebElement AWBStockInventoryExportExcel;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl11_Repeater1_ctl04_HyperLink2']")
	public WebElement AWBStatus;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtAWBPrefixFrm']")
	public WebElement AWBStatusprefix;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtAWBNo']")
	public WebElement AWBStatusAWBNo;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtAWBPrefixFrm']")
	public WebElement SubAgentAWBStatusprefix;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtAWBNo']")
	public WebElement SubAgentAWBStatusAWBNo;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div/div[2]/div[3]/input[1]")
	public WebElement AWBStatusAvailable;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnUsed']")
	public WebElement AWBStatusUsed;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnWithdraw']")
	public WebElement AWBStatusWithdrwan;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnExportExcel']")
	public WebElement AWBStatusExportToExcel;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl11_Repeater1_ctl05_HyperLink2']")
	public WebElement SubAgentIssuedInventory;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtFrom']")
	public WebElement SubAgentIssuedInventoryFromDate;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[1]/td[2]/a")
	public WebElement SubAgentIssuedInventoryDate;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div/div/div[2]/div[2]/input")
	public WebElement SubAgentIssuedInventoryToDate;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSearchDate']")
	public WebElement SubAgentIssuedInventorySearch;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl11_Repeater1_ctl06_HyperLink2']")
	public WebElement SubAgentReceivedInventory;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtFrom']")
	public WebElement SubAgentReceivedInventoryFromDate;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div/div/div[2]/div[3]/input[1]")
	public WebElement SubAgentReceivedInventorySearch;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl11_Repeater1_ctl07_HyperLink2']")
	public WebElement SubAgentAWBStatus;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div/div[2]/div[3]/input[1]")
	public WebElement SubAgentAWBStatusAvailable;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div/div[2]/div[3]/input[2]")
	public WebElement SubAgentAWBStatusUsed;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div/div[2]/div[3]/input[3]")
	public WebElement SubAgentAWBStatusWithdrawn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div/div[2]/div[4]/input")
	public WebElement SubAgentAWBStatusExportToExcel;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl29_HyperLink1']")
	public WebElement Reports;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl29_Repeater1_ctl01_HyperLink2']")
	public WebElement TransactionReports;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div/div/div[1]/div/div[7]/a/span/input")
	public WebElement TransactionReportExportExcel;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl29_Repeater1_ctl02_HyperLink2']")
	public WebElement DwellTimeReport;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div/div/div[2]/table[1]/tbody/tr/td[12]/a/span/input")
	public WebElement DwellTimeReportExportToExcel;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl29_Repeater1_ctl03_HyperLink2']")
	public WebElement TonnageReport;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtAirport']")
	public WebElement TonnageReportAirport;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div/div/div[2]/div/div/div[4]/div/a/span/input")
	public WebElement TonnageReportExportToExcel;
	
	//------------------------------------Quick ASI--------------------------------
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl04_HyperLink1']")
	public WebElement COApprovalQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_AirLineHome_ctl02_lnkAction']")
	public WebElement COApprovalActionQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtAWBNo']")
	public WebElement CartingOrderShipmentMAWBNoQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSearch']")
	public WebElement CartingOrderShipmentMAWBNoSearchBtnQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSubmit']")
	public WebElement ApproveQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_Button1']")
	public WebElement ApproveOkQuickASI;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[1]/div[3]/div/div[2]/div/span")
	public WebElement AirlineLogoutArrowQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_LinkButton6']")
	public WebElement AirlineLogoutQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSaveAwb']")
	public WebElement EditMAWBActionTabSave;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnCHANo']")
	public WebElement EditMAWBActionTabSavePopup;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[1]/div[3]/div/div[2]/div/span")
	public WebElement AdvikHydrabadArrowForLogOut;
	
	@FindBy(xpath = "//*[@id='ctl00_LinkButton6']")
	public WebElement AdvikHydrabadLogOut;
	
	@FindBy(xpath = "/html/body/div[7]/table/tbody/tr[1]/td[7]")
	public WebElement CalendarDateForQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdSBDetails_ctl02_imgASISBStatus']")
	public WebElement SBASIQuickASI;
	
	@FindBy(xpath = "//*[@id='btnASIProceeds']")
	public WebElement SBASIQuickASIProceed;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnASIYes']")
	public WebElement SBASIQuickASIProceedConfirmation;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnASIOK']")
	public WebElement SBASIQuickASIProceedConfirmationOk;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnClose']")
	public WebElement CopyAWBConfirmationYesBtnQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_imgASISBStatus']")
	public WebElement SBDetailsQuickASI;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnClearFilter']")
	public WebElement ClearFilterQuickASI;
	
	
	//------------------------- Practice---------------------------------------------
	
	@FindBy(xpath = "//*[text()='AADHYA LOGISTICS']")
	public WebElement AAdhyaLogistics;

	@FindBy(xpath = "//*[@id='ctl00_liBusiness']")
	public WebElement BusinessLoginFF;
	
	@FindBy(xpath = "//*[@id='ctl00_rptOrganizationTypeList_ctl00_lnkOrganizationTypeName']")
	public WebElement CustomBrokerInAadhya;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_imgASISBStatus']")
	public WebElement SBDetailsAadhya;
	
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdSBDetails_ctl02_imgSBTSP']")
	public WebElement TSPAadhya;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_mltSlctCHA_3']")
	public WebElement AdvikLogistics;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[8]/div/div/div/div[2]/div/input")
	public WebElement AddShipment;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdSBWiseShipments_ctl02_chkRecord']")
	public WebElement SBCheckBox;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnAssign']")
	public WebElement AddBtnSBCheckBox;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdSBWiseShipments_ctl03_chkRecord']")
	public WebElement AddBtnSBCheckBox1;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdSBWiseShipments_ctl05_chkRecord']")
	public WebElement AddBtnSBCheckBox2;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[1]/div[3]/div/div[2]/div")
	public WebElement AdvikHydrabadDownArrowBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[1]/div[3]/div/div[2]/div/div/div/a[2]")
	public WebElement AdvikHydrabadLogOutBtn;
	
	@FindBy(xpath = "//*[@id='AddRow']")
	public WebElement VehicleTokenAddBtn;
	
	@FindBy(xpath = "//*[@id='txtNOP']")
	public WebElement VTNoP;
	
	@FindBy(xpath = "(//*[@id='txtVehNo'])[2]")
	public WebElement VehicleNumber2;
	
	@FindBy(xpath = "(//*[@id='txtDriverLicNo'])[2]")
	public WebElement DriverLicenseNo2;
	
	@FindBy(xpath = "(//*[@id='txtDriverName'])[2]")
	public WebElement DriverName2;
	
	@FindBy(xpath = "(//*[@id='txtDriverMobNo'])[2]")
	public WebElement DriverMobNo2;
	
	@FindBy(xpath = "(//*[@id='txtAgentMobNo'])[2]")
	public WebElement AgentMobNo2;
	
	@FindBy(xpath = "(//*[@id='txtNOP'])[2]")
	public WebElement VTNOP2;
	
	
	
	@FindBy(xpath = "/html/body/form/div[4]/div[1]/div[2]/div/ul/li[6]/a/span")
	public WebElement FFDropdownForAAdyaLogistics;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[1]/div[2]/div/ul/li[6]/ul/li[1]/a")
	public WebElement FFCustomBroker;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/table[2]/tfoot/tr/td[12]/img")
	public WebElement AddShippingBillDetails;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/table[2]/tbody/tr[2]/td[1]/input[1]")
	public WebElement AddSBNumber;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/table[2]/tbody/tr[2]/td[2]/img")
	public WebElement AddCalendar;
	
	@FindBy(xpath = "/html/body/div[7]/table/tbody/tr[1]/td[7]/a")
	public WebElement AddCalendarDateForQuickASI;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/table[2]/tbody/tr[2]/td[5]/input[1]")
	public WebElement AddSBNoOfPieces;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/table[2]/tbody/tr[2]/td[6]/input")
	public WebElement AddSBGrossWt;
	
	@FindBy(xpath = "//*[@class='txtbox40 clsRequired cls_sbtype sbtype_2']")
	public WebElement AddSBType;
	
	@FindBy(xpath = "(//*[@id='drpSBType'])[2]")
	public WebElement AddSBTypeManual;
	
	@FindBy(xpath = "//*[@id='addDimensions_2']")
	public WebElement AddSBVolumetricWt;
	
	@FindBy(xpath = "(//*[@id='txtFOBValue'])[2]")
	public WebElement AddFOBValue;
	
	@FindBy(xpath = "(//*[@id='txtExporterName'])[2]")
	public WebElement AddExporterName;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_gridASIMawb_ctl03_chkSB'])")
	public WebElement SBASI2ndCheckbox;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBDetails_ctl02_imgSBTSP'])")
	public WebElement TSP1;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBDetails_ctl03_imgSBTSP'])")
	public WebElement TSP2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBDetails_ctl04_imgSBTSP'])")
	public WebElement TSP3;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_txtSBNos'])")
	public WebElement SBNumberInput; 
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSearch'])")
	public WebElement SBNumberSearchBtn;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSearch'])")
	public WebElement VehicleTokenForAddShipments2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBDetails_ctl03_lnkVTNo'])")
	public WebElement VehicleToken2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl02_HplADDHAWB'])")
	public WebElement AddHAWBMilestone;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl02_lnkAWBDeleteAWB'])")
	public WebElement Delete;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdMAWB_ctl02_hreApprovedCO'])")
	public WebElement CO2;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnCancelAwb'])")
	public WebElement VehicleTokenBackBtn;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnBack'])")
	public WebElement UsedVehicleTokenBackBtn;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_grdSBDetails_ctl02_lnkSBTSPAmount'])") 
	public WebElement UsedTSP;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_ibtnPrint'])")
	public WebElement TSPPrint;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[5]/div/div/div/div[1]/button/span")
	public WebElement TSPPaymentClose;
	
	@FindBy(xpath = "(//*[@id='btnPrintAllToken'])")
	public WebElement VehicleTokenPrintAll;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_chkTokenOption_0'])")
	public WebElement VehicleTokenOnlyVT;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnPrintAll'])")
	public WebElement VehicleTokenOnlyVTPrint;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_chkTokenOption_1'])")
	public WebElement VehicleTokenTSPVT;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_gridASIMawb_ctl03_chkSB'])")
	public WebElement SBASICheck2;
	
	
	@FindBy(xpath = "(//*[@id='txtSBNumber'])[3]")
	public WebElement AddSBNumber3;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/table[2]/tbody/tr[3]/td[2]/img")
	public WebElement AddCalendar3;
	
	@FindBy(xpath = "(//*[@id='drpSBType'])[3]")
	public WebElement AddSBTypeManual3;
	
	@FindBy(xpath = "(//*[@id='txtNOP'])[3]")
	public WebElement AddSBNoOfPieces3;
	
	@FindBy(xpath = "(//*[@id='txtGrossWt'])[3]")
	public WebElement AddSBGrossWt3;
	
	@FindBy(xpath = "//*[@id='addDimensions_3']")
	public WebElement AddSBVolumetricWt3;
	
	@FindBy(xpath = "(//*[@id='txtFOBValue'])[3]")
	public WebElement AddFOBValue3;
	
	@FindBy(xpath = "(//*[@id='txtExporterName'])[3]")
	public WebElement AddExporterName3;
	
	//
	@FindBy(xpath = "(//*[@id='txtSBNumber'])[4]")
	public WebElement AddSBNumber4;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/table[2]/tbody/tr[4]/td[2]/img")
	public WebElement AddCalendar4;
	
	@FindBy(xpath = "(//*[@id='drpSBType'])[4]")
	public WebElement AddSBTypeManual4;
	
	@FindBy(xpath = "(//*[@id='txtNOP'])[4]")
	public WebElement AddSBNoOfPieces4;
	
	@FindBy(xpath = "(//*[@id='txtGrossWt'])[4]")
	public WebElement AddSBGrossWt4;
	
	@FindBy(xpath = "//*[@id='addDimensions_4']")
	public WebElement AddSBVolumetricWt4;
	
	@FindBy(xpath = "(//*[@id='txtFOBValue'])[4]")
	public WebElement AddFOBValue4;
	
	@FindBy(xpath = "(//*[@id='txtExporterName'])[4]")
	public WebElement AddExporterName4;
	
	//
	@FindBy(xpath = "(//*[@id='txtSBNumber'])[5]")
	public WebElement AddSBNumber5;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/table[2]/tbody/tr[5]/td[2]/img")
	public WebElement AddCalendar5;
	
	@FindBy(xpath = "(//*[@id='drpSBType'])[5]")
	public WebElement AddSBTypeManual5;
	
	@FindBy(xpath = "(//*[@id='txtNOP'])[5]")
	public WebElement AddSBNoOfPieces5;
	
	@FindBy(xpath = "(//*[@id='txtGrossWt'])[5]")
	public WebElement AddSBGrossWt5;
	
	@FindBy(xpath = "//*[@id='addDimensions_5']")
	public WebElement AddSBVolumetricWt5;
	
	@FindBy(xpath = "(//*[@id='txtFOBValue'])[5]")
	public WebElement AddFOBValue5;
	
	@FindBy(xpath = "(//*[@id='txtExporterName'])[5]")
	public WebElement AddExporterName5;
	
	@FindBy(xpath = "(//*[@id='DeleteRow5'])")
	public WebElement AddSBDeleteBtn5;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[2]/div/div/div/div[3]/button[2]")
	public WebElement AddSBDeleteConfirmationBtn;
	
	@FindBy(xpath = "(//*[@id='DeleteRow4'])")
	public WebElement AddSBDeleteBtn4;
	
	@FindBy(xpath = "(//*[@id='txtGrossWt'])[2]")
	public WebElement VTGrossWT2;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[10]/div[2]/a[2]/span/input")
	public WebElement EditVehicleToken;
	
	@FindBy(xpath = "(//*[@id='ctl00_hldPage_btnSave'])")
	public WebElement EditedVehicleTokenSaveBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[12]/div/div/div[3]/input")
	public WebElement EditedVehicleTokenOkBtn;
	
	//----------------code----------------------------------------------------------
	
	public void QuickASITab() throws InterruptedException{
		Actions action1 = new Actions(driver);
		action1.moveToElement(gmr.eAWBTab).perform();
		Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASI);Thread.sleep(2000);
	}
	
	
	public void CO() throws InterruptedException, AWTException {
		
          wm.JavascriptExecutorClick(driver, gmr.CO);Thread.sleep(3000);
		
		wm.JavascriptExecutorClick(driver, gmr.COYesBtn);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.COOkBtn);Thread.sleep(2000);
		
		Thread.sleep(8000);
	}
	
	public void MAWBASI() throws InterruptedException {
		wm.JavascriptExecutorClick(driver, gmr.MawbASI);Thread.sleep(2000);
		//gmr.MawbASI.click();Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.MawbASIOkBtn);Thread.sleep(2000);
	}
	
public void AddSB() throws InterruptedException {
		
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
	}

public void AddSB2() throws InterruptedException {
	
	wm.JavascriptExecutorClick(driver, gmr.AddSBNumber);Thread.sleep(4000);
	gmr.AddSBNumber.sendKeys("5467892");Thread.sleep(2000);
	
	//wm.JavascriptExecutorClick(driver, gmr.AddSBDate);Thread.sleep(2000);//18 May 2023
	wm.JavascriptExecutorClick(driver, gmr.AddCalendar);Thread.sleep(2000);
	wm.JavascriptExecutorClick(driver, gmr.AddCalendarDateForQuickASI);Thread.sleep(3000);
	
	
	Select SelectSBTypeManual2 = new Select(gmr.AddSBTypeManual);Thread.sleep(500);

	SelectSBTypeManual2.selectByVisibleText("Manual");Thread.sleep(500);
	
	//wm.JavascriptExecutorClick(driver, gmr.AddSBTypeManual);Thread.sleep(2000);
	
	gmr.AddSBNoOfPieces.click();Thread.sleep(2000);
	gmr.AddSBNoOfPieces.sendKeys("6");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.AddSBGrossWt);Thread.sleep(2000);
	gmr.AddSBGrossWt.sendKeys("60");Thread.sleep(2000);
	
    wm.JavascriptExecutorClick(driver, gmr.AddSBVolumetricWt);Thread.sleep(2000);
	
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
	
	wm.JavascriptExecutorClick(driver, gmr.AddFOBValue);Thread.sleep(2000);
	gmr.AddFOBValue.sendKeys(cm.RandomNo(4));Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.AddExporterName);Thread.sleep(2000);
	gmr.AddExporterName.sendKeys("ADVIK");Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.SBSaveBtn);Thread.sleep(2000);
	
	wm.JavascriptExecutorClick(driver, gmr.SBOk);Thread.sleep(2000);
	
}
	
   public void SBDetails() throws InterruptedException {
	
	   wm.JavascriptExecutorClick(driver, gmr.SBDetailsAadhya);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBASI);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBASIProceed);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBASIConfirmation);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SBASIOk);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.TSP);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.EdocketMsg);Thread.sleep(2000);
}
   
   public void EDocket() throws InterruptedException, AWTException {
	   
	   wm.JavascriptExecutorClick(driver, gmr.Edocket);Thread.sleep(2000);
		
		driver.switchTo().frame("IframEdocket1");
		 Thread.sleep(4000);
	      
	      WebElement icon = driver.findElement(By.id("ctl00_hldPage_rptMultipleDocs_ctl01_fuctlUploadDocs"));
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
		
		//2nd doc
		
		WebElement iconn = driver.findElement(By.id("ctl00_hldPage_rptMultipleDocs_ctl02_fuctlUploadDocs"));
	      Actions obb = new Actions(driver);
	      obb.click(iconn);
	      Action actionn  = obb.build();
	      actionn.perform();
		
		Robot uploaddoc1 = new Robot();
		uploaddoc1.delay(2000);

		StringSelection ss = new StringSelection("D:\\dummy documents\\pdf1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		uploaddoc1.keyPress(KeyEvent.VK_CONTROL);
		uploaddoc1.keyPress(KeyEvent.VK_V);
		uploaddoc1.delay(2000);

		uploaddoc1.keyPress(KeyEvent.VK_ENTER);
//		uploaddoc.keyPress(KeyEvent.VK_ENTER);
		uploaddoc1.delay(1000);
		
		
		
		wm.JavascriptExecutorClick(driver, gmr.CSDDoccument_UpoadBtn);Thread.sleep(2000);	
		
		wm.JavascriptExecutorClick(driver, gmr.RecordSelectionCheckbox);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.RecordSelectionCheckbox2);Thread.sleep(2000);
		

		wm.JavascriptExecutorClick(driver, gmr.CSDDoccument_Submit);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.DocSelectedOkBtn);Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
   }
   
   public void TSP() throws InterruptedException, AWTException{
	   gmr.TSPMilestone.click();Thread.sleep(2000);
	   //gmr.SBDetails.click();Thread.sleep(2000);
	   gmr.TSP.click();Thread.sleep(2000);
	   
	   
	  
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
   }
   
   //TSP1
   
public void TSP1() throws InterruptedException, AWTException{
	   
	   gmr.SBDetailsAadhya.click();Thread.sleep(2000);
	   gmr.TSP1.click();Thread.sleep(2000);
	   
	   
	  
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
	      gmr.HSNCode.sendKeys("1234");Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.TransactionPaswrd);Thread.sleep(2000);
		gmr.TransactionPaswrd.sendKeys("Kale@JAN20241");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.TSPPayNow);Thread.sleep(3000);
		wm.JavascriptExecutorClick(driver, gmr.PaymentConfimationOkBtn);Thread.sleep(3000);
		wm.JavascriptExecutorClick(driver, gmr.TokenConfimationOkBtn);Thread.sleep(3000);
   }


//TSP2
public void TSP2() throws InterruptedException, AWTException{
	   
	   gmr.SBDetailsAadhya.click();Thread.sleep(2000);
	   gmr.TSP2.click();Thread.sleep(2000);
	   
	   
	  
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
	      gmr.HSNCode.sendKeys("1234");Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.TransactionPaswrd);Thread.sleep(2000);
		gmr.TransactionPaswrd.sendKeys("Kale@JAN20241");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.TSPPayNow);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.PaymentConfimationOkBtn);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.TokenConfimationOkBtn);Thread.sleep(2000);
}
   
   
   public void VehicleToken() throws InterruptedException{
	   
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
   
   }
   
public void VehicleTokenForAddShipments() throws InterruptedException{
	   
	wm.JavascriptExecutorClick(driver, gmr.AddShipment);Thread.sleep(2000);
	
   	
	    driver.switchTo().frame(0);Thread.sleep(1000);
	    wm.JavascriptExecutorClick(driver, gmr.SBCheckBox);Thread.sleep(2000);
	
	    wm.JavascriptExecutorClick(driver, gmr.AddBtnSBCheckBox1);Thread.sleep(2000);
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
 
   
   }
//VT2

public void VehicleTokenForAddShipments2() throws InterruptedException{
	   
	wm.JavascriptExecutorClick(driver, gmr.AddShipment);Thread.sleep(2000);
   	
	    driver.switchTo().frame(0);Thread.sleep(1000);
	    wm.JavascriptExecutorClick(driver, gmr.SBCheckBox);Thread.sleep(2000);
	
	    wm.JavascriptExecutorClick(driver, gmr.AddBtnSBCheckBox1);Thread.sleep(2000);
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
 
   
   }

   
   public void ConsAWBList() throws InterruptedException{
	   
	   wm.JavascriptExecutorClick(driver, gmr.ConsAWBList);Thread.sleep(2000);
		
		driver.switchTo().frame("IframEdocket");
		Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.MenifestToAirlineEmail);Thread.sleep(2000);
		gmr.MenifestToAirlineEmail.sendKeys("Swaranjali.Kharat@Kalelogistics.com");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SendEmailBtn);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SendEmailCloseBtn);Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
   }
   
   public void ACSReceipt() throws InterruptedException{
	   
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
   }
   
   public void Copy() throws InterruptedException{
	   
	   wm.JavascriptExecutorClick(driver, gmr.ActionTab);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.CopyAWBConfirmationYesBtn);Thread.sleep(2000);
   }
   
   public void QuickASIForAadhya() throws InterruptedException{
	   
	   Select ctoforquickASI = new Select(driver.findElement(By.id("ctl00_hldPage_ddlCustodianName")));  
		ctoforquickASI.selectByVisibleText("Kale_GHA1");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIDirectRadioBtn);Thread.sleep(2000);
		
		
		Select shipmenttypequickASI = new Select(driver.findElement(By.id("ctl00_hldPage_ddlShipmentType")));  
		shipmenttypequickASI.selectByVisibleText("Non-Bonded");Thread.sleep(2000);
		
		//wm.JavascriptExecutorClick(driver, gmr.QuickASIMAWBNoPrefix);Thread.sleep(2000);
		//gmr.QuickASIMAWBNoPrefix.sendKeys("999");Thread.sleep(2000);
		
		//gmr.QuickASIMAWBNo.sendKeys(TestDataReader.AWBNo_Direct_Practice());
		//Thread.sleep(2000);
		
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
		gmr.QuickASIGrossWt.sendKeys("120");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIChargeableWt);Thread.sleep(2000);
		gmr.QuickASIChargeableWt.sendKeys("120");Thread.sleep(2000);
		
		WebElement icon1 = driver.findElement(By.id("ctl00_hldPage_txtCarrier1"));
	    Actions ob1 = new Actions(driver);
	    ob1.click(icon1);
	    Action destaction1  = ob1.build();
	    destaction1.perform();Thread.sleep(2000);
	    
	    gmr.QuickASICarrierField.sendKeys("ZZ");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIFlightNo);Thread.sleep(2000);
		gmr.QuickASIFlightNo.sendKeys("1234");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHA);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.AAdhyaLogistics);Thread.sleep(2000);
		//wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHAAdhyaLogistics);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHA1);Thread.sleep(2000);
		
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
   
public void QuickASIConsoleForAadhya() throws InterruptedException{
	   
	   Select ctoforquickASI = new Select(driver.findElement(By.id("ctl00_hldPage_ddlCustodianName")));  
		ctoforquickASI.selectByVisibleText("Kale_GHA1");Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIConsoleRadioBtn);Thread.sleep(2000);
		
		
		Select shipmenttypequickASI = new Select(driver.findElement(By.id("ctl00_hldPage_ddlShipmentType")));  
		shipmenttypequickASI.selectByVisibleText("Non-Bonded");Thread.sleep(2000);
		
		//wm.JavascriptExecutorClick(driver, gmr.QuickASIMAWBNoPrefix);Thread.sleep(2000);
		//gmr.QuickASIMAWBNoPrefix.sendKeys("999");Thread.sleep(2000);
		
		//gmr.QuickASIMAWBNo.sendKeys(TestDataReader.AWBNo_Direct_Practice());
		//Thread.sleep(2000);
		
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
		gmr.QuickASIGrossWt.sendKeys("120");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIChargeableWt);Thread.sleep(2000);
		gmr.QuickASIChargeableWt.sendKeys("150");Thread.sleep(2000);
		
		WebElement icon1 = driver.findElement(By.id("ctl00_hldPage_txtCarrier1"));
	    Actions ob1 = new Actions(driver);
	    ob1.click(icon1);
	    Action destaction1  = ob1.build();
	    destaction1.perform();Thread.sleep(2000);
	    
	    gmr.QuickASICarrierField.sendKeys("ZZ");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIFlightNo);Thread.sleep(2000);
		gmr.QuickASIFlightNo.sendKeys("1234");Thread.sleep(4000);
		
		//wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHA);Thread.sleep(2000);
		//wm.JavascriptExecutorClick(driver, gmr.AAdhyaLogistics);Thread.sleep(2000);
		//wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHAAdhyaLogistics);Thread.sleep(2000);
		
		//wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHA1);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.NatureOfGoods);Thread.sleep(4000);
		gmr.NatureOfGoods.sendKeys("Natural");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASISave);Thread.sleep(2000);
	
		wm.JavascriptExecutorClick(driver, gmr.QuickASISuccessMsg);Thread.sleep(2000);
   
   }
   
   
   
   
   //
public void QuickASIForAdvik() throws InterruptedException{
	   
	   Select ctoforquickASI = new Select(driver.findElement(By.id("ctl00_hldPage_ddlCustodianName")));  
		ctoforquickASI.selectByVisibleText("Kale_GHA1");Thread.sleep(2000);
		
		//wm.JavascriptExecutorClick(driver, gmr.QuickASIDirectRadioBtn);Thread.sleep(2000);
		
		
		//Select shipmenttypequickASI = new Select(driver.findElement(By.id("ctl00_hldPage_ddlShipmentType")));  
		//shipmenttypequickASI.selectByVisibleText("Non-Bonded");Thread.sleep(2000);
		
		//wm.JavascriptExecutorClick(driver, gmr.QuickASIMAWBNoPrefix);Thread.sleep(2000);
		//gmr.QuickASIMAWBNoPrefix.sendKeys("999");Thread.sleep(2000);
		
		//gmr.QuickASIMAWBNo.sendKeys(TestDataReader.AWBNo_Direct_Practice());
		//Thread.sleep(2000);
		
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
		gmr.QuickASIGrossWt.sendKeys("120");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIChargeableWt);Thread.sleep(2000);
		gmr.QuickASIChargeableWt.sendKeys("150");Thread.sleep(2000);
		
		gmr.QuickASICarrierField.sendKeys("ZZ");Thread.sleep(2000);
		
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIFlightNo);Thread.sleep(2000);
		gmr.QuickASIFlightNo.sendKeys("1234");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHA);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.AdvikLogistics);Thread.sleep(2000);
		//wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHAAdhyaLogistics);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASIAssignCHA1);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.NatureOfGoods);Thread.sleep(2000);
		gmr.NatureOfGoods.sendKeys("Natural");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASISave);Thread.sleep(2000);
	
		wm.JavascriptExecutorClick(driver, gmr.QuickASISuccessMsg);Thread.sleep(2000);
   
   }
   
   public void MAWBInput() throws InterruptedException {
	   gmr.MAWBListInput.click();Thread.sleep(2000);
		//gmr.MAWBListInput.sendKeys(TestDataReader.AWBNo_Direct_Practice());
		//Thread.sleep(2000);
		
		gmr.MAWBListInputDownArrow.click();Thread.sleep(2000);
		
		gmr.Contains.click();Thread.sleep(4000);
   }
   
   public void AadhyaLogistics() throws InterruptedException {
	   wm.JavascriptExecutorClick(driver, gmr.AllForAirline);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.AllForAirlineOk);Thread.sleep(2000);
		
		
		wm.JavascriptExecutorClick(driver, gmr.COApprovalQuickASI);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNoQuickASI);Thread.sleep(2000);
		//gmr.CartingOrderShipmentMAWBNo.sendKeys("99924052081");Thread.sleep(2000); 
		
		gmr.CartingOrderShipmentMAWBNoQuickASI.sendKeys("999" + TestDataReader.AWBNo_Direct_Practice());
		Thread.sleep(2000);//-------------AWB--------
		
		wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNoSearchBtnQuickASI);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.COApprovalActionQuickASI);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.ApproveQuickASI);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.ApproveOkQuickASI);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutArrowQuickASI);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutQuickASI);Thread.sleep(2000);
	   
   }
   public void Airline() throws InterruptedException {
	   
	   wm.JavascriptExecutorClick(driver, gmr.AllForAirline);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AllForAirlineOk);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.COApproval);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNo);Thread.sleep(2000);
		//gmr.CartingOrderShipmentMAWBNo.sendKeys("99924052081");Thread.sleep(2000); 
   }
		
		//gmr.CartingOrderShipmentMAWBNo.sendKeys("999" + TestDataReader.AWBNo_Direct_Practice());
		//Thread.sleep(2000);//-------------AWB--------
		
		public void AirlineApprove() throws InterruptedException {
			
		wm.JavascriptExecutorClick(driver, gmr.CartingOrderShipmentMAWBNoSearchBtn);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.Action);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.Approve);Thread.sleep(4000);
		
		wm.JavascriptExecutorClick(driver, gmr.ApproveOk);Thread.sleep(4000);
		
		//wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutArrow);Thread.sleep(2000);
		
		//wm.JavascriptExecutorClick(driver, gmr.AirlineLogout);Thread.sleep(2000);
   
}
   
   public void AllRaadioBtn() throws InterruptedException {
     
	   gmr.AllRadioBtn.click();
		Thread.sleep(2000);
		
		gmr.GmrHydRadioOKBtn.click();
		Thread.sleep(2000);
   
   }
   
   public void AddHAWBForAadhya() throws InterruptedException {
	     
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
		assignCHAaddhawbquickASI.selectByVisibleText("AADHYA LOGISTICS");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.SaveHAWBAddBtnQuickASI);Thread.sleep(2000);
		
		
		wm.JavascriptExecutorClick(driver, gmr.SavePopupHAWBAddBtnQuickASI);Thread.sleep(2000);
   }
   public void AdvikLogout() throws InterruptedException {
	     
	   gmr.AdvikHydrabadDownArrowBtn.click();
		Thread.sleep(2000);
		
		gmr.AdvikHydrabadLogOutBtn.click();
		Thread.sleep(2000);
   
   }
   public void AirlineLogout() throws InterruptedException {
	   
   wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutArrowQuickASI);Thread.sleep(2000);
   wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutQuickASI);Thread.sleep(2000);
   }
}
   

