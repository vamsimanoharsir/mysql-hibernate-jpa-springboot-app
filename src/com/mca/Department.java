package com.mca;

public class Department {
	
	int deptid;
	String deptname;
	int marks;
	
	public Department() {}
	   public Department(int deptid, String deptname, int marks) {
		  this.deptid = deptid;
	      this.deptname = deptname;
	      this.marks=marks;
	   }
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
}
