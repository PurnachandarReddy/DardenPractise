package com.practise;

class OverloadingMethods{
	static int add(int a, int b) {
		return a+b;
		
	}
	static int add(int a, int b, int c) {
		return a+b+c;
		
	}
}
public class NethodOverloading {

	public static void Main(String args[]) {
		System.out.println(OverloadingMethods.add(10,20));
		System.out.println(OverloadingMethods.add(10,20,30));
	}
}
