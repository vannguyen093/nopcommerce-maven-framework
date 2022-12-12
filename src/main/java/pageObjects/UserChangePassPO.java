package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.UserChangePassPageUI;

public class UserChangePassPO extends BasePage {
    WebDriver driver;

    public UserChangePassPO(WebDriver driver) {
        this.driver = driver;
    }

    public void inputToChangePassTextboxByTextboxId(String textboxId, String value) {
        waitForElementVisible(driver, UserChangePassPageUI.CHANGE_PASS_TEXTBOX_BY_ID, textboxId);
        sendkeysToElement(driver, UserChangePassPageUI.CHANGE_PASS_TEXTBOX_BY_ID, value, textboxId);
    }

    public String getSuccessMessageText() {
        waitForElementVisible(driver, UserChangePassPageUI.CHANGE_PASS_SUCCESSFUL_MESSAGE_TEXT);
        return getElementText(driver, UserChangePassPageUI.CHANGE_PASS_SUCCESSFUL_MESSAGE_TEXT);
    }

    public void clickToChangePassButton() {
        waitForElementClickable(driver, UserChangePassPageUI.CHANGE_PASS_BUTTON);
        clickToElement(driver, UserChangePassPageUI.CHANGE_PASS_BUTTON);
    }

    public void clickToCloseMessageButton() {
        waitForElementClickable(driver, UserChangePassPageUI.CLOSE_MESSAGE_BUTTON);
        clickToElement(driver, UserChangePassPageUI.CLOSE_MESSAGE_BUTTON);
    }
}
