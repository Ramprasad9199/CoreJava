package com.tnsif.scannerclass;
import java.util.Scanner;

public class Scannerexample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your name");
		String name = sc.next();
		
		System.out.println("enter your rollnumber");
		int roll = sc.nextInt();
		
		System.out.println("your name is : "+name+"\nyour roll number is : "+roll);
		
	}

}
