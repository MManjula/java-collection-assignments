package com.training.collections.set;

import java.util.Objects;

public class Car {
	private String make;
	private String model;
	private double year;
	private double price;

	/**
	 * Default constructor
	 */
	public Car() {
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param make
	 * @param model
	 * @param year
	 * @param price
	 */
	public Car(String make, String model, double year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	/**
	 * Getters and setters
	 */
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getYear() {
		return year;
	}

	public void setYear(double year) {
		this.year = year;
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

		return Objects.hash(make, model);
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
		Car car = (Car) obj;
		if (this.getMake() == car.getMake() && this.getModel() == car.getModel())
			return true;
		else
			return false;

	}

}
