package tests;

import manager.ApplicationManager;
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
        String username = "admin";
        app.getLoginPageAction().fillLoginRegistrationForm(username,password);
    }
}
