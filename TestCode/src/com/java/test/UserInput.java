package com.java.test;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		System.out.println("Enter your input");
		
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=a+b;
		System.out.println(c);
		
		
		
	}
	
}
