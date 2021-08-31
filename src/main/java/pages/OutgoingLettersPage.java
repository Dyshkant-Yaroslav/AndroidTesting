package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OutgoingLettersPage extends BasePage {
    @FindBy(id = "empty_text")
    private WebElement emptyFolderTextDiv;

    public String getEmptyText() {
        return emptyFolderTextDiv.getText();
    }

    public WebElement getEmptyFolderTextDiv() {
        return emptyFolderTextDiv;
    }
}
