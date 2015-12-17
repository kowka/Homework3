package part_1;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageSourceTests {
    @Test
    public void testPageSourceComparison() {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://google.com");
        String chromePageSource = chromeDriver.getPageSource();
        chromeDriver.quit();

        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("http://google.com");
        String firefoxPageSource = firefoxDriver.getPageSource();
        firefoxDriver.quit();

        Assert.assertEquals(chromePageSource, firefoxPageSource);
    }
}
