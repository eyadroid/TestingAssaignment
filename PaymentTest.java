import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.mhe.shopping.Payment;
import com.mhe.shopping.PaymentMethod;
import com.mhe.shopping.Product;
import com.mhe.shopping.ShoppingCart;

public class PaymentTest {
    @Test
    public void testPay() {
        ShoppingCart shoppingCart = shoppingCartFactory();
        Payment payment = new Payment(shoppingCart, PaymentMethod.mbok);
        assertTrue( !(payment.pay(shoppingCart.total()/2)));
        assertTrue( (payment.pay(shoppingCart.total()/2)));
    }
    
    @Test
    public void testPaymentCanel() {
        ShoppingCart shoppingCart = shoppingCartFactory();
        Payment payment = new Payment(shoppingCart, PaymentMethod.mbok);
        payment.cancle();
        assertEquals("CANCELED", payment.status);
    }

    private ShoppingCart shoppingCartFactory() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addToCart(Product.products[0], 1);
        return shoppingCart;
    }
}
