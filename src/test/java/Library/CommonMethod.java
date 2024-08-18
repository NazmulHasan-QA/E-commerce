package Library;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class CommonMethod {
        public static void click(By path, WebDriver driver) {
            WebElement element = findelement(path, driver);
            element.click();

        }

        public static void sendData(By path, WebDriver driver, String Text) {
            WebElement element = findelement(path, driver);
            element.sendKeys(Text);
        }



        public static WebElement findelement(By path, WebDriver driver) {
            WebElement elements = driver.findElement(path);
            return elements;
        }


        public static boolean verifyElementsPesent(By path, WebDriver driver) {
            WebElement element = findelement(path, driver);
            return element.isDisplayed();

        }



        public static boolean ButtonEnableOrNot(By path, WebDriver driver)
        {
            WebElement element = findelement(path, driver);
            return element.isEnabled();
        }


        public static String findCurrentURL(By path, WebDriver driver)
        {
            return driver.getCurrentUrl();
        }

        public static void hoverOverElement(By path, WebDriver driver) {
            Actions actions = new Actions(driver);
            WebElement element = driver.findElement(path);
            actions.moveToElement(element).perform();
        }

        public static void scrollIntoElement(By path, WebDriver driver) {
            WebElement el = findelement(path, driver);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
        }

        public static boolean verifyElementIsSelected(By path, WebDriver driver) {
            WebElement el = findelement(path, driver);
            boolean isSelected = el.isSelected();
            System.out.println("Element selected is : " + isSelected);
            return isSelected;
        }

        public static void Clear(By path, WebDriver driver) {
            WebElement element = findelement(path, driver);
            element.clear();
        }
        public static void pressEnter(By path, WebDriver driver)
        {
            WebElement element = findelement(path, driver);
            element.sendKeys(Keys.ENTER);
        }


        public static WebElement waitForElementVisibility(By path, WebDriver driver)
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed
            return wait.until(ExpectedConditions.visibilityOfElementLocated(path));
        }
        public static boolean messageDisply(By path, WebDriver driver)
        {
            WebElement element=findelement(path,driver);
           return element.isDisplayed();

        }
    public static void doubleClick(By path, WebDriver driver)
    {
        WebElement element = findelement(path, driver);
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
    }
    public static void arrowDownKey(By path,WebDriver driver)
    {
        WebElement element=findelement(path,driver);
        Actions actions =new Actions(driver);
        System.out.println("Performing arrow down key action on element: " + path.toString());
        actions.moveToElement(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
    }
    public static void unLocatedElementArrowDownKey(By path, WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.dispatchEvent(new KeyboardEvent('keydown', {'key': 'ArrowDown'}));");

    }
    public static void printElementHtml(By path, WebDriver driver) {
        WebElement element = driver.findElement(path);
        String elementHtml = element.getAttribute("outerHTML");
        System.out.println(elementHtml);
    }

    public static String generateRandomGmail() {
        String[] domains = {"@gmail.com"};
        String[] prefixes = {"random", "user", "test", "example", "demo", "temp"};

        Random random = new Random();
        String prefix = prefixes[random.nextInt(prefixes.length)];
        String domain = domains[random.nextInt(domains.length)];

        // Generating a random number between 1000 and 9999 for variation
        int randomNumber = 1000 + random.nextInt(9000);

        // Concatenating the prefix, random number, and domain to form the email address
        String emailAddress = prefix + randomNumber + domain;

        return emailAddress;
    }
    public static String gettingPageSource(WebDriver driver)
    {

       return driver.getPageSource();
    }




    }


