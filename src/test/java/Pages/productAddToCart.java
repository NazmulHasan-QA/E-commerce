package Pages;

import Library.CommonMethod;
import org.openqa.selenium.WebDriver;

import static Object.AddAndRemoveFromCartOR.*;
import static org.testng.Assert.assertTrue;

public class productAddToCart {

    public void addingToCart(WebDriver driver) {
        CommonMethod.click(addToCartButton, driver);
        CommonMethod.waitForElementVisibility(confirmationMessage, driver);
        assertTrue(CommonMethod.messageDisply(confirmationMessage, driver), "Product is not added to cart");
        CommonMethod.click(crossIcon, driver);
        CommonMethod.click(cart, driver);
        CommonMethod.waitForElementVisibility(removeFromCartIcon, driver);
        CommonMethod.click(removeFromCartIcon, driver);
        CommonMethod.waitForElementVisibility(cartEmptyMessage, driver);
        assertTrue(CommonMethod.messageDisply(cartEmptyMessage, driver), "Product cannot remove from cart");
        CommonMethod.click(women, driver);
        CommonMethod.click(clickOnProduct, driver);
        CommonMethod.click(colourPick, driver);
        CommonMethod.click(addToCartButton, driver);

    }
}
