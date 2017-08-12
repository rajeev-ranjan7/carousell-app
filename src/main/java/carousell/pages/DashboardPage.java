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
public class DashboardPage extends BasePage{

    private AppiumDriver driver ;

    @SelendroidFindBy(xpath = "//android.widget.TextView[@text='Cars']")
    private WebElement carListingType;

    public DashboardPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, 10,
                TimeUnit.SECONDS), this);
        this.driver = driver;
    }

    public ListingPage clickCarListingType(){
        waitForElementToBeVisible(carListingType);
        carListingType.click();
        return new ListingPage(driver);
    }
}
