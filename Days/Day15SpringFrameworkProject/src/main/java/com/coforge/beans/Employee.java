package com.coforge.beans;

import java.util.HashSet;

public class Employee {
	private int eid;
	private String ename;
	private Department dept;
	
	private HashSet<String> skillSet;
	
	public Employee(int eid, String ename, Department dept, HashSet<String> skillSet) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
		this.skillSet = skillSet;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", skillSet=" + skillSet + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public HashSet<String> getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(HashSet<String> skillSet) {
		this.skillSet = skillSet;
	}
	
	
	
}
