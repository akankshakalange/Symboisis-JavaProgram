package com.poly.compiletime;

public class compiletimePolymorphism {
	public void m1() {
		System.out.println("no parameters");
	}
	public void m1(int a) {
		System.out.println("with integer parameter");
	}
	public void m1(String a) {
		System.out.println("with String parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compiletimePolymorphism obj=new compiletimePolymorphism();
		obj.m1();
		obj.m1( 10);
		obj.m1("akanksha");
	}

}
