package example7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(linkText = "Industries")
    private WebElement industries;

    public HomePage(WebDriver webDriver){
        super(webDriver);
    }


    public void clickIndustries() {
        industries.click();
    }
}
