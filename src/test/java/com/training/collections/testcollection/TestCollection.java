package com.training.collections.testcollection;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.collections.collection.Car;
import com.training.collections.collection.CellPhone;
import com.training.collections.collection.Laptop;
import com.training.collections.collection.School;
import com.training.collections.collection.Television;

/**
 * 
 * @author MManjula
 *
 */
public class TestCollection {
	private List<Laptop> laptops;
	private List<Car> cars;
	private List<Television> televisions;
	private List<CellPhone> cellPhones;
	private List<School> schools;

	/**
	 * Executes before each test class and creates new object
	 */
	@Before
	public void setUp() {
		laptops = new ArrayList<Laptop>();
		cars = new ArrayList<Car>();
		televisions = new ArrayList<Television>();
		cellPhones = new ArrayList<CellPhone>();
		schools = new ArrayList<School>();
	}

	@Test
	public void testLaptop() {
		Laptop laptop1 = new Laptop("Lenovo", "X130", "Windows 7", "Intel core i5");
		Laptop laptop2 = new Laptop("Dell", "XPS 15", "Ubuntu", "Intel core i7");
		Laptop laptop3 = new Laptop("HP", "X360", "Windows 10", "Intel core i5");

		laptops.add(laptop1);
		laptops.add(laptop2);
		laptops.add(laptop3);

		Iterator<Laptop> it = laptops.iterator();
		assertEquals(laptop1, it.next());
		assertEquals(laptop2, it.next());
		assertEquals(laptop3, it.next());

	}

	@Test
	public void testTelevision() {
		Television televisions1 = new Television("Samsung", "LCD", false, 60000);
		Television televisions2 = new Television("Sony", "LED", false, 70000);
		Television televisions3 = new Television("LG", "LED", true, 55000);

		televisions.add(televisions1);
		televisions.add(televisions2);
		televisions.add(televisions3);

		Iterator<Television> it = televisions.iterator();
		assertEquals(televisions1, it.next());
		assertEquals(televisions2, it.next());
		assertEquals(televisions3, it.next());

	}

	@Test
	public void testCar() {
		Car car1 = new Car("Maruti", "ertiga", 2016, 80000);
		Car car2 = new Car("Tata", "tiago", 2015, 450000);
		Car car3 = new Car("Toyota", "Fortuner", 2014, 96000);

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);

		Iterator<Car> it = cars.iterator();
		assertEquals(car1, it.next());
		assertEquals(car2, it.next());
		assertEquals(car3, it.next());

	}

	@Test
	public void testCellPhone() {
		CellPhone cellPhones1 = new CellPhone("Motorola", "G8 Plus", "Android", 13999);
		CellPhone cellPhones2 = new CellPhone("Xiomi", "Note 10", "Android", 18000);
		CellPhone cellPhones3 = new CellPhone("Lenovo", "K 10", "Android", 8999);

		cellPhones.add(cellPhones1);
		cellPhones.add(cellPhones2);
		cellPhones.add(cellPhones3);

		Iterator<CellPhone> it = cellPhones.iterator();
		assertEquals(cellPhones1, it.next());
		assertEquals(cellPhones2, it.next());
		assertEquals(cellPhones3, it.next());

	}

	@Test
	public void testSchool() {
		School school1 = new School("DPS", "Bangalore", "Bagalkot", 1);
		School school2 = new School("DAV", "Bhopal", "Rajgarh", 2);
		School school3 = new School("New Horizon", "Navi Mumbai", "Airoli", 3);

		schools.add(school1);
		schools.add(school2);
		schools.add(school3);

		Iterator<School> it = schools.iterator();
		assertEquals(school1, it.next());
		assertEquals(school2, it.next());
		assertEquals(school3, it.next());

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
