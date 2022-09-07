Feature: Login functionality

@Login
Scenario Outline: Login with different user type credential
Given Go to the Login page
When  Enter the valid emailaddress <emailaddress>
And   Enter the valid password <Password>
And   Click on the Login button
Then  The <usertype> login successfully and the dashboard loading properly <Screenshot>

Examples:
|emailaddress                 | Password              | usertype             | Screenshot  |
|developer@skunexus.com       |ChangeMe2021!          | Systemadmin          | systemadmin1    |
|aswini+user1@skunexus.com    |Test@123               | Regularuser          | regularuser2    |
|aswini+vendoruser1@skunexus.com |Test@123            | Vendoruser           | vendoruser3     |


