package pages;

import driver.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(AppiumDriver.getAppiumDriver(), this);
    }

    public void waitForVisibilityOfElement(long seconds, WebElement element) {
        new WebDriverWait(AppiumDriver.getAppiumDriver(), seconds).until(ExpectedConditions.visibilityOf(element));
    }


}
