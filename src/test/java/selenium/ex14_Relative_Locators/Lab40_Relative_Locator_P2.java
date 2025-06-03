package selenium.ex14_Relative_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab40_Relative_Locator_P2 extends CommonToAll {

    @Test
    public void test_rl() {

        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement span_element = driver.findElement(By.xpath("//span[text()='Years of Experience']"));
//        driver.findElement((with(By.id("exp-1")).toRightOf(span_element))).click();

        driver.findElement((with(By.id("exp-5")))).click();

    }
}
