package com.nt.beans;

public class PayTM implements Payment {
	
	public PayTM() {
	 System.out.println("PayTM::0-param constructor");
	}
	
	@Override
	public final String onlinePayment(int orderid) {
		return "payment made from  PayTM having "+orderid+"\n";
	}

}
