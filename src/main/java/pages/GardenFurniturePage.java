package pages;

import org.openqa.selenium.WebElement;

public class GardenFurniturePage extends BasePage {
    private String woodenFurniture = "//*[@id=\"maincontent\"]/div/div[1]/div[1]/a[1]/div";
    private String metalFurniture = "//*[@id=\"maincontent\"]/div/div[1]/div[1]/a[2]/div";


    public WebElement getWoodenFurniture(){
        return findElement(woodenFurniture);
    }

    public WebElement getMetalFurniture(){
        return findElement(metalFurniture);
    }

}
