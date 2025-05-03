package com.myapp.dozzy.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long courseId;
	
	private String courseName;
	
	private String courseDesc;
	private double coursePrice;
	
	private String courseDuration;
	
	
	

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Course(long courseId, String courseName, String courseDesc, double coursePrice, String courseDuration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.coursePrice = coursePrice;
		this.courseDuration = courseDuration;
	}



	public long getCourseId() {
		return courseId;
	}



	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}



	public String getCourseName() {
		return courseName;
	}



	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public String getCourseDesc() {
		return courseDesc;
	}



	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}



	public double getCoursePrice() {
		return coursePrice;
	}



	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}



	public String getCourseDuration() {
		return courseDuration;
	}



	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	
	
	
	
	
	
	
	
	
	

}
