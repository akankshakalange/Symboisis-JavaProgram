package com.edu.finalUse;

public class FinalPrivate2 extends FinalPrivate {
	private void getname() {
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalPrivate2 ft=new FinalPrivate2();
	//	ft.getname();  //private methods are not visible to another class
	}

}
