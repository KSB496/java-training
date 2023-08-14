package com.factory;

import com.vending.VendingMachine;
import com.vending.VendingMachineImpl;

public class VendingMachineFactory {

	public static VendingMachine createVendingMachine() {
		return new VendingMachineImpl();
	}
}
