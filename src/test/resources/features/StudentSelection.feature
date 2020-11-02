Feature:Select a student

  Scenario: As an authorized user, I should be able to use the filter and select only Students
    Given I am on Library application login page.
    And I login using valid credentials.
    And I click on "Users" link.
    When I click on "User Group" drop down menu.
    Then I should be able to click on "Students" selection.
    #comment