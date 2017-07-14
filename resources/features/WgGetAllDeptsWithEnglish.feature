@Regression @wg_get_all
Feature: Twitter - interview Nicolas Mori

Scenario Outline: Access to twitter and write a post.

#Given I start to the browser and set this url "<url>"
#And I set the name of the city "<city>"
#Then I select the option of dept type and set "<deptType>" press the button find
#Then I set the max value of rent to pay with the value "<maxRentValue>" and press the button apply filter
#And I access to the options of depart
#And I check if the british falg exit
#And I take if exist the value of requisites and show in the screen

	Given I start the browser 
	And I access to this url "<url>"
	And I press in the button to continue with the login
	
	
	And I set the name of the city "<city>"
	And I select the value from the suggestions list with the city "<city>"
	And I press the button search
	And press click in the login button and semd user "<user>" and pass "<pass>" 
	
	#And I get all the apartments and verify this
	And I get the text of all the results an show this per terminal

Examples:
| browser 	| url						 					| deptType		| maxRentValue  | user					 | pass	 	| 
| chrome    | https://en.nametests.com/test/test/9164/		| WG-Zimmer		| 750			| nicolas.mori@gmail.com | a4610b   | 




#1-Zimmer-Wohnung
#Wohnung
#Haus