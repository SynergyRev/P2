package productDAO;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;

import models.Products;
import models.product;

public class cart {
	private ArrayList <product> items;
	
	public ArrayList<product> getAllITems() {
		return items;
	}
	public void addItem(String item , double price) {
	product p = new product(price, item);
	items.add(p);
	}
	public void clearItems() {
		items.clear();
	}
	public void removeItem(int index) {
		items.remove(index);
	}
}
