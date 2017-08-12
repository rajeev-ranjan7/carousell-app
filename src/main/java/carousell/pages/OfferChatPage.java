package carousell.pages;

import carousell.checker.OfferChatPageChecker;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by rajeevranjan on 11/08/17.
 */
public class OfferChatPage extends BasePage{
    private final AppiumDriver driver ;
    private final OfferChatPageChecker checker;

    @SelendroidFindBy(id = "action_submit")
    public WebElement cancelOffer;

    @SelendroidFindBy(id = "button1")
    public WebElement editOffer;

    public OfferChatPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, 10,
                TimeUnit.SECONDS), this);
        checker = new OfferChatPageChecker(this);
        this.driver = driver;
    }

    public OfferChatPageChecker verify() {
        return checker;
    }
}
