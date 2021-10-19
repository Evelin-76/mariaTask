package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.SearchPage;
import pages.SelectedItemPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class SelectedStepDefs {
    SelectedItemPage selectedItemPage = new SelectedItemPage();
    Select select = new Select(selectedItemPage.getSelectOption());

    @When("the user clicks quantity button")
    public void theUserClicksQuantityButton() {
        System.out.println(selectedItemPage.getSelectOption().isEnabled());
        if (selectedItemPage.getSelectOption().isEnabled()) {
            select.selectByIndex(1);
            selectedItemPage.getOptionQuantityDropDownBtn().click();
            BrowserUtils.waitFor(1);
            WebElement selectQuantity = selectedItemPage.getSelectQuantity(2);
            selectQuantity.click();
            BrowserUtils.waitFor(2);
        } else {
          //  select.getFirstSelectedOption().click();
            BrowserUtils.waitFor(1);
            selectedItemPage.getOptionQuantityDropDownBtn().click();
        }
    }

    @Then("the selected {int} is displayed")
    public void theSelectedIsDisplayed(int expectedOption) {
        Assert.assertTrue(selectedItemPage.getSelectQuantity(expectedOption).isDisplayed());

    }

    @Then("the {string} displayed is same that {int} selected")
    public void theQuantityDisplayedIsSameThatQuantitySelected(String expectedQuantity, int quantity) {
        String actualQuantity = selectedItemPage.getSelectQuantity(quantity).getText();
        System.out.println("actual quantity " + actualQuantity);

        Assert.assertEquals(expectedQuantity, actualQuantity);
    }

    @When("the user clicks on Add To Cart button")
    public void theUserClicksOnAddToCartButton() {
        selectedItemPage.getAddToCartBtn().click();
    }

    @Then("the user launches to the {string} page changes")
    public void theUsersLaunchToThePageChanges(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}