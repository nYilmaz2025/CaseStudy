Feature: Verify that all Pokémon starting their name with “Y” are present in the “List of names”
  @try
  Scenario: Verify that all Pokémon names start with “Y”
    Given The user is on the Main Page
    And Navigate to Bulbapedia tab and click By Name
    When User click to Y letter in the content List
    Then Verify all the names start with Y Letter