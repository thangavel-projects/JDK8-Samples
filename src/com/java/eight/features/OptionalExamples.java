package com.java.eight.features;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExamples {

	public static void main(String[] args) {
		optionalEmptyMethod();
		nullableMethod();
		ifPresentMethod();
		mapLambdas();
	}

	private static void optionalEmptyMethod() {
		try {
			Optional<Object> emptyOptional = Optional.empty();
			System.out.println(emptyOptional.get()); 
		} catch (NoSuchElementException ex) {
			System.out.println("Expected NoSuchElement Exception"); 
		}
	}
	
	private static void nullableMethod(){
		String str = null; // "Epam Systems";
		Optional<String> ofNullable = Optional.ofNullable(str);
		if(ofNullable.isPresent()){
			System.out.println("The String value is not NULL!!!");
		}else{
			System.out.println("The String value is NULL :-(");
		}
	}
	
	private static void ifPresentMethod(){
		Optional<String> optional = Optional.of("Optional Value Here!");
		optional.ifPresent(System.out::println);
	}
	
	private static void mapLambdas(){
		
		Optional<String> optionalValue = Optional.of( "Epam Systems" );
		Optional<Integer> optionalSize = optionalValue.map(String::length ); 
		System.out.println( "Length of String is:: " + optionalSize.orElse( 0 ) );

		Optional<String> optionalValueNull = Optional.ofNullable( null );
		Optional<Integer> optionalSizeNull = optionalValueNull.map( x -> x.length()  ); 
		System.out.println( "Length of Optional String is " + optionalSizeNull.orElse( 0 ) );
	}
}
