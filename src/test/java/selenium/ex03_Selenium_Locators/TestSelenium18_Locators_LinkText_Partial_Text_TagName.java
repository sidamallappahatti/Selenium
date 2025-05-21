package selenium.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium18_Locators_LinkText_Partial_Text_TagName {
    @Description("Verify vwo")
    @Test
    public void test_login_vwo() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--inprivate");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/#/login");

        // Link Text - Full Text Match
//        WebElement a_tag_free_trail_full_match=driver.findElement(By.linkText("Start a free tria"));
//        a_tag_free_trail_full_match.click();

        // If the element locator is invalid - no such element: Unable to locate element: {"method":"link text","selector":"Start a free tria"}

        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
        // Start a free trial
        // Start a free
        // Start a
        // Start , Trail, free, a, Star...
        a_tag_partial_match.click();

        driver.quit();

    }
}
