package pom.lt.AlixTom.pages.orthodoxy_lt;

import pom.lt.AlixTom.pages.Common;
import pom.lt.AlixTom.pages.Locators;

public class HomePageMenuPage {

    public static void open(String url) {
        Common.openUrl(url);
        Common.sleep(3000);
    }
    public static void clickMenuButtonToOpenPage(Integer key) {
        switch (key) {
            case 1:
                Common.clickElementByAction(Locators.Orthodoxy_lt.MenuElements.menuButton01);
            break;
            case 2:
                Common.clickElementByAction(Locators.Orthodoxy_lt.MenuElements.menuButton02);
            break;
            case 3:
                Common.clickElementByAction(Locators.Orthodoxy_lt.MenuElements.menuButton03);
            break;
            case 4:
                Common.clickElementByAction(Locators.Orthodoxy_lt.MenuElements.menuButton04);
            break;
            case 5:
                Common.clickElementByAction(Locators.Orthodoxy_lt.MenuElements.menuButton05);
            break;
            case 6:
                Common.clickElementByAction(Locators.Orthodoxy_lt.MenuElements.menuButton06);
            break;
            case 7:
                Common.clickElementByAction(Locators.Orthodoxy_lt.MenuElements.menuButton07);
            break;
            case 8:
                Common.clickElementByAction(Locators.Orthodoxy_lt.MenuElements.menuButton08);
            break;
        }
    }
    public static String readMessage(Integer key) {
       switch (key) {
           case 1:
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
           case 8:
                Common.waitForElementWithVisibilityChange(Locators.Orthodoxy_lt.MenuElements.paragraph01);
                return Common.getElementText(
                        Locators.Orthodoxy_lt.MenuElements.paragraph01
                );
            case 7:
                Common.waitForElementWithVisibilityChange(Locators.Orthodoxy_lt.MenuElements.paragraph07);
                return Common.getElementText(
                        Locators.Orthodoxy_lt.MenuElements.paragraph07);
        }
        return null;
    }
}
