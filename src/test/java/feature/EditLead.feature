Feature: CreateLead in the testLeaf LeafTaps Website
Scenario: Login into LeafTaps Site and go to CreateLead page(Positive)
Given open the chrome browser
And maximize the chrome browser
And Set the Timeoutsfor createLead
And Type the URLfor website
And Enter UserName as DemoSalesManager
And Enter password as crmsfa
When Click login Button
Then Verify login sucessfull
