package com.vending;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.exception.NotSuffChangeException;
import com.exception.SoldOutException;
import com.factory.VendingMachineFactory;

public class VendingTest {

	private static VendingMachine vm;
	
	@BeforeClass
	public static void init() {
		vm = VendingMachineFactory.createVendingMachine();
	}
	
	@AfterClass
	public static void closeRes() {
		vm = null;
	}
	
	@Test
	public void testBuyItemWithExactPrice() {
		long price = vm.selectedItemAndGetPrice(Item.COKE);
		assertEquals(Item.COKE.getPrice(),price);
		vm.insertCoin(Coin.QUARTER);
		Bucket<Item, List<Coin>> bucket = vm.collectItemAndChange();
		Item item = bucket.getFirst();
		List<Coin> change = bucket.getSecond();
		assertEquals(Item.COKE, item);
		assertTrue(change.isEmpty());
	}
	
	@Test
	public void testBuyWithMorePrice() {
		long price = vm.selectedItemAndGetPrice(Item.SODA);
		assertEquals(Item.SODA.getPrice(),price);
		vm.insertCoin(Coin.QUARTER);
		vm.insertCoin(Coin.QUARTER);
		Bucket<Item, List<Coin>> bucket = vm.collectItemAndChange();
		Item item = bucket.getFirst();
		List<Coin> change = bucket.getSecond();
		assertEquals(Item.SODA,item);
		assertTrue(!change.isEmpty());
		assertEquals(50-Item.SODA.getPrice(),getTotal(change));
	}

	private long getTotal(List<Coin> change) {
		// TODO Auto-generated method stub
		long total = 0;
		for(Coin c : change) {
			total = total + c.getDenomination();
		}
		return total;
	}
	
	@Test(expected = SoldOutException.class)
	public void testReset() {
		VendingMachine machine = VendingMachineFactory.createVendingMachine();
		machine.reset();
		machine.selectedItemAndGetPrice(Item.COKE);
	}
	
	@Test(expected = NotSuffChangeException.class)
	public void testNotStuffChange() {
		for(int i=0;i<5;i++) {
			vm.selectedItemAndGetPrice(Item.SODA);
			vm.insertCoin(Coin.QUARTER);
			vm.insertCoin(Coin.QUARTER);
			vm.collectItemAndChange();
			vm.selectedItemAndGetPrice(Item.PEPSI);
			vm.insertCoin(Coin.QUARTER);
			vm.insertCoin(Coin.QUARTER);
			vm.collectItemAndChange();
			/*vm.selectedItemAndGetPrice(Item.COKE);
			vm.insertCoin(Coin.QUARTER);
			//insertCoin(Coin.QUARTER);
			vm.collectItemAndChange();
			vm.selectedItemAndGetPrice(Item.SODA);
			vm.insertCoin(Coin.QUARTER);
			vm.insertCoin(Coin.QUARTER);
			vm.collectItemAndChange();
			vm.selectedItemAndGetPrice(Item.COKE);
			vm.insertCoin(Coin.QUARTER);
			//vm.insertCoin(Coin.QUARTER);
			vm.collectItemAndChange();*/
			
		}
	}
	
}
