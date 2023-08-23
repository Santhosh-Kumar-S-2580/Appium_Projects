@Register
Feature: Calculator Application 
@ValidRegistration
Scenario: User Operates the Calculator
   Given open the calculator
   When change Theme
   Then perform calculation & Print the Result
   
