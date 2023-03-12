package com.cyr;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class StoreTest {
	
	@Test
	public void testGetProductsWithValidValue()
	{
		Store store = new Store();
		List<String> list = store.getProducts("1");
		
		assertEquals("Samsung Mobile", list.get(0));
	}

}
