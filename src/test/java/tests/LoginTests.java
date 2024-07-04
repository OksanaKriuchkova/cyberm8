package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void preCondition(){
        if(app.getHelperUser().isLogged()){
            app.getHelperUser().logout();
        }
    }

    @Test
    public void loginSuccess(){
        app.getHelperUser().fillLoginRegistrationForm("admin","REZ1ucp2drw8gdp@efj");
        app.getHelperUser().submitLogin();

       Assert.assertTrue(app.getHelperUser().isLogged());

    }

    @Test
    public void loginSuccess2(){
        app.getHelperUser().fillLoginRegistrationForm("admin","REZ1ucp2drw8gdp@efj");
        app.getHelperUser().submitLogin();

        Assert.assertTrue(app.getHelperUser().isLogged());

    }


}
