package selenium.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium08_Minimize_Maximize {

    @Description("Open the URL")
    @Test
    public void test_selenium(){

        WebDriver driver=new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

//        driver.manage().window().maximize();
//        driver.manage().window().minimize();


        System.out.println(driver.getTitle());


    }

}
