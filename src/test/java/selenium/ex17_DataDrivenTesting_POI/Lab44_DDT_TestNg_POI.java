package selenium.ex17_DataDrivenTesting_POI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

public class Lab44_DDT_TestNg_POI extends CommonToAll {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String email, String password) {

        System.out.println(email + " - " + password);

    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                new Object[]{"admin@123", "pass122"},
                new Object[]{"admin@143", "pass132"},
                new Object[]{"admin@153", "pass111"},
                new Object[]{"admin@153", "pass111"},
                new Object[]{"admin@153", "pass111"},
                new Object[]{"admin@153", "pass111"},
                new Object[]{"admin@153", "pass111"},
                new Object[]{"admin@153", "pass111"},
                new Object[]{"admin@153", "pass111"},
                new Object[]{"admin@153", "pass111"},
                new Object[]{"admin@153", "pass111"}
        };
    }
}
