Feature: Weather App
	@runAll @test1 
  Scenario: 5 Day forecast is displayed for a valid City 
    Given I am on the weather homepage
     When I enter "Stirling" as the City 
     Then The 5 day forecast is displayed
     
	@runAll @test2 
  Scenario Outline: Error message displayed for invalid City name
    Given I am on the weather homepage
     When I enter "<city>" as the City
     Then I see the error message displayed
     Examples:
     |city			|
     |St1rling	|
     |Alloa			|
     |123456		|

	@runAll @test3     
  Scenario: Daily summary expands to show weather at 3 hour intervals
    Given I am on the weather homepage
      And I enter "Stirling" as the City
     When I expand a daily summary    
     Then The 3 hourly forecast is displayed

	@runAll @test4      
   Scenario: Daily summary collapses to hide 3 hour intervals
    Given I am on the weather homepage
      And I enter "Stirling" as the City
     When I close a daily summary  
     Then The 3 hourly forecast is hidden 
     
     
     
         
     
