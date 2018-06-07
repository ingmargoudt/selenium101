package example3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    private By industries = By.linkText("Industries");

    public HomePage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void clickIndustries(){
        driver.findElement(industries).click();
    }
}
