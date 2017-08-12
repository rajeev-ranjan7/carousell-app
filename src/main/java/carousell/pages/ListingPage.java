package carousell.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by rajeevranjan on 11/08/17.
 */
public class ListingPage extends BasePage{
    private final AppiumDriver driver ;

    public ListingPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, 10,
                TimeUnit.SECONDS), this);
        this.driver = driver;
    }

    public OfferPage clickListing(String index){
        WebElement listing = getPageElement("Xpath", "//android.widget.LinearLayout[@resource-id='com.thecarousell.Carousell:id/view_product' and @index='%p']", index);
        waitForElementToBeVisible(listing);
        listing.click();
        return new OfferPage(driver);
    }
}
