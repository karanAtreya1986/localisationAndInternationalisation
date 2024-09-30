package com.locales;

import java.util.Locale;

public class WaysToCreateLocaleClass {

	public static void main(String[] args) {

		// Creates a locale object using one parameter to constructor
		// pass in the country code
		Locale locale = new Locale("fr");
//		System.out.println("locale: " + locale);

		// CreateS A locale object using two parameters constructor
		// pass in the country code and country name
		Locale locale2 = new Locale("fr", "Germany");
//		System.out.println("locale2: " + locale2);

		// Create a locale object using three parameters constructor
		// pass in country code
		// pass in country name
		// give your own code for the country
		Locale locale3 = new Locale("no", "NORWAY", "NY");
//		System.out.println("locale3: " + locale3);

		// A local object from Locale.Builder
		// use builder method.
		// set the language.
		// set the region
		// then build.
		Locale localeFromBuilder = new Locale.Builder().setLanguage("en").setRegion("US").build();
//		System.out.println("localeFromBuilder: " + localeFromBuilder);

		// Using Locale Constant
		// use the country name and print it
		// it will also give the language code
		Locale localeConst = Locale.FRANCE;
//		System.out.println("localeConst: " + localeConst);

		// Locale from forLanguageTag method
		Locale forLangLocale = Locale.forLanguageTag("en-US");
//		System.out.println("forLangLocale: " + forLangLocale);

		// gives the default as per the jdk
		// machine is from india so india jdk is present
		Locale localeAsPerJDKLocale = Locale.getDefault();
//		System.out.println("Default Locale: " + localeAsPerJDKLocale);

		// gives all locales
		// gives all languages along with their country
//		Locale[] availableLocale = Locale.getAvailableLocales();
//		for (Locale aLocale : availableLocale) {
//			System.out.println("Name of Locale: " + aLocale.getDisplayName());
//			System.out.println("Language Code: " + aLocale.getLanguage() + ", " + "Language Display Name: "
//					+ aLocale.getDisplayLanguage());
//			System.out.println("Country Code: " + aLocale.getCountry() + ", " + "Country Display Name: "
//					+ aLocale.getDisplayCountry());
//			if (!aLocale.getScript().equals("")) {
//				System.out.println("Script Code: " + aLocale.getScript() + ", " + "Script Display Name: "
//						+ aLocale.getDisplayScript());
//			}
//			if (!aLocale.getVariant().equals("")) {
//				System.out.println("Variant Code: " + aLocale.getVariant() + ", " + "Variant Display Name: "
//						+ aLocale.getDisplayVariant());
//			}
//		}
//		

		// get all methods from locale class
		Locale[] availableLocale = Locale.getAvailableLocales();
		for (Locale aLocale : availableLocale) {
//			System.out.println(aLocale.getCountry()); //gives two digit country codes across planet
//			System.out.println(aLocale.getDisplayCountry()); //gives the actual name of the countries
			// it returns all countries.//not sure what it returns
//			System.out.println(aLocale.getDisplayCountry(Locale.FRANCE)); 
			// gets all languages in planet
//			System.out.println(aLocale.getDisplayLanguage());
			// gives all languages printed in chinese
//			System.out.println(aLocale.getDisplayLanguage(Locale.CHINESE));
			// it gives the local language and the corresponding country name
//			System.out.println(aLocale.getDisplayName());
			// it gives the local language and the corresponding country name
//			System.out.println(aLocale.getDisplayName(Locale.CANADA));
			// this also gives all the languages in planet
//			System.out.println(aLocale.getDisplayScript());
			// this also gives all the languages in planet in japanese language
//			System.out.println(aLocale.getDisplayScript(Locale.JAPAN));
			// shows blank in output
//			System.out.println(aLocale.getDisplayVariant());
			// shows blank in output
//			System.out.println(aLocale.getDisplayVariant(Locale.GERMAN));
			// not sure what it does, returns null
//			System.out.println(aLocale.getExtension('n'));
			// gives three digit iso country code for all countries
			// if three digit code not present then get missing resource exception
//			System.out.println(aLocale.getISO3Country());
			// get three digit iso languages for all countries in planet
//			System.out.println(aLocale.getISO3Language());
			// get the language code for all countries in planet
//			System.out.println(aLocale.getLanguage());
			// gives four digit language code for all countries in planet.
//			System.out.println(aLocale.getScript());
			// returns blank in output
//			System.out.println(aLocale.getVariant());
			// gives two digit language code - city name in short - country name in short
//			System.out.println(aLocale.toLanguageTag());
		}
		// gives country code and country name
//		String[] locales = Locale.getISOCountries();
//		for (String countryCode : locales) {
//			Locale obj = new Locale("", countryCode);
//			System.out.println("Country Code = " + obj.getCountry() + ", Country Name = " + obj.getDisplayCountry());
//		}

		// check methods in iso countries
//		String[] locales = Locale.getISOCountries();
//		for (String countryCode : locales) {
//			Locale l8 = new Locale("", countryCode);
//			// gives two digit country code
////			System.out.println(l8.getCountry());
//			// gives country names
////			System.out.println(l8.getDisplayCountry());
//			// gives all country names
////			System.out.println(l8.getDisplayCountry(Locale.GERMAN));
//			// returns blank in output
////			System.out.println(l8.getDisplayLanguage());
//			// gives all country names
////			System.out.println(l8.getDisplayCountry(Locale.FRENCH));
//			// gives all country names
////			System.out.println(l8.getDisplayName());
//			// gives all country names in chinese
////			System.out.println(l8.getDisplayName(Locale.CHINA));
//			// returns blank in output
////			System.out.println(l8.getDisplayScript());
//			// returns blank in output
////			System.out.println(l8.getDisplayScript(Locale.FRENCH));
//			// returns blank in output
////			System.out.println(l8.getDisplayVariant());
//			// returns blank in output
////			System.out.println(l8.getDisplayVariant(Locale.ENGLISH));
//			// three digit country codes are returned
////			System.out.println(l8.getISO3Country());
//			// returns blank in output
////			System.out.println(l8.getISO3Language());
//			// returns blank in output
////			System.out.println(l8.getLanguage());
//			// returns blank in output
////			System.out.println(l8.getScript());
//			// returns blank in output
////			System.out.println(l8.getVariant());
//			// gives two digit language code
//			System.out.println(l8.toLanguageTag());
//		}

		// try printing the country codes without locale object creation
		// we get two digit country codes
		String[] locales = Locale.getISOCountries();
		for (String countryCode : locales) {
			System.out.println(countryCode);
		}
	}
}
