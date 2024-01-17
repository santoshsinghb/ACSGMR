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
@GMRProcess
Feature: Export > ACS-GMR-Admin

Background: Launch the ACS application and login the application ACS_GMR_Admin
     When I login with "ACS USER" user given in "Login" sheet ACS_GMR_Import

 @ACS_GMR_Admin
   Scenario: create Account credit request ACS_GMR_Admin
   Given To verify whether the user is able to login with there account and to send the Credit Request to Kale Finance ACS_GMR_Admin
   When User should be able to click on "Admin" mode and Account Credit request page should be displayed.
   Then User should be able to select "Credit Type" from dropdown and In the dropdown Cheque DD/PO,Bank Transfer,Cash mode should be display
   Then User should be able to enter "Bank Name","Branch Name"and "cheque UTRno" in the textbox
   Then User should be able to enter amount range in the "Amount",enter the "Remark(Opt.)"and click on "Choose File" and select the file to upload.File name should be displayed at the side of the "Choose File" button.
   Then User should be able to click on "Upload" to upload the file and  User should be able to click on "SAVE" button
   Then User should be able to click on "OK" button of successful message dialogue box and Account Credit Request page should be displayed.
   Then User should be able to view the Account Ledger and User should be able to login with FF credentials and  click on "Admin" mode.
   Then User should be able to click on "Account Ledger" sub-menu of Account Management menu.
   Then User should be able to select the Mode From Dropdown and In the dropdown Export, Import and Both mode should be display System should display the selected option.
   Then User should be able to select "From Date" from the calendar icon or can change the date by arrow keys from keyboard. 
   Then User should be able to click on "View" button and All the credits and debits for each AWB no. should be displayed in the grid.
   Then User should be able to Click on "Advance Receipt" sub-menu of "Account Management" menu and Advance Receipt page should be displayed.  
   Then User should be able to select "Credit Type" from dropdown and In the dropdown Cheque DD/PO,Bank Transfer,Cash mode should be display. 
   Then User should be able to click on "Search" button and Records should be displayed to the user according to the applied filters.  
   Then User should be able to click on View Recipt from grid and PDF file should be downloaded with the Recipt  
   Then User should be able to click on "Refund Receipt" sub-menu of  Account Management menu and Refund Receipt page should be displayed.       
   Then User should be able to select "From Date" from the calendar icon or can change the date by arrow keys from keyboard and User should be able to click on "Search" button and  Records should be displayed to the user according to the applied filters.
    Then User should be able to click on "CTO Ledger" sub-menu of Account Management menu and PD Acc.Report page should be displayed.   
    Then User should be able to select the CTO From Dropdown and System should display the selected option.
    Then User should be able to select "From Date" from the calendar icon or can change the date by arrow keys from keyboard andUser should be able to click on "View" button All the credits and debits for each AWB no. should be displayed in the grid.
    Then User should be able to click on "Export to Excel" button and Excel file should be downloaded with the credits and debits details for each AWB no. 
    Then User should be able to click on "Export to PDF" button and PDF file should be downloaded with the credits and debits details for each AWB no    
   