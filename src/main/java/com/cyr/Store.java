package com.cyr;

import java.util.ArrayList;
import java.util.List;

public class Store {

	public List<String> getProducts(String value) {
		
		String s1="";String s2="";String s3="";
		
		if (value.equals("1")) {
			ArrayList<String> phones = new ArrayList<String>();
			s1 = "Samsung Mobile";
			s2 = "Nokia Mobile";
			s2 = "Apple Mobile";
			phones.add(s1);phones.add(s2);phones.add(s3);
			return phones;
		} 
		else if (value.equals("2")) {
			ArrayList<String> laptops = new ArrayList<String>();
			s1 = "Dell Laptop";
			s2 = "Lenovo Laptop";
			laptops.add(s1);laptops.add(s2);laptops.add(s3);
			return laptops;
		}
		else {
			ArrayList<String> tabs = new ArrayList<String>();
			s1 = "Panasonic Tablet";
			s2 = "Lenovo Tablet";
			tabs.add(s1);tabs.add(s2);tabs.add(s3);
			return tabs;
		}
		
	}
}
