package example6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(linkText = "Industries")
    private WebElement industries;

    public HomePage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }


    public void clickIndustries() {
        industries.click();
    }
}
