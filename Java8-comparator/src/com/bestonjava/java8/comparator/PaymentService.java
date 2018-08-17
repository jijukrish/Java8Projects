package com.bestonjava.java8.comparator;

public interface PaymentService {
	double discount();
	default double calculateOrder(double orderPrice){
		return orderPrice -(orderPrice*discount());
	}
}
