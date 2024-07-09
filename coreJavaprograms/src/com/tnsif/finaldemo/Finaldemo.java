package com.tnsif.finaldemo;

public final class Finaldemo {
	 
	 final int x = 10;
	 
	 static final int y; 
	 
	 final static void change() {
		 System.out.println("default");
	 }
	 static {
		 y = 9;
	 }
	
}
