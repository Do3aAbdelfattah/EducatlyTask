Feature: Search Functionality
  @run
  Scenario: verify basic keyword searches within both search bars
    Given user is in home page
    When user enters "arts" in the first search bar
    And user enters "europe" in the second search bar
    And user clicks on search button
    Then the search result page is opened

  Scenario: try entering empty search terms in both search bars
    Given user is in home page
    When user clicks on search button
    Then result page for all programs opens

  Scenario: try entering special characters in both search bars
    Given user is in home page
    When user selects "@#$" from the first search bar
    And user select "@#$" from the second search bar
    When user clicks on search button
    Then result page for all programs opens

  Scenario: try entering numbers in both search bars
    Given user is in home page
    When user selects "452" from the first search bar
    And user select "755" from the second search bar
    When user clicks on search button
    Then result page for all programs opens