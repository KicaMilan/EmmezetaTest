package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;

public class IncreaseItemQuantityTest extends IntermediateTest {

    @Test
    public void increaseItemQuantityTest() {

        emmezeta.getHomePage().getSearchField().sendKeys("jastuk doll");
        emmezeta.getHomePage().click(emmezeta.getHomePage().getSearchButton());
        emmezeta.getDollPillowPage().getQuantityField().click();
        emmezeta.getDollPillowPage().getQuantityField().sendKeys(Keys.LEFT_CONTROL +"a");
        emmezeta.getDollPillowPage().getQuantityField().sendKeys(Keys.DELETE);
        emmezeta.getDollPillowPage().getQuantityField().sendKeys("3");
        emmezeta.getDollPillowPage().click(emmezeta.getDollPillowPage().getAddToCartButton());
        emmezeta.getHomePage().getCartButton().click();
        Assert.assertEquals("3.597,00 din.", emmezeta.getCartPage().getTriplePillowPrice().getText());
        
    }


}
