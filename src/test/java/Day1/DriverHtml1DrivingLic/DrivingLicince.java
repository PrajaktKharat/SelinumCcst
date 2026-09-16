package Day1.DriverHtml1DrivingLic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrivingLicince {

    public static void main(String[] args) {
        WebDriver Loc_driver = new ChromeDriver();

        try {
            Loc_driver.get("file:///C:/Users/CCST/Desktop/Selanium101/DriverFileGiven/TestcasesClassAssignment-drivingLicenseUI.html");

            Thread.sleep(1000);

            WebElement obj_Fullname =  Loc_driver.findElement(By.id("fullname"));
            WebElement obj_Address =  Loc_driver.findElement(By.id("address"));
            WebElement obj_Age =  Loc_driver.findElement(By.id("age"));
            WebElement obj_Birthplace =  Loc_driver.findElement(By.id("placeofbirth"));
            WebElement obj_MaleGender = Loc_driver.findElement(By.id("Male"));
            WebElement obj_FemalGender = Loc_driver.findElement(By.id("Female"));
            WebElement obj_IsColourBlind = Loc_driver.findElement(By.name("color_yes"));
            WebElement obj_clickSubmit = Loc_driver.findElement(By.xpath("//button[@type = 'submit']"));
            WebElement obj_licType = Loc_driver.findElement(By.id("licenseType"));
            WebElement obj_LangType = Loc_driver.findElement(By.id("languages"));

            Select obj_licType1  = new Select(obj_licType);
            Select obj_LangType1  = new Select(obj_LangType);

            Thread.sleep(1000);
            obj_licType1.selectByIndex(1);

            Thread.sleep(1000);
            obj_Fullname.sendKeys("Raj");
            Thread.sleep(1000);
            obj_Address.sendKeys("Satara");
            Thread.sleep(1000);
            obj_Age.sendKeys("56");
            Thread.sleep(1000);
            obj_Birthplace.sendKeys("Pune");
            Thread.sleep(1000);
            obj_MaleGender.click();
            Thread.sleep(1000);
            obj_IsColourBlind.click();
            Thread.sleep(1000);

            obj_LangType1.selectByVisibleText("Marathi");

            Thread.sleep(1000);

            obj_clickSubmit.click();
            Thread.sleep(3000);

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
           Loc_driver.quit();
        }
    }
}
