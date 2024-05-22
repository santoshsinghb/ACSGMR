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


@GMRProcessQuickASI
Feature: Export > ACS-GMR-QuickASI

Background: Launch the ACS application and login the application ACS_GMR QuickASI
     When I login with "ACS USER" user given in "Login" sheet ACS_GMR QuickASI

     @ACS_GMR_QuickASI_DirectNonBonded
     Scenario: create a new AWB ACS_GMR QuickASI Direct Non Bonded
     Given To verify whether User is able to view Quick ASI Tab in e-AWB drop down ACS_GMR QuickASI
     Then For Bonded shipments verify whether the user is able to sent the CO request to Bonded Trucker ACS_GMR QuickASI Direct NonBonded
     Then I login with "ACS AADHYA" Adhya user given in "Login" sheet ACS_GMR QuickASI Direct NonBonded
     Then I logout with "ACS USER" airline user given in "Login" sheet ACS_GMR QuickASI Direct NonBonded
     Then To verify whether the user is able to submit the SB ASI details ACS_GMR QuickASI Direct NonBonded
     
     
     @ACS_GMR_QuickASI_DirectBonded
     Scenario: create a new AWB ACS_GMR QuickASI Direct Bonded
     Given To verify whether User is able to view Quick ASI Tab in e-AWB drop down ACS_GMR QuickASI Direct Bonded
     Then For Bonded shipments verify whether the user is able to sent the CO request to Bonded Trucker ACS_GMR QuickASI Direct Bonded
     Then I login with "ACS AADHYA" Adhya user given in "Login" sheet ACS_GMR QuickASI Direct Bonded
     Then I logout with "ACS USER" airline user given in "Login" sheet ACS_GMR QuickASI Direct Bonded
     Then To verify whether the user is able to submit the SB ASI details ACS_GMR QuickASI Direct Bonded
     Then Able to generate single VT for 2 different AWB ACS_GMR QuickASI Direct Bonded
     
     @ACS_GMR_QuickASI_ConsoleNonBonded
     Scenario: create a new AWB ACS_GMR QuickASI Console NonBonded
     Given To Verify whether User is able to view enable Add HAWB button after selecting radiobutton for Consol ACS_GMR QuickASI Console NonBonded
     Then For Bonded shipments verify whether the user is able to sent the CO request to Bonded Trucker ACS_GMR QuickASI Console NonBonded
     Then I login with "ACS AADHYA" Adhya user given in "Login" sheet ACS_GMR QuickASI Console NonBonded
     Then I logout with "ACS USER" airline user given in "Login" sheet ACS_GMR QuickASI Console NonBonded
     Then To verify whether the user is able to submit the SB ASI details ACS_GMR QuickASI Console NonBonded
     
     
     @ACS_GMR_QuickASI_ConsoleBonded
     Scenario: create a new AWB ACS_GMR QuickASI Console Bonded
     Given To Verify whether User is able to view enable Add HAWB button after selecting radiobutton for Consol ACS_GMR QuickASI Console Bonded
     Then For Bonded shipments verify whether the user is able to sent the CO request to Bonded Trucker ACS_GMR QuickASI Console Bonded
     Then I login with "ACS AADHYA" Adhya user given in "Login" sheet ACS_GMR QuickASI Console Bonded
     Then I logout with "ACS USER" airline user given in "Login" sheet ACS_GMR QuickASI Console Bonded
     Then To verify whether the user is able to submit the SB ASI details ACS_GMR QuickASI Console Bonded
     