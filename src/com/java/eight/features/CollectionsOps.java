package com.java.eight.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class CollectionsOps {

	private List<Person> nameList = new ArrayList<>();

	public CollectionsOps() {
		nameList.add(new Person("Thangavel", "Loganathan"));
		nameList.add(new Person("Selvakumar", "Loganathan"));
		nameList.add(new Person("Karthik", "Kannan"));
		nameList.add(new Person("Rajesh", "Sellamuthu"));
	}


	public static void main(String[] args) {
		CollectionsOps ops = new CollectionsOps();
		ops.sortByName();
		ops.filterByKeyword();
		ops.forLoopAlternate();
	}
	
	/**
	 * Sort the names based on first name using Lambda Expressions.
	 */
	private void sortByName(){
		Collections.sort(nameList,  (p1, p2) -> p1.firstName.compareTo(p2.firstName));
		nameList.forEach( name -> System.out.printf("%s %s\n", name.firstName , name.lastName));
	}
	
	/**
	 * Filters the list based on the keywords using Lambda Expressions.
	 */
	private void filterByKeyword(){
		nameList.stream()
			.filter(p -> p.lastName.equals("Loganathan"))
			.forEach( p -> System.out.printf("%s %s %s\n", "The Filtered Names are:",p.firstName, p.lastName));
	}
	
	/**
	 * Alternate way to for loop and prints integer range.
	 */
	private void forLoopAlternate(){
		IntStream.range(1, 10)
			.forEach(i -> System.out.println(i));
	}
	
	
}
