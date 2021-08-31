package androidTests;

import business.BusinessObject;
import org.testng.annotations.Test;

public class GmailTests extends BaseTest {

    private static final String LETTER_THEME = "SomeTheme";
    private static final String LETTER_TEXT = "some text";
    private static final String LETTER_RECIPIENT = "dyshkantyaroslav@gmail.com";
    private static final String INCORRECT_LETTER_RECIPIENT = "aaa";
    private static final String EMPTY_OUTGOING_LETTERS_TEXT = "пока пусто";
    private static final String SHORT_RECIPIENT_NAME = "dyshkantyar.";
    private static final int DEFAULT_WAIT_TIME = 10;

    private  BusinessObject businessObject = new BusinessObject();


    @Test
    public void sendLetterAndCheckItTest() {
       businessObject.sendLetterAndCheckIt(LETTER_THEME, LETTER_TEXT, LETTER_RECIPIENT, DEFAULT_WAIT_TIME,
                EMPTY_OUTGOING_LETTERS_TEXT, SHORT_RECIPIENT_NAME);
    }
    @Test
    public void sentLetterWithIncorrectRecipientTest(){
        businessObject.sendLetterWithIncorrectRecipient(LETTER_THEME,LETTER_TEXT,
                INCORRECT_LETTER_RECIPIENT,DEFAULT_WAIT_TIME);
    }

}
