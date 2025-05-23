package selenium.ex11_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

public class Lab35_WebTable_test1 extends CommonToAll {

    @Test(groups = "QA")
    @Description("Test Web Table")
    public void test_web_table_login() {


        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        String first_part = "//table[@id='customers']/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        String contact = "Maria Anders";
        for (int i = 2; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                String dynamic_path = first_part + i + second_part + j + third_part;
//                System.out.println(dynamic_path);
                String data = driver.findElement(By.xpath(dynamic_path)).getText();
//                System.out.println(data);
                if (data.contains(contact)) {
                    String country_path = dynamic_path + "/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("------");
                    System.out.println(contact + " is In - " + country_text);

                }


            }
        }
    }
}