package pages;

import org.openqa.selenium.WebElement;

public class RabbitPillowPage extends BasePage {

    private String addToCartButton = "//button[@id='product-addtocart-button']";
    private String productTitle = "//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[1]/h1/span";

    public WebElement getAddToCartButton(){
        return findElement(addToCartButton);
    }

    public WebElement getProductTitle(){
        return findElement(productTitle);
    }
}
