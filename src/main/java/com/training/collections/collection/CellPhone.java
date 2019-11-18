package com.training.collections.collection;

public class CellPhone {
	private String company;
	private String model;
	private String operatingSystem;
	private double price;

	/**
	 * default constructor
	 */
	public CellPhone() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param company
	 * @param model
	 * @param description
	 * @param price
	 */
	public CellPhone(String company, String model, String operatingSystem, double price) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}

	/**
	 * 
	 * getters and setters
	 */
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
