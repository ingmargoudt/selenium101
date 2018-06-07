package example6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndustryPage {

    @FindBy(className = "component__hero-subpage__title")
    private WebElement industryLabel;

    public IndustryPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public String getIndustryLabel() {
        return industryLabel.getText();

    }
}
