package example2;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSimple extends BaseTest {

    @Test
    public void simpleStart() {

        driver.get("http://capgemini.com");
        WebElement searchbar = driver.findElement(By.linkText("Industries"));
        searchbar.click();
        String industryLabel = driver.findElement(By.className("component__hero-subpage__title")).getText();
        assertEquals( "Industries", industryLabel);

    }
}
