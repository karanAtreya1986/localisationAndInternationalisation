package com.locales;

import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalisationInOneShort {

	public static void main(String[] args) {

		// Resource bundle class – to internationalise/globalise messages.
		// create properties files for the specific regions.
		// pass in the complete package name
		// pass in the properties file name without extension
		// if we pass properties then we get cant find bundle error
//		ResourceBundle bundle1 = ResourceBundle.getBundle("com.locales.BundleDefault.properties");
		// pass it without properties extension and it works.
		// in editor we can use "." instead of slash for giving the path
//		ResourceBundle bundle1 = ResourceBundle.getBundle("com.locales.BundleDefault");
//		displayValues(bundle1);

		// using getdefault method to get the default locale.
//		Locale defaultLocale = Locale.getDefault();
//		ResourceBundle bundle2 = ResourceBundle.getBundle("com.locales.BundleDefault", defaultLocale);
//		displayValues(bundle2);

		// lets create for sweden
		// first parameter to locale is language code
		// second parameter to locale is country code
//		Locale swedishLocale = new Locale("sv", "SE");
//		ResourceBundle bundle3 = ResourceBundle.getBundle("com.locales.SwedenBundle", swedishLocale);
//		displayValues(bundle3);

		// give non existent locale
		// it will still pick the bundle properties file which you gave
//		Locale nonexistentLocale = new Locale("xx", "XX");
//		ResourceBundle bundle4 = ResourceBundle.getBundle("com.locales.SwedenBundle", nonexistentLocale);
//		displayValues(bundle4);

		Locale usLocale = new Locale("en", "US");
		ResourceBundle bundle5 = ResourceBundle.getBundle("com.locales.USBundle", usLocale);
		displayValues(bundle5);
	}

	// pass in the resource bundle.
	// use getstring method to get the translations of the keys.
	public static void displayValues(ResourceBundle bundle) {
		System.out.println("hello message:" + bundle.getString("my.hello"));
		System.out.println("goodbye message:" + bundle.getString("my.goodbye"));
		System.out.println("question message:" + bundle.getString("my.question"));
		System.out.println();
	}

}
