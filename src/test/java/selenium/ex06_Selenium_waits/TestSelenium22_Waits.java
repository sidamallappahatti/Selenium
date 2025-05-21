package selenium.ex06_Selenium_waits;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSelenium22_Waits {

    @Description("Implicit wait")
    @Test
    public void test_implicit_wait() {

        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://app.vwo.com");

        driver.quit();
    }
}


