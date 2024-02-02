package com.poly.compiletime;
class parent{
	void m1() {
		System.out.println("in parent");
	}
}
class child extends parent{
	void m1(String a) {
		System.out.println("in child ");
	}
}
public class Inheritancethrough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj=new child();
		obj.m1();
		obj.m1("kbp");
	}

}
