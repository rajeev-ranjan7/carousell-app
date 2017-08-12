package carousell.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by rajeevranjan on 11/08/17.
 */
public class LoginPage extends BasePage{

    private AppiumDriver driver ;

    @AndroidFindBy(id = "content")
    private AndroidElement content;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LOGIN']")
    private AndroidElement login;

    @AndroidFindBy(id = "text_username")
    private AndroidElement usernameField;

    @AndroidFindBy(id = "text_password")
    private AndroidElement passwordField;

    @AndroidFindBy(id = "action_signin")
    private AndroidElement loginLnk;

    public LoginPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, 10,
                TimeUnit.SECONDS), this);
        this.driver = driver;
    }

    public LoginPage loginTab(){
        waitForElementToBeVisible(content);
        login.click();
        return this;
    }

    public LoginPage userName(String username){
        waitForElementToBeVisible(usernameField);
        usernameField.setValue(username);
        return this;
    }

    public LoginPage passWord(String password){
        waitForElementToBeVisible(passwordField);
        passwordField.setValue(password);
        return this;
    }

    public DashboardPage clickLogin(){
        waitForElementToBeVisible(loginLnk);
        loginLnk.click();
        return new DashboardPage(driver);
    }
}
