package pom.lt.AlixTom.tests.orthodoxy_lt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.lt.AlixTom.pages.orthodoxy_lt.MonastyriSearchTestPage;
import pom.lt.AlixTom.pages.orthodoxy_lt.NovostiFilterPage;
import pom.lt.AlixTom.tests.TestBase;

public class MonastyriSearchTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        MonastyriSearchTestPage.open("https://www.orthodoxy.lt/monastyri");
    }

    @Test
    private void searchInputTest(){
        String inputText = "Вестник";
        String expectedMessage = "РЕЗУЛЬТАТЫ ПОИСКА";
        String actualMessage = "";

        MonastyriSearchTestPage.inputTexttoSearchBox(inputText);
        MonastyriSearchTestPage.clickButtonSearch();
        actualMessage = MonastyriSearchTestPage.readMessage();

        Assert.assertTrue(
                actualMessage.contains(expectedMessage),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualMessage,
                        expectedMessage
                )
        );
    }

    @Test
    private void navigateHomeButtonTest(){
       String expectedUrl = "https://www.orthodoxy.lt/";
       String actualUrl = "";

       MonastyriSearchTestPage.clickButtonNavigateHome();
        actualUrl = MonastyriSearchTestPage.readCurrentUrl();
        Assert.assertTrue(actualUrl.equals(expectedUrl),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualUrl,
                        expectedUrl
                )
        );

    }
}
