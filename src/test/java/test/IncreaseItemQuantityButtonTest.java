package test;

import org.junit.Assert;
import org.junit.Test;

public class IncreaseItemQuantityButtonTest extends IntermediateTest {

    @Test
    public void increaseItemQuantityButtonTest(){
        emmezeta.getHomePage().getSearchField().sendKeys("jastuk doll");
        emmezeta.getHomePage().click(emmezeta.getHomePage().getSearchButton());
        emmezeta.getDollPillowPage().getIncreaseQuantityButton().click();
        emmezeta.getDollPillowPage().getIncreaseQuantityButton().click();
        emmezeta.getDollPillowPage().click(emmezeta.getDollPillowPage().getAddToCartButton());
        emmezeta.getHomePage().getCartButton().click();
        Assert.assertEquals("3.597,00 din.", emmezeta.getCartPage().getTriplePillowPrice().getText());
    }
}
