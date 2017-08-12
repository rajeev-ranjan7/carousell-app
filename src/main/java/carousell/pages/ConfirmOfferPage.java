package carousell.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by rajeevranjan on 11/08/17.
 */
public class ConfirmOfferPage extends BasePage{

    private final AppiumDriver driver ;

    @SelendroidFindBy(id = "action_submit")
    private WebElement confirm;

    @SelendroidFindBy(id = "button1")
    private WebElement yes;

    public ConfirmOfferPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, 10,
                TimeUnit.SECONDS), this);
        this.driver = driver;
    }

    public OfferChatPage confirmOffer(){
        waitForElementToBeVisible(confirm);
        confirm.click();
        yes.click();
        return new OfferChatPage(driver);
    }

}
