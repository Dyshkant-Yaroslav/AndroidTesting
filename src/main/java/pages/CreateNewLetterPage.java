package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewLetterPage extends BasePage {
    @FindBy(xpath = "//android.view.ViewGroup//android.widget.EditText")
    private WebElement recipientInput;
    @FindBy(id = "subject")
    private WebElement themeInput;
    @FindBy(xpath = "//android.webkit.WebView//android.widget.EditText")
    private WebElement textInput;
    @FindBy(id = "send")
    private WebElement sendMessageButton;
    @FindBy(id = "peoplekit_avatars_avatar")
    private WebElement selectRecipientButton;
    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Недействительный ')]")
    private WebElement incorrectAddressDiv;


    public void fillRecipientInput(String recipient) {
        recipientInput.sendKeys(recipient);
    }

    public void fillThemeInput(String theme) {
        themeInput.sendKeys(theme);
    }

    public void fillTextInput(String text) {
        textInput.sendKeys(text);
    }

    public void tapOnSendMessageButton() {
        sendMessageButton.click();
    }

    public void tapOnSelectedRecipientAvatar() {
        selectRecipientButton.click();
    }

    public WebElement getSelectRecipientButton() {
        return selectRecipientButton;
    }

    public String textOfIncorrectRecipientDiv() {
        return incorrectAddressDiv.getText();
    }

}
