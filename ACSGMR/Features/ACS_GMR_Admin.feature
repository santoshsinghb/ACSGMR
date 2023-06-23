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