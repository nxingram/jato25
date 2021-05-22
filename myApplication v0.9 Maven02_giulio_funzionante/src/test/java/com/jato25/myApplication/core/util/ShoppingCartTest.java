package com.jato25.myApplication.core.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.jato25.myApplication.cart.ShoppingCart;
import com.jato25.myApplication.model.Product;
import com.jato25.myApplication.model.User;
import com.jato25.myApplication.persistence.CategoriaDAO;


public class ShoppingCartTest {
	private CategoriaDAO catDb;

	
	Product pGoodB;
	Product pGoodB2;
	Product pGoodC;
	Product pGoodC2;
	Product pBonus;
	Product pBad;
	Product pBad2;
	Product pBad3;
	
	ShoppingCart shop;
	
	User uP;

	@Before
	public void setUp() {
		shop = new ShoppingCart();
		catDb = new CategoriaDAO();
		
		pGoodB = new Product("birra", 3, catDb.getCategoriaBevanda());
		pGoodB2 = new Product("whisky", 5, catDb.getCategoriaBevanda());
		pGoodC = new Product("pizza", 5, catDb.getCategoriaCibo());
		pGoodC2 = new Product("arancino", 1, catDb.getCategoriaCibo());
		pBonus = new Product("Prodotto bonus", 0, catDb.getCategoriaBonus());
		pBad = new Product(null, 0, catDb.getCategoriaCibo());
		pBad2 = new Product("gelato", 0, catDb.getCategoriaCibo());
		pBad3 = new Product(null, 5, catDb.getCategoriaCibo());
		
		uP = new User();
		uP.setPremium(true);
	}
	

	@Test
	public void testAddItem() {
		assertEquals("Il carello non è vuoto", 0, shop.getItemCount());
		shop.addItem(pGoodB);
		assertEquals("La lista di prodotti nel carello è diverso da 1", 1, shop.getItemCount());
		assertTrue("Il numero dei prodotti non è corretto", 1 == shop.getItemCount());
		shop.addItem(pBad);
		shop.addItem(pBad2);
		shop.addItem(pBad3);
		assertEquals("Numero dei prodotti è corretto /prodotto non aggiunto perchè errato", 1, shop.getItemCount());

	}

	@Test
	public void testGetItemCount() throws Exception {
		assertEquals("Il carello è vuoto", 0, shop.getItemCount());
		shop.addItem(pGoodB);
		assertEquals("La lista di prodotti nel carello è diverso da 1", 1, shop.getItemCount());
		shop.removeItem(pGoodB);
		assertEquals("Il carello è vuoto", 0, shop.getItemCount());

	}

	@Test
	public void testRemoveItem() throws Exception {
		assertEquals("Il carello non è vuoto", 0, shop.getItemCount());
		shop.addItem(pGoodB);
		assertEquals("La lista di prodotti nel carello è diverso da 1", 1, shop.getItemCount());
//		shop.removeItem(pGood);
//		assertEquals("Il carello non è vuoto", 0, shop.getItemCount());
		shop.removeItem(pGoodB);
		assertEquals("il numero dei prodotti non coincide con quello atteso /0", 0, shop.getItemCount());

	}

	@Test
	public void testEmpty() {
		assertEquals("Il carello non è vuoto", 0, shop.getItemCount());
		shop.addItem(pGoodB);
		shop.addItem(pGoodC);
		assertEquals("Il carello contiene 2 elementi", 2, shop.getItemCount());
		shop.empty();
		assertEquals("Il carello è vuoto", 0, shop.getItemCount());
	}

	@Test
	public void testGetBalance() {
		assertEquals("Il carello non è vuoto", 0, shop.getItemCount());
		assertEquals("Il prezzo non è 0", 0, shop.getBalance());
		shop.addItem(pGoodB);
		shop.addItem(pGoodC);
		assertEquals("Il prezzo non è 8", 8, shop.getBalance());

		try {
			shop.removeItem(pGoodB);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("Il prezzo non è 5", 5, shop.getBalance());
		
	}

	@Test
	public void testGetItems() {
		shop.addItem(pGoodB);
		ArrayList<Product> items = shop.getItems(null);
//		for (Product product : items) {
//			System.out.println(product.toString());
//		}
		assertEquals("il numero dei prodotti non coincide con quello atteso /1", 1, items.size());
		assertEquals("la categoria non coincide con quello atteso", catDb.getCategoriaBevanda(), items.get(0).getCategoria());
		shop.addItem(pGoodC);
		assertEquals("il numero dei prodotti non coincide con quello atteso/2",2, items.size());
		items = shop.getItems(catDb.getCategoriaBevanda());
		assertEquals("il numero dei prodotti non coincide con quello atteso /1", 1, items.size());
		items = shop.getItems(catDb.getCategoriaCibo());
		assertEquals("il numero dei prodotti non coincide con quello atteso /1", 1, items.size());
		shop.addItem(pGoodC2);
		items = shop.getItems(catDb.getCategoriaCibo());
		assertEquals("il numero dei prodotti non coincide con quello atteso /2", 2, items.size());

	}
	
	@Test
	public void testBonusProduct() {
		assertEquals("Il carello non è vuoto", 0, shop.getItemCount());
		shop.addItem(pGoodC);
		shop.bonusProduct(pBonus, uP);
		assertEquals("il numero dei prodotti non coincide con quello atteso /1", 1, shop.getItemCount());
		shop.addItem(pGoodC);
		assertEquals("il numero dei prodotti non coincide con quello atteso /2", 2, shop.getItemCount());
		shop.bonusProduct(pBonus, uP);
		assertEquals("il numero dei prodotti non coincide con quello atteso /3", 3, shop.getItemCount());
	}
	
	@Test
	public void removeBonusProduct() {
		assertEquals("Il carello non è vuoto", 0, shop.getItemCount());
		shop.addItem(pGoodC);
		shop.addItem(pGoodB2);
		shop.removeBonusProduct(uP);
		assertEquals("il numero dei prodotti non coincide con quello atteso /2", 2, shop.getItemCount());
		shop.bonusProduct(pBonus, uP);
		assertEquals("il numero dei prodotti non coincide con quello atteso /3", 3, shop.getItemCount());
		try {
			shop.removeItem(pGoodC);
		} catch (Exception e) {
			assertEquals("eccezione", e.getMessage(), "Prodotto non trovato");
		}
		assertEquals("il numero dei prodotti non coincide con quello atteso /2", 2, shop.getItemCount());
		shop.removeBonusProduct(uP);
		assertEquals("il numero dei prodotti non coincide con quello atteso /1", 1, shop.getItemCount());

	}
	
}











