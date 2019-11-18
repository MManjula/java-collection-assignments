package com.training.collections.set;

import java.util.Objects;

public class School {
	private String name;
	private String city;
	private String schoolDistrict;
	private int greatSchoolRanking;

	/**
	 * Default Constructor
	 */
	public School() {
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param name
	 * @param city
	 * @param schoolDistrict
	 * @param greatSchoolRanking
	 */
	public School(String name, String city, String schoolDistrict, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	/**
	 * 
	 * getters and setters
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchoolDistrict() {
		return schoolDistrict;
	}

	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}

	/**
	 * overriding the hash code as per the requirement
	 */
	@Override
	public int hashCode() {

		return Objects.hash(name, city, schoolDistrict);
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
		School school = (School) obj;
		if (this.getName() == school.getName() && this.getCity() == school.getCity()
				&& this.getSchoolDistrict() == school.getSchoolDistrict())
			return true;
		else
			return false;

	}

}
