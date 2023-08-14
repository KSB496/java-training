package shoppingcart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingTest {

	private ShoppingCart cart;
	private Product book1;
	private Product book2;
	
	@BeforeEach
	public void callBefore() {
		cart = new ShoppingCart();
		book1 = new Product("Java" , 120);
		book2 = new Product("C++" , 20);
		cart.addItem(book1);
		cart.addItem(book2);		
	}
	
	@Test
	void testSize() {
		Product book3 = new Product("Python" , 10);
		cart.addItem(book3);
		assertEquals(3,cart.getItemCount());
		double gb = book1.getPrice()+book2.getPrice()+book3.getPrice();
		assertEquals(gb,cart.getBalance());		
	}
	
	@Test
	void testremove() throws ProductNotFoundException {
		cart.removeItem(book1);
		assertEquals(1,cart.getItemCount());
	}
	
	void testempty() {
		cart.empty();
		assertEquals(0,cart.getBalance());
		assertEquals(0,cart.getItemCount());
	}

}
