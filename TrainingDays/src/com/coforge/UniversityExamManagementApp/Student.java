package com.coforge.UniversityExamManagementApp;

public class Student {
	private String studentName;
	private String studentId;
	private int attendancePercent;
	
	public Student() {
		super();
	}

	public Student(String studentName, String studentId, int attendancePercent) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.attendancePercent = attendancePercent;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getAttendancePercent() {
		return attendancePercent;
	}

	public void setAttendancePercent(int attendancePercent) {
		this.attendancePercent = attendancePercent;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", attendancePercent=" + attendancePercent + "]";
	}
	
	
}
