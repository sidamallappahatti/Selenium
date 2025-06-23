package selenium.ex16_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

public class Lab41_Selenium_Exceptions extends CommonToAll {

    @Test
    public void test_selenium_exceptions() {
        driver.get("https://app.vwo.com/");
        System.out.println("Start the program");

        try {
            driver.findElement(By.id("Siddu"));
        } catch (NoSuchElementException e) {
            System.out.println("No elements found");
        }
    }
}
