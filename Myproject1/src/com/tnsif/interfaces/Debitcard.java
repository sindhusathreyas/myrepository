package com.tnsif.interfaces;
public class Debitcard implements Payment {
	private String cardNo;

	public Debitcard(String cardNo) {
		super();
		this.cardNo = cardNo;
	}

	@Override
	public void process(double amt) {
		System.out.println("Processing debit card payment of Rs. "+amt+" using Debit Card No.: "+cardNo);
		
	}
}


