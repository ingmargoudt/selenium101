package example5;

import example2.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSimple extends BaseTest {

    @Test
    public void simpleStart() {

        driver.get("http://capgemini.com");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickIndustries();
        IndustryPage industryPage = PageFactory.initElements(driver, IndustryPage.class);
        String industryLabel = industryPage.getIndustryLabel();
        assertEquals("Industries", industryLabel);

    }
}
