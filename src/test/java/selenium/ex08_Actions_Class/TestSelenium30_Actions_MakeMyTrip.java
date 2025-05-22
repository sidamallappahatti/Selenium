package selenium.ex08_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import selenium.Utilities.CommonToAll;

import java.time.Duration;
import java.util.List;

public class TestSelenium30_Actions_MakeMyTrip extends CommonToAll {

    @Test
    public void test_actions() throws InterruptedException {

        String URL = "https://www.makemytrip.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        // Wait for the popup to come and click the x icon
        //span[@data-cy='closeModal']

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        // This will close the modal
        WebElement model = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        model.click();

        Thread.sleep(3000);

        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy='fromCity']"));
        fromCity.click();

        WebElement fromCityInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='From']")
        ));

        Actions actions = new Actions(driver);
        actions.moveToElement(fromCityInput).click().sendKeys("chand").build().perform();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li")
        ));

        try {
            List<WebElement> list_auto_suggest = driver.findElements(
                    By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));

            for (int i = 0; i < list_auto_suggest.size(); i++) {
                List<WebElement> refreshedList = driver.findElements(
                        By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
                WebElement e = refreshedList.get(i);
                if (e.getText().contains("Chandigarh")) {
                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", e);
                    break;
                }
            }

        } catch (StaleElementReferenceException e) {
            System.out.println("Ignore this StaleElement exception");
        }
    }
}
