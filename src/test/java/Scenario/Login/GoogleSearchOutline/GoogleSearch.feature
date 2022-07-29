Feature: Google search


@CommonTest
  Scenario: Google front page search
    Given User is on landing page
    And User input searching terms
    |sesearchingTerms|
    |komary          |
    And User click search button
    And User check the number of pages
    When User click on first link on page
    And User check title of page
    Then User quit page

