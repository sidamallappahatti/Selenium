package selenium.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

public class TestSelenium17_Locators_Selenium_ID_NAME_CLASSNAME {

    @Description("TC#1 - Verify that with invalid login,error message is displayed")
    @Owner("Siddu")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_vwo_login_invalid_credentials() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/#/login");

        //Step 1 - Find Email address and enter asd123@gmail.com
        //Step 2 - Find Password field and enter 1234
        //Step 3 - Submit button and Click on button
        //Step 4 - Wait for some time
        //Step 5 - Verify the error message

        driver.findElement(By.id("login-username")).sendKeys("asd123@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("1234");
        driver.findElement(By.id("js-login-btn")).click();

        Thread.sleep(3000);

        WebElement error_msg=driver.findElement(By.className("notification-box-description"));
        System.out.println(error_msg.getText());
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");


        driver.quit();


    }
}
