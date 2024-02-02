package com.interfaceExample;

import java.util.Scanner;

public class Test {
	static Scanner sc =new Scanner(System.in);
public static void getMobiles() {
	System.out.println("Press 1 for Iphone \n Press 2 for Samsung");
	int ch =sc.nextInt();
	switch(ch) {
	case 1:
		Iphone obj=new Iphone();
		System.out.println("name \t id\t category\t price");
		System.out.println(obj.getName()+"\t"+obj.getProductId()+"\t"+obj.getCategory()+"\t"+obj.getPrice());
		break;
	case 2:
		Samsung obj1=new Samsung();
		System.out.println(obj1.getName()+"\t"+obj1.getProductId()+"\t"+obj1.getCategory()+"\t"+obj1.getPrice());
		break;
	}

}
public static void getTv() {
	System.out.println("Press 1 for LG \n Press 2 for ONIDA");
	int ch =sc.nextInt();
	switch(ch) {
	case 1:
		LG obj=new LG();
		System.out.println("name \t id\t category\t price");
		System.out.println(obj.getName()+"\t"+obj.getProductId()+"\t"+obj.getCategory()+"\t"+obj.getPrice());
		break;
	case 2:
		Onida obj1=new Onida();
		System.out.println("name \t id\t category\t price");
		System.out.println(obj1.getName()+"\t"+obj1.getProductId()+"\t"+obj1.getCategory()+"\t"+obj1.getPrice());
		
		break;
	}
}
	public static void getAc() {
		System.out.println("Press 1 for Ac1 \n Press 2 for Ac2");
		int ch =sc.nextInt();
		switch(ch) {
		case 1:
			Ac1 obj=new Ac1();
			System.out.println("name \t id\t category\t price");
			System.out.println(obj.getName()+"\t"+obj.getProductId()+"\t"+obj.getCategory()+"\t"+obj.getPrice());
			break;
		case 2:
			Ac2 obj1=new Ac2();
			System.out.println("name \t id\t category\t price");
			System.out.println(obj1.getName()+"\t"+obj1.getProductId()+"\t"+obj1.getCategory()+"\t"+obj1.getPrice());
			
			break;
		}
}
}

