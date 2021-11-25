package it.shop;

import java.util.Random;

public class Prodotto {
	// Attributes
	private int id;
	private String name;
	private String description;
	private double price;
	private int iva;

	// Methods
	public Prodotto(String name, double price, int iva) {
		this.id = randomId();
		this.name = name;
		this.price = price;
		this.iva = iva;
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

	public double ivaCalculator(double iva) {
		return (this.price / 100) * iva;

	}

	// Calculate price + iva
	public double getPriceWithIva() {
		return this.price + ivaCalculator(this.iva);

	}

	// Return string "id-name"
	public String getExtendedName() {
		return this.id + "-" + this.name;

	}
}
