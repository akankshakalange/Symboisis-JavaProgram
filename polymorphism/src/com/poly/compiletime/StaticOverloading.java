package com.poly.compiletime;

public class StaticOverloading {
	
	public static void m1() {
		System.out.println("With no parameter");
	}
	public static void m1(int a) {
		System.out.println("with int parameter");
	}
	public static void m1(String a) {
		System.out.println("with string parameter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticOverloading.m1();
		StaticOverloading.m1(10);
		StaticOverloading.m1("kbp");
		
		
	}

}
