package com.training.collections.set;

import java.util.Objects;

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

	/**
	 * overriding the hash code as per the requirement
	 */
	@Override
	public int hashCode() {

		return Objects.hash(company, type, price);
	}

	/**
	 * overriding equals() to compare car objects with itself, null and their data
	 * members
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else if (obj == null)
			return false;
		else if (getClass() != obj.getClass())
			return false;
		Television television = (Television) obj;
		if (this.getCompany() == television.getCompany() && this.getType() == television.getType()
				&& this.getPrice() == television.getPrice())
			return true;
		else
			return false;

	}

}
