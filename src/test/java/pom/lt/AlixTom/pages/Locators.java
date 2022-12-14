package pom.lt.AlixTom.pages;

import org.openqa.selenium.By;

public class Locators {

public static class Orthodoxy_lt{

    public static class MenuElements{
        public static By paragraph01 = new By.ByXPath("//article[@id='header_inner_article']/h2");
        public static By paragraph07 = new By.ByXPath("//div[@class='low-level-content']/h2");

        public static By menuButton01 = new By.ByXPath("(//nav[@id='top-nav']//li)[1]");
        public static By menuButton02 = new By.ByXPath("(//nav[@id='top-nav']//li)[2]");
        public static By menuButton03 = new By.ByXPath("(//nav[@id='top-nav']//li)[3]");
        public static By menuButton04 = new By.ByXPath("(//nav[@id='top-nav']//li)[4]");
        public static By menuButton05 = new By.ByXPath("(//nav[@id='top-nav']//li)[5]");
        public static By menuButton06 = new By.ByXPath("(//nav[@id='top-nav']//li)[6]");
        public static By menuButton07 = new By.ByXPath("(//nav[@id='top-nav']//li)[7]");
        public static By menuButton08 = new By.ByXPath("(//nav[@id='top-nav']//li)[8]");

    }

    public static class TextBox{
        public static By inputContainer01 = By.xpath("//input[@id='filter_from_date']");
        public static By inputContainer02 = By.xpath("//input[@id='filter_until_date']");
        public static By paragraphMessage = By.xpath("//div[@id='filteringMessage']");
        public static By inputSearchContainer = By.xpath("//input[@id = 'searchrequest']");
        public static By paragraphSearch = By.xpath("//div[@id='searchcontent']/div[1]");
    }
    public static class Buttons {

        public static By buttonFilter = By.xpath("//a[@id='start_filtering']");
        public static By buttonClear = By.xpath("//div[@class = 'filter-buttons']/span/a[2]");
        public static By buttonSearch = By.xpath("//*[@id='startsearch']/span/span");

        public static By buttonNavigateHome = By.xpath("//*[@id='top-nav']//h2");
    }

}

}
