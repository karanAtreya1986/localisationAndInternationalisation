package com.locales;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class NumbersCurrencyDateFormatting {

	public static void main(String[] args) {

		// formats the number as the computer default
		// our computer is from india so shows number how its written in india
		long number = 5000000L;
		NumberFormat numberFormatDefault = NumberFormat.getInstance();
//		System.out.println("Number Format using Default Locale: " + numberFormatDefault.format(number));

		// this is how the number will be seen in italian format.
		NumberFormat numberFormatLocale = NumberFormat.getInstance(Locale.ITALY);
//		System.out.println("Number Format using ITALY Locale: " + numberFormatLocale.format(number));

		// Why locale is used-
		// If amazon builds something, they wont have hundred deployments for every
		// country and region. They will have one or two applications developed and use
		// the locale class.

		// Getinstance() -> returns you instance of that specified class. With the
		// instance, you can access all the class elements.
		// lets get the default currency format of our machine which is purchased in
		// india
		NumberFormat numberFormatDefaultCurrency = NumberFormat.getCurrencyInstance();
//		System.out.println("Currency Format using Default Locale: " + numberFormatDefaultCurrency.format(number));

		// currency instance of italy.
		NumberFormat numberFormatLocaleCurrency = NumberFormat.getCurrencyInstance(Locale.ITALY);
//		System.out.println("Currency Format using ITALY Locale: " + numberFormatLocaleCurrency.format(number));

		// gives the default date format of the machine
		// ours is machine purchased in india so that format which is set in machine by
		// manufacturer
		Date currentDate = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance();
//		System.out.println("Date Format in default format: " + dateFormat.format(currentDate));

		// get date format as per german
		Date currentDateGermanDate = new Date();
		DateFormat dateFormatGerman = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMANY);
//		System.out.println("Date Format in German Locale: " + dateFormat.format(currentDateGermanDate));

		// use currency class
		// use locale as china
		// get the chinese currency name and currency code
		Currency currency = Currency.getInstance(Locale.CHINA);
		System.out.println(
				currency.getDisplayName() + " (" + currency.getCurrencyCode() + ") " + currency.getDisplayName());

	}

}
