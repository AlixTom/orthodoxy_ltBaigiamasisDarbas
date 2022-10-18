package pom.lt.AlixTom.tests.orthodoxy_lt;

import org.testng.annotations.BeforeMethod;
import pom.lt.AlixTom.pages.orthodoxy_lt.Orthodoxy_ltHomeMenuPage;
import pom.lt.AlixTom.tests.TestBase;

public class Orthodoxy_ltHomeMenuTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        Orthodoxy_ltHomeMenuPage.open("https://www.orthodoxy.lt/");

    }

}
