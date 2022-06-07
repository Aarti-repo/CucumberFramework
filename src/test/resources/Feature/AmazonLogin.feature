Feature: Feature to test login functionality 


 
Scenario Outline: Test Amazon login is successful with valid credential 

	Given Launch the chrome driver and Start the application 
	
	When User enter valid <username> & <password> 
	
	And User should able to login successfully 
	
	Then User is nevigated to home page 
	
	
	Examples: 
	
		|username|password|
		|9657378754|@Aarti88|
		|aarti|1234|