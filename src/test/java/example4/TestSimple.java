package example4;

import example2.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSimple extends BaseTest {

    @Test
    public void simpleStart() {

        driver.get("http://capgemini.com");
        HomePage homePage = new HomePage(driver);
        String industryLabel = homePage.clickIndustries()
                .getIndustryLabel();
        assertEquals("Industries", industryLabel);

    }
}
