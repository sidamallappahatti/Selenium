package selenium.ex08_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium28_ActionClass {

    @Test
    public void test_actions() {

        WebDriver driver = new EdgeDriver();
        String url = "https://awesomeqa.com/practice.html";
        driver.get(url);
        driver.manage().window().maximize();

        //Keys - Action classes
        WebElement firstName = driver.findElement(By.name("firstname"));

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(firstName, "siddu").keyUp(Keys.SHIFT).build().perform();

    }
}
