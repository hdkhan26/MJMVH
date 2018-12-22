#Author: SyntaxTeam
Feature: Recuritment feature

   
Scenario: Recquirment Feature

Given I logged into OrangeHRM
When I click Recruitment Module and click Candidates
And Click Add
And Enter "Haider" and "M" and "Khan"
And Enter "haiderkhan33@yahoo.com" and "12345678"
Then I see Job Vacancy is displayed
And I enter user "Khan" and greeting "How r u"
And I select "2018-12-20"
And I click Save
Then I see Candidate appears in Candidates History

 Scenario: Candidates
 
 Given I logged into OrangeHRM 
When I click Recruitment Module and click Candidate
And I Select All from Job Title
And I Select All from Vacancy
And I Select All from the Hiring Manager
And I Select All from Status
And I Enter "Haider" and "M" and "Khan"
And I Enter date "2018-12-20"
And Select Methods of Application to Manual
And Click Search
Then I see Candidate is present
 
   
   