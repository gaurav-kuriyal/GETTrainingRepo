package com.coforge.Day5;

public class Student implements Comparable<Student>{
	private int stdId;
	private String stdName;
	private double marks;
	public Student() {
		super();
	}
	public Student(int stdId, String stdName, double marks) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.marks = marks;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", marks=" + marks + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		return this.stdId-o.stdId;
	}
	
	
}
