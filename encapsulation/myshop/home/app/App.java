package com.myshop.home.app;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Operations op=new Operations();
		while(true) {
		System.out.println("Press 1 for add data \npress 2 for see data \npress 3 for update data");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			op.setData();
			break;
		case 2:
			op.getData();
			break;
		case 3:
			op.updateData();
		}
		}
		
	}
}
