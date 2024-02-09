package com.programs.demos;

public class Student {

	private int stuId;
	private String stuName;
	private String gender;
	private double feePaid;
	private double feeBal;
	private String CourseName;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int stuId, String stuName, String gender, double feePaid, double feeBal, String courseName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.gender = gender;
		this.feePaid = feePaid;
		this.feeBal = feeBal;
		CourseName = courseName;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getFeePaid() {
		return feePaid;
	}

	public void setFeePaid(double feePaid) {
		this.feePaid = feePaid;
	}

	public double getFeeBal() {
		return feeBal;
	}

	public void setFeeBal(double feeBal) {
		this.feeBal = feeBal;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", gender=" + gender + ", feePaid=" + feePaid
				+ ", feeBal=" + feeBal + ", CourseName=" + CourseName + "]";
	}

}
