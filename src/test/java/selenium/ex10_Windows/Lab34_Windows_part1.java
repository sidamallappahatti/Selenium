package selenium.ex10_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

import java.util.Set;

public class Lab34_Windows_part1 extends CommonToAll {

    @Test
    public void test_windows() {

        String url = "https://the-internet.herokuapp.com/windows";
        driver.manage().window().maximize();
        driver.get(url);

        String parent_window = driver.getWindowHandle();
        System.out.println(parent_window);

        WebElement link = driver.findElement(By.xpath("//a[text()='Click Here']"));
        link.click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            if (driver.getPageSource().contains("New Window")) {
                System.out.println("Switched to new child window");
            }
            driver.switchTo().window(parent_window);
        }

    }
}
