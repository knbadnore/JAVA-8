package com.java.consumers.pojo;

public class Products {
	public String name;
	public double price;

	public Products(String name, double price) {

		this.name = name;
		this.price = price;
	}

	public void applyDiscount(double percentage) {
		this.price = this.price - (this.price * percentage / 100);
	}
}
