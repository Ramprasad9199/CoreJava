package com.tnsif.constructor;

public class Thisdemo {
	int rollno;
	String name;
	
	Thisdemo(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
		
		System.out.println(rollno);
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		Thisdemo i = new Thisdemo(23, "RAM");
	
}
}
