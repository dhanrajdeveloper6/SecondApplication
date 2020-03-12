package com.nt.beans;

public class PhonePy implements Payment {

	public PhonePy() {
		System.out.println("PhonePay:: 0-param constructor");
		
	}
	
	@Override
	public final String onlinePayment(int orderid) {
		return "payment made from  phonepay having "+orderid+"\n";
	}
}
