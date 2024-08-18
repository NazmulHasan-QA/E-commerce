package Object;

import org.openqa.selenium.By;

public class AutoMationPraticeSearchObject {
    public static By searchField = By.xpath("//input[@id='search_query_top']");
    public static By searchResult = By.cssSelector("\"li[class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line'] div[class='right-block'] a[title='Printed Dress']\"");
    public static By message = By.xpath("//p[contains(.,'No results were found for your search \"#4$&+\"')]");
    public static By alertWarning = By.xpath("//p[@class='alert alert-warning']");
    public static String validSearchData="Printed Summer Dress";
    public static String InValidSearchData="#4$&+";
}
