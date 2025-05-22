package selenium.ex08_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSelenium29_ActionsClass {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        String url = "https://www.spicejet.com/";
        driver.get(url);
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));

        Actions actions = new Actions(driver);
        // Move to element
        //click
        //SendKeys

        actions.moveToElement(source).click().sendKeys("BLR").build().perform();

    }
}
