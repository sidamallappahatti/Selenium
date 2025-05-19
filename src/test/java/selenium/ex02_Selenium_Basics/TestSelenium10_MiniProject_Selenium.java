package selenium.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium10_MiniProject_Selenium extends CommonToAll{
    @Description("Open the url")
    @Test
    public void test_Selenium() throws Exception{

        WebDriver driver=new EdgeDriver();

        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com/");

        if (driver.getPageSource().contains("CURA Healthcare Service")){
            Assert.assertTrue(true);
            System.out.println("Test case pass");
        }else {
            Assert.fail("CURA Healthcare Service text is not visible");
//            throw new Exception("CURA Healthcare Service text is not visible");
        }

        closeBrowser(driver);


    }

}
