package io.automatenow;

import org.testng.annotations.*;

/**
 * @author Marco A. Cruz
 */
public class TestBrowserNav {

    @AfterMethod
    void teardowm() {
        Driver.quit();
    }

    @Test
    void test1() {
        Driver.getInstance().get("https://www.automatenow.io");
    }

    @Test
    void test2() {
        Driver.getInstance().get("https://www.selenium.dev");
    }

    @Test
    void test3() {
        Driver.getInstance().get("https://www.oracle.com");
    }
}
