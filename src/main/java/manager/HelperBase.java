package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void type(WebElement element, String text){

        new WebDriverWait(wd,10).until(ExpectedCondition.visibilityOf(element));


        WebDriver driver = new ChromeDriver();
       WebDriverWait wait = new WebDriverWait(wd,10);

        driver.get("https://testing.cloud.cyberm8.com");

        WebElement element1 = driver.findElement(By.id(5));

        element.click();
        element.clear();
        if(text!=null){

            element.sendKeys(text);
        }

    }

    public void click(WebElement element){
        element.click();

    }

   public boolean isElementPresent(WebElement element){
       try{
           return element.isDisplayed();
       }catch (NotFoundException exception){
           return false;
       }
   }

}
