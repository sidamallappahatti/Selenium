package selenium.ex17_DataDrivenTesting_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

public class Lab46_DDT_TestNg_POI_Real extends CommonToAll {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String email, String password) {
        System.out.println(email + " - " + password);


    }

    @DataProvider
    public Object[][] getData() {
        // READ THE DATA FROM THE EXCEL FILE
        // GIVE THEM IN THE 2D ARRAY
        return UtilExcel.getTestDataFromExcel("Sheet1");

    }


}

