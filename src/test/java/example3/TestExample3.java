package example3;

import example2.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExample3 extends BaseTest {

    @Test
    public void TestExample3() {

        driver.get("http://capgemini.com");
        HomePage homePage = new HomePage(driver);
        homePage.clickIndustries();
        IndustryPage industryPage = new IndustryPage(driver);
        String industryLabel = industryPage.getIndustryLabel();
        assertEquals( "Industries", industryLabel);

    }
}
