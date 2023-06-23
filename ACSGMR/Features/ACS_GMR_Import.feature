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
Feature: Export > ACS-GMR-Import

Background: Launch the ACS application and login the application ACS_GMR_Import
     When I login with "ACS USER" user given in "Login" sheet ACS_GMR_Import

 @ACS_GMR_Import
   Scenario: create a direct shipment ACS_GMR_Import
   Given To verify whether user is able to create Direct Shipment from Add MAWB/HAWB screen ACS_GMR_Import
   Then I login with "ACS AIRLINE KALE" airline user given in "Login" sheet ACS_GMR_Import
   Then I logout with "ACS USER" airline user given in "Login" sheet for request status ACS_GMR_Import
  # When I login with "ACS AADHYA" airline user given in "Login" sheet ACS_GMR_Import 
    