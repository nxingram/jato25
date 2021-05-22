package com.jato25.myApplication.core.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.jato25.myApplication.cart.ShoppingCart;
import com.jato25.myApplication.model.Product;


public class ShoppingCartTest {
	
	Product pGood = new Product("birra", 3);
	Product pBad = new Product(null, 0);
	Product pBad2 = new Product("gelato", 0);
	Product pBad3 = new Product(null, 5);
	ShoppingCart shop;
	
	@Before
	public void setUp() {
		shop = new ShoppingCart();
	}
	

	@Test
	public void testAddItem() {
		assertEquals("Il carello non è vuoto", 0, shop.getItemCount());
		shop.addItem(pGood);
		assertEquals("Numero dei prodotti non è corretto", 1, shop.getItemCount());
//		assertTrue("Il numero dei prodotti non è corretto", 1 == sho.getItemCount());
		shop.addItem(pBad);
		shop.addItem(pBad2);
		shop.addItem(pBad3);
		assertEquals("Numero dei prodotti non è corretto", 1, shop.getItemCount());

	}

	@Test
	public void testGetItemCount() throws Exception {
		assertEquals("Il carello è vuoto", 0, shop.getItemCount());
		shop.addItem(pGood);
		assertEquals("Il carello non è vuoto", 1, shop.getItemCount());
		shop.removeItem(pGood);
		assertEquals("Il carello è vuoto", 0, shop.getItemCount());

	}

	@Test
	public void testRemoveItem() throws Exception {
		assertEquals("Il carello è vuoto", 0, shop.getItemCount());
		shop.addItem(pGood);
		assertEquals("Il carello non è vuoto", 1, shop.getItemCount());
//		shop.removeItem(pGood);
//		assertEquals("Il carello non è vuoto", 0, shop.getItemCount());
		try {
			shop.removeItem(pGood);
			fail("eccezione non sollevata");
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("eccezione", e.getMessage(), "Prodotto non trovato");
	
		}
	}

	@Test
	public void testEmpty() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBalance() {
		fail("Not yet implemented");
	}

}
