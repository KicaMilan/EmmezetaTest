package pages;

import org.openqa.selenium.WebElement;

public class WoodenFurniturePage extends BasePage {

    private String servingTrolleyCheckBox = "//*[@id=\"vrstaFilter_option_6\"]";
    private String toledoServingTrolley = "//a[contains(text(),'Toledo kolica za posluživanje 56x97x82 cm natur')]";

    public WebElement getServingTrolleyCheckBox(){
        return findElement(servingTrolleyCheckBox);
    }

    public WebElement getToledoServingTrolley(){
        return findElement(toledoServingTrolley);
    }



}
