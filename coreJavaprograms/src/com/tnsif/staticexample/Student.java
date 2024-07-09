package com.tnsif.staticexample;

public class Student {
	int rollno;
	String name;
	 
	static String collage = "Sri indu";
	
	static void change() {
		collage = "IIT";

	}
	Student(int r, String n){
		rollno = r;
		name = n;
		
	}
	void display() {
		System.out.println(rollno+" "+name+" "+collage);
	}
}
