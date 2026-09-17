package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Customcontextmenu {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("C:/Users/CCST/Desktop/Selanium101/DriverFileGiven/rightClickContextMenuInteraction.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        Actions action = new Actions(driver);

        WebElement targetbox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("targetBox"))
        );

        action.contextClick(targetbox).perform();

        WebElement contextmenu = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("contextMenu"))

        );

        if (contextmenu.isDisplayed()){
            System.out.println(" Pass after right click");
        }else {
            System.out.println("Fail after right click dont apper ");
        }


        WebElement delet = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("deleteOption"))
        );
        delet.click();


        action.contextClick(delet).perform();


        targetbox.click();

        String result = driver.findElement(By.id("result")).getText();
        System.out.println(result );
        if (result.equals("You selected: Delete")){
            System.out.println(" Pass  Delete option " + result );
        }else {
            System.out.println("Fail  Delete option " + result);
        }


    }
}
