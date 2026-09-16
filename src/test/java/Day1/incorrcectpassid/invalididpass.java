package Day1.incorrcectpassid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class invalididpass {



    public static void main(String[] args) {

        WebDriver obj_driver = new ChromeDriver();
        try {
            obj_driver.get("https://www.saucedemo.com");

            Thread.sleep(1000);

            WebElement obj_username = obj_driver.findElement(By.id("user-name"));
            WebElement obj_password = obj_driver.findElement(By.id("password"));
            WebElement obj_loginButton = obj_driver.findElement(By.id("login-button"));
            Thread.sleep(1000);
            obj_username.sendKeys("Nakul");
            obj_password.sendKeys("123456");

            Thread.sleep(1000);

            obj_loginButton.click();

            Thread.sleep(1000);

            if(obj_driver.findElement(By.cssSelector("h3[role = 'alert']")).isDisplayed()) {
                System.out.println("TestCase Passed");
            }

            else{
                System.out.println("Failed");
            }

        } catch (Exception e){
            e.printStackTrace();
        }finally {
            obj_driver.quit();
        }




    }
}
