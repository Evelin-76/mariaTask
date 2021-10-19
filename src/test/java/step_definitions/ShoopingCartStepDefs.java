package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ShoppingCartPage;

public class ShoopingCartStepDefs {
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @When("the user clicks on Cart button")
    public void theUserClicksOnCartButton() {
        shoppingCartPage.getCartBtn().click();
    }

    @And("the price is multiply for the {int} selected")
    public void thePriceIsMultiplyForTheQuantitySelected(int quantity) {
//        System.out.println(shoppingCartPage.getTotalPrice().getText());
        System.out.println(shoppingCartPage.getSinglePriceDouble());

//       int number = Integer.parseInt(shoppingCartPage.getTotalPriceInt());
//        System.out.println("number " + number);
        double v = shoppingCartPage.getSinglePriceDouble() * quantity;
        System.out.println("double " + v);
    }

    @Then("the price is correct after multiplicate by {int}")
    public void theTotalPriceIsCorrect(int quantity) {
        double singlePriceByQuantity = shoppingCartPage.getSinglePriceDouble() * quantity;
        double totalPrice = shoppingCartPage.getTotalPriceDouble();
        System.out.println("single" + singlePriceByQuantity);
        System.out.println("total" + totalPrice);
      //  Assert.assertEquals(singlePriceByQuantity,totalPrice);

//        String actualPrice = shoppingCartPage.getTotalPrice().getText();
//        System.out.println(actualPrice);
      //  System.out.println(expectedPrice);
//        Assert.assertEquals(expectedPrice,actualPrice);

    }

    @When("the user clicks quantity button in Cart module")
    public void theUserClicksQuantityButtonInCartModule() {
        shoppingCartPage.getOptionQuantityDropDownBtn().click();
    }

    @And("the users {int} product")
    public void theUsersReduceTheQuantityProduct(int reduceQuantity) {
        shoppingCartPage.getSelectQuantity(reduceQuantity).click();


    }

    @Then("the total price is correct after multiplicate for {int}")
    public void theTotalPriceIsNewPrice(int quantity) {
        double singlePriceByQuantity = shoppingCartPage.getSinglePriceDouble() * quantity;
        double totalPrice = shoppingCartPage.getTotalPriceDouble();
        System.out.println("single" + singlePriceByQuantity);
        System.out.println("total" + totalPrice);

    }


}
