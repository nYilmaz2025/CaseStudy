Feature: Search function result and filtering options

  Scenario: Use the Advance options in search result
    Given The user is on the Main Page
    When Search 'communities and events' keywords in searchbox
    And Click the advance tab
    And Click options checkbox
    Then Verify to see the all related results

