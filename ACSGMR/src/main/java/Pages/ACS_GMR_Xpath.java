package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ACS_GMR_Xpath extends Pages.BasePage {

	public ACS_GMR_Xpath(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id='ctl00_hldPage_rblCTO_0']")
	public WebElement AllRadioBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnCTOYes']")
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
	
	@FindBy(xpath = "(//*[text()='Shipper Name: '])[1]/parent::td/parent::tr/td[2]/input[1]")
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
	
	@FindBy(xpath = "/html/body/form/div[12]/div[3]/div/button[1]")
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
	
	@FindBy(xpath = "/html/body/form/div[12]/div[3]/div/button[1]")
	public WebElement ConsigneeOkBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[3]/div/table/tbody/tr[2]/td/span/table/tbody/tr[4]/td/span/table/tbody/tr/td[1]/table/tbody/tr[5]/td/a")
	public WebElement Routing;
	
	@FindBy(css = "#ctl00_hldPage_GenericAutoFillDestAirport_txtCode")
	public WebElement DestPort;
	
	@FindBy(xpath = "//*[text()='LHR-London']")
	public WebElement DestPortCountry;
	
	@FindBy(css = "#ctl00_hldPage_ViaRoute2_txtCode")
	public WebElement Via2;
	
	@FindBy(xpath = "/html/body/form/div[12]/div[3]/div/button[1]")
	public WebElement RoutingOk;
	
	@FindBy(css = "#aspnetForm > div:nth-child(44) > div.ui-dialog-titlebar.ui-corner-all.ui-widget-header.ui-helper-clearfix > button")
	public WebElement RoutingClose;
	
	@FindBy(css = "#ctl00_hldPage_txtflightno1")
	public WebElement FlightNo;
	
	@FindBy(css = "#ctl00_hldPage_txtflightno1")
	public WebElement ChargeCode;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_Chkisaggreed']")
	public WebElement UncheckRates;
	
	@FindBy(xpath = "//*[@id='txtCgRate_1']")
	public WebElement RateCharges;
	
	@FindBy(xpath = "//*[@id='txtCgTotal_1']")
	public WebElement total;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[3]/div/table/tbody/tr[2]/td/span/table/tbody/tr[8]/td/div/table/tbody/tr[2]/td[11]/input")
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
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtflightno1']")
	public WebElement QuickASIFlightNo;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[4]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[2]/td[12]/table/tbody/tr/td/div/div[1]/div[1]")
	public WebElement QuickASIAssignCHA;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_mltSlctCHA_3']")
	public WebElement QuickASIAssignCHAAdvikEnterprises;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_mltSlctCHA_1']")
	public WebElement QuickASIAssignCHAAdhyaLogistics;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[4]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[2]/td[12]/table/tbody/tr/td/div/div[1]/div[2]/span")
	public WebElement QuickASIAssignCHA1;
	
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
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSubmit']")
	public WebElement Approve;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_Button1']")
	public WebElement ApproveOk;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[1]/div[3]/div/div[2]/div/span")
	public WebElement AirlineLogoutArrow;
	
	@FindBy(xpath = "//*[@id='ctl00_LinkButton6']")
	public WebElement AirlineLogout;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[4]/div[6]/div/div/div/fieldset/div[2]/table/tbody/tr[2]/td[14]/a/img")
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
	
	@FindBy(xpath = "/html/body/form/div[10]/div[3]/div/button[1]")
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
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdSBDetails_ctl02_imgASISBStatus']")
	public WebElement SBASI;
	
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
	
	@FindBy(xpath = "/html/body/div[7]/table/tbody/tr[1]/td[5]/a")
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
	
	@FindBy(xpath = "//*[@class='.rowfy-addrow']")
	public WebElement vehicaltokenplusbtn ;
	
}
