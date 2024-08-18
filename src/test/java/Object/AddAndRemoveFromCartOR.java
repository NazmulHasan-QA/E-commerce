package Object;

import org.openqa.selenium.By;

public class AddAndRemoveFromCartOR {
    public static By addToCartButton = By.xpath("//span[.='Add to cart']");
    public static By confirmationMessage = By.xpath("//h2[contains(.,'Product successfully added to your shopping cart')]");
    public static By crossIcon = By.xpath("//span[@class='cross']");
    public static By cart = By.xpath("//b[.='Cart']");
    public static By removeFromCartIcon=By.xpath("//i[contains(@class,'icon-trash')]");
    public static By cartEmptyMessage=By.xpath("//p[.='Your shopping cart is empty.']");
    public static By women = By.xpath("//a[.='Women']");
    public static By clickOnProduct = By.xpath("//a[normalize-space()='Blouse']");
    public static By colourPick = By.xpath("//a[@class='color_pick']");
}
