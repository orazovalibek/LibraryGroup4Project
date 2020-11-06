@inactive
Feature: Inactive

  Scenario: AC#6 As an authorized user, I should be able to select anything on the management page.
    Given user is logged in as a librarian
    When user clicks on users module
    And when user select InActive from dropdown
    Then user should be able to see "INACTIVE" text in dropdown box



