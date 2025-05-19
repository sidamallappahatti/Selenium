package selenium.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium11_Change_Driver {

    public static void main(String[] args) {
//        ChomeDriver driver=new ChromeDriver();
//        driver= new ChromeDriver();


        WebDriver driver1=new EdgeDriver();
        driver1=new FirefoxDriver();
    }
}
