package test.java.com.bestonjava.java8.comparator;

import org.junit.jupiter.api.Test;

import com.bestonjava.java8.comparator.MoipPaymentService;
import com.bestonjava.java8.comparator.PayPalPaymentService;
import com.bestonjava.java8.comparator.PaymentService;

import junit.framework.TestCase;

public class PaymentServiceTest extends TestCase{
	@Test
	public void testshouldCalculateOrderPriceUsingPayPalService(){
		PaymentService payment = new PayPalPaymentService();
		double orderprice =100.0;
		double finalPrice = payment.calculateOrder(orderprice);;
		
		assertEquals(finalPrice,80.0);
	}

	@Test
	public void testshouldCalculateOrderPriceUsingMoipPaymentService(){
		PaymentService payment = new MoipPaymentService();
		double orderprice =100.00;
		double finalPrice = payment.calculateOrder(orderprice);
		assertEquals(finalPrice,90.0);
	}
}
