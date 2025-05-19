package selenium.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium07_Selenium_Commands {

    @Test
    public static void test_Method() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");


        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());


        driver.quit();

    }
}
