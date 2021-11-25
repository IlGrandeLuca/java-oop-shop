package it.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iva = 22;
		Scanner in = new Scanner(System.in);

		// Set instance of Prodotto
		System.out.print("Enter product name: ");
		String name = in.nextLine();
		System.out.print("Enter product price: ");
		double price = in.nextDouble();
		Prodotto product = new Prodotto(name, price, iva);

		in.nextLine(); // Consume newline left-over

		System.out.println("If you want to enter a description of this product enter 'yes': ");
		String control = in.nextLine();

		if (control.equalsIgnoreCase("yes")) {
			System.out.print("Enter product description: ");
			product.setDescription(in.nextLine());
		}

		// Print object's attributes using getter methods
		System.out.println("\nProduct ID: " + product.getId());
		System.out.println("Product name: " + product.getName());
		System.out.println("Product price: " + String.format("%.2f", product.getPrice()) + "€");
		System.out.println("IVA: " + product.getIva() + "%");
		System.out.println("Product price + IVA: " + String.format("%.2f", product.getPriceWithIva()) + "€");
		System.out.println("Product ID + name: " + product.getExtendedName());
		System.out.println("Product description: " + product.getDescription() + "\n");

		// Modify object's attributes using setter methods
		System.out.println("If you want to change the name of this product enter 'yes': ");
		control = in.nextLine();

		if (control.equalsIgnoreCase("yes")) {
			System.out.print("Enter new name: ");
			product.setName(in.nextLine());

			System.out.println("New name: " + product.getName());
		}

		System.out.println("If you want to change the price of this product enter 'yes': ");
		control = in.nextLine();

		if (control.equalsIgnoreCase("yes")) {
			System.out.print("Enter new name: ");
			product.setPrice(in.nextDouble());

			System.out.println("New price: " + String.format("%.2f", product.getPrice()) + "€");
		}

		if (name != product.getName()) {
			System.out.println("New ID + name: " + product.getExtendedName());
		}

		if (price != product.getPrice()) {
			System.out.println("New price + IVA: " + String.format("%.2f", product.getPriceWithIva()) + "€");
		}

		in.close();
	}

}
