package webUI.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webUI.BaseObject;
import webUI.decorator.MyButton;
import webUI.decorator.MyInput;

public class ProblemPage extends BaseObject {
    @FindBy(xpath ="/html/body/div[1]/div/div[2]/ul/li[2]/a")
    private MyButton openSelect;
    @FindBy(xpath ="//*[@id=\"projects-list\"]/li[3]/div/ul/li[3]/a")
    private MyButton chooseProject;
    @FindBy(xpath ="/html/body/div[2]/div[2]/div[2]/div/div/div/form/div/div[2]/div[2]/input")
    private MyButton openP;

    public ProblemPage(WebDriver driver) {
        super(driver);
    }
    public ProblemPage openSelect(){
        openSelect.myClick();
        return this;
    }
    public CreateProblemPage chooseOption(){
        chooseProject.myClick();
        openP.myClick();
        return new CreateProblemPage(driver);
    }
}
