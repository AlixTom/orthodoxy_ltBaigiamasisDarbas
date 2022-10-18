package pom.lt.AlixTom.tests.orthodoxy_lt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.lt.AlixTom.pages.orthodoxy_lt.NovostiFilterPage;
import pom.lt.AlixTom.tests.TestBase;

public class NovostiFilterTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        NovostiFilterPage.open("https://www.orthodoxy.lt/novosti");
    }

    @Test
    private void testTextBoxFilter(){

        String boxFromInput = "2022-09-01";
        String boxUntillInput = "2022-10-18";
        String actualMessage = "";


        NovostiFilterPage.inputTexttoTextBox(boxFromInput, 1);
        NovostiFilterPage.inputTexttoTextBox(boxUntillInput, 2);
        NovostiFilterPage.clickButtonFilter();
        actualMessage = NovostiFilterPage.readMessage();
        Assert.assertTrue(
                actualMessage.contains(boxFromInput),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualMessage,
                        boxFromInput
                )
        );
        Assert.assertTrue(
                actualMessage.contains(boxUntillInput),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualMessage,
                        boxUntillInput
                )
        );

    }

    @Test
    private void testTextBoxClear(){
        String boxFromInput = "2022-09-01";
        String boxUntillInput = "2022-10-18";
        String actualMessage = "";

        NovostiFilterPage.inputTexttoTextBox(boxFromInput, 1);
        NovostiFilterPage.inputTexttoTextBox(boxUntillInput, 2);
        NovostiFilterPage.clickButtonFilter();
        actualMessage = NovostiFilterPage.readMessage();
        Assert.assertTrue(
                actualMessage.contains(boxFromInput),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualMessage,
                        boxFromInput
                )
        );
        NovostiFilterPage.clickButtonClear();
        boolean visibility = NovostiFilterPage.checkFieldVisibility();

        Assert.assertFalse (visibility);

    }

}
