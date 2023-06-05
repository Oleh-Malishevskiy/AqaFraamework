package webUI.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Parameters;
import webUI.BaseObject;
import webUI.decorator.MyButton;
import webUI.decorator.MyInput;

public class LogInPage extends BaseObject {
    @FindBy(xpath ="/html/body/div/div/div/div/div/div[4]/div/div/div/form/fieldset/label/span/input")
    private MyInput userNameInput;
    @FindBy(xpath ="//*[@id=\"login-form\"]/fieldset/input[2]")
    private MyButton userNameButton;
    @FindBy(xpath ="//*[@id=\"password\"]")
    private MyInput userPasswordInput;
    @FindBy(xpath ="//*[@id=\"login-form\"]/fieldset/input[3]")
    private MyButton userPasswordButton;

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public LogInPage writeUserName(String pass){
        userNameInput.waitForMy();
        userNameInput.input(pass);
        userNameButton.myClick();
        return this;
    }
    public LogInPage writeUserPassword(String userName) throws InterruptedException {
        Thread.sleep(1000);
        userPasswordInput.input(userName);
        userPasswordButton.myClick();

        return this;
    }
}
