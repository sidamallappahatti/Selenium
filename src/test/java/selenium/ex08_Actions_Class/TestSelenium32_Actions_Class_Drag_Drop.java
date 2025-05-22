package selenium.ex08_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

public class TestSelenium32_Actions_Class_Drag_Drop extends CommonToAll {

    @Test
    public void test_actions_drag_drop() {

        String url = "https://demoqa.com/droppable/";
        driver.get(url);

        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(from, to).build().perform();
    }
}
