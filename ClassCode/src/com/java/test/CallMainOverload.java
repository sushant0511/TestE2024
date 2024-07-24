package com.java.test;

public class CallMainOverload {

	public static void main(String[] args) {
		// create object 
		TestOverLoad overLoad=new TestOverLoad();
		overLoad.add();
		overLoad.add(12);
		overLoad.add(12,78);
		overLoad.add('h');
	}
	
}
