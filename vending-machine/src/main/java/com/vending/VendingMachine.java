package com.vending;

import java.util.List;

public interface VendingMachine {
	
	public long selectedItemAndGetPrice(Item item);
	public void insertCoin(Coin coin);
	public List<Coin> refund();
	public void reset();
	public Bucket<Item,List<Coin>> collectItemAndChange();

}
