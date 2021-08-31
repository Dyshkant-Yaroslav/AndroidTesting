package driver;

import capabilities.CapabilitiesFactory;
import io.appium.java_client.android.AndroidDriver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class AppiumDriver {

    private static AndroidDriver driver;

    public static AndroidDriver getAppiumDriver() {
        if (driver == null) {
            driver = new AndroidDriver(Objects.requireNonNull(CapabilitiesFactory.getAppiumURL()),
                    CapabilitiesFactory.getCapabilities());
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void closeAppiumDriver() {
        driver.quit();
    }

}
