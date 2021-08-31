package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class IncomeLettersPage extends BasePage {

    @FindBy(id = "dismiss_button")
    private WebElement closeGoogleMeetDiv;

    @FindBy(id = "compose_button")
    private WebElement createNewLetterButton;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Открыть панель навигации\"]")
    private WebElement contextMenuButton;

    public void tapOnCloseGoogleMeetDiv() {
        closeGoogleMeetDiv.click();
    }

    public void tapOnCreateNewLetterButton() {
        createNewLetterButton.click();
    }

    public void tapOnContextMenuButton() {
        contextMenuButton.click();
    }


}
