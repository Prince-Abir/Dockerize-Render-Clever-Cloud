package com.myapp.dozzy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.dozzy.Exceptions.ResourceNotFoundException;
import com.myapp.dozzy.entities.Course;
import com.myapp.dozzy.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public Course getCourse(long id) {

		Course course = courseRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Course not found!!"));
		return course;
	}

	public List<Course> getAllCourse() {

		List<Course> courses = courseRepository.findAll();
		return courses;
	}

	public Course addCourse(Course course) {
		Course savedCourse = courseRepository.save(course);
		return savedCourse;

	}

	public Course updateCourse(long id, Course updatedCourse) {

		Course course = courseRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Course not found!!"));

		course.setCourseName(updatedCourse.getCourseName());
		course.setCourseDesc(updatedCourse.getCourseDesc());
		course.setCoursePrice(updatedCourse.getCoursePrice());
		course.setCourseDuration(updatedCourse.getCourseDuration());

		courseRepository.save(course);

		return course;
	}

	public String deleteCourse(long id) {
		
		Course course = courseRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Course not found!!"));;

		try {
			courseRepository.delete(course);
			return "Course Delete Successfully";

		} catch (Exception e) {
			return "Course Deletion Failed!";
		}

	}

}
