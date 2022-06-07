Feature: Check home page functionality 


Background: user is logged in 

	Given user is on login page 
	When user enters username & password 
	And click on login button 
	Then user is nevigated to home page 
	
	
	
Scenario: Check logout link 

#	Given user is logged in 
	
	When user click on welcome link 
	
	Then logout link is displayed 
	
	
Scenario: verify quick launch toolbar is present 

#	Given user is logged in 
	
	When user clicks on dashboard link 
	
	Then quick launch toobar is displayed 
	
	
	
	
	
