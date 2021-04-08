package pages;

import org.openqa.selenium.WebElement;

public class CartPage extends  BasePage {

    private String productDescriptionLabel = "//a[@id='tab-label-product_attribute.tab-title']";
    private String triplePillowPrice = "/html/body/div[2]/main/div[3]/div/div[2]/form/div[1]/table/tbody/tr[1]/td[4]/span/span/span";
    private String emptyCartButton = "//button[@id='empty_cart_button']";
    private String emptyCartMessage = "//p[contains(text(),'Nemate proizvode u vašoj korpi za kupovinu.')]";
    private String totalCartPrice = "//*[@id=\"cart-totals\"]/div/table/tbody/tr[1]/td/span";
    private String removeFirsItemFromCartButton = "//*[@id=\"shopping-cart-table\"]/tbody[2]/tr[2]/td/div/a[2]";
    private String removeSecondItemFromCart = "//*[@id=\"shopping-cart-table\"]/tbody[2]/tr[2]/td/div/a[2]";


    public WebElement getProductDescriptionLabel(){
        return findElement(productDescriptionLabel);

    }

    public WebElement getTriplePillowPrice(){
        return findElement(triplePillowPrice);
    }

    public WebElement getEmptyCartButton() {
        return findElement(emptyCartButton);
    }

    public WebElement getEmptyCartMessage() {
        return findElement(emptyCartMessage);
    }

    public WebElement getTotalCartPrice() {
        return findElement(totalCartPrice);
    }

    public WebElement getRemoveFirstItemFromCartButton(){
        return findElement(removeFirsItemFromCartButton);
    }

    public WebElement getRemoveSecondItemFromCartButton(){
        return findElement(removeSecondItemFromCart);
    }

}
