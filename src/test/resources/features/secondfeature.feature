@Login
  Feature: Login feature for orangeCRM
    Scenario: Login with valid credentials
      Given I am on the login page
      When I enter username and password
      And I click on the login button
      Then I should see the dashboard page
