package selenium.ex02_Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium13_NOHTTP {
    public static void main(String[] args) {

        EdgeDriver driver=new EdgeDriver();
//        driver.get("bing.com");
        driver.get("//https:bing.com"); // HTTP is imp

        driver.quit();
    }
}
