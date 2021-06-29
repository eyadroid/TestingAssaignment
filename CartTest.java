import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.mhe.shopping.ShoppingCart;
import com.mhe.shopping.Product;

public class CartTest {
   ShoppingCart cart = new ShoppingCart();

   @Test
   public void testAddToCart() {

      // add item to cart
      cart.addToCart(new Product(
         "test1",
         "Smart Watch",
         200,
         1
      ), 1);

      // items must be 1
      assertEquals(cart.getItems().length, 1);
   }

   @Test
   public void testRemoveFromCart() {
      Product product1 =new Product(
         "test1",
         "Smart Watch",
         200,
         1
      );
      Product product2 =new Product(
         "test2",
         "Smart Watch",
         200,
         1
      );

      cart.addToCart(product1, 1);
      cart.addToCart(product2, 1);

      cart.removeFromCart(product1);
      System.out.println("it is: " +  cart.getItems().length);
      assertEquals(cart.getItems().length, 1);
      cart.removeFromCart(product2);
      assertEquals(cart.getItems().length, 0);
   }
}
