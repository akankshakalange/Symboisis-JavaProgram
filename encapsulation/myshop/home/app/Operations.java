package com.myshop.home.app;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.myshop.home.Appliances;

public class Operations {
	static Scanner sc=new Scanner(System.in);
	 static Appliances ap=new Appliances();
	public void setData() {
		
		System.out.println("Enter product id");
		int id=sc.nextInt();
		ap.setProductId(id);
		System.err.println("Enter product name");
		ap.setProductName(sc.next());
		System.out.println("Enter product price");
		double price=sc.nextDouble();
		double gstPrice= price+((price*18)/100);
		
		ap.setPrice(price);
		ap.setGst(gstPrice);
		
		
	}
	public void getData() {
		System.out.println("  --------Product info------------- "  );
		//double gst=ap.getPrice()+18;
		System.out.println("product id is:"+ap.getProductId()+"\n"+"product price is:"+ap.getPrice()+"\n"+"price with gst:"+ap.getGst()+"\n"+"product name is:"+ap.getProductName());
		System.out.println("---------Thank You-------------");
		
	}
	public void updateData() {
		System.out.println("press 1 for update id \n press 2 for update price \n press 3 for update name");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter new product id");
			ap.setProductId(sc.nextInt());
			System.out.println("Product id updated at:"+ LocalDateTime.now());
			break;
		case 2:
			System.out.println("Enter new product price");
			ap.setPrice(sc.nextDouble());
			System.out.println("Product price updated at:"+ LocalDateTime.now());
			break;
		case 3:
			System.out.println("Enter new product name");
			ap.setProductName(sc.next());
			System.out.println("Product name updated at:"+ LocalDateTime.now());
			break;
		}
	}
}
