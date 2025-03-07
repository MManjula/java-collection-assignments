package com.training.collections.collection;

public class Television {
	private String company;
	private String type;
	private boolean threeDEnabled;
	private double price;

	/**
	 * Default constructor
	 */
	public Television() {
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param company
	 * @param type
	 * @param threeDEnabled
	 * @param price
	 */
	public Television(String company, String type, boolean threeDEnabled, double price) {
		super();
		this.company = company;
		this.type = type;
		this.threeDEnabled = threeDEnabled;
		this.price = price;
	}

	/**
	 * Getters and setters
	 */
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isThreeDEnabled() {
		return threeDEnabled;
	}

	public void setThreeDEnabled(boolean threeDEnabled) {
		this.threeDEnabled = threeDEnabled;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
