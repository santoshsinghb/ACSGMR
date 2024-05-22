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
Feature: Export > ACS-GMR

Background: Launch the ACS application and login the application
     When I login with "ACS USER" user given in "Login" sheet 

 @ACS_GMR1
   Scenario: create a new AWB ACS_GMR
     Given To verify whether the user is able to Create Booking from e-Booking ACS_GMR
     Then To verify Whether User is able to Upload the HAWB Details From sub-menu of e-AWB ACS_GMR
     Then I login with "ACS AIRLINE KALE" airline user given in "Login" sheet ACS_GMR
     Then I logout with "ACS USER" airline user given in "Login" sheet ACS_GMR
     Then To verify whether the user is able to do SB ASI and TSP payment in MAWB list for direct AWB ACS_GMR 
     Then To verify whether the user is able to forward jobs to airline from Receive sub-menu of e-booking ACS_GMR
     Then To Verify Whether user is able to View the All Records of AWB in Track and Trace ACS_GMR
     Then To verify whether user is able to send request of AWB stock to airline login ACS_GMR
     Then I login with "ACS AIRLINE KALE" airline user given in "Login" sheet for request status ACS_GMR
     Then I logout with "ACS USER" airline user given in "Login" sheet for request status ACS_GMR
     Then To verify whether the user is able to assign AWB from Assign to Sub Agent from AWB Stock Inventory ACS_GMR
     Then To verify whether the user is able to view the AWB from Sub Agent Inventory ACS_GMR
     Then To verify whether user is able to View the Transaction Report From Sub-menu of Reports ACS_GMR
     
     