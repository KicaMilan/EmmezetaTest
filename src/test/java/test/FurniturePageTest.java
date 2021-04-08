package test;

import org.junit.Assert;
import org.junit.Test;

public class FurniturePageTest extends IntermediateTest {

    @Test
    public void furniturePageTest(){
        emmezeta.getHomePage().getFurnitureButton().click();
        emmezeta.getFurniturePage().getGardenButton().click();
        emmezeta.getGardenFurniturePage().getWoodenFurniture().click();
        emmezeta.getWoodenFurniturePage().getServingTrolleyCheckBox().click();
        Assert.assertTrue(emmezeta.getWoodenFurniturePage().getToledoServingTrolley().isDisplayed());


    }

}
