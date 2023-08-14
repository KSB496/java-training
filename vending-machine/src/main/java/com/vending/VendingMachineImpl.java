package com.vending;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.exception.NotSuffChangeException;
import com.exception.NotfullPaidException;
import com.exception.SoldOutException;

public class VendingMachineImpl implements VendingMachine {

	private Inventory<Coin> cashInventory = new Inventory<Coin>();
	private Inventory<Item> itemInventory = new Inventory<Item>();
	
	//how much item we have selled today
	private long totalSales;
	
	private Item currentItem;
	private long currentBalance;
	
	public VendingMachineImpl() {
		initialize();
	}
	
	public void initialize() {
		//initialize machine with 5 coins of each denomination and 5 cans of each item
		
		for(Coin c : Coin.values()) {
			cashInventory.put(c, 5);
		}
		for(Item i : Item.values()) {
			itemInventory.put(i, 5);
		}
	}
	
	@Override
	public long selectedItemAndGetPrice(Item item) {
		// TODO Auto-generated method stub
		if(itemInventory.hasItem(item)) {
			currentItem = item;
			return currentItem.getPrice();
		}
		else {
			throw new SoldOutException("Item Sold Out.....Please buy another item...");
		}
	}

	@Override
	public void insertCoin(Coin coin) {
		// TODO Auto-generated method stub
		currentBalance = currentBalance + coin.getDenomination();
		cashInventory.add(coin);
		
	}

	@Override
	public List<Coin> refund() {
		// TODO Auto-generated method stub
		List<Coin> refund = getChange(currentBalance);
		updateCashInventory(refund);
		currentBalance = 0;
		currentItem = null;
		return refund;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		cashInventory.clear();
		itemInventory.clear();
		totalSales = 0;
		currentItem = null;
		currentBalance = 0;
	}

	@Override
	public Bucket<Item, List<Coin>> collectItemAndChange() {
		// TODO Auto-generated method stub
		Item item = collectItem();
		totalSales = totalSales + currentItem.getPrice();
		List<Coin> change = collectChange();
		return new Bucket<Item, List<Coin>>(item, change);
	}
	
	private List<Coin> collectChange() {
		// TODO Auto-generated method stub
		long changeAmount = currentBalance - currentItem.getPrice();
		List<Coin> change = getChange(changeAmount);
		updateCashInventory(change);
		currentBalance = 0;
		currentItem = null;
		return change;
	}

	private Item collectItem() throws NotSuffChangeException, NotfullPaidException {
		if(isFullPaid()) {
			if(hasSuffChange()) {
				itemInventory.deduct(currentItem);
				return currentItem;
			}
			throw new NotSuffChangeException("Not sufficient change in inventory");
		}
		long remainingBalance = currentItem.getPrice()-currentBalance;
		throw new NotfullPaidException("price not full paid",remainingBalance);
	}
	
	private boolean isFullPaid() {
		if(currentBalance >= currentItem.getPrice()) {
			return true;
		}
		return false;
	}
	
	private void printStats() {
		System.out.println("Total Sales : " + totalSales);
		System.out.println("Current Item Inventory : " + itemInventory);
		System.out.println("Current cash Inventory : " + cashInventory);
	}
	
	private boolean hasSuffChange() {
		return hasSufficientChangeForAmount(currentBalance - currentItem.getPrice());
	}
	
	private boolean hasSufficientChangeForAmount(long amount) {
		boolean hasChange = true;
		try {
			getChange(amount);
		}catch(NotSuffChangeException e) {
			return hasChange = false;
		}
		return hasChange;
	}
	
	private List<Coin> getChange(long amount) throws NotSuffChangeException {
		// TODO Auto-generated method stub
		//
		List<Coin> changes = Collections.EMPTY_LIST;
		if(amount>0) {
			changes = new ArrayList<Coin>();
			long balance = amount;
			while(balance > 0) {
				if(balance >= Coin.QUARTER.getDenomination() 
						&& cashInventory.hasItem(Coin.QUARTER)) {
					changes.add(Coin.QUARTER);
					balance = balance - Coin.QUARTER.getDenomination();
					continue;
				}else if(balance >= Coin.DIME.getDenomination() 
						&& cashInventory.hasItem(Coin.DIME)) {
					changes.add(Coin.DIME);
					balance = balance - Coin.DIME.getDenomination();
					continue;
				}else if(balance >= Coin.NICKLE.getDenomination() 
						&& cashInventory.hasItem(Coin.NICKLE)) {
					changes.add(Coin.NICKLE);
					balance = balance - Coin.NICKLE.getDenomination();
					continue;
				}else if(balance >= Coin.PENNY.getDenomination() 
						&& cashInventory.hasItem(Coin.PENNY)) {
					changes.add(Coin.PENNY);
					balance = balance - Coin.PENNY.getDenomination();
					continue;
				}else {
					throw new NotSuffChangeException("Not sufficient change, Please try another product..");
				}
			}
		}
		return changes;
		
	}

	private void updateCashInventory(List<Coin> change) {
		for(Coin c : change) {
			cashInventory.deduct(c);
		}
	}
	
	public long getTotalSales() {
		return totalSales;
	}

}
