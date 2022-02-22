package com.dio.base;

public class Order {
	
	private final String code;
	private final double totalValue;
	
	public Order (String code, double totalValue) {
		this.code = code;
		this.totalValue = totalValue;
	}

	public double calculateFee () {
		if (totalValue > 100) {
			return totalValue * 5;
		} else {
			return totalValue;
		}
	}

}