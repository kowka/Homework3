package part_2;


import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    private static WebDriver webDriver;

    @BeforeClass
    public static void setUp() {
        webDriver = new ChromeDriver();
        webDriver.get("http://ya.ru");
    }

    @AfterClass
    public static void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    @Test
    public void testHeader() {
        Assert.assertEquals("Яндекс", webDriver.getTitle());
    }

    @Test
    public void testUrl() {
        Assert.assertEquals("https://ya.ru/", webDriver.getCurrentUrl());
    }

    @Test
    public void testSearchFieldPresent() {
        Assert.assertTrue(webDriver.findElement(By.id("text")).isDisplayed());
    }
}
