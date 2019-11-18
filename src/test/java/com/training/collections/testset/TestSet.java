package com.training.collections.testset;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.collections.set.Car;
import com.training.collections.set.CellPhone;
import com.training.collections.set.Laptop;
import com.training.collections.set.School;
import com.training.collections.set.Television;

public class TestSet {
	private Set<Laptop> laptops;
	private Set<Car> cars;
	private Set<Television> televisions;
	private Set<CellPhone> cellPhones;
	private Set<School> schools;

	/**
	 * Executes before each test class and creates new object
	 */
	@Before
	public void setUp() {
		laptops = new HashSet<Laptop>();
		cars = new HashSet<Car>();
		televisions = new HashSet<Television>();
		cellPhones = new HashSet<CellPhone>();
		schools = new HashSet<School>();
	}

	/**
	 * test to check the size of Laptop Set having few duplicates
	 */
	@Test
	public void testLaptop() {
		Laptop laptop1 = new Laptop("Lenovo", "X130", "Windows 7", "Intel core i5");
		Laptop laptop2 = new Laptop("Dell", "XPS 15", "Ubuntu", "Intel core i7");
		Laptop laptop3 = new Laptop("HP", "X360", "Windows 10", "Intel core i5");
		Laptop laptop4 = new Laptop("Dell", "XPS 15", "Linux", "Intel core i7");

		laptops.add(laptop1);
		laptops.add(laptop2);
		laptops.add(laptop3);
		laptops.add(laptop4);

		assertEquals(3, laptops.size());

	}

	/**
	 * test to check the size of Television Set having few duplicates
	 */

	@Test
	public void testTelevision() {
		Television televisions1 = new Television("Samsung", "LCD", false, 60000);
		Television televisions2 = new Television("Sony", "LED", false, 70000);
		Television televisions3 = new Television("LG", "LED", true, 55000);
		Television televisions4 = new Television("Sony", "LED", false, 90000);
		Television televisions5 = new Television("Sony", "LED", true, 70000);

		televisions.add(televisions1);
		televisions.add(televisions2);
		televisions.add(televisions3);
		televisions.add(televisions4);
		televisions.add(televisions5);

		assertEquals(4, televisions.size());

	}

	/**
	 * test to check the size of Car Set having few duplicates
	 */

	@Test
	public void testCar() {
		Car car1 = new Car("Maruti", "ertiga", 2016, 80000);
		Car car2 = new Car("Tata", "tiago", 2015, 450000);
		Car car3 = new Car("Toyota", "Fortuner", 2014, 96000);
		Car car4 = new Car("Maruti", "ertiga", 2016, 80000);
		Car car5 = new Car("Maruti", "ertiga", 2016, 100000);

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);

		assertEquals(3, cars.size());

	}

	/**
	 * test to check the size of CellPhone Set having few duplicates
	 */

	@Test
	public void testCellPhone() {
		CellPhone cellPhones1 = new CellPhone("Motorola", "G8 Plus", "Android", 13999);
		CellPhone cellPhones2 = new CellPhone("Xiomi", "Note 10", "Android", 18000);
		CellPhone cellPhones3 = new CellPhone("Lenovo", "K 10", "Android", 8999);
		CellPhone cellPhones4 = new CellPhone("Xiomi", "Note 10", "Android", 20000);
		CellPhone cellPhones5 = new CellPhone("Xiomi", "Note 5 Pro", "Android", 16000);

		cellPhones.add(cellPhones1);
		cellPhones.add(cellPhones2);
		cellPhones.add(cellPhones3);
		cellPhones.add(cellPhones4);
		cellPhones.add(cellPhones5);

		assertEquals(4, cellPhones.size());

	}

	/**
	 * test to check the size of School Set having few duplicates
	 */

	@Test
	public void testSchool() {
		School school1 = new School("DPS", "Bangalore", "Bagalkot", 1);
		School school2 = new School("DAV", "Bhopal", "Rajgarh", 2);
		School school3 = new School("New Horizon", "Navi Mumbai", "Airoli", 3);
		School school4 = new School("New Horizon", "Navi Mumbai", "Thane", 3);
		School school5 = new School("New Horizon", "Navi Mumbai", "Airoli", 4);

		schools.add(school1);
		schools.add(school2);
		schools.add(school3);
		schools.add(school4);
		schools.add(school5);

		assertEquals(4, schools.size());

	}

	/**
	 * Executes after each test class and clears the object
	 */
	@After
	public void tearDown() {
		laptops = null;
		cars = null;
		televisions = null;
		cellPhones = null;
		schools = null;

	}

}
