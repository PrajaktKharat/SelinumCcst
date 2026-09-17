package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Draganddrop {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/Users/CCST/Desktop/Selanium101/DriverFileGiven/dragDrop.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        Actions actions = new Actions(driver);

        WebElement item1 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("item1"))


        );

        WebElement targetConterner = driver.findElement(By.id("targetContainer"));


         actions.dragAndDrop(item1,targetConterner).perform();
        boolean isDropped = !targetConterner.findElements(By.id("item1")).isEmpty();
        if (isDropped) {
            System.out.println("Test Passed ");
        } else {
            System.out.println("Test Failed ");
        }






        WebElement item2 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("item2"))


        );

        actions.dragAndDrop(item2,targetConterner).perform();

        boolean isDropped2 = !targetConterner.findElements(By.id("item2")).isEmpty();
        if (isDropped2) {
            System.out.println("Test Passed ");
        } else {
            System.out.println("Test Failed ");
        }




        WebElement item3 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("item3"))


        );


        actions.dragAndDrop(item3,targetConterner).perform();

        boolean isDropped3 = !targetConterner.findElements(By.id("item3")).isEmpty();
        if (isDropped) {
            System.out.println("Test Passed ");
        } else {
            System.out.println("Test Failed ");
        }



        //  Reverce sourceContainer

        WebElement item101 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("item1"))


        );

        WebElement sourceContainer = driver.findElement(By.id("sourceContainer"));


        actions.dragAndDrop(item101,sourceContainer).perform();
        boolean isDropped101 = !sourceContainer.findElements(By.id("item1")).isEmpty();
        if (isDropped101) {
            System.out.println("Test Passed sourceContainer");
        } else {
            System.out.println("Test Failed sourceContainer");
        }






        WebElement item201 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("item2"))


        );

        actions.dragAndDrop(item201,sourceContainer).perform();

        boolean isDropped201 = !sourceContainer.findElements(By.id("item2")).isEmpty();
        if (isDropped201) {
            System.out.println("Test Passed sourceContainer");
        } else {
            System.out.println("Test Failed sourceContainer");
        }




        WebElement item301 = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("item3"))


        );


        actions.dragAndDrop(item301,sourceContainer).perform();

        boolean isDropped301 = !sourceContainer.findElements(By.id("item3")).isEmpty();
        if (isDropped301) {
            System.out.println("Test Passed sourceContainer");
        } else {
            System.out.println("Test Failed sourceContainer");
        }



    }


}
