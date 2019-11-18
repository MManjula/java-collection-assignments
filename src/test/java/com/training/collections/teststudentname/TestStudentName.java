package com.training.collections.teststudentname;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.collections.studentname.Student;

/**
 * 
 * @author MManjula
 *
 */
public class TestStudentName {

	private List<Student> studentList;
	private Set<Student> studentSet;

	/**
	 * Executes before every test class and creates the object
	 */
	@Before
	public void setUp() {
		studentList = new ArrayList<Student>();
		studentSet = new HashSet<Student>();
	}

	/**
	 * test to check the insertion order in list
	 */
	@Test
	public void testListOrder() {
		Student student1 = new Student("Manjula");
		Student student2 = new Student("Chetali");
		Student student3 = new Student("Riya");
		Student student4 = new Student("Nivedita");
		Student student5 = new Student("Ishitaa");

		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);

		Iterator<Student> it = studentList.iterator();

		assertEquals(student1, it.next());
		assertEquals(student2, it.next());
		assertEquals(student3, it.next());
		assertEquals(student4, it.next());
		assertEquals(student5, it.next());

	}

	/**
	 * test to check the insertion order in Set
	 */
	@Test
	public void testSetOrder() {
		Student student1 = new Student("Manjula");
		Student student2 = new Student("Chetali");
		Student student3 = new Student("Riya");
		Student student4 = new Student("Nivedita");
		Student student5 = new Student("Ishitaa");

		studentSet.add(student1);
		studentSet.add(student2);
		studentSet.add(student3);
		studentSet.add(student4);
		studentSet.add(student5);

		Iterator<Student> it = studentSet.iterator();

		assertNotEquals(student1, it.next());
		assertNotEquals(student2, it.next());
		assertNotEquals(student3, it.next());
		assertNotEquals(student4, it.next());
		assertNotEquals(student5, it.next());

	}

	/**
	 * executes after each test class and clears the object
	 */
	@After
	public void tearDown() {
		studentList = null;
		studentSet = null;
	}

}
