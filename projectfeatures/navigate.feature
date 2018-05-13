
Feature: Estimate Page
As a new customer  
I want to be able to enter my postcode
So that I can get an estimation of prices of housese in my area 

Background: 


Scenario: the user should be able to use a valide address
Given the user is on the homepage of hostmaker
When the user enters vaild postcode 
Then the user should be able to get an estimate 

@ignore
Scenario: The user should be able to use valide postcode to book an appointment 
Given the user is on the homepage of hostmaker
When user enters valid postcode as "N1 9PD"
And user enters firstname as "Neo"
And user enters lastname as "Oke"
And user enters phonenumber as "07539469557"
When user enters email as "test@test.com"
Then the user should be able to get an estimate