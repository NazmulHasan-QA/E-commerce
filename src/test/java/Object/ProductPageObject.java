package Object;

import org.openqa.selenium.By;

public class ProductPageObject {
    public static By plusIcon = By.xpath("//div[@id='categories_block_left']//li[1]//span[1]");
    public static By women = By.xpath("//a[.='Women']");
    public static By minusIcon = By.cssSelector("div[class='block_content'] span[class='grower OPEN']");
    public static By dropDownButton = By.id("selectProductSort");
    public static By filterCheckBox = By.xpath("//input[@id='layered_category_4']");
    public static By filteredMessage = By.xpath("//li[contains(normalize-space(),'Categories: Tops')]");
    public static By sizeSelecting = By.xpath("//input[@value='1_1']");
    public static By filterEnableMessage = By.xpath("//span[@style='float: none;']");
    public static By iconRemove = By.xpath("//i[@class='icon-remove']");
    public static By selectingProductBeigiColor = By.id("layered_id_attribute_group_7");
    public static By beigiColorMessage = By.xpath("//li[contains(.,'Color: Beige')]");
    public static By selectingBlackColour = By.xpath("//input[@data-rel='11_3']");
    public static By blackColourMessaage = By.xpath("//li[contains(.,'Color: Black')]");
    public static By clickOnProduct = By.xpath("//a[normalize-space()='Blouse']");
    public static By colourPick = By.xpath("//a[@class='color_pick']");
    public static By newImage = By.xpath("//img[@id='bigpic']");
    public static By productIncreaseButton = By.xpath("//i[contains(@class,'icon-plus')]");
    public static By productDecreaseButton = By.xpath("//i[contains(@class,'icon-minus')]");
    public static By productName = By.xpath("//h1[.='Blouse']");
    public static By productCondition = By.xpath("//span[.='New product']");
    public static By fullDetails = By.cssSelector("div[id='short_description_content'] p");


}
