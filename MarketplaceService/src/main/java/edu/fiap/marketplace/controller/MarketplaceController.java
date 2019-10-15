package edu.fiap.marketplace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.fiap.marketplace.model.Item;
import edu.fiap.marketplace.service.MarketplaceService;

@RestController
@RequestMapping(value = "marketplace")
public class MarketplaceController {

	@Autowired
	private MarketplaceService service;

	@RequestMapping(value = "/publish/item/new", method = RequestMethod.POST)
	public void newItem(@RequestBody Item item) {
		service.save(item);

	}
	
	@RequestMapping(value = "/publish/item/update", method = RequestMethod.PUT)
	public void updateItem(@RequestBody Item item) {
		service.update(item);

	}
	
	@RequestMapping(value = "/publish/remove/{idItem}", method = RequestMethod.DELETE)
	public void deleteItem(@RequestParam int item) {
		service.delete(item);

	}

	@RequestMapping(value = "/view/item", method = RequestMethod.GET)
	public List<Item> view() {
		return service.view();

	}

}
