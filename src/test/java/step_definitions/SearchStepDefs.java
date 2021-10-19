package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SearchPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SearchStepDefs {
    SearchPage searchPage = new SearchPage();
    @Given("the user is on the Amazon {string} page")
    public void theUserIsOnTheAmazonPage(String expectedTitle) {
        Driver.get().get(ConfigurationReader.get("url"));
        String actualTitle = Driver.get().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("the users clicks on search box")
    public void theUsersClicksInSearchBox() {
        searchPage.getSearchBox().click();
    }

    @And("the user enters {string}")
    public void theUserEnters(String itemName) {
        searchPage.getSearchBox().sendKeys(itemName);
        BrowserUtils.waitFor(1);
    }

    @When("the user clicks on search button")
    public void theUserClicksOnSearchButton() {
        searchPage.getSearchBtn().click();
    }

    @Then("the lists of items is displayed")
    public void theListsOfItemsIsDisplayed() {
        Assert.assertTrue(searchPage.getAllElements().isDisplayed());
      //  Assert.assertTrue(searchPage.getItemFromTheList(selectedItem).isDisplayed());
    }

    @When("the user clicks on the {int} item")
    public void theUserClicksOnTheTheSelectedItem(int selectedItem) {
        searchPage.getItemFromTheList(selectedItem).click();
    }

    @Then("the user launchs to the item page and {string} page changes")
    public void pageIsLaunched(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertNotEquals(expectedTitle,actualTitle);
    }
}
