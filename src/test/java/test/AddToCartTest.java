package test;

import org.junit.Assert;
import org.junit.Test;

public class AddToCartTest extends IntermediateTest {

    @Test
    public void addToCartTest() {
        emmezeta.getHomePage().getSearchField().sendKeys("jastuk doll");
        emmezeta.getHomePage().click(emmezeta.getHomePage().getSearchButton());
        emmezeta.getDollPillowPage().click(emmezeta.getDollPillowPage().getAddToCartButton());
        emmezeta.getHomePage().getCartButton().click();
        Assert.assertTrue(emmezeta.getDollPillowPage().getPillowDescriptionLabel().isDisplayed());

    }
}
