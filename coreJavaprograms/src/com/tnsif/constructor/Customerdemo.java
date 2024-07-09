package com.tnsif.constructor;

import java.util.Scanner;

public class Customerdemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
			
		System.out.println("Enter your cid");
		int no= sc.nextInt();
		
		System.out.println("Enter your address");
		String address = sc.next();
		
		Customer c = new Customer();
		c.setCname(name);
		c.setNo(no);
		c.setCaddress(address);
		
		System.out.println(c);
		
		boolean out= c instanceof Customer;
		System.out.println(out);
		
	}
		
		
	}


