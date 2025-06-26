package selenium.ex17_DataDrivenTesting_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

public class Lab45_DDT_TestNg_POI_NextSteps extends CommonToAll {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String email, String password) {

        System.out.println(email + " - " + password);

    }

    @DataProvider
    public Object[][] getData() {

        // Read the Excel File
        // Convert the data R, C into the data[][]
        // return new Object[][];
        return null;

    }
}

