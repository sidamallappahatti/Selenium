package selenium.ex12_Javascript_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

public class Lab37_Javascript_Code extends CommonToAll {

    @Test
    public void test_javascript(){

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.location= 'https://www.google.com'");

        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement div_to_scroll=driver.findElement(By.xpath("//div[@id='userName']"));


        js.executeScript("window.scrollBy(0,500)");

        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);

    }
}
