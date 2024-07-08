package tests;

import manager.LoginPageAction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginSuccess(){
        login();

        Assert.assertTrue(app.getLoginPageAction().isLogged());

    }


}
