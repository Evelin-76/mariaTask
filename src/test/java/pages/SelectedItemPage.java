package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

public class SelectedItemPage extends BasePage{

    @FindBy (css = ".a-dropdown-label")
    private WebElement optionQuantityDropDownBtn;

    public WebElement getOptionQuantityDropDownBtn() {
        return optionQuantityDropDownBtn;
    }

    //Dynamic method for getSelectQuantity
    public WebElement getSelectQuantity(int quantity){
        WebElement element = Driver.get().findElement(By.xpath("(//li[@role='option'])[" + quantity + "]"));
        return element;
    }


    @FindBy (name = "dropdown_selected_size_name")
    private WebElement selectOption;

    public WebElement getSelectOption() {
        return selectOption;
    }

    @FindBy (id = "add-to-cart-button")
    private WebElement addToCartBtn;

    public WebElement getAddToCartBtn() {
        return addToCartBtn;
    }



    @FindBy (id = "add-to-cart-button")
    private WebElement cartBtn;

    public WebElement getCartBtn() {
        return cartBtn;
    }
}
