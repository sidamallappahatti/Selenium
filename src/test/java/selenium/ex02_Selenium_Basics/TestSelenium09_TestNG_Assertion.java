package selenium.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium09_TestNG_Assertion {
    @Description("Open the URL")
    @Test
    public void test_Selenium(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

        //assertj validation
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

        driver.quit();



    }
}
