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

@GMRProcessPractice
Feature: Export > ACS-GMR-NewCR

Background: Launch the ACS application and login the application ACS_GMR_Practice
     When I login with "ACS USER" user given in "Login" sheet ACS_GMR_Practice 

  @ACS_GMR_NewCR_Flow1 
   Scenario Outline: To verify user able to create Direct AWB ACS_GMR_Practice
   Then To verify user able to create Direct AWB in FF login ACS_GMR_Practice "<MAWBNo_17>"
   Then I login with "ACS AIRLINE KALE" user given in "Login" sheet ACS_GMR_Practice
   Then To verify Airline login ACS_GMR_Practice "<MAWBNo_17>"
   Then I login with "ACS AADHYA" user given in "Login" sheet ACS_GMR_Practice
   Then add 2SB details and generate single VT in CB login ACS_GMR_Practice
   Examples:
   |MAWBNo_17   |
   |87656774    |
   
    @ACS_GMR_NewCR_Flow2
   
   #TC 13,26,27,29,48,50,54,55,56,61,63,65,67
   Scenario Outline: To verify user able to create consol AWB in FF login add 1SB ACS_GMR_Practice
   #Then I login with "ACS USER" user given in "Login" sheet ACS_GMR_Practice
   Then To verify user able to create consol AWB in FF login add 1SB ACS_GMR_Practice "<MAWBNo_13>"
  Then I login with "ACS AIRLINE KALE" user given in "Login" sheet ACS_GMR_Practice
   Then To verify airline login ACS_GMR_Practice "<MAWBNo_13>"
   Then I login with "ACS AADHYA" user given in "Login" sheet ACS_GMR_Practice
   Then TSP process from airline login in CB login ACS_GMR_Practice "<MAWBNo_13>"
   Then To verify whether the user is able to do multiple SB ASI for all SB in CB login ACS_GMR_Practice "<MAWBNo_13>"
   Then To verify whether the user is able to delete SB details of existing SB before doing SB ASI from CB login ACS_GMR_Practice "<MAWBNo_13>"
   Then To verify whether the user is able to edit SB details of existing SB before doing SB ASI from CB login ACS_GMR_Practice "<MAWBNo_13>"
   Then To verify whether the user is able to delete SB details of existing SB after doing SB ASI from CB login ACS_GMR_Practice "<MAWBNo_13>"
   Then To verify whether the user is able to edit SB details of existing SB after doing SB ASI from CB login ACS_GMR_Practice "<MAWBNo_13>"
   Then To verify whether the system allow the user to do SB ASI for submitted SB ASI TSP done for 2 SB Addition of 3rd SB and Submission of SB ASI in CB login ACS_GMR_Practice "<MAWBNo_13>"
   Then To verify user able to create consol AWB in FF login add 1SB and generate multiple VT in CB login or not ACS_GMR_Practice "<MAWBNo_13>"
   Then To verify whether the user is able to view the TSP and VT Print as well as in CB login ACS_GMR_Practice "<MAWBNo_13>"
   Then VT print from CB login ACS_GMR_Practice "<MAWBNo_13>"
   
   
   Examples:
   |MAWBNo_13   |
   |87656715    |
   
   @ACS_GMR_NewCR_Flow3
   
   #TC 1,4,17,19,24,25,30,31,32,33,34,35,37,38,39,40,41,42,43,47,49,51,52,53,60,62,64,66
   Scenario Outline: To verify whether the user is able to  rejection of CO from airline login ACS_GMR_Practice
   #Then I login with "ACS USER" user given in "Login" sheet ACS_GMR_Practice
   Then To verify whether the user is able to rejection of CO from airline login ACS_GMR_Practice "<MAWBNo_39>"
   Then I login with "ACS AIRLINE KALE" user given in "Login" sheet ACS_GMR_Practice
   Then To verify rejection of airline login ACS_GMR_Practice "<MAWBNo_39>"
  Then I login with "ACS USER" user given in "Login" sheet ACS_GMR_Practice
   Then To verify whether the user is able to rejection of CO ACS_GMR_Practice "<MAWBNo_39>"
  Then I login with "ACS AIRLINE KALE" user given in "Login" sheet ACS_GMR_Practice
   Then till TSP process from airline login ACS_GMR_Practice "<MAWBNo_39>"
   Then I login with "ACS USER" user given in "Login" sheet ACS_GMR_Practice
   Then TSP process from airline login ACS_GMR_Practice "<MAWBNo_39>"
   Then To verify whether the user is able to do multiple SB ASI for all SB ACS_GMR_Practice "<MAWBNo_39>"
   Then To verify whether the user is able to delete SB details of existing SB before doing SB ASI from FF login ACS_GMR_Practice "<MAWBNo_39>"
   Then To verify whether the user is able to edit SB details of existing SB before doing SB ASI from FF login ACS_GMR_Practice "<MAWBNo_39>"
   Then To verify whether the user is able to delete SB details of existing SB after doing SB ASI from FF login ACS_GMR_Practice "<MAWBNo_39>"
   Then To verify whether the user is able to edit SB details of existing SB after doing SB ASI from FF login ACS_GMR_Practice "<MAWBNo_39>"
   Then To verify whether the system allow the user to do SB ASI for submitted SB ASI TSP done for 2 SB Addition of 3rd SB and Submission of SB ASI ACS_GMR_Practice "<MAWBNo_39>"
   Then To verify whether the user is able to view the TSP and VT Print as well as ACS_GMR_Practice "<MAWBNo_39>"
   Then VT print from FF login ACS_GMR_Practice "<MAWBNo_39>"
   #Then I login with "ACS AIRLINE KALE" user given in "Login" sheet ACS_GMR_Practice
   Then To verify whether the user is able to rejection of CO from Airline login or not for those AWB TSP already process ACS_GMR_Practice "<MAWBNo_39>"
   
   Examples:
   |MAWBNo_39   |
   |87656726    |
   
   
   