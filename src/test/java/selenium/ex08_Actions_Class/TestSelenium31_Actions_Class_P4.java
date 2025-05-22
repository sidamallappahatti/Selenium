package selenium.ex08_Actions_Class;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

public class TestSelenium31_Actions_Class_P4 extends CommonToAll {

    @Test
    public void test_page_up_page_down() {

        String url = "https://www.rolls-roycemotorcars.com/en_GB/home.html";
        driver.get(url);
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_UP).build().perform();

    }
}
