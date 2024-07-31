package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ApplicationManager {

    public WebDriver wd;

    LoginPageAction loginPageAction;

    TaskListPageAction tasklist;

    public void init(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        wd = new ChromeDriver(options);
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        wd.navigate().to("https://testing.cloud.cyberm8.com");

        tasklist = new TaskListPageAction(wd);

    }

    public LoginPageAction getLoginPageAction() {
        loginPageAction = new LoginPageAction(wd);
        return loginPageAction;
    }

    public void stop(){

        wd.quit();

    }


    public TaskListPageAction getTaskList() {

        return new TaskListPageAction(wd);
    }
}
