package pages;

import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private String cookiesButton = "//button[@id='btn-cookie-allow']";
    private String searchField = "//input[@id='search']";
    private String searchButton = "//*[@id=\"search_mini_form\"]/div[1]/div[2]/button";
    private String furnitureButton = "//*[@id=\"store.menu\"]/nav/ul/li[1]";
    private String multimediaButton = "//*[@id=\"store.menu\"]/nav/ul/li[2]";
    private String appliancesButton = "//*[@id=\"store.menu\"]/nav/ul/li[3]";
    private String housingButton = "//*[@id=\"store.menu\"]/nav/ul/li[4]";
    private String dishesButton = "//*[@id=\"store.menu\"]/nav/ul/li[5]";
    private String giftsButton = "//*[@id=\"store.menu\"]/nav/ul/li[6]";
    private String gardenButton = "//*[@id=\"store.menu\"]/nav/ul/li[7]";
    private String newYearButton = "//*[@id=\"store.menu\"]/nav/ul/li[8]";
    private String promotionsButton = "//*[@id=\"store.menu\"]/nav/ul/li[9]";
    private String cartButton = "//header/div[2]/div[1]/a[1]";
    private String myShopButton = "/html/body/div[2]/header/div[2]/ul/a/div";
    private String myAccountButton = "//span[contains(text(),'Moj nalog')]";

    public WebElement getCookiesButton() {
        return findElement(cookiesButton);
    }

    public WebElement getSearchField(){
        return findElement(searchField);
    }

    public WebElement getSearchButton(){
        return findElement(searchButton);
    }

    public WebElement getFurnitureButton() {
        return findElement(furnitureButton);
    }

    public WebElement getMultimediaButton() {
        return findElement(multimediaButton);
    }

    public WebElement getAppliancesButton() {
        return findElement(appliancesButton);
    }

    public WebElement getHousingButton() {
        return findElement(housingButton);
    }

    public WebElement getDishesButton() {
        return findElement(dishesButton);
    }

    public WebElement getGiftsButton() {
        return findElement(giftsButton);
    }

    public WebElement getGardenButton() {
        return findElement(gardenButton);
    }

    public WebElement getNewYearButton() {
        return findElement(newYearButton);
    }

    public WebElement getPromotionsButton() {
        return findElement(promotionsButton);
    }

    public WebElement getCartButton(){
        return findElement(cartButton);
    }

    public WebElement getMyShopButton(){
        return findElement(myShopButton);
    }

    public WebElement getMyAccountButton(){
        return findElement(myAccountButton);
    }

}