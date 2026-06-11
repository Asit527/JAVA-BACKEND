package com.kodewala.driver;

import com.kodewala.modules.*;
import com.kodewala.config.*;
import java.util.Scanner;

public class AmazonApp {

	public static void main(String[] args) {
		ViewProducts viewer = new ViewProducts();
		CartManager cart = new CartManager();
		PlaceOrder orderer = new PlaceOrder();
		OrderHistory history = new OrderHistory();
		Scanner sc = new Scanner(System.in);

		System.out.print("Login - Enter User ID: ");
		int userId = sc.nextInt();

		while (true) {
			System.out.println("\n--- E-Commerce System ---");
			System.out.println("1. View Products");
			System.out.println("2. Add to Cart");
			System.out.println("3. Show My Cart");
			System.out.println("4. Place Order (Buy Now)");
			System.out.println("5. View Order History");
			System.out.println("6. Exit");
			System.out.print("Select an option: ");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				viewer.display();
				break;
			case 2:
				System.out.print("Enter Product ID: ");
				int pId = sc.nextInt();
				System.out.print("Enter Quantity: ");
				int q = sc.nextInt();
				cart.addToCart(userId, pId, q);
				break;
			case 3:
				cart.showCart(userId);
				break;
			case 4:
				System.out.print("Enter Product ID: ");
				int prod = sc.nextInt();
				System.out.print("Enter Quantity: ");
				int qty = sc.nextInt();
				orderer.execute(userId, prod, qty);
				break;
			case 5:
				history.display(userId);
				break;
			case 6:
				System.out.println("Goodbye!");
				System.exit(0);
			default:
				System.out.println("Invalid Option!");
			}
		}
	}
}