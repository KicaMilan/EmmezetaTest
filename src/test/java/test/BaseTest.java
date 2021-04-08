package test;

import browser.Browser;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import pages.Emmezta;

public class BaseTest {

    protected static Emmezta emmezeta;

    @BeforeClass
    public static void setUp() {
        emmezeta = new Emmezta();
    }

    @AfterClass
    public static void cleanUp() {
        Browser.getBrowser().quit();
    }
}
