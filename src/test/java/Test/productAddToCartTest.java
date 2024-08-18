package Test;

import Pages.ProductPage;
import Pages.productAddToCart;
import org.testng.annotations.Test;

public class productAddToCartTest extends Base {
    productAddToCart
    cartObject=new productAddToCart();
    ProductPage
            productObject=new ProductPage();
    
            @Test
    public void cartFunctionTest()
            {
                productObject.productDetails(driver);
                cartObject.addingToCart(driver);


            }


}
