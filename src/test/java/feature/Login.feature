Feature: Login in the testLeaf LeafTaps Website

Scenario: Login into LeafTaps Site(Positive)
Given open the browser
And maximize the browser
And Set the Timeouts
And Type the URL
And Enter the UserName as DemoSalesManager
And Enter the password as crmsfa
When Click the login Button
Then Verify login sucessfull 
