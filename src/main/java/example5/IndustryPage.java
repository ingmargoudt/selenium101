package example5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndustryPage {

    @FindBy(className = "component__hero-subpage__title")
    private WebElement industryLabel;


    public String getIndustryLabel() {
        return industryLabel.getText();

    }
}
