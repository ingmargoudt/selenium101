package example3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndustryPage {

    private final WebDriver driver;
    private final By industryLabel = By.className("component__hero-subpage__title");

    public IndustryPage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public String getIndustryLabel() {
        return driver.findElement(industryLabel).getText();

    }
}
