package pages;

import org.openqa.selenium.WebElement;

public class DollPillowPage extends BasePage{

    private String productMessage = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div";
    private String addToCartButton = "//button[@id='product-addtocart-button']";
    private String increaseQuantityButton = "//*[@id=\"product_addtocart_form\"]/div/div/div[1]/div/span[2]";
    private String decreaseQuantityButton = "//*[@id=\"product_addtocart_form\"]/div/div/div[1]/div/span[1]";
    private String quantityField = "//input[@id='qty']";
    private String productDescriptionLabel = "//a[@id='tab-label-product_attribute.tab-title']";
    private String deliveryPriceLabel = "//a[@id='tab-label-shipping_cost_info-title']";
    private String declarationLabel = "//a[@id='tab-label-product_declaration-title']";
    private String userManualLabel = "//a[@id='tab-label-amfile_attachment-title']";
    private String productTitle = "//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[1]/h1/span";
    private String addToCartMessage = "//body/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]";
    private String pillowDescriptionLabel = "//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[1]/div";

    public WebElement getProductMessage(){
        return findElement(productMessage);
    }

    public WebElement getAddToCartButton() {
        return findElement(addToCartButton);
    }

    public WebElement getIncreaseQuantityButton() {
        return findElement(increaseQuantityButton);
    }

    public WebElement getDecreaseQuantityButton() {
        return findElement(decreaseQuantityButton);
    }

    public WebElement getProductDescriptionLabel() {
        return findElement(productDescriptionLabel);
    }

    public WebElement getDeliveryPriceLabel() {
        return findElement(deliveryPriceLabel);
    }

    public WebElement getDeclarationLabel() {
        return findElement(declarationLabel);
    }

    public WebElement getUserManualLabel() {
        return findElement(userManualLabel);
    }

    public WebElement getProductTitle(){
        return findElement(productTitle);
    }

    public WebElement getAddToCartMessage() {
        return findElement(addToCartMessage);
    }

    public WebElement getPillowDescriptionLabel(){
        return findElement(pillowDescriptionLabel);
    }

    public WebElement getQuantityField(){
        return findElement(quantityField);
    }
}
