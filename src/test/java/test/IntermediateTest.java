package test;

import browser.Browser;
import org.junit.BeforeClass;

public class IntermediateTest extends  BaseTest {

    @BeforeClass
    public static void testSetUp() {
        Browser.getBrowser().get("https://emmezeta.rs");
        Browser.getBrowser().manage().window().maximize();
        emmezeta.getHomePage().getCookiesButton().click();
        }
}
