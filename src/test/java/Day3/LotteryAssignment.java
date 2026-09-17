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

public class LotteryAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("file:///C:/Users/CCST/Downloads/challenge_MouseKeyboardActions.html");

        WebElement objDoc = driver.findElement(By.id("documentsMenu"));
           action.moveToElement(objDoc).perform();


           WebElement documentsSubmenu = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("documentsSubmenu"))
            );
            if (documentsSubmenu.isDisplayed()){
                System.out.println("Pass Sub menu " + documentsSubmenu + " apper hover ");
            }else {
                System.out.println("Fail  sub menu " + documentsSubmenu + " Did Not appear ");
            }

            action.moveToElement(objDoc).perform();

            WebElement upload_doc = wait.until(
                   ExpectedConditions.visibilityOfElementLocated(By.id("uploadDocLink"))
           );
           upload_doc.click();


           //Adhar upload
        WebElement fileinput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("fileInput"))
        );

        String filepath = "C:\\Users\\CCST\\Desktop\\Selanium101\\DriverFileGiven\\actionClass_Menu.html";

        fileinput.sendKeys(filepath);

        System.out.println("file path send to input field ");


        WebElement filenamelable = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("fileName"))
        );

        if(filenamelable.getText().contains("actionClass_Menu")){
            System.out.println("Pass: File selected correctly"  +  filenamelable);
        }else {
            System.out.println("Failed : incorrect file name " + filenamelable);
        }

        WebElement Uploadbutton = driver.findElement(By.id("uploadBtn"));
        Uploadbutton.click();

        action.sendKeys(Keys.END).perform();


    }
}
