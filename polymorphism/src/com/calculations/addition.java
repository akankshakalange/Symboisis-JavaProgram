package com.calculations;

import java.util.Scanner;

public class addition {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("Addition is:"+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition a1=new addition();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st num:");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd num");
		int num2=sc.nextInt();
		a1.add(num1, num2);
	}

}
