Feature: Selection of Items
  Background:
    Given the user is on the Amazon "Amazon.com. Gasta menos. Sonríe más." page
    When the users clicks on search box

  Scenario Outline: Add items to the cart
    And the user enters "<item>"
    When the user clicks on search button
    When the user clicks on the <selected index> item
    And the user launchs to the item page and "<Title>" page changes
    When the user clicks quantity button
    Then the selected <quantity> is displayed
    Then the "<quantityString>" displayed is same that <quantity> selected
    When the user clicks on Add To Cart button
    Then the user launches to the "Carrito de compras de amazon.com" page changes

    Examples:
      | item         | selected index | Title                                | quantity | quantityString |
      | hats for men | 1              | Amazon.com. Gasta menos. Sonríe más. | 2        | 2              |
#      | shoes        | 1              | Amazon.com. Gasta menos. Sonríe más. | 3        | 3              |
