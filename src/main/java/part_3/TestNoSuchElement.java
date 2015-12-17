package part_3;


import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNoSuchElement {
    WebDriver webDriver;

    @Test(expected = org.openqa.selenium.NoSuchElementException.class)
    public void testNoSuchElement() {
        webDriver = new ChromeDriver();
        webDriver.get("http://ya.ru");
        webDriver.findElement(By.id("text1"));
    }

    @Test
    public void testNoSuchElementException() {
        webDriver = new ChromeDriver();
        webDriver.get("http://ya.ru");

        try {
            webDriver.findElement(By.id("text1"));
        } catch (NoSuchElementException ex) {
            Assert.assertTrue(true);
        }
    }

    @After
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
