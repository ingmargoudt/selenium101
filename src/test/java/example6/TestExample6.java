package example6;

import example2.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExample6 extends BaseTest {

    @Test
    public void TestExample6() {

        driver.get("http://capgemini.com");
        HomePage homePage = new HomePage(driver);
        homePage.clickIndustries();
        IndustryPage industryPage = new IndustryPage(driver);
        String industryLabel = industryPage.getIndustryLabel();
        assertEquals("Industries", industryLabel);

    }
}
