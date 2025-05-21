package selenium.ex05_Selenium_CSSSelector;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium21_MiniProject_4 {

    @Owner("Siddu")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that with valid email, pass, appointment page is loaded")
    @Test
    public void test_katalon_login() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("siddu@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("password");
        WebElement login_btn_css = driver.findElement(By.cssSelector("button[type='submit']"));
        login_btn_css.click();

        Thread.sleep(3000);

        String error_msg = driver.findElement(By.cssSelector("p.oxd-text.oxd-text--p.oxd-alert-content-text")).getText();
        System.out.println(error_msg);
        Assert.assertEquals(error_msg, "Invalid credentials");

        driver.quit();

    }
}
