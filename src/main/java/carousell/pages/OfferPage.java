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
public class OfferPage extends BasePage{

    private final AppiumDriver driver ;

    @SelendroidFindBy(id = "text_buy")
    private WebElement buyOffer;

    public OfferPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, 10,
                TimeUnit.SECONDS), this);
        this.driver = driver;
    }

    public ConfirmOfferPage clickOffer(){
        waitForElementToBeVisible(buyOffer);
        buyOffer.click();
        return new ConfirmOfferPage(driver);
    }
}
