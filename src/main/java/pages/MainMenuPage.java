package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainMenuPage extends BasePage {

    @FindBy(xpath = "//android.widget.TextView[@text='Отправленные']")
    private WebElement sentLettersButton;
    @FindBy(xpath = "//android.widget.TextView [@text='Исходящие']")
    private WebElement outgoingLettersButton;


    public void tapOnSentLettersButton() {
        sentLettersButton.click();
    }

    public void tapOnOutgoingLettersButton() {
        outgoingLettersButton.click();
    }


}
