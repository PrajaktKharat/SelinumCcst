
package Day2.Day2Ajax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ajaxassig {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("file:///C:/Users/CCST/Desktop/Selanium101/DriverFileGiven/challenge_AjaxPage.html");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // wait for spinner to disappear
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("spinner")));

            // click load button
            WebElement loadQuoteBtn = driver.findElement(By.id("loadQuoteBtn"));
            loadQuoteBtn.click();

            // wait for quote loading text to disappear
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("quoteLoading")));

            // validate quote display
            WebElement quoteBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("quoteBox")));

            if (quoteBox.isDisplayed()) {
                System.out.println("Quote is Displayed");
            }
            System.out.println("And quot is " + quoteBox.getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}