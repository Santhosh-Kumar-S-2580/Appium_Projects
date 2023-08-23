@validmobile
Feature:  Mobile Number Validation

Scenario: Mobile Number Validation in Signup page of the amazon
   Given User is on AMAZON website "https://www.amazon.in/"
   When  click the SignIn Button
   When  Enter the Mobile Number as "6385688118"
   When  Click on Continue
   Then  User Should be Navigated to Password field
   
   
   
  