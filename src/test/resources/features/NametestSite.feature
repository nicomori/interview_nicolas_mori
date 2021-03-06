@Regression @example
Feature: interview Nicolas Mori

Scenario Outline: Interview Nicolas Mori

	Given I start the browser 
	And I access to this url "<url>"
	Then verify the homepage is correctly deployed without errors
	And I press in the button to continue with the login
	Then verify the FB login is correctly deployed without errors
	And I set the username "<user>" and the password "<pass>"
	Then verify the result is correctly deployed without errors
	
Examples:
| browser 	| url						 					| user						 					 | pass	 				   	  | 
| chrome    | https://en.nametests.com/test/test/9164/		| gnfskuf_wongstein_1472554768@tfbnw.net		 | CDtmCMGEj]XCiPmsYiWvaLP6    | 
| chrome    | https://en.nametests.com/test/test/8292/		| gnfskuf_wongstein_1472554768@tfbnw.net		 | CDtmCMGEj]XCiPmsYiWvaLP6    | 
| chrome    | https://en.nametests.com/test/test/11005/		| gnfskuf_wongstein_1472554768@tfbnw.net		 | CDtmCMGEj]XCiPmsYiWvaLP6    | 
