#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: AddCandidate
  I want to add new candidate

  @tag1
  Scenario Outline: Success add new candidate
    #Given login
    And I want to go page candidate list
    Then I want to click Add Candidate Button
    #When I open add candidate page
    When Input First Name <name>
    And Input Last Name <name>
    And Input Email <email>
    Then Click Save
    And Verify
    Then CloseBrowser

    Examples: 
      | name  | email        | contact | keywords | comment |
      | name1 | john@doe.com |     007 | key word | comment |
