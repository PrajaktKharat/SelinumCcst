package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class keybordshotcuts {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/Users/CCST/Desktop/Selanium101/DriverFileGiven/keyboardShortcuts.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        Actions actio = new Actions(driver);

        WebElement sourceText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("sourceText"))
        );

        WebElement targetText = driver.findElement(By.id("targetText"));

        sourceText.click();
        actio.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        System.out.println("Selected all Performed on source Cointiner");

        actio.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        System.out.println("Copied  Performed on source Cointiner");

        targetText.click();
        actio.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        System.out.println("Paisted  Performed on source Cointiner");


        targetText.click();
        actio.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        System.out.println("Deletion  Performed on source Cointiner");




    }
}
