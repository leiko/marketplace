package edu.fiap.marketplace.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fiap.marketplace.model.Item;
import edu.fiap.marketplace.repository.ItemRepository;

@Service	
public class MarketplaceService {

	private static final Logger log = LoggerFactory.getLogger(MarketplaceService.class);

	@Autowired
	private ItemRepository repository;

	public void save(Item item) {

		log.info("save:");
		repository.save(item);

	}
	
	public void update(Item item) {

		log.info("update:");
		repository.save(item);

	}
	
	public void delete(int idItem) {

		log.info("delete:");
		Item item = repository.findById(idItem);
		repository.delete(item);

	}

	public List<Item> view() {
		
		log.info("view items:");
		List<Item> list = new ArrayList<Item>();
		
		for (Item item : repository.findAll()) {
			list.add(item);
		}
			
		return list;

	}

}
