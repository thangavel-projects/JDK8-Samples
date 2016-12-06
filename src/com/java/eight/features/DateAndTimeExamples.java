package com.java.eight.features;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateAndTimeExamples {

	public static void main(String... arg){
		
		playgroundForDate();
		playgroundForTime();
		TimeHelper.playgroundForTime();
		TimeHelper.dateDifference();
	}

	private static void playgroundForDate() {
		
		//Get System default date.
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate.toString());
		
		// Define custom date
		LocalDate customDate = LocalDate.of(2103, 7, 3);
		System.out.println(customDate.toString());
		
		// Get date of the day in particular year
		LocalDate numberOfDate = LocalDate.ofYearDay(2013, 1);
		System.out.println(numberOfDate.toString());
	}
	
	private static void playgroundForTime(){
		
		// Get system date and time.
		LocalTime dateTime = LocalTime.now();
		System.out.println(dateTime.toString());
		
		// Define custom time
		LocalTime customTime = LocalTime.of(14, 34);
		System.out.println(customTime.toString());
		
		// Get time based out seconds
		LocalTime localTime = LocalTime.ofSecondOfDay(74343);
		System.out.println(localTime.toString());
		
		//Get local date and time
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.toString());
		
		// Define custom date time
		LocalDateTime customDateTime = LocalDateTime.of(2015, 8, 3, 9, 32);
		System.out.println(customDateTime.toString());
		
		// Define custom date time
		LocalDateTime customDatesTime = LocalDateTime.of(2015, Month.MARCH, 3, 9, 32);
		System.out.println(customDatesTime.toString());
		
		// Get Zone time id
		LocalTime localTimeZone = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(localTimeZone.toString());
		
		// Get Current Time Zone in UTC format
		LocalTime localTime2 = LocalTime.now(Clock.systemUTC());
		System.out.println(localTime2.toString());
		
	}
}
