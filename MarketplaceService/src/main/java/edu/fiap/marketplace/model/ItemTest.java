package edu.fiap.marketplace.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.fiap.marketplace.model.Item;

class ItemTest {
	@Test
	void defineTitle() {
		Item item = new Item();
		item.setTitle("Iphone");
		
		assertEquals("Iphone", item.getTitle());
	}
	
	@Test
	void defineDescription() {
		Item item = new Item();
		item.setDescription("Pouco uso");
		
		assertEquals("Pouco uso", item.getDescription());
	}
	
	@Test
	void defineStatus() {
		Item item = new Item();
		item.setStatus("A venda");
		
		assertEquals("A venda", item.getStatus());
	}
	
	@Test
	void definePrice() {
		Item item = new Item();
		item.setPrice("50.00");
		
		assertEquals("50.00", item.getPrice());
	}
}
