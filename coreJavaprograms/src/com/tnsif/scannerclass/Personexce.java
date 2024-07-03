package com.tnsif.scannerclass;

import java.util.Scanner;

public class Personexce {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your income");
		int income = sc.nextInt();
		
		Person_income pp = new Person_income();
		pp.setName(name);
		pp.setIncome(income);
		
		Taxcalculation t = new Taxcalculation();
		
		t.calculation(pp);
		
		System.out.println("After modification");
		System.out.println(pp);
	}
}
