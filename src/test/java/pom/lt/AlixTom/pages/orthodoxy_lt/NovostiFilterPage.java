package pom.lt.AlixTom.pages.orthodoxy_lt;

import pom.lt.AlixTom.pages.Common;
import pom.lt.AlixTom.pages.Locators;

import org.openqa.selenium.NoSuchElementException;


public class NovostiFilterPage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void inputTexttoTextBox(String boxInput, int key) {
        switch (key) {
            case 1:
            Common.sendKeysToElement(
                    boxInput,
                    Locators.Orthodoxy_lt.TextBox.inputContainer01);
            break;
            case 2:
            Common.sendKeysToElement(
                        boxInput,
                        Locators.Orthodoxy_lt.TextBox.inputContainer02);
            break;
        }
    }

    public static void clickButtonFilter() {
        Common.clickElement(Locators.Orthodoxy_lt.Buttons.buttonFilter);
    }

    public static String readMessage() {

            Common.waitForElementWithVisibilityChange(Locators.Orthodoxy_lt.TextBox.paragraphMessage);
            return Common.getElementText(
                    Locators.Orthodoxy_lt.TextBox.paragraphMessage
            );

    }

    public static void clickButtonClear() {
        Common.clickElement(Locators.Orthodoxy_lt.Buttons.buttonClear);
    }

    public static boolean checkFieldVisibility() {
       try{
           return Common.getElement(Locators.Orthodoxy_lt.TextBox.paragraphMessage).isDisplayed();
        }
       catch (NoSuchElementException e){
       e.printStackTrace();
       return false;
       }
    }
}
