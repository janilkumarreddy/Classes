package com.demo.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTimeDemo {

	public static void main(String[] args) throws ParseException {


		// Instantiate a Date object by invoking its constructor
		Date objDate = new Date();
		// Display the Date & Time using toString()
		System.out.println(objDate.toString());

		String strDateFormat = "hh:mm:ss a dd-MMM-yyyy"; //Date format is Specified
		SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); //Date format string is passed as an argument to the Date format object
		System.out.println(objSDF.format(objDate)); //Date formatting is applied to the current date

		String strDateFormat1 = "dd-MM-yyyy"; //Date format is Specified
		SimpleDateFormat objSDF1 = new SimpleDateFormat(strDateFormat1); //Date format string is passed as an argument to the Date format object
		System.out.println(objSDF1.format(objDate)); //Date formatting is applied to the current date


		DateAndTimeDemo obj = new DateAndTimeDemo();
		obj.compareDates();

		obj.gregorianCalender();
	}

	public void compareDates() throws ParseException {
		SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
		Date dt_1 = objSDF.parse("12-10-2013");
		Date dt_2 = objSDF.parse("12-10-2012");

		System.out.println("Date1 : " + objSDF.format(dt_1));
		System.out.println("Date2 : " + objSDF.format(dt_2));

		if (dt_1.compareTo(dt_2) > 0) {
			System.out.println("Date 1 occurs after Date 2");
		} // compareTo method returns the value greater than 0 if this Date is after the Date argument.
		else if (dt_1.compareTo(dt_2) < 0) {
			System.out.println("Date 1 occurs before Date 2");
		} // compareTo method returns the value less than 0 if this Date is before the Date argument;
		else if (dt_1.compareTo(dt_2) == 0) {
			System.out.println("Both are same dates");
		} // compareTo method returns the value 0 if the argument Date is equal to the second Date;
		else {
			System.out.println("You seem to be a time traveller !!");
		}
	}

	public void gregorianCalender() {
		String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", 
				"Oct", "Nov", "Dec"};

		int year;
		// Create a Gregorian calendar initialized
		// with the current date and time in the
		// default locale and timezone.

		GregorianCalendar gcalendar = new GregorianCalendar();

		// Display current time and date information.
		System.out.print("Date: ");
		//System.out.println(gcalendar.get(Calendar.MONTH));
		System.out.print(months[gcalendar.get(Calendar.MONTH)]);
		System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
		System.out.println(year = gcalendar.get(Calendar.YEAR));
		System.out.print("Time: ");
		System.out.print(gcalendar.get(Calendar.HOUR) + ":");
		System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
		System.out.println(gcalendar.get(Calendar.SECOND));

		// Test if the current year is a leap year
		if(gcalendar.isLeapYear(year)) {
			System.out.println("The current year is a leap year");
		}else {
			System.out.println("The current year is not a leap year");
		}
	}
}
