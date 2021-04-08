package test;

import org.junit.Assert;
import org.junit.Test;

public class FindProductTest extends IntermediateTest {

    @Test
    public void findProductTest() {
        emmezeta.getHomePage().getSearchField().sendKeys("jastuk doll");
        emmezeta.getHomePage().click(emmezeta.getHomePage().getSearchButton());
        Assert.assertEquals("Jastuk Doll 36x36cm je jedini proizvod koji odgovara vašoj 'jastuk doll' pretrazi.",
                emmezeta.getDollPillowPage().getProductMessage().getText());

    }
}
