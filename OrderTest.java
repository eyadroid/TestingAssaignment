import com.mhe.shopping.Delivery;
import com.mhe.shopping.Order;
import com.mhe.shopping.Payment;
import com.mhe.shopping.PaymentMethod;
import com.mhe.shopping.ShoppingCart;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class OrderTest {

    @Test
   public void testCancleOrder() {
        String orderId = orderFactory();
        Order.cancel(orderId);
        assertEquals("CANCELED", Order.getOrder(orderId).status);
   }
   
    @Test
   public void testChangeDeliveryLocation() {
          String orderId = orderFactory();
          Delivery newLocation = new Delivery("new", "Omdurman");
          Order.changeDeliveryLocation(orderId, newLocation);
          assertEquals(newLocation.id, Order.getOrder(orderId).deliveryLocation.id);
   }

   private String orderFactory() {
     ShoppingCart shoppingCart = new ShoppingCart();
     Delivery location = new Delivery("test", "Bahry");
     Payment payment = new Payment(shoppingCart, PaymentMethod.cash, "COMPLETED");
     return Order.placeOrder(shoppingCart, location, payment);
   }
}
