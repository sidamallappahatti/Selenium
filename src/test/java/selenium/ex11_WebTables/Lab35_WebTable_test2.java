package selenium.ex11_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

import java.util.List;

public class Lab35_WebTable_test2 extends CommonToAll {

    @Test(groups = "QA")
    @Description("Web Table testing")
    public void test_web_table_login() {


        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));

        // Rows and columns
        List<WebElement> rows_ofTable = table.findElements(By.tagName("tr"));

        for (int i = 0; i < rows_ofTable.size(); i++) {
            List<WebElement> col = rows_ofTable.get(i).findElements(By.tagName("td"));
            for (WebElement c : col) {
                System.out.println(c.getText());
            }

        }

    }
}
