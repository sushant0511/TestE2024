package com.java.test;

public class MainCall {

	public static void main(String[] args) {

		CallNew call=new CallNew();
		System.out.println(call);
		call.callData();
		call=null;
		call.callData();
		System.out.println(call);
	}
}
class CallNew {

	public void callData()
	{
		System.out.println("Hi from Java by Callnew");
	}
	
}