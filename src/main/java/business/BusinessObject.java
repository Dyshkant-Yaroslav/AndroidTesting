package business;


import pages.*;


public class BusinessObject {

    private  CreateNewLetterPage createNewLetterPage = new CreateNewLetterPage();
    private  IncomeLettersPage incomeLettersPage = new IncomeLettersPage();
    private  MainMenuPage mainMenuPage = new MainMenuPage();
    private  OutgoingLettersPage outgoingLettersPage = new OutgoingLettersPage();
    private  SelectUserPage selectUserPage = new SelectUserPage();
    private  SentLettersPage sentLettersPage = new SentLettersPage();
    private  WelcomePage welcomePage = new WelcomePage();


    public void sendLetterAndCheckIt(String theme, String text, String recipient, int waitTime,
                                     String emptyLettersText, String shortRecipient) {
        basicSendLetter(theme, text, recipient, waitTime);
        incomeLettersPage.tapOnContextMenuButton();
        mainMenuPage.tapOnOutgoingLettersButton();
        outgoingLettersPage.waitForVisibilityOfElement(waitTime, outgoingLettersPage.getEmptyFolderTextDiv());
        assert (outgoingLettersPage.getEmptyText().contains(emptyLettersText));
        incomeLettersPage.tapOnContextMenuButton();
        mainMenuPage.tapOnSentLettersButton();
        sentLettersPage.waitForVisibilityOfElement(waitTime, sentLettersPage.getListOfSentLetters().get(0));
        assert (sentLettersPage.textOfLastSentLetter().contains(shortRecipient));
        assert (sentLettersPage.textOfLastSentLetter().contains(text));
        assert (sentLettersPage.textOfLastSentLetter().contains(theme));
    }

    public void sendLetterWithIncorrectRecipient(String theme, String text, String recipient, int waitTime) {
        basicSendLetter(theme, text, recipient, waitTime);
        assert (createNewLetterPage.textOfIncorrectRecipientDiv().contains(recipient));
    }


    private void basicSendLetter(String theme, String text, String recipient, int waitTime) {
        welcomePage.tapCloseButton();
        selectUserPage.waitForVisibilityOfElement(waitTime, selectUserPage.getUsersListDiv());
        selectUserPage.tapGoToGmailButton();
        incomeLettersPage.tapOnCloseGoogleMeetDiv();
        incomeLettersPage.tapOnCreateNewLetterButton();
        createNewLetterPage.fillThemeInput(theme);
        createNewLetterPage.fillTextInput(text);
        createNewLetterPage.fillRecipientInput(recipient);
        createNewLetterPage.waitForVisibilityOfElement(waitTime, createNewLetterPage.getSelectRecipientButton());
        createNewLetterPage.tapOnSelectedRecipientAvatar();
        createNewLetterPage.tapOnSendMessageButton();
    }

}
