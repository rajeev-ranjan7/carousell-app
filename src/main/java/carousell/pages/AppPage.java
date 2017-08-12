package carousell.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;


/**
 * Created by rajeevranjan on 11/08/17.
 */
public class AppPage extends BasePage{

    private AppiumDriver driver ;

    @AndroidFindBy(id = "email_signin_button")
    private RemoteWebElement email;

    @AndroidFindBy(id = "view_buttons")
    private RemoteWebElement signUpButtons;

    public AppPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver,
                        10,
                        TimeUnit.SECONDS),
                this);
        this.driver = driver;
    }

    public LoginPage clickEmailLogin(){
        waitForElementToBeVisible(signUpButtons);
        email.click();
        return new LoginPage(driver);
    }
}
