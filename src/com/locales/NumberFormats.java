package com.locales;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

class NumberFormats {
	public static void main(String[] args) {

		// see the number in different country formats.

		long number = 5000000L;

		// this is your systems default number format.
		NumberFormat numberFormatDefault = NumberFormat.getInstance();
		System.out.println("Number Format using Default Locale: " + numberFormatDefault.format(number));

		// number format for Italy.
		NumberFormat numberFormatLocale = NumberFormat.getInstance(Locale.ITALY);
		System.out.println("Number Format using ITALY Locale: " + numberFormatLocale.format(number));

		// number format for Italian.
		NumberFormat numberFormatLocaleItalian = NumberFormat.getInstance(Locale.ITALIAN);
		System.out.println("Number Format using name as Italian Locale: " + numberFormatLocaleItalian.format(number));

		// this is the format for default currency of the system.
		NumberFormat numberFormatDefaultCurrency = NumberFormat.getCurrencyInstance();
		System.out.println("Currency Format using Default Locale: " + numberFormatDefaultCurrency.format(number));

		// number format in france format.
		NumberFormat franceNumberFormatLocale = NumberFormat.getInstance(Locale.FRANCE);
		System.out.println("Number Format using FRANCE Locale: " + franceNumberFormatLocale.format(number));

		// number format in french format.
		NumberFormat frenchNumberFormatLocale = NumberFormat.getInstance(Locale.FRENCH);
		System.out.println("Number Format using FRENCH Locale: " + frenchNumberFormatLocale.format(number));

		// Italian currency format.
		NumberFormat numberFormatLocaleCurrency = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println("Currency Format using ITALY Locale: " + numberFormatLocaleCurrency.format(number));

		// using currency class, we can achieve the same results.
		Currency currency = Currency.getInstance(Locale.CHINA);
		System.out.println(
				currency.getDisplayName() + " (" + currency.getCurrencyCode() + ") " + currency.getDisplayName());

		// using date to get the German date format.
		Date currentDate = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMANY);
		System.out.println("Date Format in German Locale: " + dateFormat.format(currentDate));
	}
}
