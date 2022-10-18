package pom.lt.AlixTom.pages.orthodoxy_lt;

import pom.lt.AlixTom.pages.Common;
import pom.lt.AlixTom.pages.Locators;

public class NovostiFilterPage {

    public static void open(String url) {
        Common.openUrl(url);
        Common.sleep(3000);
    }
    public static void clickMenuButtonToOpenPage(Integer key) {

        Common.clickElementByAction(Locators.Orthodoxy_lt.MenuElements.menuButton02);
    }
}
