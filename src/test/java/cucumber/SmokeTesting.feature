@smoke
Feature: Create User Admins with Active/Inactive statuses and Developer/Secondary/portfolio/trakheesi user admin roles


  @tag
  Scenario Outline: Verify User admin creation with active status , no change in country code developer user admin
    Given I enter <name>, <email>, <mobile_number>, <address> and click Save & Send Password
    Then Verify created user admin details

    Examples: 
			| name |        email      | mobile_number |     address      |
			
			| abcd | abcd123@gmail.com | +919991855800 | Pixbit Solutions |
			

