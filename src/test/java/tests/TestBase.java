package tests;

import manager.ApplicationManager;
import manager.LoginPageAction;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    private final String username = "admin";
    private final String password = "REZ1ucp2drw8gdp@efj";

    public static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUp(){
        app.init();

    }

    @AfterSuite
    public void tearDown(){
       // app.stop();
    }

    protected void login(){
        app.getLoginPageAction().fillLoginRegistrationForm(username,password);
    }
}
