package com.java.eight.features;

public class Letter implements Addressable {

	String street;
	String postCode;
	
	public Letter(String street, String postCode) {
		this.street = street;
		this.postCode = postCode;
	}

	@Override
	public String getStreet() {
		return street;
	}

	
	@Override
	public String getPostCode() {
		return postCode;
	}

	public static void main(String[] args) {
		
		Letter letter = new Letter("London Kings Layout", "82389");
		System.out.println(letter.getFullAddress());
	}
}
