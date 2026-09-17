package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor; // Imported correctly
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExecutor {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {

            driver.get("file:///C:/Users/CCST/Desktop/Selanium101/DriverFileGiven/TestcasesClassAssignment-drivingLicenseUI.html");

            double zoomlevelbefore = ((Number) js.executeScript("return window.devicePixelRatio;")).doubleValue();
            System.out.println("Current Zoom Ratio :" + zoomlevelbefore);

            Actions actions = new Actions(driver);
            actions.keyDown(Keys.CONTROL).sendKeys(Keys.ADD).keyUp(Keys.CONTROL).perform();

            double zoomlevelafter = ((Number) js.executeScript("return window.devicePixelRatio;")).doubleValue();
            System.out.println("Current Zoom Ratio :" + zoomlevelafter);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //driver.quit();
        }
    }
}