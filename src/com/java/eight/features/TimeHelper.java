package com.java.eight.features;

import java.time.LocalDate;
import java.time.Period;

public class TimeHelper {

	public static void playgroundForTime(){
		
		// Check the date is before/after
		LocalDate localDate = LocalDate.of(2013, 4, 25);
		System.out.println(localDate.now().isBefore(localDate));
		
	}
	
	/**
	 * Get the date difference between two dates in the format of days
	 * months/years.
	 */
	public static void dateDifference(){
		
		LocalDate firstDate = LocalDate.of(2013, 3, 20);
		LocalDate secondDate = LocalDate.of(2015, 8, 12);
		
		Period diff = Period.between(firstDate, secondDate);
		System.out.println("The Difference is ::"+diff.getDays());
	}
	
	
}
