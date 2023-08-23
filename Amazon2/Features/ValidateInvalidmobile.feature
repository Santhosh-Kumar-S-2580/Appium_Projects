@Invalidmobile
Feature:  Invalid Mobile Number Validation

Scenario: Invalid Mobile Number Validation in Signup page of the amazon
   Given User go  AMAZON website "https://www.amazon.in/"
   When  click on  the SignIn Button
   When  Enter the Invalid Mobile Number as "<mobile>"
   When  Click on Continue
   Then  User Should be get the error message & Error Message As "<Error>"
   
   
   Examples:
   |mobile|Error|
   |0090876543210|Incorrect phone number|
   |63856881171234sdsad|There was a problem|
   |63856@8$8117!@123|There was a problem|
   |qdwdd|There was a problem|
   |$%$!|There was a problem|
   |1233|Incorrect phone number|
   
   