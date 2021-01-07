Feature: Application login



Scenario: Home page default login
Given User is on netbanking landing page
When User login into application with username "jin" and password "no"
Then Home page is populated 
And Cards displayed are "true"


Scenario: Home page default login
Given User is on netbanking landing page
When User login into application with username "john" and password "hello"
Then Home page is populated 
And Cards displayed are "false"

