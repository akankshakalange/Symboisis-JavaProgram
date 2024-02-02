package com.edu.abstractClass;

public  class department extends College {

	@Override
	public void getClasses() {
		// TODO Auto-generated method stub
		System.out.println("FY");
	}
	public static void main(String args[]) {
		department dep=new department();
		dep.getClasses();
	}

}
