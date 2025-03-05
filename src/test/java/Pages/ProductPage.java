package Pages;

import Library.CommonMethod;
import org.openqa.selenium.WebDriver;

import static Object.ProductPageObject.*;
import static org.testng.Assert.assertTrue;

public class ProductPage {

    public void productDetails(WebDriver driver) {
        CommonMethod.click(women, driver);
        assertTrue(CommonMethod.ButtonEnableOrNot(plusIcon, driver), "Button is not enable");
        CommonMethod.click(plusIcon, driver);
        CommonMethod.click(minusIcon, driver);
        
        assertTrue(CommonMethod.ButtonEnableOrNot(dropDownButton, driver));
        CommonMethod.click(dropDownButton, driver);
        CommonMethod.arrowDownKey(dropDownButton, driver);
        //  CommonMethod.unLocatedElementArrowDownKey(dropDownButton,driver);
        CommonMethod.pressEnter(dropDownButton, driver);
        CommonMethod.click(filterCheckBox, driver);
        CommonMethod.waitForElementVisibility(filteredMessage, driver);
        assertTrue(CommonMethod.messageDisply(filteredMessage, driver), "Product can not be sorted");
        CommonMethod.click(iconRemove, driver);
        CommonMethod.click(sizeSelecting, driver);
        assertTrue(CommonMethod.messageDisply(filterEnableMessage, driver), "Size not selected");
        CommonMethod.click(selectingProductBeigiColor, driver);
        assertTrue(CommonMethod.messageDisply(beigiColorMessage, driver), "Colour filter not active");
        CommonMethod.click(selectingBlackColour, driver);
        assertTrue(CommonMethod.messageDisply(blackColourMessaage, driver), "Colour filter is not active");
        CommonMethod.click(clickOnProduct, driver);
        assertTrue(CommonMethod.verifyElementsPesent(colourPick, driver), "Not navigate to product details page");
        CommonMethod.click(colourPick, driver);
        assertTrue(CommonMethod.verifyElementsPesent(newImage, driver), "No change in image happend");
        assertTrue(CommonMethod.ButtonEnableOrNot(productIncreaseButton, driver), "Is not enable");
        CommonMethod.doubleClick(productIncreaseButton, driver);
        assertTrue(CommonMethod.ButtonEnableOrNot(productDecreaseButton, driver), "Is not enable");
        CommonMethod.click(productDecreaseButton, driver);
        System.out.println("Product details:");
        CommonMethod.printElementHtml(productName,driver);
        CommonMethod.printElementHtml(productCondition,driver);
        CommonMethod.printElementHtml(fullDetails,driver);


    }


}
