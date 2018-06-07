package example1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExample1 {

    @Test
    public void TestExample1() {

        System.setProperty("webdriver.chrome.driver", this.getClass().getClassLoader().getResource("chromedriver.exe").getPath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://capgemini.com");
        WebElement searchbar = driver.findElement(By.linkText("Industries"));
        searchbar.click();
        String industryLabel = driver.findElement(By.className("component__hero-subpage__title")).getText();
        assertEquals( "Industries", industryLabel);
        driver.quit();

    }
}
