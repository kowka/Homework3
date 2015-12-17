package part_4;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TimoutTest {
    WebDriver webDriver;

    @Test
    public void testTimeout() {
        webDriver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(webDriver, 1);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        webDriver.get("http://www.wix.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("start-cta")));
    }

    @After
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
