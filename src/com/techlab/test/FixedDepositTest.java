package com.techlab.test;

import com.techlab.model.DiwaliRate;
import com.techlab.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		DiwaliRate d = new DiwaliRate();
		FixedDeposit fd = new FixedDeposit(101, "Steve", 5000, 6000, 3, d);
		System.out.println("Simple Interest for Diwali: "+fd.calculateSI());
	}

}
