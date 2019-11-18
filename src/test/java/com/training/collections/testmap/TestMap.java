package com.training.collections.testmap;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.collections.map.Student;

public class TestMap {
	private Map<String, Student> students;

	/**
	 * executes before each test case and creates an object
	 */
	@Before
	public void setup() {
		students = new HashMap<>();
	}

	/**
	 * test for HashMap with key = Name and value = favorite fruit name
	 */
	@Test
	public void testMapOnStudentClass() {
		Student student1 = new Student("Raechal", "Guava");
		Student student2 = new Student("Joey", "Banana");
		Student student3 = new Student("Ross", "Pear");
		Student student4 = new Student("Monica", "Apple");

		students.put("Raechal", student1);
		students.put("Joey", student2);
		students.put("Ross", student3);
		students.put("Monica", student4);

		assertEquals("Pear", students.get("Ross").getFruit());
	}

	/**
	 * executes after every test case and clears the object
	 */
	@After
	public void tearDown() {
		students = null;
	}
}
