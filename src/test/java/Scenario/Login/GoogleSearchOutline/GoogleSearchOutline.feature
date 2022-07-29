Feature: Google search outline

  @outline
  Scenario Outline: Google front page search
    Given User is on landing page
    And User set <searchingTerms>
    And User click search button
    And User check the number of pages
    When User click on first link on page
    And User check title of page
    Then User quit page
    Examples:
    |searchingTerms|
    |komary        |
    |robaki        |