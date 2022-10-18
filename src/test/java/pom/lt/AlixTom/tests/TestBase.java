package pom.lt.AlixTom.tests;

import pom.lt.AlixTom.pages.Common;
import pom.lt.AlixTom.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pom.lt.AlixTom.utils.TestListener;

@Listeners(TestListener.class)
public class TestBase {

    @BeforeMethod
    public void setUp() {
        Common.setUpDriver();
    }

//    @AfterMethod
//    public void tearDown() {
      //       Common.sleep(3000);
//        Common.closeDriver();
//    }

}
