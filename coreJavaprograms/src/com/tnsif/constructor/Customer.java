package com.tnsif.constructor;

public class Customer {
	
	private String  cname;
	private int no;
	private String caddress;
	
	// default constructor
	public Customer() {
		
	}

	public Customer(String cname, int no, String caddress) {
		super();
		this.cname = cname;
		this.no = no;
		this.caddress = caddress;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", no=" + no + ", caddress=" + caddress + "]";
	}
	
	

	
	
	

}



