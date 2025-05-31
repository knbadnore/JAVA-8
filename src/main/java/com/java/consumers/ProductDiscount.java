package com.java.consumers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import com.java.consumers.pojo.Products;

public class ProductDiscount {

	public static void main(String[] args) {

		List<Products> productsList = Arrays.asList(new Products("Laptop", 1200.00), new Products("Smartphone", 800.00),
				new Products("Tablet", 400.00));
		Consumer<Products> printOrignial = p -> System.out
				.println("NAME :" + p.name + " PRICE :" + String.format("%.2f", p.price));

		Consumer<Products> aaplyDiscount = p -> p.applyDiscount(10);
		Consumer<Products> discountedPrice = p -> System.out
				.println("NAME :" + p.name + " PRICE :" + String.format("%.2f", p.price));

		Consumer<Products> fullProcess = printOrignial.andThen(aaplyDiscount).andThen(discountedPrice);
		productsList.forEach(fullProcess);
	}

}
