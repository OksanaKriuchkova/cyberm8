package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddTaskPageAction extends HelperBase{

    public AddTaskPageAction(WebDriver wd) {
        super(wd);
        PageFactory.initElements(wd,this);
    }

    @FindBy(how = How.XPATH, using = "//i[@class='mdi mdi-pencil']")
    private WebElement pencilButton;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search...']")
    private WebElement searchInput;

    @FindBy(how = How.XPATH, using = "//div[@class='collapse']//app-action-list/div[1]")
    public WebElement searchResult;

    public void setSearchInput(String text){
        WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));
        WebElement searchInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search...']")));
        searchInputElement.sendKeys(text);
    }

    public void setPencilButton(){
        click(pencilButton);
    }

   // public void setOnSearchInput(String text){
  //      type(searchInput);
  //  }


}
