package test;

import org.junit.Assert;
import org.junit.Test;

public class RemoveFromCartTest extends IntermediateTest {

    @Test
    public void removeFromCartTest(){
        emmezeta.getHomePage().getSearchField().sendKeys("jastuk doll");
        emmezeta.getHomePage().click(emmezeta.getHomePage().getSearchButton());
        emmezeta.getDollPillowPage().click(emmezeta.getDollPillowPage().getAddToCartButton());
        emmezeta.getHomePage().getSearchField().sendKeys("jastuk rabbit");
        emmezeta.getHomePage().click(emmezeta.getHomePage().getSearchButton());
        emmezeta.getRabbitPillowPage().click(emmezeta.getRabbitPillowPage().getAddToCartButton());
        emmezeta.getHomePage().click(emmezeta.getHomePage().getCartButton());
        emmezeta.getCartPage().click(emmezeta.getCartPage().getRemoveSecondItemFromCartButton());
        Assert.assertEquals("1.199,00 din.", emmezeta.getCartPage().getTotalCartPrice().getText());
    }
}
