package com.myapp.dozzy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.dozzy.entities.Course;
import com.myapp.dozzy.repository.CourseRepository;
import com.myapp.dozzy.services.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {


	@Autowired
	private CourseService courseService;



	@GetMapping(path = "/{courseId}")
	public Course getCourse(@PathVariable(name = "courseId") long id) {

		Course course = courseService.getCourse(id);
		return course;
	}

	@GetMapping("/courses")
	public List<Course> getAllCourse() {

		List<Course> courses = courseService.getAllCourse();
		return courses;
	}

	@PostMapping("/add")
	public ResponseEntity<Course> addCourse(@RequestBody Course newCourse) {
		Course course = courseService.addCourse(newCourse);
		return ResponseEntity.ok(course);

	}

	@PutMapping("/{courseId}")
	public ResponseEntity<Course> updateCourse(@PathVariable(name = "courseId") long id,
			@RequestBody Course updatedCourse) {
		Course course = courseService.updateCourse(id, updatedCourse);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(course);
	}

	@DeleteMapping("/{courseId}")
	public String deleteCourse(@PathVariable(name = "courseId") long id) {
		String message = courseService.deleteCourse(id);
		return message;

	}

}
