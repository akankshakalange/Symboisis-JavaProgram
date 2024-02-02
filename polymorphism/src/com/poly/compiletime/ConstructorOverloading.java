package com.poly.compiletime;

public class ConstructorOverloading {

	ConstructorOverloading(){
		System.out.println("default");
	}
	ConstructorOverloading(int a){
		System.out.println("with int parameter");
	}
	ConstructorOverloading(String a){
		System.out.println("With string parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading obj = new ConstructorOverloading("kbp");
	}

}
