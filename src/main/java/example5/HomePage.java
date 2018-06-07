package example5;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(linkText = "Industries")
    private WebElement industries;


    public void clickIndustries() {
        industries.click();
    }
}
