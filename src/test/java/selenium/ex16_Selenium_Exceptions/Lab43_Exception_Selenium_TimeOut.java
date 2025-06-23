package selenium.ex16_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

import java.time.Duration;

public class Lab43_Exception_Selenium_TimeOut extends CommonToAll {

    @Test
    public void test_selenium_exceptions(){
        System.out.println("Start of program");
        driver.get("https://google.com");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"//textarea[@id='abc']")));

        WebElement search_input_box = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search_input_box.sendKeys("Selenium");
    }
}
