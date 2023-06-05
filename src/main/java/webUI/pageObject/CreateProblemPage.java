package webUI.pageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webUI.BaseObject;
import webUI.decorator.MyButton;
import webUI.decorator.MyInput;

import java.util.UUID;

public class CreateProblemPage extends BaseObject {

    @FindBy(xpath ="/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[6]/td/select")
    private MyButton selectUser;
    @FindBy(xpath ="/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[6]/td/select/option[2]")
    private MyButton chooseUser;
    @FindBy(xpath ="//*[@id=\"summary\"]")
    private MyInput writeStaticInfo;
    @FindBy(xpath ="//*[@id=\"description\"]")
    private MyInput description;
    @FindBy(xpath ="//*[@id=\"steps_to_reproduce\"]")
    private MyInput steps;
    @FindBy(xpath ="//*[@id=\"additional_info\"]")
    private MyInput addInfo;
    @FindBy(xpath ="//*[@id=\"report_bug_form\"]/div/div[2]/div[2]/input")
    private MyButton createProblemBtn;
    public CreateProblemPage(WebDriver driver) {
        super(driver);

    }
    public CreateProblemPage selectUser(){
        selectUser.myClick();
        chooseUser.myClick();
        return this;
    }
    public CreateProblemPage writeInfo(){
        writeStaticInfo.input(UUID.randomUUID().toString());
        description.input(UUID.randomUUID().toString());
        steps.input(UUID.randomUUID().toString());
        addInfo.input(UUID.randomUUID().toString());
        return this;
    }
    public ProblemsBrowserPage createProblem(){
        createProblemBtn.myClick();
        return new ProblemsBrowserPage(driver);
    }
}
