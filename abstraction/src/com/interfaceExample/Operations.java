package com.interfaceExample;

import java.util.Scanner;

public class Operations  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Test t1=new Test();
		while(true) {
			System.out.println("Press 1 for Mobiles\n Press 2 for Tv\n Press 3 for Ac");
			int ch=sc.nextInt();
		switch(ch) {
		case 1:
			t1.getMobiles();
			break;
		case 2:
			t1.getTv();
			break;
		case 3:
			t1.getAc();
			break;
		}
		System.out.println("Do you Want to continue if yes just enter 'yes' or not then press any key");
		String res=sc.next();
		if(!res.equalsIgnoreCase("Yes")) {
			break;
		}
		
		}
	}

	

}
