package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageAction extends HelperBase {
    public LoginPageAction(WebDriver wd) {
        super(wd);
    }

    @FindBy(id = "//input[@id='username']")
    private WebElement usernameInput;

    @FindBy(id = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(id = "//button[@id='loginBtn']")
    private WebElement loginButton;

    public void fillLoginRegistrationForm(String user, String password){

        type(usernameInput,user);

        type(passwordInput,password);
    }

    public void submitLogin(){

        click((WebElement) By.xpath("//button[@id='loginBtn']"));
    }

    public boolean isLogged(){
        return  isElementPresent((WebElement) By.xpath("//div[@class='right-top-header']/div/a"));

    }

    public void logout(){
        click((WebElement) By.xpath("//div[@class='right-top-header']/div/a[1]"));
        click((WebElement) By.xpath("//a[normalize-space()='Sign Out']"));
    }
}
