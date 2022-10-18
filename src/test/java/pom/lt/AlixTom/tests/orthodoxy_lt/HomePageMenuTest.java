package pom.lt.AlixTom.tests.orthodoxy_lt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.lt.AlixTom.pages.orthodoxy_lt.HomePageMenuPage;
import pom.lt.AlixTom.tests.TestBase;

public class HomePageMenuTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePageMenuPage.open("https://www.orthodoxy.lt/");

    }
    @DataProvider(name = "menueItems", parallel = true)
    public Object[][] menueItemsDataProvider() {
        return new Object[][]{
                {"ПРАВОСЛАВНАЯ ЦЕРКОВЬ В ЛИТВЕ", 1},
                {"НОВОСТИ ЕПАРХИИ / ARKIVYSKUPIJOS NAUJIENOS", 2},
                {"БЛАГОЧИНИЯ", 3},
                {"МОНАСТЫРИ", 4},
                {"ВЕСТНИК", 5},
                {"МЕДИАТЕКА", 6},
                {"КОНТАКТЫ", 7},
                {"ГАЗЕТА «ПРАВОСЛАВНАЯ ЛИТВА»", 8},
        };
    }
    @Test (dataProvider = "menueItems")
    private void testMenu(String text, Integer key) {
        String expectedMessage = text;
        String actualMessage = "";
        HomePageMenuPage.clickMenuButtonToOpenPage(key);
        actualMessage = HomePageMenuPage.readMessage(key);

        Assert.assertTrue(
                actualMessage.equals(expectedMessage),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualMessage,
                        expectedMessage
                )
        );

    }
}
