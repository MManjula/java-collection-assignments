package com.training.collections.set;

import java.util.Objects;

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

	/**
	 * overriding the hash code as per the requirement
	 */
	@Override
	public int hashCode() {

		return Objects.hash(company, model, operatingSystem);
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
		CellPhone cellPhone = (CellPhone) obj;
		if (this.getCompany() == cellPhone.getCompany() && this.getModel() == cellPhone.getModel()
				&& this.getOperatingSystem() == cellPhone.getOperatingSystem())
			return true;
		else
			return false;

	}

}
