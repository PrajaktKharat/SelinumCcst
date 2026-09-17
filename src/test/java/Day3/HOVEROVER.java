//package Day3;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class HOVEROVER {
//
//    public static void main(String[] args) {
//
//        WebDriver driver = new ChromeDriver();
//        driver.get("file:///C:/Users/CCST/Desktop/Selanium101/DriverFileGiven/actionClass_Menu.html#");
//
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//            Actions acti = new Actions (driver);
//
//            // product menu
//
//            WebElement objprod = driver.findElement(By.id("productsMenu"));
//            acti.moveToElement(objprod).perform();
//
//
//            WebElement objsubmenu = wait.until(
//                    ExpectedConditions.visibilityOfElementLocated(By.id("productsSubmenu"))
//            );
//            if (objsubmenu.isDisplayed()){
//                System.out.println("Pass Sub menu " + objsubmenu + " apper hover ");
//            }else {
//                System.out.println("Fail  sub menu " + objsubmenu + " Did Not appear ");
//            }
//
//            acti.moveToElement(objprod).perform();
//
//            WebElement obj_laptop = wait.until(
//                    ExpectedConditions.visibilityOfElementLocated(By.id("laptopsLink"))
//            );
//            obj_laptop.click();
//
//           // String result = driver.//baki ahe
//
//
//            // Service
//
//            WebElement objser = driver.findElement(By.id("productsMenu"));
//            acti.moveToElement(objprod).perform();
//
//
//            WebElement objsubmenu = wait.until(
//                    ExpectedConditions.visibilityOfElementLocated(By.id("productsSubmenu"))
//            );
//            if (objsubmenu.isDisplayed()){
//                System.out.println("Pass Sub menu " + objsubmenu + " apper hover ");
//            }else {
//                System.out.println("Fail  sub menu " + objsubmenu + " Did Not appear ");
//            }
//
//            acti.moveToElement(objprod).perform();
//
//            WebElement obj_laptop = wait.until(
//                    ExpectedConditions.visibilityOfElementLocated(By.id("laptopsLink"))
//            );
//            obj_laptop.click();
//
//
//            } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            driver.quit();
//        }
//    }
//}
