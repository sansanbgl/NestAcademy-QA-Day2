#Author: umarhasan@its.ac.id
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
@Login
Feature: Login
  I will login on orange hrm

  @SuccessLogin
  Scenario Outline: login success
    Given I want to login page
    When Input username <username>
    And Input password <password>
    Then Click the login button
    And Verify Login Success
    Then CloseBrowser

    Examples: 
      | username | password |
      | Admin    | admin123 |
