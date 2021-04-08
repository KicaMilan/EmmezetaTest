package test;

import org.junit.Assert;
import org.junit.Test;

public class EmptyCartTest extends IntermediateTest {

    @Test
    public void EmptyCartTest() {

        emmezeta.getHomePage().getSearchField().sendKeys("jastuk doll");
        emmezeta.getHomePage().click(emmezeta.getHomePage().getSearchButton());
        emmezeta.getDollPillowPage().click(emmezeta.getDollPillowPage().getAddToCartButton());
        emmezeta.getHomePage().getCartButton().click();
        emmezeta.getCartPage().click(emmezeta.getCartPage().getEmptyCartButton());
        Assert.assertEquals("Nemate proizvode u vašoj korpi za kupovinu.", emmezeta.getCartPage().getEmptyCartMessage().getText());


    }
}
