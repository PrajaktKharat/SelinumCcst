package Day2.NavigationOfWindowsDAY2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationWindow {

    public static void main(String[] args) {
        WebDriver obj_Driver = new ChromeDriver();

        try {
            Thread.sleep(5000);
            obj_Driver.manage().window().maximize();

            obj_Driver.get("https://www.google.com");
            System.out.println("Step 1 - Loaded via get(): " + obj_Driver.getTitle());
            System.out.println("Handle after navigate get(): " + obj_Driver.getWindowHandle());
            Thread.sleep(5000);

            obj_Driver.navigate().to("https://www.selenium.dev");
            System.out.println("Step 2 - Navigated via to(): " + obj_Driver.getTitle());
            System.out.println("Handle after navigate to(): " + obj_Driver.getWindowHandle());
            Thread.sleep(5000);

            obj_Driver.navigate().to("https://www.wikipedia.org");
            System.out.println("Step 3 - Navigated via to(): " + obj_Driver.getTitle());
            System.out.println("Handle after navigate to(): " + obj_Driver.getWindowHandle());
            Thread.sleep(5000);

            obj_Driver.navigate().back();
            System.out.println("Step 4 - Back: " + obj_Driver.getTitle());
            System.out.println("Handle after navigate back(): " + obj_Driver.getWindowHandle());
            Thread.sleep(5000);

            obj_Driver.navigate().forward();
            System.out.println("Step 5 - Forward: " + obj_Driver.getTitle());
            Thread.sleep(5000);

            obj_Driver.navigate().refresh();
            System.out.println("Step 6 - Refresh: " + obj_Driver.getTitle());
            System.out.println("Handle after refresh(): " + obj_Driver.getWindowHandle());
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            obj_Driver.quit();
        }
    }
}