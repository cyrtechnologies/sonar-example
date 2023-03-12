package com.cyr;

import java.util.List;

public class StoreDemo {

	public static void main(String[] args) {
		
		Store store = new Store();
		List<String> phones = store.getProducts("2");
		
		for (String prod : phones) {
			System.out.println(prod);
		}

	}

}
