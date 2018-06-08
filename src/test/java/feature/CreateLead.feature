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
And Click CRMSFA 
And Click Lead
And Click Create Lead
And Enter the company Name as AlightSolution 
And Enter the First Name as Hariprasath
And Enter the last Name as S
When Click the Create Lead button
Then Verify Create Lead is created 