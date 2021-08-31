package androidTests;

import driver.AppiumDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {

    @AfterTest
    public void closeTest() {
        AppiumDriver.closeAppiumDriver();
    }
}
