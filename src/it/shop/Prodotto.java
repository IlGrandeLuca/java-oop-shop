package it.shop;

import java.util.Random;

public class Prodotto {
	// Attributes
	private int id;
	private String name;
	private String description;
	private double price;
	private int iva;

	// Method
	public Prodotto() {
		this.id = randomId();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getId() {
		return id;
	}

	// Randomize ID attribute
	private int randomId() {
		Random r = new Random();
		return r.nextInt(500);

	}

	// Calculate price + iva
	public double setPriceWithIva() {
		double priceWithIva = this.price + ((this.price / 100) * iva);
		return priceWithIva;

	}

	// Return string "id-name"
	public String extendedName() {
		return this.id + "-" + this.name;

	}
}
