package Pages;

import Library.CommonMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static Object.AutoMationPraticeSearchObject.*;


public class AutomationPracticeSearchField {





    public void testSearchWithValidData(WebDriver driver) {
//Test with valid search data
        CommonMethod.sendData(searchField, driver, validSearchData);
        CommonMethod.pressEnter(searchField, driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        CommonMethod.findelement(searchField, driver);
        assert CommonMethod.gettingPageSource(driver).contains(validSearchData) : "Search results not found for 'Printed Summer Dress'";
    }
      //  Test with invalid search data
        public void testSearchWithInvalidData(WebDriver driver) {
            CommonMethod.Clear(searchField, driver);
            CommonMethod.sendData(searchField, driver, InValidSearchData);
            CommonMethod.pressEnter(searchField, driver);

        }
//Test with blank search field
public void testSearchWithBlankData(WebDriver driver)
{
        CommonMethod.Clear(searchField,driver);
        CommonMethod.sendData(searchField,driver,"    ");
        CommonMethod.pressEnter(searchField,driver);
        Assert.assertTrue(driver.findElement(alertWarning).isDisplayed(),"Search result found for search ");


    }

}
