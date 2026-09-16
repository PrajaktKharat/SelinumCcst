package Day1.OpenFireFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Firefoxdriver {

    public static void main(String[] args) {
        WebDriver Obj_Drive = new FirefoxDriver();

        try {
            Obj_Drive.get("https://www.saucedemo.com");

            Thread.sleep(1000);
            System.out.println(Obj_Drive.getTitle());


        }
        catch (Exception e){
            e.printStackTrace();
        }

// Second Obj Is Created
        try {
            Thread.sleep(2000);
            Obj_Drive.get("https://www.google.com");

            Thread.sleep(1000);
            System.out.println(Obj_Drive.getTitle());
        }

        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            Obj_Drive.quit();
        }
    }
}
