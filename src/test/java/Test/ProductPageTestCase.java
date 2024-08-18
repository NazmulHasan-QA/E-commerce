package Test;

import Pages.ProductPage;
import org.testng.annotations.Test;

public class ProductPageTestCase extends Base{
    ProductPage
            productObject=new ProductPage();
    @Test
    public void ProductPageTest()
    {
        productObject.productDetails(driver);
    }
}
