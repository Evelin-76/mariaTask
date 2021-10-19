Feature: Shopping Cart

  Background:
    Given the user is on the Amazon "Amazon.com. Gasta menos. Sonríe más." page
    When the users clicks on search box

  Scenario Outline: Add items to the cart
    And the user enters "<item>"
    When the user clicks on search button
    When the user clicks on the <selected index> item
    And the user launchs to the item page and "<Title>" page changes
    When the user clicks quantity button
#    Then the selected <quantity> is displayed
#    Then the "<quantityString>" displayed is same that <quantity> selected
    When the user clicks on Add To Cart button
    Then the user launches to the "Carrito de compras de amazon.com" page changes
    When the user clicks on Cart button
    And the price is multiply for the <quantity> selected
    Then the price is correct after multiplicate by <quantity>
    When the user clicks quantity button in Cart module
    And the users <reduce the quantity> product
    And the price is multiply for the <new quantity> selected
    Then the total price is correct after multiplicate for <new quantity>
    Examples:
      | item         | selected index | Title                                | quantity | quantityString |price | quantity | reduce the quantity | new quantity | new price|
      | hats for men | 1              | Amazon.com. Gasta menos. Sonríe más. | 2        | 2              | US$34.96 | 2        | 1                   | 1            | 17.48|
#      | shoes        | 1              | Amazon.com. Gasta menos. Sonríe más. | 3        | 3              |




    Scenario Outline: Deleting Items
      When the user clicks on Cart button
      And the price is multiply for the <quantity> selected
#    Then the total price is <price>
#    When the users <reduce the quantity> product
#    And the price is multiply for the <new quantity> selected
#    Then the total price is <new price>
      Examples:
        | price | quantity | reduce the quantity | new quantity | new price |
        | 17.48 | 2        | 1                   | 1            | 17.48     |
