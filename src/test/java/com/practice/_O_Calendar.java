package com.practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class _O_Calendar {

	//increase current date by 10
	
	private static void dateIncrease() {
		
		//get the current date
		Date currentDate = new Date();
		
		//Create calendar instance and set it to the current date
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(currentDate);
		
		//increase the date by 10
		calendar.add(Calendar.DATE, 10);
		
		//Get the updated date
		Date updatedDate = calendar.getTime();
		
		//date format
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println("Current date: "+sdf.format(currentDate));
		System.out.println("Date after 10 days: "+sdf.format(updatedDate));
	}
	
	//Increase the month by 2
	private static void monthIncrease() {
		Date currentMonth = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(currentMonth);
		calendar.add(Calendar.MONTH, 2);
		Date updatedMonth = calendar.getTime();
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("current month: "+sdf.format(currentMonth));
		System.out.println("Month after 2 months: "+sdf.format(updatedMonth));
	}
	
	//Increase 5 years
	private static void yearIncrease() {
		Date currentYear = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(currentYear);
		calendar.add(Calendar.YEAR, 5);
		Date updatedYear = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
		System.out.println("Cuurent year: "+sdf.format(currentYear));
		System.out.println("Year after 5 years: "+sdf.format(updatedYear));
	}
	
	public static void main(String[] args) {
		dateIncrease();
		monthIncrease();
		yearIncrease();
	}
}
