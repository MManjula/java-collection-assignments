package com.training.collections.testcomparable;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.collections.comparable.Car;

public class TestComparable {
	private List<Car> cars;

	/**
	 * executes before each test class and creates new object
	 */
	@Before
	public void setUp() {
		cars = new ArrayList<Car>();
	}

	/**
	 * Method to test sorting of Car class according to their make in ascending
	 * order
	 */
	@Test
	public void testSortingOfCarsUsingComparableInterface() {

		Car car1 = new Car("Maruti", "ertiga", 2016, 80000);
		Car car2 = new Car("Toyota", "Fortuner", 2014, 96000);
		Car car3 = new Car("Tata", "tiago", 2015, 450000);

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);

		Collections.sort(cars);

		Iterator<Car> it = cars.iterator();
		assertEquals("Maruti", it.next().getMake());
		assertEquals("Tata", it.next().getMake());
		assertEquals("Toyota", it.next().getMake());

	}

	/**
	 * executes after each test class and clears the object
	 */
	@After
	public void tearDown() {
		cars = null;
	}

}
