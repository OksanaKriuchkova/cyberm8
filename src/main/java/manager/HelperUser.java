package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase {
    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void fillLoginRegistrationForm(String user, String password){
      //  WebElement userInput = wd.findElement(By.xpath("//input[@id='username']"));
      //  userInput.click();
      //  userInput.clear();
      //  userInput.sendKeys(user);

        type(By.xpath("//input[@id='username']"),user);

      //  WebElement passwordInput = wd.findElement(By.xpath("//input[@id='password']"));
      //  passwordInput.click();
      //  passwordInput.clear();
      //  passwordInput.sendKeys(password);

        type(By.xpath("//input[@id='password']"),password);
    }

    public void submitLogin(){
        click(By.xpath("//button[@id='loginBtn']"));
    }

    public boolean isLogged(){
        return  isElementPresent(By.xpath("//body/app-root/app-home/div[@id='main']/div[@id='right-panel']/div[@class='top-content']/header[@class='header']/div[@class='right-top-header']/div/a[1]"));

    }

    public void logout(){
        click(By.xpath("//body/app-root/app-home/div[@id='main']/div[@id='right-panel']/div[@class='top-content']/header[@class='header']/div[@class='right-top-header']/div/a[1]"));
        click(By.xpath("//a[normalize-space()='Sign Out']"));
    }
}
