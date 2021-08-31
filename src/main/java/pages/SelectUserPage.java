package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectUserPage extends BasePage {

    @FindBy(id = "action_done")
    private WebElement goToGmailButton;
    @FindBy(id = "setup_addresses_list")
    private WebElement usersListDiv;

    public void tapGoToGmailButton() {
        goToGmailButton.click();
    }

    public WebElement getUsersListDiv() {
        return usersListDiv;
    }
}
