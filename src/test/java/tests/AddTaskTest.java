package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddTaskTest extends TestBase{
    private WebDriver wd;

    @BeforeClass
    public void precondition(){
        login();
    }

    @Test(priority = 1)
    public void clickOnTaskList(){
        app.getTaskList().addTaskList();
    }
    @Test(priority = 2)
    public void clickOnAddTaskButton(){
        app.getTaskList().addTaskButton();
    }

//    @Test(priority = 3)
 //   public void inputTaskName(){
 //      app.getTaskList().getAddTaskPageAction().setSearchInput("sleep");
 //   }

    @Test(priority = 4)
    public void clickOnPencil(){
        app.getTaskList().getAddTaskPageAction().setPencilButton();
    }
}
