package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

public class ShoppingCartPage extends BasePage {

    @FindBy (id = "hlb-view-cart-announce")
    private WebElement cartBtn;
    public WebElement getCartBtn() {
        return cartBtn;
    }



//    @FindBy ()
//    private WebElement cartBtn;
//
//    public WebElement getCartBtn() {
//        return cartBtn;
//    }

    @FindBy (css = ".a-button-text.a-declarative")
    private WebElement quantityBtn;

    public WebElement getQuantityBtn() {
        return quantityBtn;
    }

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


    // @FindBy (xpath = "(//*[@class ='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[1]")
   @FindBy (xpath = "//*[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")
    private WebElement singlePrice;

    public WebElement getSinglePrice() {
        return singlePrice;
    }
    //parse String to Double for arithmetic operations
    public double getSinglePriceDouble() {
        String numberPrice = singlePrice.getText().replace("US$", "");
       // int numPrice = Integer.valueOf(numberPrice);
        double i = Double.parseDouble(numberPrice);
        return i;
    }

    @FindBy (xpath = "(//*[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[2]")
    private WebElement totalPrice;

    public WebElement getTotalPrice() {
        return totalPrice;
    }

    //parse String to Double for arithmetic operations
    public double getTotalPriceDouble() {
        String numberPrice = totalPrice.getText().replace("US$", "");
       //  int numPrice = Integer.valueOf(numberPrice);
        double i = Double.parseDouble(numberPrice);
        return i;
    }


}
