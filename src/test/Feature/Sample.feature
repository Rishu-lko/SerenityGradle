Feature: Resources 

@SampleSerenity
Scenario: Sample Serenity
Given I send sample get request
Then I validate status code to be "200"