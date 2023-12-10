package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;				

	//constructor main
	public Product() {
	}

	// constructor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// constructor override
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public int getQuantity() {
		return quantity;
	}
}
