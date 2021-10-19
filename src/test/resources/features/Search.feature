Feature: Search
  Background:
    Given the user is on the Amazon "Amazon.com. Gasta menos. Sonríe más." page

  Scenario Outline: Search item
    When the users clicks on search box
    And the user enters "<item>"
    When the user clicks on search button
    Then the lists of items is displayed
    When the user clicks on the <selected index> item
    Then the user launchs to the item page and "<Title>" page changes
      Examples:
        | item         | selected index | Title                                |
        | hats for men | 1              | Amazon.com. Gasta menos. Sonríe más. |
#        | laptops      | 1              | Amazon.com. Gasta menos. Sonríe más. |
