package com.nt.beans;

public class GooglePay implements Payment {

	public GooglePay() {
		System.out.println("Google-pay::0-param constructor");
	}
	
	@Override
	public final String onlinePayment(int orderid) {
		return "payment made from googlepay having id "+orderid+"\n";
	}
}
