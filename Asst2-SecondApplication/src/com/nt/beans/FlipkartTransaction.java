package com.nt.beans;

import java.util.Random;

public class FlipkartTransaction {
	
	private Payment payNow;
	
	
	private FlipkartTransaction() {
		System.out.println("Flipkart transaction::0-param constructor");
	}
	
	public void setTransaction(Payment payNow) {
		this.payNow = payNow;
	}
	
	public int Trans(int amount) {
		//int amount = 1500;
		Random ran = new Random();
		int taxid = ran.nextInt(1000000);
		String status = payNow.onlinePayment(taxid);
		
		System.out.println(status+"Amount paid having transaction id "+taxid);
		return amount;
	}
	
	

}
