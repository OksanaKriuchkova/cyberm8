package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAction extends HelperBase {
    public LoginPageAction(WebDriver wd) {
        super(wd);
        PageFactory.initElements(wd,this);
    }

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "loginBtn")
    private WebElement loginButton;

    public void fillLoginRegistrationForm(String user, String password){

        type(usernameInput,user);

        type(passwordInput,password);

        click(loginButton);
    }


    public boolean isLogged(){
        WebElement adminMenu = wd.findElement(By.xpath("//div[@class='right-top-header']/div/a"));
        return  isElementPresent(adminMenu);


    }

}
