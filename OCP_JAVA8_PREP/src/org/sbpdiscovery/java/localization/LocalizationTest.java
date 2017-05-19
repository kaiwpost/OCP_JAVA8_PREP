package org.sbpdiscovery.java.localization;


import java.util.*;

public class LocalizationTest {

	public static void main(String[] args) {

		//String lang = "cn";
		//String country = "CN";
		Locale locale = new Locale(System.getProperty("user.language"), System.getProperty("user.country"));
		//Locale locale = Locale.GERMANY;
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getCountry());
		System.out.println(locale.getLanguage());

		
		ResourceBundle r = ResourceBundle.getBundle("org/sbpdiscovery/java/localization/Bundle", locale);
		
		String wish = r.getString("wish");
		System.out.println(wish);	
	}

}
