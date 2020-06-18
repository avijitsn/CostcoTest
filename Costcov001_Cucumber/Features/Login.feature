Feature: Verify Login to Costco website

@tag1
Scenario: Costco login
# User login to Costco website with userid & password
	Given user click on chrome browser
	When user open url "https://www.costco.com/"
	And user click on Signin 
	Then user entered Email Address as "avijitsn@gmail.com" and Password as "derling7"
 

#Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |
