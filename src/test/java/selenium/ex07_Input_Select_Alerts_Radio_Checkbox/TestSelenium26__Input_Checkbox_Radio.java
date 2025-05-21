package selenium.ex07_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium26__Input_Checkbox_Radio {

    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        //Input Box
        driver.findElement(By.name("firstname")).sendKeys("Siddu");

        //RadioBox
        driver.findElement(By.id("sex-0")).click();

        //CheckBox
        driver.findElement(By.id("tool-2")).click();

    }
}
