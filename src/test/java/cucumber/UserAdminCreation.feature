
@tag
Feature: Create User Admins with Active/Inactive statuses and Developer/Secondary/portfolio/trakheesi user admin roles


Background:
Given I open login page and login "" and "" then open User Admin page and click Add User Admin

  @tag2
  Scenario Outline: Verify User admin creation with active status , no change in country code developer user admin
    Given I enter <name>, <email>, <mobile_number>, <address> and click Save & Continue

    Examples: 
      +---------+----------------------+---------------+------------------+
			|   name  |        email         | mobile_number |     address      |
			+---------+----------------------+---------------+------------------+
			| Sharika | sharika123@gmail.com |  919594934894 | Pixbit Solutions |
			+---------+----------------------+---------------+------------------+

			
	@tag3
	Scenario Outline: Verify User admin creation with active 