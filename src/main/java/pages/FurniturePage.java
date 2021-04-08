package pages;

import org.openqa.selenium.WebElement;

public class FurniturePage extends BasePage {

    private String livingRoomButton = "//body/div[2]/main[1]/div[1]/div[1]/div[1]/a[1]/div[1]";
    private String mattressesAndFlooringButton = "//body/div[2]/main[1]/div[1]/div[1]/div[1]/a[2]/div[1]";
    private String bedroomButton = "//body/div[2]/main[1]/div[1]/div[1]/div[1]/a[3]/div[1]";
    private String childrenRoomButton = "//body/div[2]/main[1]/div[1]/div[1]/div[1]/a[4]/div[1]";
    private String diningRoomButton = "//body/div[2]/main[1]/div[1]/div[1]/div[1]/a[5]/div[1]";
    private String kitchenButton = "//body/div[2]/main[1]/div[1]/div[1]/div[1]/a[6]/div[1]";
    private String bathroomButton = "//body/div[2]/main[1]/div[1]/div[1]/div[1]/a[7]/div[1]";
    private String anteroomButton = "//body/div[2]/main[1]/div[1]/div[1]/div[1]/a[8]/div[1]";
    private String officeButton = "//body/div[2]/main[1]/div[1]/div[1]/div[1]/a[9]/div[1]";
    private String gardenButton = "//body/div[2]/main[1]/div[1]/div[1]/div[1]/a[10]/div[1]";
    private String furniturePromotionsButton = "//body/div[2]/main[1]/div[1]/div[1]/div[1]/a[11]/div[1]";
    private String furnitureNewProductsButton = "//body/div[2]/main[1]/div[1]/div[1]/div[1]/a[12]/div[1]";

    public WebElement getLivingRoomButton() {
       return findElement(livingRoomButton);
    }

    public WebElement getMattressesAndFlooringButton() {
        return findElement(mattressesAndFlooringButton);
    }

    public WebElement getBedroomButton() {
        return findElement(bedroomButton);
    }

    public WebElement getChildrenRoomButton() {
        return findElement(childrenRoomButton);
    }

    public WebElement getDiningRoomButton() {
        return findElement(diningRoomButton);
    }

    public WebElement getKitchenButton() {
        return findElement(kitchenButton);
    }

    public WebElement getBathroomButton() {
        return findElement(bathroomButton);
    }

    public WebElement getAnteroomButton() {
        return findElement(anteroomButton);
    }

    public WebElement getOfficeButton() {
        return findElement(officeButton);
    }

    public WebElement getGardenButton() {
        return findElement(gardenButton);
    }

    public WebElement getFurniturePromotionsButton() {
        return findElement(furniturePromotionsButton);
    }

    public WebElement getFurnitureNewProductsButton() {
        return findElement(furnitureNewProductsButton);
    }
}
