package edu.fiap.marketplace.repository;


import org.springframework.data.repository.CrudRepository;

import edu.fiap.marketplace.model.Item;


public interface ItemRepository extends CrudRepository<Item, Long> {
	
	Item findById(int id);
	
}
