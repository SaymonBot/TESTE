package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		String name = sc.next();
		  
		System.out.println("Enter price");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Name updated: " + product.getName());
		
		product.setPrice(1200.0);
		System.out.println("Updated price: " + product.getPrice());
		
		
		System.out.println("Product: " + product.getName());
		
		
		
		sc.close();
	}

}
