package models;




public class product {

private double price;
private String name;
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public product() {
	super();
	// TODO Auto-generated constructor stub
}
public product(double price, String name) {
	super();
	this.price = price;
	this.name = name;
}
}
