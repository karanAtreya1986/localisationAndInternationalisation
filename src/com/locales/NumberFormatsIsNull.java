package com.locales;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

class NumberFormatsIsNull {
	public static void main(String[] args) {

		long number = 5000000L;

		// what happens when numberformat has the value null.
		// we set the currency after making it null
		// we get null pointer exception.
//		Currency chinaCurrency = Currency.getInstance(Locale.CHINA);
//		NumberFormat chinaFormatDefault = null;
//		chinaFormatDefault.setCurrency(chinaCurrency);
//		System.out.println("china currency is " + chinaFormatDefault.format(number));

		// to solve the null pointer exception
		Currency chinaCurrency = Currency.getInstance(Locale.CHINA);
		NumberFormat chinaFormatDefault = null;
		// after setting to null, then reassign to the locale.
//		chinaFormatDefault = NumberFormat.getInstance(Locale.CHINA);

		// add this line and check if null pointer is gone
		// once we do get instance, the null pointer goes.
		chinaFormatDefault = NumberFormat.getInstance();
		chinaFormatDefault.setCurrency(chinaCurrency);
		System.out.println("china currency is " + chinaFormatDefault.format(number));
	}
}
