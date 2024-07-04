package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ApplicationManager {

    WebDriver wd;

    public void init(){

        wd = new ChromeDriver();
        wd.navigate().to("https://testing.cloud.cyberm8.com/login");

    }

    public void stop(){

        wd.quit();

    }


}
