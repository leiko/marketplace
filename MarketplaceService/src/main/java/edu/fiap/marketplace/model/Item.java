package edu.fiap.marketplace.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")	
public class Item {

	@Id
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "user_id", nullable = false)
	private int user_id;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "price", nullable = false)
	private String price;
	
	public Item() {
		
	}

	public int getId() {
		return id;
	}

	public int getUser_id() {
		return user_id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getStatus() {
		return status;
	}

	public String getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", user_id=" + user_id + ", title=" + title + ", description=" + description
				+ ", status=" + status + ", price=" + price + "]";
	}
	
}
