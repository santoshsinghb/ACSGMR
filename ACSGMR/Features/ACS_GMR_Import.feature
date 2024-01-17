#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@GMRProcess @ACSGMRImport
Feature: Export > ACS-GMR-Import

Background: Launch the ACS application and login the application ACS_GMR_Import
    When I login with "ACS USER" user given in "Login" sheet ACS_GMR_Import

 @ACS_GMR_1Import
   Scenario: create a direct/consol shipment ACS_GMR_Import single BOE single VT.
   Given To verify whether user is able to create Direct Shipment from Add MAWB/HAWB screen ACS_GMR_Import
  Then I login with "ACS AIRLINE KALE" airline user given in "Login" sheet ACS_GMR_Import
   Then user should be able to Approve the Airline DO request from Kale Airline account
   ###Then I logout with "ACS USER" airline user given in "Login" sheet for request status ACS_GMR_Import
  ##When I login with "ACS AADHYA" airline user given in "Login" sheet ACS_GMR_Import 
   
   
  And user should be able to do Weight verification of Consol Shipment
  #When To verify whether the user is able to do Consol DO and assign the shipment as self for Consol Shipment
   Then user should be able to do Consol DO and assign the shipment to another CB
   And user should be able to do BoE for Direct/Consol Shipment
   Then user should be able to do Pick Order for Direct/Consol Shipment
  When user should be able to do OOC for Direct/Consol Shipment 
   Then user should be able to BoE ASI and View the ACS Receipt for Direct/Consol Shipment
  #And To check if user can create TSP for Direct/Consol shipment as self assign.
   Then user should be able to assign the shipment to Consignee to create TSP for Direct/Consol shipment
   When user should be able to create single VT for single BoE  from TSP pop up
  #Then To check if user is able to create single VT for single BoE  from  Shipment list page
   When user should be able to generate the token on click of Generate Token button
   #Then To verify whether the user is able to Revoke and Send ADO again from Airlines login
   #And To verify whether the user is able to view Reject icon when the CTO rejects the Wt.Verification and again the user is able to resubmit the Wt.Verification.
  #When To verify whether the user is able to do BoE and view complete icon when CTO Approves BoE for Direct/Consol Shipment with Manual Type
   #Then To verify whether the user is able to take print of Pick Order for Direct/Consol Shipment
   Then user should be able to view Complete icon for Dock In/Dock Out on Track and Trace screen when the CTO perform Dock In/Dock Out activity.
  #When To verify whether the user is able to View Partial Complete icon for Dock In/Dock Out on Track and Trace screen when the CTO perform Dock In/Dock Out activity for 1 VT out of 2 VT.
   And To check whether the system displays proper status for ARR,RCF,NFD,ADO,DI,Consol DO, BoE, RFE,FFE,OOC, TSP,VT,GD with proper date and timestamp.
   Then user should be able to clicks on AWB number and it should display its  details and correct status in its respective fields.
   Then user should be able to View the Transaction Report From Sub-menu of Reports
   When user should be able to View the Dwell Time Report From Sub-menu of Reports
   Then user should be able to View the Tonnage Report
   Then user should be able to release and revoke DO in bulk.
    
    
@ACS_GMR_2Import
    Scenario: create a direct shipment ACS_GMR_Import single BOE multiple VT and multiple BOE single VT.
    Given To verify whether user is able to create Direct Shipment from Add MAWB/HAWB screen ACS_GMR_Import
    Then I login with "ACS AIRLINE KALE" airline user given in "Login" sheet ACS_GMR_Import
    Then user should be able to Approve the Airline DO request from Kale Airline account
    Then logout with airline ane login with FF.
    And user should be able to do Weight verification of Consol Shipment
 # #When To verify whether the user is able to do Consol DO and assign the shipment as self for Consol Shipment
   Then user should be able to do Consol DO and assign the shipment to another CB
   And user should be able to do BoE for Direct/Consol Shipment
   Then user should be able to do Pick Order for Direct/Consol Shipment
   When user should be able to do OOC for Direct/Consol Shipment 
   Then user should be able to BoE ASI and View the ACS Receipt for Direct/Consol Shipment
 # #And To check if user can create TSP for Direct/Consol shipment as self assign.
   Then user should be able to assign the shipment to Consignee to create TSP for Direct/Consol shipment
   Then To check if user is able to create multiple VT for single BoE  from Shipment list page
   When To verify whether user is able to Cancel the token on click of Cancel Token Button from VCT screen
   Then To check if user is able to create single VT  for multiple BoE  from shipment list page
   ###Then user should be able to view Complete icon for Dock In/Dock Out on Track and Trace screen when the CTO perform Dock In/Dock Out activity.
  #When To verify whether the user is able to View Partial Complete icon for Dock In/Dock Out on Track and Trace screen when the CTO perform Dock In/Dock Out activity for 1 VT out of 2 VT.
   ###And To check whether the system displays proper status for ARR,RCF,NFD,ADO,DI,Consol DO, BoE, RFE,FFE,OOC, TSP,VT,GD with proper date and timestamp.
   ###Then user should be able tor clicks on AWB number and it should display its  details and correct status in its respective fields.
  ### Then user should be able to View the Transaction Report From Sub-menu of Reports
   ###When user should be able to View the Dwell Time Report From Sub-menu of Reports
   ###Then user should be able to View the Tonnage Report
   ###Then user should be able to release and revoke DO in bulk.
   
    
 @ACS_GMR_3Import  
    Scenario: create a direct shipment ACS_GMR_Import.
    Given To verify whether user is able to create Direct Shipment from Add MAWB screen ACS_GMR_Import
    Then I login with "ACS AIRLINE KALE" airline user given in "Login" sheet ACS_GMR_Import
   Then user should be able to Approve the Airline DO request from Kale Airline account
    And user should be able to do BoE for Direct/Consol Shipment for direct shipment
   Then user should be able to do Pick Order for Direct/Consol Shipment for direct shipment.
   When user should be able to do OOC for Direct/Consol Shipment for direct shipment.
   Then user should be able to BoE ASI and View the ACS Receipt for Direct/Consol Shipment for direct shipment.
   And To check if user can create TSP for Direct shipment as self assign.
  # When user should be able to create single VT for single BoE  from TSP pop up
  #  When user should be able to generate the token on click of Generate Token button
   # Then user should be able to view Complete icon for Dock In/Dock Out on Track and Trace screen when the CTO perform Dock In/Dock Out activity.
    ##Given To verify can submit any documentation if previous one is pending.
    