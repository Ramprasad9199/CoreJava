package com.tnsif.staticexample;

public class Demo1 {
	public static void main(String[] args) {
		Student.change();
		
		Student s1 = new Student(1, "RAM");
		Student s2 = new Student(2, "CHANDANA");
		Student s3 = new Student(3, "NANDHI");
		
		s1.display();
		s2.display();
		s3.display();
	}
}
