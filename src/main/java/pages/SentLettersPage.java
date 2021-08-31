package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SentLettersPage extends BasePage {

    @FindBy(id="viewified_conversation_item_view")
    private List<WebElement> listOfSentLetters;


    public String textOfLastSentLetter() {
        return listOfSentLetters.get(0).getText();
    }

    public List<WebElement> getListOfSentLetters() {
        return listOfSentLetters;
    }
}
