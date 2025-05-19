package selenium.ex01_Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class TestSelenium01 {
    @Test

    public void test_openVWOLoginPage() {

        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.manage().window().maximize();
        edgeDriver.get("https://app.vwo.com/");
        System.out.println(edgeDriver.getTitle());


    }
}
