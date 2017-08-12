package carousell;

import carousell.pages.AppPage;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by rajeevranjan on 11/08/17.
 */
public class CarOfferTest extends AbstractTest{

    AppiumDriver driver ;

    @BeforeTest
    public void setup() throws MalformedURLException {
        driver = getDriver();
    }

    @Test
    public void testCarListtingOfferTest(){
        AppPage app = new AppPage(driver);
        app
                .clickEmailLogin()
                .loginTab()
                .userName("rranjan")
                .passWord("tester2016")
                .clickLogin()
                .clickCarListingType()
                .clickListing("1")
                .clickOffer()
                .confirmOffer()
                .verify().cancelOfferAvailable(true)
                .verify().editOfferAvailable(true);
    }

}
