package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {

    @FindBy(id = "welcome_tour_got_it")
    private WebElement closeButton;


    public void tapCloseButton() {
        closeButton.click();
    }

}
