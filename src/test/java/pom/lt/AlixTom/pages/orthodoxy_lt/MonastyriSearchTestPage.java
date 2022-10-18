package pom.lt.AlixTom.pages.orthodoxy_lt;

import pom.lt.AlixTom.pages.Common;
import pom.lt.AlixTom.pages.Locators;

public class MonastyriSearchTestPage {

    public static void open(String url) {
        Common.openUrl(url);

    }

    public static void inputTexttoSearchBox(String text) {

        Common.sendKeysToElement(
                text,
                Locators.Orthodoxy_lt.TextBox.inputSearchContainer
        );
    }
    public static void clickButtonSearch() {
        Common.clickElement(Locators.Orthodoxy_lt.Buttons.buttonSearch);
    }
    public static String readMessage() {

        Common.waitForElementWithVisibilityChange(Locators.Orthodoxy_lt.TextBox.paragraphSearch);
        return Common.getElementText(
                Locators.Orthodoxy_lt.TextBox.paragraphSearch
        );

    }

    public static void clickButtonNavigateHome() {
        Common.clickElementByAction(Locators.Orthodoxy_lt.Buttons.buttonNavigateHome);

    }

    public static String readCurrentUrl(){
       return Common.checkUrl();
    }
}
