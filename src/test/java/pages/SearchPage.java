package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.List;

public class SearchPage extends BasePage {

    @FindBy (id = "twotabsearchtextbox")
    private WebElement searchBox;

    public WebElement getSearchBox() {
        return searchBox;
    }




    @FindBy (id = "nav-search-submit-button")
    private  WebElement searchBtn;

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    @FindBy (css = ".s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16")
    private WebElement allElements;

    public WebElement getAllElements() {
        return allElements;
    }

    @FindBy (css = ".sg-col-inner")
    private List<WebElement> listOfItems;

    public List<WebElement> getListOfItems() {
        return listOfItems;
    }

    //dynamic method to getItemFromTheList
    public WebElement getItemFromTheList(int index){
        WebElement element = Driver.get().findElement(By.xpath("(//a[@class='a-link-normal a-text-normal'])["+index+"]"));
        return element;
    }

}
