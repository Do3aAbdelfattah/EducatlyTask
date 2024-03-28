Feature: Search Bar Interactions

  Scenario: verify the placeholder text displayed within each search bar
    Given user is in home page
    And placeholder for first search bar is "What to study"
    Then placeholder for second search bar is "Where to study"

  Scenario: verify selection from auto-suggestions list
    Given user clicks on first search bar
    When user select "Arts"
    And clicks on second search bar
    And select "Europe"
    And user clicks on search button
    Then the search result page is opened