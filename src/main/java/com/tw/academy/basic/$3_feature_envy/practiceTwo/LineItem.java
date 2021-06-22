package com.tw.academy.basic.$3_feature_envy.practiceTwo;

public class LineItem {
	private final String description;
	private final double price;
	private final int quantity;

	public LineItem(String description, double p, int quantity) {
		super();
		this.description = description;
		this.price = p;
		this.quantity = quantity;
	}

	public double getTotalPrice(){
		return price * quantity;
	}
}