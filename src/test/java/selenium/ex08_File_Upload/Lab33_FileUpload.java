package selenium.ex08_File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

public class Lab33_FileUpload extends CommonToAll {

    @Test
    public void test_fileUpload() {

        String url = "https://awesomeqa.com/selenium/upload.html";
        driver.get(url);

        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));
        String working_dir = System.getProperty("user.dir");
        String file_path = working_dir + "/src/test/java/selenium/data.txt";

        uploadFileInput.sendKeys(file_path);
        driver.findElement(By.name("submit")).click();

    }

}
