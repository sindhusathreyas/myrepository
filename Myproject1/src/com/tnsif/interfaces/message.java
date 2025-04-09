package com.tnsif.interfaces;
public class message {
  public static void main(String[] args) {
	  Payment creditcard = new Creditcard("123456");
		creditcard.process(2000);
		
		Payment upi = new UPI("123456@ybl");
		upi.process(1000);
		
		Payment debitcard = new Debitcard("234561762");
		debitcard.process(3000);

	}	  
}
