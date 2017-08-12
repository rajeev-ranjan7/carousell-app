package carousell;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by rajeevranjan on 11/08/17.
 */
public class AbstractTest {

    AppiumDriver driver ;

    AppiumDriver getDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        /* Here we specify the capabilities required by the Appium server.
             * We have already manually specified most of these through the
             * Appium server interface (apk path etc.). */
        capabilities.setCapability("deviceName", "note");
            driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        return driver;
    }
}
