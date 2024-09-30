package com.locales;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatWithoutFormatOption {

	public static void main(String[] args) {

		// using date to get the German date format.
		// we have not used .format method.
		// it prints memory address.
		Date currentDate = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMANY);
		System.out.println("Date Format in German Locale: " + dateFormat);
	}

}
