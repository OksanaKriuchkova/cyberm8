package tests;

import manager.LoginPageAction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    private final String username = "admin";
    private final String password = "REZ1ucp2drw8gdp@efj";

    //    @BeforeMethod
 //   public void preCondition(){
 //       if(app.getHelperUser().isLogged()){
//            app.getHelperUser().logout();
 //       }
 //   }

    @Test
    public void loginSuccess(){
        app.getLoginPageAction().fillLoginRegistrationForm(username,password);
        app.getLoginPageAction().submitLogin();

        Assert.assertTrue(app.getLoginPageAction().isLogged());

    }


}
