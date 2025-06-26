package selenium.ex17_DataDrivenTesting_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

public class Lab47_DDT_TestNg_POI_Real extends CommonToAll {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String email, String password) {
        driver.navigate().to("https://app.vwo.com/#/login");



    }

    @DataProvider
    public Object[][] getData() {
        // READ THE DATA FROM THE EXCEL FILE
        // GIVE THEM IN THE 2D ARRAY
        return UtilExcel.getTestDataFromExcel("Sheet1");

    }


}

