package selenium.ex13_JS_ShadowDOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

public class Lab38_JS_Code_ShadowDOM extends CommonToAll {

    @Test
    public void test_js(){

        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        waitForJVM(3000);

        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('div#app2').shadowRoot.querySelector('#pizza');");
        inputboxPizza.sendKeys("farmhouse");

    }
}
