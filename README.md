# Hostmaker_Project
create the project using Jave, cucumber and Gherking.
created a simple step for for the project.
Feature: Estimate Page
As a new customer  
I want to be able to enter my postcode
So that I can get an estimation of prices of housese in my area


Scenario: the user should be able to use a valide address
Given the user is on the homepage of hostmaker
When the user enters vaild postcode 
Then the user should be able to get to the request page for the estimate and logout.

created a feature file where you can run the test case. 

I also created more more steps but for now have put ignore on them.

sorry i could not build this in Node js for you. 
