package Day2.DAY2Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class screenshotSele {

    public static void main(String[] args) {
        WebDriver driver = null;

        try {
            driver = new ChromeDriver();
            Thread.sleep(1000);

            String screenshotDir = "screenshots/";
            new File(screenshotDir).mkdirs();

            driver.get("file:///C:/Users/CCST/Desktop/Selanium101/DriverFileGiven/TestcasesClassAssignment-drivingLicenseUI.html");
            Thread.sleep(1000);

            String actualTitle = driver.getTitle();
            String expected = "Driving licence Application ...";

            if (actualTitle.equals(expected)) {
                System.out.println("Pass");
            } else {
                System.out.println("Failed");
                captureScreenshot(driver, "Fail_to_match");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            driver.quit();

        }
    }

    public static void captureScreenshot(WebDriver driver, String fileName) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("screenshots/" + fileName + ".png"));
            System.out.println("Screenshot Saved!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}