package selenium.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Description("Open the app.vwo.com and verify the title")
    @Test
    public void test_Selenium03() {

        // Selenium 3
        //You need to setup the Driver(browser)
        //System.setProperty("webDriver.gecko.driver","/path/geckodriver");


        // Selenium 4
        // Selenium Manager - utility - Which can download the driver automatically
        // start and stop itself.
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");
    }

}
