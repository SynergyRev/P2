package models;

public class Games {
	private int id;
	private Products product;
	private String gName;
	private String Description;
	private Double price;
	private Double ratings;
	
	public Games() {
		super();
		
	}

	public Games(int id, Products product, String gName, String description, Double price, Double ratings) {
		super();
		this.id = id;
		this.product = product;
		this.gName = gName;
		Description = description;
		this.price = price;
		this.ratings = ratings;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getRatings() {
		return ratings;
	}

	public void setRatings(Double ratings) {
		this.ratings = ratings;
	}
	
	
	

}
