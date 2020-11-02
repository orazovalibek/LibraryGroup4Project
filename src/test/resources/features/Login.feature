Feature: As a user I should be able to log in
@student
  Scenario: Log in to the library page
    Given user is on the login page
    When user logs in as a librarian
    Then user should be able to see dashboard page

