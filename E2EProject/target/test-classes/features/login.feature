Feature: Login into application

Scenario Outline: positive test validating login
Given Initialize browser with chrome
And Navigate "http://www.qaclickacademy.com" site
And click on login link in home page to land on sign in page
When user enters <username> and <password> and logs in 
Then verify that user is successfully logged in 
And close all browserss

Examples:
|username			|password		|
|test99@gmail.com	|123456			|
|test123@gmail.com	|12345			|
