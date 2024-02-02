package com.poly;
//static method cannot be overriden
class first{
	public static void m1() {
		System.out.println("M1:first");
	}
}

class second{
	public static void m1(){
		System.out.println("M1:second");
	}
}
public class StaticMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first.m1();
		second.m1();
	//	first f=new first();// static method called by non-static way
	//	f.m1();
	}
	

}
