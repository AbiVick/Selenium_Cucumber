Feature: Login functionality

Scenario: login with valid user details

Given User launch chrome browser
When user open app URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
And user enter email as "admin@yourstore.com" and password as "admin"
And click on Login
Then page title should be "Dashboard / nopCommerce administration"
When user click on Logout link
Then page title should be "Your store. Login"
And close browser

#Scenario: login with wrong title text

#Given User launch chrome browser
#When user open app URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
#And user enter email as "admin@yourstore.com" and password as "admin"
#And click on Login
#Then page title should be "Dashboard / nopCommerce administration"
#When user click on Logout link
#Then page title should be "Your store. Login1"
#And close browser