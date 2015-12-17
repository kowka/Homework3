package part_5;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;

public class PhantomJsTests {
    @Test
    public void testPhantomJs() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        caps.setCapability("takeScreenshot", true);
        caps.setCapability(
                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/Users/alenak/projects/homework3/node_modules/phantomjs/lib/phantom/bin/phantomjs"
        );

        WebDriver driver = new PhantomJSDriver(caps);

        driver.get("http://wix.com");
        System.out.println(driver.getTitle());

    }
}
