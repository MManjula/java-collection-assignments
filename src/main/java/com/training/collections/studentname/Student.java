package com.training.collections.studentname;

/**
 * 
 * @author MManjula
 *
 */
public class Student {

	private String studentName;

	/**
	 * Default Constructor
	 */
	public Student() {
	}

	/**
	 * 
	 * @param studentName
	 */
	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}

	/**
	 * 
	 * setters and getters of studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
