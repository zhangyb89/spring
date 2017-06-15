package com;

public class XOR {

	public static void main(String[] args) {
		int a = 7;  
		System.out.println(a+"的二进制"+Integer.toBinaryString(a));
		//System.out.println("~"+a+"的二进制"+Integer.toBinaryString(~a));
		int c = 8;
		System.out.println(c+"的二进制"+Integer.toBinaryString(c));
		System.out.println("a 与 c 异或的结果是："+(a|c));
		
		int b = a|c;
		
		System.out.println("b^a == "+(b&a));
		
		System.out.println(Integer.toBinaryString(5));
	}
}
