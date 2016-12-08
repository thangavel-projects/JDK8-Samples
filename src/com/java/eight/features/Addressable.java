package com.java.eight.features;

public interface Addressable {

	public String getStreet();
	public String getPostCode();
	
	default String getFullAddress(){
		return getStreet()+" "+getPostCode();
	}
}
