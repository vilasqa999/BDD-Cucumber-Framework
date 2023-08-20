
Feature: Login

Scenario: Successful login with valid cred 
Given User launch Chrome browser
When  User open application url "https://admin-demo.nopcommerce.com/login"
And User enter username as "admin@yourstore.com" and password as "admin"
And click on login button
Then dashboard title should be shown as "Dashboard / nopCommerce administration"
And User click on logout button
Then  Page title should be "Your store. Login"
And close browser