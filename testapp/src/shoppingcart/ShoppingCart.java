package shoppingcart;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {

	private ArrayList<Product> item;
	public ShoppingCart() {
		item = new ArrayList<Product>();
	}
	public double getBalance() {
		double balance = 0.00;
		for(Iterator i = item.iterator(); i.hasNext();) {
			Product item = (Product)i.next();
			balance += item.getPrice();
		}
		return balance;
	}
	public void addItem(Product pro) {
		item.add(pro);
	}
	public void removeItem(Product pro) throws ProductNotFoundException {
		if(!item.remove(pro)) {
			throw new ProductNotFoundException();
		}
	}
	public int getItemCount() {
		return item.size();
	}
	
	public void empty() {
		item.clear();
	}
}
