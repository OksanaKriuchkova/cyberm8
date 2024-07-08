package manager;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void type(WebElement element, String text){

        new WebDriverWait(wd,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));

        element.click();
        element.clear();
        element.sendKeys(text);

    }

    public void click(WebElement element){

        new WebDriverWait(wd,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
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
