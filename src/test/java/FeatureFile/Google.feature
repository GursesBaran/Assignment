Feature: Search Engine Test

  Scenario: Perform a search on a search engine
    Given I am on the Google homepage
    When I submit the search term "cucumber testing"
    Then I should see the first result as expected
