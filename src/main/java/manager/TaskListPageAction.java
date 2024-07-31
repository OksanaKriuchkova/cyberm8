package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TaskListPageAction extends HelperBase{

    public TaskListPageAction(WebDriver wd) {
        super(wd);
        PageFactory.initElements(wd,this);
    }

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Task List']")
    private WebElement addTaskList;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add task')]")
    private WebElement addTaskButton;

    public void addTaskList(){
        click(addTaskList);
    }

    public void addTaskButton(){
        click(addTaskButton);
    }

    public AddTaskPageAction getAddTaskPageAction(){
        addTaskButton.click();
        return new AddTaskPageAction(wd);
    }

}
